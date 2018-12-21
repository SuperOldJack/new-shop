<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
	function sendDate(node){
		
		//处理元素
		var oldNode = $(node).parents("tr");
		var node = oldNode.clone();
		
		var specification = oldNode.find(".goods_specification:selected");
		var s_text =specification.text();
		var s_val = specification.val();
		node.find(".goods_specification").parent().replaceWith("<span class='goods_specification'>"+s_text+"</span><input type='hidden' name='shopSpecification' value="+s_val+">");
		
		var unit = oldNode.find(".goods_unit:selected");
		var u_text =unit.text();
		var u_val = unit.val();
		node.find(".goods_unit").parent().replaceWith("<span class='goods_unit'>"+u_text+"</span><input type='hidden' name='shopUnit' value="+u_val+">");
		
		node.find(".select_goods").parent().remove();
		
		node.append("<td><input name='goodsPrice' class='goods_price'/></td><td><input name='goodsCount' class='goods_count'/></td><td class='goods_countmoney'></td>");
		
		window.opener.addRow(node);
		window.close();
	}
	
</script>
<title>选择商品</title>
</head>
<body>
	

	<table id="selectGoodsInfo">
		<c:forEach items="${goodsInfo}" var="item" >
			
			

			<tr class="goodsinfoArr">
				
				<td>${item.id}<input type="hidden" name="shopId" value="${item.id}"></td>
				<td>${item.name}<input type="hidden" name="shopName" value="${item.name}"></td>
				<td><select name="单位名称" >
						<c:forEach items="${countUnitys}" var="Unit">
							<option class="goods_unit" value="${Unit.id}">${Unit.unit_name}</option>
						</c:forEach>

				</select></td>
				<td><select  name="规格名称">
						<c:forEach items="${specifications}" var="Specification">
							<option class="goods_specification" value="${Specification.id}">${Specification.specificationType}</option>
						</c:forEach>

				</select></td>
				
				<td>${item.content}</td>
				<td><input type="button" class="select_goods" onclick="sendDate(this)"></td>
			</tr>


		</c:forEach>

	</table>
	<input type="button" onclick="window.close()" value="关闭" />
</body>
</html>