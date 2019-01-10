<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 条件查找页面 仅ID 依赖于page页面-->


	<input type="text" id="findId" value="">  
	<input type="button" id="find" onclick="findData(${data.currentPageNo})">
	
	<script>
		//为分页添加条件
		function findData(currentPageNo){
			if(currentPageNo != "" || currentPageNo != null){
				
				var findId = $("#findId").get(0);
				if(findId != null){
					var value = $(findId).val();
					if(value != "") currentPageNo += "&findId="+value;
					alert(currentPageNo);
					loadDocment(currentPageNo);
				}
			}
			
		}
	</script>
	
