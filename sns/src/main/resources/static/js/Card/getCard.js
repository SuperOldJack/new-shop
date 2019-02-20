function getCard(node){
	$.post("/card/getCard",
		 "json",function(data){
			console.log(data);
			
			$.each(data,function(){
				node.append("<option value="+this.id+">"+this.name+"</option>");
			});
			
		 }
	);
}