//查看收款单的相关单据(出库单)
function relatedDoc(that) {
	//alert('查看收款单的相关单据(出库单)');
	var inLib = null;
	var code = $(that).parent().siblings().eq(1).text();//, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no
	window.open("finance/queryOutLibInfo?Code=" + code, 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
}

//查看收款单的详情
function detailed(that) {
	//alert('查看收款单的详情');
	var inLib = null;
	var code = $(that).parent().siblings().eq(0).text();
	window.open("finance/queryRecDocInfo?Code=" + code, 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
}

//收款单的js
function queryrecDoc() {
	/*$("#main").load("/finance/queryrecment");*/
	$.ajax({
		"url":"finance/queryReceipts",
		"type":"get",
		"success":function(data) {
			console.log(data);
			 var recList = data
			 var recHtml = "";
			 for(var i = 0; i < recList.length; i++) {
				  recHtml += "<tr><td>" + recList[i].payment.goods.code + "</td>";
				  recHtml += "<td>" + recList[i].outputlib.goodsDocument.code + "</td>";
				  recHtml += "<td>" + recList[i].payment.actual_money + "</td>";
				  recHtml += "<td>" + recList[i].payment.comment + "</td>";
				  recHtml += "<td><button class='btn btn-primary'onclick='relatedDoc(this)'>相关单据</button>";
				  recHtml += "<button class='btn btn-primary'onclick='detailed(this)'>查看详情</button></td></tr>";
			 }
			 $("#recInfoTable").html(recHtml);
		}
	});
}

$(function() {
	queryrecDoc();
})