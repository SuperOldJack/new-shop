/**
 * 用于管理货物信息
 * 弹出货物信息窗口
 */


function add_row(){
	window.open("/goodsInfo/addgoodsManage","","top=200,left=200,width=1200,height=600");
	
}

function reload(goods){
	 goods =$(goods).find("tr"); 
	
	 $.each(goods, function(){     
		 $("#sqd").find("tbody").append(this);
	 });  
	
	
	
}
