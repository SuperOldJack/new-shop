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
		<div id="regForm" class="reg_from modal_hide">
			<form action="">
				<label>注册form、</label> <label>电话</label><input> <label>验证码</label><input>
			</form>
		</div>

		<div id="loginForm" class="login_from">
			<form action="">
				<label>登录form、</label> <label>电话</label><input> <label>验证码</label><input>
			</form>
		</div>
		<button onclick="changeLR()">切换</button>
		<!-- <div class="lr_head">
			
		</div> -->
	</div>
</body>
</html>
<!-- <form>
	<div class="form-group">
		<label for="email">Email address:</label> <input type="email"
			class="form-control" id="email">
	</div>
	<div class="form-group">
		<label for="pwd">Password:</label> <input type="password"
			class="form-control" id="pwd">
	</div>
	<div class="form-check">
		<label class="form-check-label"> <input
			class="form-check-input" type="checkbox"> Remember me
		</label>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
</form> -->