/**
 * 
 */
var ws;

if ("WebSocket" in window)
{

	// 打开一个 web socket
	ws = new WebSocket("ws://localhost:80/orderGoodsSelect");

	ws.onopen = function()
	{
		
		
	};

	ws.onmessage = function (evt) 
	{ 
		var received_msg = evt.data;
		document.getElementById('tittle_lable').innerHTML = received_msg;
		document.getElementById('a').value = received_msg;
	};

	ws.onclose = function()
	{ 
		// 关闭 websocket
		alert("连接已关闭..."); 
	};
}

else
{
	// 浏览器不支持 WebSocket
	alert("您的浏览器不支持 WebSocket,将无法使用大部分功能,请更换浏览器");
}
function sendMessage(){

	ws.send(document.getElementById('text').value);
}