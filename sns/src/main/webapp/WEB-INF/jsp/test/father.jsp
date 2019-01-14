<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<script>
	function openPage() {
		window.open("/hhq/openPage", 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
	}
</script>
<form action="/hhq/testSubmit" method="post">
	<input name="inputDocCode" type="text">
	<input name="inputDocId" type="text">
	<button type="submit">提交</button>
</form>
<button onclick="openPage()">打开</button>
