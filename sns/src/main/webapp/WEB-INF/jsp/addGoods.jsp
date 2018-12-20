<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function sendDate(){
		window.opener.reload(window.document.getElementById("selectGoodsInfo").innerHTML);
		window.close();
	}
</script>
<title>选择商品</title>
</head>
<body>
	<table id="selectGoodsInfo">
	<c:forEach items="${goodsInfo}" var="item">
		
		
			<tr>
				<td>${item.name}</td>
				<td>
					<select name="单位名称">
						<c:forEach items="${countUnitys}" var="Unit">
							<option value="${Unit.id}">${Unit.unit_name}</option>
						</c:forEach>
						
					</select>
				</td>
				<td>
					<select name="">
						<c:forEach items="${specifications}" var="Specification">
							<option value="${Specification.id}">${Specification.specificationType}</option>
						</c:forEach>
						
					</select>
				</td>
				<td>
					<input type="checkbox" name="">
				</td>
				<td>${item.content}</td>
			</tr>
			
		
	</c:forEach>
	
	</table>
	<input type="button"  onclick="sendDate()" value="提交"/>
</body>
</html>