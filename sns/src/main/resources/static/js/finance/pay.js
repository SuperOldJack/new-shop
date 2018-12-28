var inLib

//查看付款单的相关单据(入库单)
function relatedDoc(that) {
	console.log('查看付款单的相关单据(入库单)');
	inLib = '666';
	var code = $(that).parent().siblings().eq(1).text();//
	window.open("finance/queryInLibDocInfo?Code=" + code, 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
}

//查看付款单的详情
function detailed(that) {
	console.log('查看付款单的详情');
	var code = $(that).parent().siblings().eq(0).text();
	window.open("finance/queryPayDocInfo?Code=" + code, 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no');
}

//付款单的js
function queryPayDoc() {
	console.log("查询数据");
	/*$("#main").load("/finance/queryPayment");*/
	$.ajax({
		"url":"finance/queryPayment",
		"type":"get",
		"success":function(data) {
			console.log(data);
			 var payList = data
			 var payHtml = "";
			 for(var i = 0; i < payList.length; i++) {
				  payHtml += "<tr><td>" + payList[i].payment.goods.code + "</td>";
				  payHtml += "<td>" + payList[i].inputlib.goodsDocument.code + "</td>";
				  payHtml += "<td>" + payList[i].payment.actual_money + "</td>";
				  payHtml += "<td>" + payList[i].payment.comment + "</td>";
				  payHtml += "<td><button class='btn btn-primary'onclick='relatedDoc(this)'>相关单据</button> ";
				  payHtml += "&nbsp;&nbsp;&nbsp;<button class='btn btn-primary' onclick='detailed(this)'>查看详情</button></td></tr>";
			 }
			 //console.log("payHtml:"+payHtml);
			 $("#payInfoTable").html(payHtml);
		}
	});
}

$(function() {
	queryPayDoc();
})