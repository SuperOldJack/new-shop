//打开新增采购单子窗体
function openAddGoodsChildren() {
	window.open("/goodsInfo/addgoodsManage", "children",
			"top=200,left=200,width=600,height=600");
}

function addRow(data) {
	alert("666");
	$("#goodsDiv").append(data);
}

