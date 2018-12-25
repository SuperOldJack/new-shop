<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
</head>
<body>
子窗体
<button onclick="passVal('毛毛')">毛毛</button>
<button onclick="passVal('蛋蛋')">蛋蛋</button>
<button onclick="passVal('皮皮')">皮皮</button>
<script>
	function passVal(msg) {
		window.opener.document.getElementById("msg").innerHTML += msg + "<br/>";
	}
</script>
</body>
</html>