//付款单的js
function queryPayDoc() {
	/*$("#main").load("/finance/queryPayment");*/
	$.ajax({
		"url":"finance/queryPayment",
		"type":"get",
		"success":function(data) {
			console.log(data);
			 var payList = data
			 var payHtml = "";
			 for(var i = 0; i < payList.length; i++) {
				  payHtml += "<tr><td>" + payList[i].payment.docCode + "</td>";
				  payHtml += "<td>" + payList[i].inLibAndSup.goodsCode + "</td>";
				  payHtml += "<td>" + payList[i].payment.actual_money + "</td>";
				  payHtml += "<td>" + payList[i].payment.comment + "</td></tr>";
			 }
			 //console.log("payHtml:"+payHtml);
			 $("#payInfoTable").html(payHtml);
		}
	});
}

$(function() {
	queryPayDoc();
})