<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
货品销售汇总
</div>

<INPUT id=temp type=hidden name=temp>
</FORM>
<FORM name=excel action=../inc/excel.asp method=post target=_blank>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		
		name=sql>
	<TABLE id=tbl onclick=sortColumn(event) width=1351 align=center
		border=0>
		<TBODY>
			<TR align=middle>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品编码</td>
				<td style="CURSOR: pointer" width=200 type="CaseInsensitiveString">货品名称</td>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品规格</td>
				<td style="CURSOR: pointer" width=60 type="Number">单价</td>
				<td style="CURSOR: pointer" width=60 type="Number">销售数量</td>
				<td style="CURSOR: pointer" width=80 type="Number">销售金额</td>
				<td style="CURSOR: pointer" width=60 type="Number">退货数量</td>
				<td style="CURSOR: pointer" width=80 type="Number">退货金额</td>
				<td style="CURSOR: pointer" width=60 type="Number">总金额</td>
				<td style="CURSOR: pointer" width=80 type="Number">总数量</td>
			</TR>
		
			
		</TBODY>
		<TBODY>
			<TR onmouseover=over() onclick=change() onmouseout=out()>
			</TR>
		</TBODY>
	</TABLE>
	<TABLE width=1351 align=center border=0>
		<TBODY>
			<TR>
				<TH align=left colSpan=14><FONT style="FONT-FAMILY: Webdings">9
						3</FONT> [1] <FONT style="FONT-FAMILY: Webdings">4 :</FONT> [页次:1/1页]
					[共2条] [20条/页] <SCRIPT>
function tiaozhuan(){
var yema=document.getElementById("yema").value
document.form1.action='#';
document.form1.submit();
}
</SCRIPT> 转到第：<INPUT id=yema size=1>页<LABEL class=button1><INPUT
						onclick=tiaozhuan() type=button value=GO></LABEL> <LABEL
					class=button1><INPUT type=submit value=Excel></LABEL></TH>
			</TR>
		</TBODY>
	</TABLE>
</FORM>


<script type="text/javascript" >
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
	
</script>
