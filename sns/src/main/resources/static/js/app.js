var flag = true;

function showOrHide() {
	if(flag) {
		$("#left_div").removeClass("left_div_show");
		$("#left_div").addClass("left_div_hide");
		$("#rigth_div").removeClass("rigth_div_small");
		$("#rigth_div").addClass("rigth_div_big");
		flag = false;
	} else {
		$("#rigth_div").removeClass("rigth_div_big");
		$("#rigth_div").addClass("rigth_div_small");
		$("#left_div").removeClass("left_div_hide");
		$("#left_div").addClass("left_div_show");
		flag = true;
	}
}


$(document).ready(function() {
	
});