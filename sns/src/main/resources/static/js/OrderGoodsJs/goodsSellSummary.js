/**
 * 
 */
$.post("/sellManage/goodsSummaryAll ",
		"json",function(data){
	console.log(data);
	for(var i = 0; i < data.length; i++){

		$("#tbl").append("<tr> <td>"+data[i].shopInfo.shop.id+"</td><td>"+data[i].shopInfo.shop.name
				+"</td><td>"+data[i].shopInfo.specification.specificationType
				+"</td><td>"
				+"<td>"+data[i].shopInfo.unit.unit_name+"</td>"
				+"<td>"+data[i].handleCount+"</td>"
				+"<td>"+data[i].handleMoney+"</td>"
				+"<td>"+data[i].returnCount+"</td>"
				+"<td>"+data[i].returnMoney+"</td>"
				
				
				
				+"<td>"+(data[i].returnMoney -data[i].returnMoney) +"</td>"
				+"<td>"+(data[i].handleCount-data[i].returnCount)+"</td>"
				+"</tr>");

	}
}
);