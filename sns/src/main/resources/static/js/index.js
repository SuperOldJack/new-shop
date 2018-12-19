$(function() {
	var menuArr = [
			{
				"purchaseTxt":["新增采购订单","采购订单查询"],
				"purchaseFun":["addPurchaseOrder()","findPurchaseOrder()"]
			}
		];
	
	for(var i = 0; i < menuArr.length; i++) {
		for(var j = 0; j < menuArr[i].purchaseTxt.length; j++) {
			console.log(menuArr[i].purchaseTxt[j]);
			console.log(menuArr[i].purchaseFun[j]);
		}
	}
});


/*{
	menuParentItem : [
		purchaseTxt:["新增采购订单","采购订单查询"],
		purchaseFunction:["addPurchaseOrder()","findPurchaseOrder()"]
	]
}*/