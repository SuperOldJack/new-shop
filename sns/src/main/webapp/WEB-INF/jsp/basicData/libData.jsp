<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
$(function() {
	 $.ajax({
		 url:"queryLibInfo",
		 type:"get",
		 success: function(data) {
			 console.log(data);
			 var libList = data
			 var libHtml = "";
			 for(var i = 0; i < libList.length; i++) {
				  libHtml += "<tr><td>"+libList[i].name+"</td>";
				  libHtml += "<td>"+libList[i].address+"</td>";
				  libHtml += "<td>"+libList[i].lib_phone+"</td>";
				  libHtml += "<td>"+libList[i].lib_manage_man+"</td>";
				  libHtml += "<td>"+libList[i].manage_phone+"</td></tr>";
			 }
			 $("#libInfo").html(libHtml);
		 } 
	 });
});
</script>
<div class="main_div">
	<h3>仓库信息</h3>
	<hr>
	<table class="table">
		<thead>
			<tr>
				<td>仓库名</td>
				<td>仓库地址</td>
				<td>仓库电话</td>
				<td>仓库负责人</td>
				<td>负责人电话</td>
			</tr>
		</thead>
		<tbody id="libInfo">

		</tbody>
	</table>
</div>

