<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新建付款单</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
  <script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
  <script type="text/javascript" src="/js/dashboard.js"></script>
  <script type="text/javascript" src="/js/finance/pay.js"></script>
  <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
</head>
<body>
<h3>付款单登记</h3>
<h3>${payCode }</h3>
<hr/><!-- action="/finance/addPayDoc" -->
<form id="addPayFrom" method="post">
<input type="hidden" name="goods.code" value="${payCode }">
<table>
	<tbody>
		<tr><td>付款日期:</td> <td><input autocomplete="off" name="dealtime" type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"></td> 
		<td>入库单号:</td> 
			<td><input name="inputDocId" type="hidden"><input name="inputDocCode" readonly="readonly" type="text"> 
			<input type="button" value="选择" id="btnSel"/>
		</td></tr>
		<tr>
			<td>账户：</td> 
			<td> <select name="card.id">
					<c:forEach items="${cardList }" var="card">
						<option value="${card.id }">${card.name } </option>
					</c:forEach>
				</select>
			</td> </tr>
		<tr><td>银行账号</td> <td></td> </tr>
		<tr><td>支付方式：</td> <td> <select><option>支票</option></select></td> <td>实付金额</td> <td><input name="actual_money" type="text"></td> </tr>
		<tr><td>备注：</td> <td><input name="comment" type="text"></td></tr>
		<tr><td>经办人：</td> <td><input name="work.id" type="text"></td><td>制单人：</td> <td><input name="createMan" type="text"></td></tr>
	</tbody>
</table>
<input type="submit" value="保存" onclick="addPayDoc()"/>
</form>
<hr>
</body>
<script>
	$(function() {
		$("#btnSel").click(function() {
			window.open("/finance/openDocSelectPage?type=1", 'newwindow', 'left=550,top=100,height=500, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
		});
	});
</script>
</html>