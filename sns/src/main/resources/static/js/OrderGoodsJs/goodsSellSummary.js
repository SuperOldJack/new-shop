/**
 * 
 */
$.post("/sellManage/goodsDetailAll ",
		"json",function(data){
	alert("aaa");
	for(var i = 0; i < data.length; i++){

		$("#tbl").append("<tr> <td>"+data[i].shop.id+"</td><td>"+data[i].shop.name
				+"</td><td>"+data[i].specification.specificationType
				+"</td><td>"
				+"<td>"+data[i].unit.unit_name+"</td>"
				+"<td>"+data[i].handleGoodsCount+"</td>"
				+"<td>"+data[i].handleGoodsMoney+"</td>"
				+"<td>"+data[i].returnGoodsCount+"</td>"
				+"<td>"+data[i].returnGoodsMoney+"</td>"
				
				
				
				+"<td>"+(data[i].returnGoodsMoney*data[i].returnGoodsCount - data[i].returnGoodsCount * data[i].returnGoodsMoney) +"</td>"
				+"<td>"+(data[i].handleGoodsCount-data[i].returnGoodsCount)+"</td>"
				+"</tr>");

	}
}
);