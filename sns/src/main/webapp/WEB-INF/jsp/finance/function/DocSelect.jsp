<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>单据选择</title>
<link href="/bootstrap/css/bootstrap.css">
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
	function selected(e) {
		var inDocCode = $(e).children().eq(1).text();
		var inDocId = $(e).children().eq(0).text();
		window.opener.$("input[name='inputDocCode']").val(inDocCode);//这里设置入库单号
		window.opener.$("input[name='inputDocId']").val(inDocId);//这里设置入库单id
		window.close();
	}
	$(function() {
		$(".item").hover(
			function() { $(this).css("background-color","#cdcdcd");},
			function() { $(this).css("background-color","#fff");}
		);
	});
</script>
</head>
<body>
	<h3>选择入库单</h3>
	<table class="table">
		<thead>
			<tr>
				<td>id</td>
				<td>入库单号</td>
				<td>日期</td>
				<td>供货商</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${inputLibList }" var="input">
				<tr class="item" onclick="selected(this)">
					<td>${input.id }</td>
					<td>${input.goodsDocument.code }</td>
					<td><fmt:formatDate value="${input.goodsDocument.create_time }" pattern="yyyy-MM-dd"/></td>
					<td>${input.supplier.linker_name }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>