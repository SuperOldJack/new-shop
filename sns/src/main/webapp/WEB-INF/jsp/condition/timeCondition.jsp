<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 条件查找页面 仅时间 依赖于page页面-->


	<input type="text" id="starTime" value="">
	<input type="text" id="endTime" value="">  
	<input type="button" id="find" onclick="findData(${data.currentPageNo})">
	
	
	
	<script>
		//为分页添加条件
		function findData(currentPageNo){
			if(currentPageNo != "" || currentPageNo != null){
				
				var starTime = $("#starTime").get(0);
				if(starTime != null){
					var value = $(starTime).val()
					if(value != "") currentPageNo += "&starTime="+value;
				}
				
				var endTime = $("#endTime").get(0);
				if(endTime != null){
					var value = $(endTime).val()
					if(value != "") currentPageNo += "&endTime="+value;
				}
				
				loadDocment(currentPageNo);
			}
			
		}
	</script>
	
