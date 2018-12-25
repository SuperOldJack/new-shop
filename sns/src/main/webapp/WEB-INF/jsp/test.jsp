<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
</head>
<script type="text/javascript">
	function ajaxTest() {
		$.ajax({
			url:"htest",
			type:"post",
			success:function(data) {
				console.log(data);
			}
		})
		
	}
	function postTest() {
		$.post("htest",function(r) {
			alert(r);
		},"JSON")
	}
</script>
<body>
	<button onclick="ajaxTest()">test</button>
	<button onclick="postTest()">post</button>
</body>
</html>