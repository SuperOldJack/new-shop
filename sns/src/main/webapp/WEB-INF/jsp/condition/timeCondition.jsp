<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 条件查找页面 仅时间 依赖于page页面-->


	<input class="condition" type="text" id="starTime" value="">
	<input class="condition" type="text" id="endTime" value="">  
	<input type="button" id="find" value="查询" onclick="findData(${data.currentPageNo})">
	
	
	
	<script>
		//为分页添加条件
		function findData(currentPageNo){
			if(currentPageNo != "" || currentPageNo != null){
				
				var currentPage=parseInt(currentPageNo);//去除页码的多余数据
				
				$(".condition").each(function(data){
					var node = $(this);
					
					var id = node.attr('id');
					var value = node.val();
					if(value != "") currentPage += "&"+id+"="+value;
					
				});
				
				loadDocment(currentPage);
			}
			
		}
	</script>
	
