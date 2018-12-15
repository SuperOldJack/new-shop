<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
<link rel="stylesheet" href="/css/font-awesome.min.css" >
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/hullabaloo.js"></script>
</head>
<body>
	<script>
		$.hulla = new hullabaloo();
	</script>
	<div class="container">
		<button type="button" class="btn" onclick="$.hulla.send('这是一则成功信息', 'success')">基本按钮</button>
	</div>
</body>
</html>