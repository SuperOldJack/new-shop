<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出库单信息</title>
<link href="/bootstrap/css/bootstrap.css">
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
</head>
<body class="main_div">
	<h3>出库单</h3>
	<h3>${code }</h3>
	<table class="table">
		<tbody>
			<tr>
				<td>制单日期:<td><input type="text">
				<td>供货商:<td><input type="text">
			<tr>
				<td>库房:<td><input type="text">
				<td>制单人:<td><input type="text">
			<tr>
				<td>备注:<input type="text">
				<td>经办人:<input type="text">	
		</tbody>
	</table>
	<button class="btn btn-success">添加</button>
	<button class="btn btn-warning">删除</button>
	<table class="table">
		<thead>
			<tr>
				<td>商品编码
				<td>商品名称
				<td>商品规格
				<td>单位
				<td>单价
				<td>数量
				<td>小计
				<td>备注
		</thead>
		<tbody>
			<c:forEach items="">
				<tr>
					<td>商品编码
					<td>商品名称
					<td>商品规格
					<td>单位
					<td>单价
					<td>数量
					<td>小计
					<td>备注
			</c:forEach>
		</tbody>
	</table>
<script>
	$(function() {
		console.log('出库单信息');
		console.log(window.opener.inLib);
	});
</script>
</body>
</html>