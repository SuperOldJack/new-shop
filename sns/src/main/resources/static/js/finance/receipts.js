//付款单的js
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
				  recHtml += "<tr><td>" + recList[i].payment.docCode + "</td>";
				  recHtml += "<td>" + recList[i].inLibAndSup.goodsCode + "</td>";
				  recHtml += "<td>" + recList[i].payment.actual_money + "</td>";
				  recHtml += "<td>" + recList[i].payment.comment + "</td></tr>";
			 }
			 //console.log("recHtml:"+recHtml);
			 $("#recInfoTable").html(recHtml);
		}
	});
}

$(function() {
	queryrecDoc();
})