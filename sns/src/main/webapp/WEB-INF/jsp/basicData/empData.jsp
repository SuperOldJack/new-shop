<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
function check() {
	if($("input[name='name']").val().trim() == '') {
		alert("姓名不能为空"); $("input[name='name']").focus(); return false;
	} else if($("input[name='address']").val().trim() == '') {
		alert("住址不能为空"); $("input[name='address']").focus(); return false;
	} else if($("input[name='e-mail']").val().trim() == '') {
		alert("邮箱不能为空"); $("input[name='e-mail']").focus(); return false;
	} else if($("input[name='phone']").val().trim() == '') {
		alert("电话不能为空"); $("input[name='phone']").focus(); return false;
	} else if($("input[name='birthday']").val().trim() == '') {
		alert("生日不能为空"); $("input[name='birthday']").focus(); return false;
	} else {
		$("#addEmpForm").submit(); return true;
	}
	return false;
}
 $(function() {
	 $.ajax({
		 url:"getEmpList",
		 type:"get",
		 success: function(data) {
			 console.log(data);
			 var empList = data
			 var empHtml = "";
			 for(var i = 0; i < empList.length; i++) {
				  empHtml += "<tr><td>"+empList[i].vip.vip_number+"</td>";
				  empHtml += "<td>"+empList[i].name+"</td>";
				  empHtml += "<td>"+empList[i].sex+"</td>";
				  empHtml += "<td>"+empList[i].address+"</td>";
				  empHtml += "<td>"+empList[i].e_mail+"</td>";
				  empHtml += "<td>"+empList[i].phone+"</td>";
				  empHtml += "<td>"+empList[i].birthday+"</td>";
				  empHtml += "<td>"+empList[i].vip.vip_code+"</td></tr>";
			 }
			 $("#empInfo").html(empHtml);
		 } 
	 });
 });
</script>
<div class="main_div">
	<h3>员工管理</h3>
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#addEmpBtn">新增员工</button>
	<hr>
	<table class="table table-hover">
		<thead>
			<tr>
				<td>员工账号</td>
				<td>员工姓名</td>
				<td>性别</td>
				<td>住址</td>
				<td>e-mail</td>
				<td>电话</td>
				<td>生日</td>
				<td>识别码</td>
			</tr>
		</thead>
		<tbody id="empInfo">

		</tbody>
	</table>
</div>


<div class="modal fade" id="addEmpBtn">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<h4 class="modal-title">新增员工</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<div class="modal-body">
				<form id="addEmpForm" action="/addEmp" method="post" onsubmit="return check()">
					<div class="form-group">
						<label>员工姓名:</label> <input class="form-control"
							name="name">
					</div>
					<div class="form-group">
						<label for="email">性别:</label>
						<select class="form-control" name="sex">
							<option value="男" selected="selected">男</option>
							<option value="女">女</option>
						</select>
					</div>
					<div class="form-group">
						<label for="pwd">住址</label> 
						<input class="form-control" name="address" >
					</div>
					<div class="form-group">
						<label for="email">e-mail:</label>
						<input class="form-control" name="e-mial">
					</div>
					<div class="form-group">
						<label for="email">电话</label> <input class="form-control"
							name="phone">
					</div>
					<div class="form-group">
						<label for="email">生日:</label> <input class="form-control"
							 name="brithday"onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly="readonly">
					</div>
					<button type="submit" class="btn btn-primary">添加员工</button>
				</form>
			</div>

			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
			</div>

		</div>
	</div>
</div>

