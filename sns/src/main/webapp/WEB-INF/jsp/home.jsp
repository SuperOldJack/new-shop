<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
<link rel="stylesheet" href="/css/home.css" >
<link rel="stylesheet" href="/css/font-awesome.min.css" >
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/hullabaloo.js"></script>
<script type="text/javascript" src="/js/home.js"></script>
</head>
<body>
	<div class="head_div">
		<div class="common_head_div">
			<%@include file="head.jsp"%>
		</div>
		<div class="head_bg">
			<img class="head_bg_img" alt="是我背景图片哒" src="/images/head_bg_img.jpg">
		</div>
	</div>
	<div class="container">
		<div class="row">
			<button onclick="$.hulla.send('绿色消息', 'success')">绿色</button>
			<button onclick="$.hulla.send('蓝色消息', 'info')">蓝色</button>
			<button onclick="$.hulla.send('黄色消息', 'warning')">黄色</button>
			<button onclick="$.hulla.send('红色消息', 'danger')">红色</button>
			<button id="validate">验证</button>
			<button id="getbank">查询</button>
			<div class="niubi"></div>
		</div>
	</div>
	<div class="common_bottom_div">
		<%@include file="bottom.jsp"%>
	</div>
</body>
</html>