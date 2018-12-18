var flag = true;//左侧菜单显示/隐藏控制
var flag2 = true;//登录注册表单切换控制

function showOrHide() {
	if(flag) {
		$("#left_div").removeClass("left_div_show");
		$("#left_div").addClass("left_div_hide");
		$("#rigth_div").removeClass("rigth_div_small");
		$("#rigth_div").addClass("rigth_div_big");
		flag = false;
	} else {
		$("#rigth_div").removeClass("rigth_div_big");
		$("#rigth_div").addClass("rigth_div_small");
		$("#left_div").removeClass("left_div_hide");
		$("#left_div").addClass("left_div_show");
		flag = true;
	}
}

//打开登录注册模态框
function openModal() {
	$(".modal_hide").removeClass("modal_hide");
	changeLR();
}
//关闭登录注册模态框
function hideModal() {
	$(".lr_modal").addClass("modal_hide");
	$(".modal_bg").addClass("modal_hide");
}

//切换登录注册
function changeLR() {
	if(flag2) {
		//注册
		$("#regForm").removeClass("modal_hide");
		$("#loginForm").addClass("modal_hide");
		$(".propmt_text span").text("已有账号?");
		$(".propmt_text a").text("登录");
		flag2 = false;
	} else {
		//登录
		$("#loginForm").removeClass("modal_hide");
		$("#regForm").addClass("modal_hide");
		$(".propmt_text span").text("没有账号?");
		$(".propmt_text a").text("注册");
		flag2 = true;
	}
}

$(document).ready(function() {
	
});