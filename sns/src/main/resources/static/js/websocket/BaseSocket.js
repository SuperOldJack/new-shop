/**
 * 用于获得code参数
 */


function connectionSocket(url){

	if ("WebSocket" in window)
	{

		// 打开一个 web socket
		var ws = new WebSocket("ws://localhost:80/"+url);

		ws.onopen = function()
		{
			 $.post("/sellManage/getNowSellOrderCode","json",function(data){ fullCode(data);});
			 
		};

		ws.onmessage = function (evt) 
		{ 
			var received_msg = evt.data;
			fullCode(received_msg);
		};

		ws.onclose = function()
		{ 
			// 关闭 websocket
			alert("连接已关闭..."); 
		};
		
		return ws;
	}

	else
	{
		// 浏览器不支持 WebSocket
		alert("您的浏览器不支持 WebSocket,将无法使用大部分功能,请更换浏览器");
		window.close();
	}
	
}
function fullCode(received_msg){
	document.getElementById('tittle_lable').innerHTML = received_msg;
	document.getElementById('a').value = received_msg;
}
function sendMessage(){

	ws.send(document.getElementById('text').value);
}