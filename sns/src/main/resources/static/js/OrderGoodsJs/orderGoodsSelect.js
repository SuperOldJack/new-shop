/**
 * 
 */

$.post("/sellManage/orderGoodsSelect",
		"json",function(data){

				for(var i = 0; i < data.length; i++){
					$("#tbl").append("<tr> <td>"+data[i].shop.id+"</td><td>"+data[i].shop.name
										+"</td><td>"+data[i].specification.specificationType
										+"</td><td>"+data[i].goodsDocument.document_type+"</td>"
										+"<td>"+data[i].goodsDocument.create_time+"</td>"
										+"<td>"+data[i].price+"</td>"
										+"<td>"+data[i].goodsDocument.manageMan.name+"</td>"
										+"<td>"+data[i].count+"</td>"
										+"<td>"+"暂时没写计算金额啊"+"</td>"
										+"<td>"+data[i].unit+"</td>"
										+"<td>"+data[i].goodsDocument.code+"</td>"
										+"<td>"+data[i].goodsDocument.manageLib.name+"</td>"
										+"<td>"+data[i].goodsDocument.comment+"</td>"
										+"</tr>");

				}
	 }
	);



