<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="text"><button onclick="send()">发消息</button>
<button onclick="closeWebSocket()">关闭连接</button>

<div id="message"></div>
<script>
	var websocket = null;
	//判断是否支持websocket
	if("WebSocket" in window) {
		websocket = new WebSocket("ws://localhost:80/websocket");
	} else { alert("不支持")}
	
	//将消息显示
	function setMessageInnerHtml(msg) {
		document.getElementById("message").innerHTML += msg + "<br/>";
	}
	//关闭连接
	function closeWebSocket() { websocket.close;}
	
	function send() {
		var meg = document.getElementById("text").value;
		websocket.send(meg);
	}
	
	websocket.onerror = function() { setMessageInnerHtml("连接发生错误");}
	
	//连接成功
	websocket.onopen = function() { setMessageInnerHtml("连接成功");}
	
	//接收到消息
	websocket.onmessage = function(event) {
		setMessageInnerHtml("接收到消息:" + event.data);
	}
	
	//连接关闭时的回调方法
	websocket.onclose = function() {
		setMessageInnerHtml("websocket连接关闭")
	}
	
	//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
	window.onbeforeunload = function () {
		closeWebSocket();
	}
</script>
</body>
</html>