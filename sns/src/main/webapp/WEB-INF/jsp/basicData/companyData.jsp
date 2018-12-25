<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	//查询公司信息
	function queryCompanyInfo() {
		$.ajax({
			url : "queryCompanyInfo",
			type : "get",
			success : function(data) {
				console.log(data);
				$("input[name='name']").val(data.name);
				$("input[name='linkMan']").val(data.linkman);
				$("input[name='e_mail']").val(data.e_mail);
				$("input[name='phone']").val(data.phone);
				$("input[name='address']").val(data.address);
				return data;
			}
		});
	}

	$(function() {
		var comInfo = queryCompanyInfo();
		//console.log(comInfo);
	});
</script>
<div class="main_div">
	<h3>公司信息</h3>
	<div class="companyInfoDiv">
	<form id="updateCompanyInfo" action="/" method="post">
		<div class="form-group">
			<label>公司名称:</label> <input class="form-control" name="name" value="">
		</div>
		<div class="form-group">
			<label>联系人:</label> <input class="form-control" name="linkMan" value="">
		</div>
		<div class="form-group">
			<label>公司邮箱:</label> <input class="form-control" name="e_mail" value="">
		</div>
		<div class="form-group">
			<label>公司电话:</label> <input class="form-control" name="phone" value="">
		</div>
		<div class="form-group">
			<label>公司地址:</label> <input class="form-control" name="address" value="">
		</div>
		<button type="submit" class="btn btn-primary">修改</button>
	</form>
	</div>
</div>

