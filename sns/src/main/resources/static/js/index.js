function loadPage(that) {
	var url = $(that).attr("data-url");
	$("#main").load(url);
}

$(function() {
	var menuParentArr = ["purchase","sell","stock","finance","stockAndBill","other","basicData","system"];
	var menuHtml = "";
	var menuArr = [
			{//采购管理
				"texts":["新增采购订单","采购订单查询","新增采购单","采购单查询","采购退货","采购明细表","货品采购汇总表","供应商采购汇总表","采购订单完成情况"],
				"urls":["1","2","3","4","5","6","7","8","9"]
			},
			{//销售管理
				"texts":["新增销售订单","销售订单查询","新增销售单","销售单查询","销售退货","销售明细表","货品销售汇总表","客户销售汇总表","销售订单完成情况"],
				"urls":["fun()","fun()","fun()","fun()","fun()","fun()","fun()","fun()","fun()"]
			},
			{//库存管理
				"texts":["新增入库单","入库单查询","新增出库单","出库单查询","仓库调拨","库存盘点"],
				"urls":["fun()","fun()","fun()","fun()","fun()","fun()"]
			},
			{//财务管理
				"texts":["付款单","收款单","其他收入","其他支出","账户查询","账户余额查询","应付账款表-单据","应付账款表-往来单位","应收账款表-单据","应收账款表-往来单位"],
				"urls":["fun()","fun()","fun()","fun()","fun()","fun()","fun()","fun()","fun()","fun()"]
			},
			{//库存和单据查询
				"texts":["单据查询","库存数量查询","库存报警","库存汇总","库存明细"],
				"urls":["fun()","fun()","fun()","fun()","fun()"]
			},
			{//其他报表
				"texts":["其他明细报表","利润分析","销售排行","销售统计","进销存报表"],
				"urls":["fun()","fun()","fun()","fun()","fun()"]
			},
			{//基础资料
				"texts":["往来单位资料","货品资料","员工信息","仓库资料","计量单位","帐户信息","公司信息"],
				"urls":["fun()","fun()","fun()","fun()","fun()","fun()","fun()"]
			},
			{//系统管理
				"texts":["操作员管理","系统设置","数据初始化"],
				"urls":["fun()","fun()","fun()",]
			},
		];
	
	for(var i = 0; i < menuArr.length; i++) {
		for(var j = 0; j < menuArr[i].texts.length; j++) {
			menuHtml += "<div class='mdc-list-item mdc-drawer-item'>";
			menuHtml += "<a class='mdc-drawer-link' href='javascript:' data-url ='"
				/*+ "/" + menuParentArr[i]*/+"/"+ menuArr[i].urls[j]+"' onclick='loadPage(this)'>"
				+ menuArr[i].texts[j]+"</a>";
			menuHtml += "</div>";
			/*console.log(menuArr[i].text[j]);
			console.log(menuArr[i].functions[j]);*/
		}
		$("#"+menuParentArr[i]).find(".mdc-list").html(menuHtml);
		menuHtml = "";
	}
	
});
//class="tabs-link" href="javascript:" data-url="people/MyQuestions.jsp"
/*$(".atten").click(function() {
		var url = $(this).attr("data-url");
		$(".proFile-main").load(url);
	});*/
/*<nav class="mdc-list mdc-drawer-submenu">
<div class="mdc-list-item mdc-drawer-item">
  <a class="mdc-drawer-link">
   	子菜单1
  </a>
</div>
</nav>*/
