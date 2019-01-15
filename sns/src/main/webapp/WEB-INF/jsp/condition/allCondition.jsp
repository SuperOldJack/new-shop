<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 条件查找页面 所有条件 依赖于page页面-->


	客户ID:<input class="condition" type="text" id="findId" value="">  
	制单日期 起始:<input class="condition" type="text" id="starTime" value="">
	结束:<input class="condition" type="text" id="endTime" value=""> 
	
	仓库名称:<input class="condition" type="text" id="libId" value="">
	货品名称:<input class="condition" type="text" id="shopId" value="">
	经办人:<input class="condition" type="text" id="manageManId" value="">
	  
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
	
