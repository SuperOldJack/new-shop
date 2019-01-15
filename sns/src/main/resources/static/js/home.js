function loadPage(that) {
	console.log(that);
	var mid = $(that).attr("mid");
	var systemtype = $(that).attr("systemtype");
	$("#main").load("/home/"+systemtype+"/"+mid,function(){
		
		$("#main").append("<input id='url' type='hidden' mid='"+mid+"' systemtype='"+systemtype+"'/>" );
	});
}

//初始化菜单项                                                                                             
function initPage() {
	var menuParentArr = ["purchase","sell","stock","finance","stockAndBill","other","basicData","system"];
	var menuHtml = "";
	var menuArr = [
			{//采购管理
				"texts":["新增采购单","采购单查询","采购退货","采购明细表","货品采购汇总表","供应商采购汇总表","采购订单完成情况"],
				"urls":["addPurchase","findPurchase","purchaseReturn","purchaseDetail","purchaseSummary","supplierSummary","purchaseOrderStatus"]
			},
			{//销售管理 	
				"texts":["新增销售单","销售单查询","销售退货","销售明细表","货品销售汇总表","客户销售汇总表","销售订单完成情况"],
				"urls":["addSell","findSell?currentPageNo=0","sellRturn","sellDetail?currentPageNo=0","sellSummary?currentPageNo=0","CSellSummary?currentPageNo=0","sellOrderStatus"]
			},
			{//库存管理
				"texts":["新增入库单","入库单查询","新增出库单","出库单查询","仓库调拨","库存盘点"],
				"urls":["addInputLib","findInputLib","addOutputLib","findOutputLib","libAllocate","stockCheck"]
			},
			{//财务管理
				"texts":["付款单","收款单","其他收入","其他支出","账户查询","账户余额查询","应付账款表-单据","应付账款表-往来单位","应收账款表-单据","应收账款表-往来单位"],
				"urls":["pay","receipts","otherPay","otherReceipts","findAccount","findResidual","S-pay-D","S-pay-unit","S-Receipts-D","S-Receipts-unit"]
			},
			{//库存和单据查询
				"texts":["单据查询","库存数量查询","库存报警","库存汇总","库存明细"],
				"urls":["findDocument","findStockNum","stockAlarm","stockSummary","stockDetail"]
			},
			{//其他报表
				"texts":["其他明细报表","利润分析","销售排行","销售统计","进销存报表"],
				"urls":["otherDetail","profitAnalysis","sellRanking","sellStatistics","jxc"]
			},
			{//基础资料
				"texts":["往来单位资料","货品资料","员工信息","仓库资料","计量单位","帐户信息","公司信息"],
				"urls":["unitData","goodsData","empData","libData","measUnit","accountData","companyData"]
			},
			{//系统管理
				"texts":["操作员管理","系统设置","数据初始化"],
				"urls":["adminManagement","systemSet","dataInit"]
			},
		];
	
	for(var i = 0; i < menuArr.length; i++) {
		for(var j = 0; j < menuArr[i].texts.length; j++) {
			menuHtml += "<div class='mdc-list-item mdc-drawer-item'>";
			menuHtml += "<a class='mdc-drawer-link' href='javascript:'" +
					" onclick='loadPage(this)' systemtype='"+menuParentArr[i]+"' mid='"+menuArr[i].urls[j]+"'>"
				+ menuArr[i].texts[j]+"</a>";
			menuHtml += "</div>";
			/*console.log(menuArr[i].text[j]);
			console.log(menuArr[i].functions[j]);*/
		}
		$("#"+menuParentArr[i]).find(".mdc-list").html(menuHtml);
		menuHtml = "";
	}
}

function loginSubmit() {
	$("$loginFrom").submit();
}

var flag2 = true;//登录注册表单切换控制

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

//得到上一次操作的东西
function getLast() {
	$.ajax({
		url:"getLast",
		post:"get",
		success : function(data) {
			var last = data;
			if(last != null && last.trim() != '') {
				$("#main").load(last);
			}
		}
	});
}


$(function() {
	initPage();
	getLast();
	
	//滑块验证
	/*console.log(parseFloat('1px'))*/
	var SlideVerifyPlug = window.slideVerifyPlug;
	var slideVerify = new SlideVerifyPlug('#verify-wrap',{
		wrapWidth:'300',
        initText:'请按住向右滑动',
        sucessText:'验证通过',
        getSucessState:function(res){
       		console.log(res);
       	}
	});
});
