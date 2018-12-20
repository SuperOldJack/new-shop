<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function sendDate(){
		window.opener.document.getElementById("OpenDiv").innerHTML="我是从子窗口Open传过来的值"
	}
</script>
<title>选择商品</title>
</head>
<body>

	<c:forEach items="${goodsInfo}" var="item">
		${item.name}
	</c:forEach>
</body>
</html>