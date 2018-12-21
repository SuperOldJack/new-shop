<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	$(function() {
		var comInfo = getCompanyData();
	});
</script>
<div class="main_div">
	<h3>公司信息</h3>
	<form id="updateCompanyInfo" action="/addEmp" method="post">
		<div class="form-group">
			<label>公司名称:</label> <input class="form-control" name="name" value="">
		</div>
		<div class="form-group">
			<label>联系人:</label> <input class="form-control" name="name" value="">
		</div>
		<div class="form-group">
			<label>公司邮箱:</label> <input class="form-control" name="name" value="">
		</div>
		<div class="form-group">
			<label>公司电话:</label> <input class="form-control" name="name" value="">
		</div>
		<div class="form-group">
			<label>公司地址:</label> <input class="form-control" name="name" value="">
		</div>
		<button type="submit" class="btn btn-primary">修改</button>
	</form>
</div>

