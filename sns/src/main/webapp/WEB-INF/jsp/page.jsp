<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 分页组件与Condition页面耦合 -->
	
<!-- 分页部分开始 -->
<div style="width: 100%; text-align: right;">
	共${data.totalCount}条记录&nbsp;&nbsp;
	${data.currentPageNo}/${data.totalPageCount}页 <a
		href="javascript:load(1)">首页</a> <a
		href="javascript:load(${data.prePage})">上一页</a>
	<a href="javascript:load(${data.nextPage})">下一页</a>
	<a
		href="javascript:load(${data.totalPageCount})">最后一页</a>
	<span class="page-go-form"><label>跳转至</label> <input
		type="number" style="width: 40px" name="inputPage" id="inputPage"
		class="page-key">页
		<button type="button" class="page-btn" onclick="pageTo()">GO</button>
	</span> &nbsp;&nbsp;&nbsp;&nbsp;
</div>

<script type="text/javascript">

	function load(currentPageNo) {
		
		try{
			if(typeof(eval('findData')) == "function"){
				findData(currentPageNo);
			}
			
		}catch(e){
			console.log(e);
		}
		
		loadDocment(currentPageNo);
	}

	function pageLink(currentPageNo) {
		load(currentPageNo);
	}
	
	
	function loadDocment(currentPageNo){
		//获取路径信息
		var urlNode = $("#url");
	
		var str=urlNode.attr("mid");

		
		
		var subStr=new RegExp('\\?currentPageNo=\\d*');//创建正则表达式对象
		
		
		//判断是否带有额外条件
		/* 
		
		  
		
		 */
		
		var result=str.replace(subStr,"?currentPageNo="+currentPageNo);//把页码及其参数替换为当前值
		//console.log(result);

		var url =result;
		urlNode.attr("mid",url);

		
		
		loadPage(urlNode.get(0));
	}

	function pageTo() {
		var page = document.getElementById("inputPage").value;
		var maxPage = ${data.totalPageCount};
		if (isNaN(page)) {
			alert("请输入一个数字.");
		} else {
			if (page == undefined || page == "") {
				page = ${data.currentPageNo};
			}
			var realPage = parseInt(page);
			if (parseInt(page) <= 0) {
				realPage = 1;
			}
			if (parseInt(page) > parseInt(maxPage)) {
				realPage = maxPage;
			}
			load(realPage);
		}
	}
</script>
<!-- 分页部分 结束-->