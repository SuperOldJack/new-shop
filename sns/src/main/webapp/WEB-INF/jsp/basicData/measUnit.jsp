<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
function editUnit(item){
	alert("编辑"+item);
}

function removeUnit(item) {
	alert("删除"+item);
}

$(function() {
	 $.ajax({
		 url:"queryMeasUnit",
		 type:"get",
		 success: function(data) {
			 var unitList = data
			 var unitHtml = "";
			 for(var i = 0; i < unitList.length; i++) {
				  unitHtml += "<tr><td>"+unitList[i].id+"</td>";
				  unitHtml += "<td>"+unitList[i].unit_name+"</td>";
				  unitHtml += "<td><a class='btn btn-primary' onclick='editUnit(this)'>编辑</a>";
				  unitHtml += "&nbsp;&nbsp;&nbsp;<a class='btn btn-danger'onclick='removeUnit(this)'>删除</a></td></tr>";
			 }
			 $("#unitInfo").html(unitHtml);
		 } 
	 });
});
</script>
<div class="main_div">
	<h3>计量单位信息</h3>
	<hr>
	<table class="table table-hover">
		<thead>
			<tr>
				<td>id</td>
				<td>单位名</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody id="unitInfo">
			<tr>
				<td>id</td>
				<td>单位名</td>
				<td><a class="btn btn-primary">修改</a><a class="btn btn-danger">删除</a></td>
			</tr>
		</tbody>
	</table>
</div>

