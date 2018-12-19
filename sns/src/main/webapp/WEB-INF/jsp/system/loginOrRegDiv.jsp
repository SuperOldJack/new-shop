<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
<script src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<div class="lr_logo_div">
			<img class="logo_img" alt="" src="images/ns3_1.png">
		</div>
		<div id="regForm" class="modal_hide lr_from ">
			<form>
				<div class="form-group">
					<label for="email">手机号:</label> <input type="text"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="pwd">密码:</label> <input type="password"
						class="form-control">
				</div>
				<div class="submit_div">
					<a class="submit_btn" onclick="regSubmit()">注册</a>
				</div>
			</form>
		</div>

		<div id="loginForm" class="lr_from">
			<form>
				<div class="form-group">
					<label for="email">账号:</label> <input type="text"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="pwd">密码:</label> <input type="password"
						class="form-control">
				</div>
				<div class="submit_div">
					<a class="submit_btn" onclick="regSubmit()">登录</a>
				</div>
			</form>
		</div>
		<div class="propmt_text">
			<span>已有账号?</span><a onclick="changeLR()">登录</a>
		</div>