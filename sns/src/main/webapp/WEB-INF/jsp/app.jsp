<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" >
<link rel="stylesheet" href="/css/app.css" >
<link rel="stylesheet" href="/css/font-awesome.min.css" >
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/hullabaloo.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="pageBody">
	<div class="app_body">
		<div id="left_div" class="left_div_show">
			<div class="logo_div">
				<img class="logo_img" alt="" src="images/ns3_1.png">
			</div>
			<div class="left_mune_div">
				<ul>
					<li>
						<a>菜单1</a>
					</li>
					<li>
						<a>菜单2</a>
					</li>
					<li>
						<a>菜单2</a>
					</li>
				</ul>
			</div>
		</div>
		<div id="rigth_div" class="rigth_div_small">
			<div class="rigth_head_div">
					<a class="show_left_mune" onclick="showOrHide()">菜单</a>
				<div class="rigth_menu">
					<ul>
						<li>
							<div class="tx_div">
								<img class="tx_img" alt="" src="images/xiangjiao.jpg">
							</div>
						</li>
						<li><a>选项1</a></li>
						<li><a>选项1</a></li>
						<li><a>选项3</a></li>
						<li><a onclick="openModal()">登录|注册</a></li>
					</ul>
				</div>
			</div>
			<div class="rigth_body_div">
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
				<span class="pi">写个屁啊</span><br/><span class="pi">写个屁啊</span><br/>
			</div>
		</div>
	</div>
	</div>
	<div class="modal_bg modal_hide" onclick="hideModal()"></div>
	<div class="lr_modal modal_hide">
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
	</div>
</body>
</html>