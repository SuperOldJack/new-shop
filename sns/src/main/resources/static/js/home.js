$.hulla = new hullabaloo();

$(document).ready(function() {
	$("#getbank").click(function() {
		$.post("/bank/getBankList",function(r) {
			alert("ok");
			console.log(r);
		}, "JSON");
	});
	
	$("#validate").click(function() {
		$.post(
			"/bank/validate",
			{id:"123456"},
			function(r) {
				$.hulla.send("验证完成"+r, "success");
			},
			"JSON"
		);
	});
});