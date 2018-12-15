<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>

<link href="/css/autoHide.css" rel="stylesheet" type="text/css">
</head>
<body  onmousemove="moveTest(event)">
	<div class="hide_bar" style="width: 100%; z-index: 0" ></div>
	<a href="#">aaaaaaaaa</a>
	<c:forEach items="${bankList}" var="bank">
		<p>${bank.customerName}</p>
	</c:forEach>
	<a href="out">输出--序列化对象</a>
	<a href="input">输入--反序列化对象</a>
	
	
	<script type="text/javascript">
	//需要放在元素后面
	var flag = true;
	var hide_node = $(".hide_bar")
	var node_hight = parseInt(hide_node.css("height"));
	function moveTest(mouse){
		if(flag && mouse.clientY <= node_hight){
			hide_node.stop();
			hide_node.animate({top:"0px"},50);
			flage = false;
		}
		if(flag && mouse.clientY > node_hight){
			$(".hide_bar").stop();
			$(".hide_bar").animate({top:(-1*node_hight)+"px"},50);
			flage = true;
		}
	}
</script>
</body>
</html>