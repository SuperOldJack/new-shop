<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="/js/jquery-3.3.1.js"></script>
<script>
function check() {
	var flag = false;
	if($("input[name='name']").trim() == '') {
		alert("姓名不能为空");
	}else {flag = true;}
	if($("input[name='address']").trim() == '') {
		alert("住址不能为空");
	}else {flag = true;}
	if($("input[name='e-mail']").trim() == '') {
		alert("邮箱不能为空");
	}else {flag = true;}
	if($("input[name='phone']").trim() == '') {
		alert("电话不能为空");
	}else {flag = true;}
	if($("input[name='birthday']").trim() == '') {
		alert("生日不能为空");
	}else {flag = true;}/* basicData	empData */
	if(flag) {
		/* $("#addEmpForm").submit(); */
		addEmp();
	}	
}

 function addEmp() {
	var $name = $("select[name='name']").val();
	var $sex = $("select[name='sex']").val();
	var $address = $("select[name='address']").val();
	var $e_mail = $("select[name='e-mail']").val();
	var $phone = $("select[name='phone']").val();
	var $birthday = $("select[name='birthday']").val();
	$.post("addEmp", {"name":$name,"sex":$sex,"address":$address,"e_mail":$e_mail,"phone":$phone,"brithday":$birthday},
		function(r){consoloe.log(r),"JSON"}		
	);
	/* $.post("addEmp",
		{"name":$name,"sex":$sex,"address":$address,"e_mail":$e_mail,"phone":$phone,"brithday":$birthday},
		function(data) {
			console.log(data);
			console.log("1");
		},
		"json"
	); */
	console.log("2");
}
</script>
<div class="main_div">
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#addEmpBtn">新增员工</button>
</div>


<div class="modal fade" id="addEmpBtn">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<h4 class="modal-title">新增员工</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<div class="modal-body">
				<form id="addEmpForm" action="/addEmp" method="post">
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
					<button type="submit" class="btn btn-primary" onclick="check()">添加员工</button>
				</form>
			</div>

			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
			</div>

		</div>
	</div>
</div>

