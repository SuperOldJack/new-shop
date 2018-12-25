package com.shop.socket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@ServerEndpoint("/websocket")
@Component
public class WebSocketTest {
	
	//在线人数
	private static int onLineCount = 0;
	

	//concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
	private static CopyOnWriteArraySet<WebSocketTest> webSocketSet = 
			new CopyOnWriteArraySet<WebSocketTest>();
	
	//与某个客户端的连接会话  需要它来给客户端发送数据
	private Session sessino;
	
	/**
	 * 有连接打开时
	 * @param session
	 */
	@OnOpen
	public void onOpen(Session session) {
		this.sessino = session;
		webSocketSet.add(this);
		addOnLineCount();
		System.out.println("有新连接加入 此时在线人数为:" + getOnLineCount());
	}
	
	/**
	 * 有连接关闭时
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this);
		subOnLineCount();
		System.out.println("有连接关闭 此时在线人数为:" + getOnLineCount());
	}

	
	@OnMessage
	public void onMessage(String msg, Session session) {
		System.out.println("接收到消息:" + msg);
		//群发消息
		for(WebSocketTest item : webSocketSet) {
			try {
				item.sendMessage(msg);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	//自定义方法
	private void sendMessage(String msg) throws IOException {
		this.sessino.getBasicRemote().sendText(msg);
	}

	public static void addOnLineCount() {
		WebSocketTest.onLineCount++;
	}
	
	public static void subOnLineCount() {
		WebSocketTest.onLineCount--;
	}


	public static int getOnLineCount() {
		return WebSocketTest.onLineCount;
	}
	
}
