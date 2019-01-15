<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<script >
	function select(e) {
		var inDocCode = $(e).children().eq(0).text();
		var inDocId = $(e).children().eq(1).text();
		window.opener.$("input[name='inputDocCode']").val(inDocCode);//这里设置入库单号
		window.opener.$("input[name='inputDocId']").val(inDocId);//这里设置入库单id
		window.close();
	}
	function openNew() {
		window.open("/hhq/openNew", 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
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
<table class="table">
	<thead>
		<tr><td>id</td><td>名字</td></tr>
	</thead>
	<tbody>
		<tr class="item" onclick="select(this)"><td>1</td><td>奶子</td></tr>
		<tr class="item" onclick="select(this)"><td>2</td><td>屁股</td></tr>
		<tr class="item" onclick="select(this)"><td>3</td><td>大长腿</td></tr>
	</tbody>
</table>
</body>
</html>