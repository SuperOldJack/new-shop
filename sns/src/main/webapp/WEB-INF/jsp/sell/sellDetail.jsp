<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>销售明细</div>

<DIV class=style1 align=center>销售明细表</DIV>
<INPUT id=temp type=hidden name=temp>
</FORM>
<FORM name=excel action=../inc/excel.asp method=post target=_blank>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		value="select goodscode,goodsname,billtype,adddate,t_bill.custname as custname,price,number,money,goodsunit,username,units,t_bill.billcode as billcode,depotname,memo from s_billdetail where flag<>0 and billtype like '销售%' and (AddDate)<=#2010-4-15# and (AddDate)>=#2010-4-1# and depotname in ('酒泉库','武威库','张掖库','成品仓','库房',)"
		name=sql>
	<TABLE id=tbl onclick=sortColumn(event) width=1351 align=center
		border=0>
		<THEAD>
			<TR align=middle>
				<TH style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品编码</TH>
				<TH style="CURSOR: pointer" width=200 type="CaseInsensitiveString">货品名称</TH>
				<TH style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品规格</TH>
				<TH style="CURSOR: pointer" width=70 type="CaseInsensitiveString">业务类型</TH>
				<TH style="CURSOR: pointer" width=81 type="CaseInsensitiveString">开单日期</TH>
				<TH style="CURSOR: pointer" width=60 type="Number">单价</TH>
				<TH style="CURSOR: pointer" width=50 type="CaseInsensitiveString">业务员</TH>
				<TH style="CURSOR: pointer" width=60 type="Number">数量</TH>
				<TH style="CURSOR: pointer" width=80 type="Number">金额</TH>
				<TH style="CURSOR: pointer" width=40 type="CaseInsensitiveString">单位</TH>
				<TH style="CURSOR: pointer" width=140 type="CaseInsensitiveString">单据号</TH>
				<TH style="CURSOR: pointer" width=80 type="CaseInsensitiveString">出货仓</TH>
				<TH style="CURSOR: pointer" width=150 type="CaseInsensitiveString">备注</TH>
			</TR>
		</THEAD>
		<TBODY>
			
		</TBODY>
		<TBODY>
			<TR onmouseover=over() onclick=change() onmouseout=out()>
				<TD align=middle>小计</TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle>2</TD>
				<TD align=middle>0</TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
				<TD align=middle></TD>
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

<script type="text/javascript">
	 $.post("/sellManage/orderGoodsSelect",
		"json",function(data){

				for(var i = 0; i < data.length; i++){
					$("#tbl").append("<tr> <td>"+data[i].shop.id+"</td><td>"+data[i].shop.name
										+"</td><td>"+data[i].specification.specificationType
										+"</td><td>"+data[i].goodsDocument.document_type+"</td>"
										+"<td>"+data[i].goodsDocument.create_time+"</td>"
										+"<td>"+data[i].goodsDocument.manageMan.name+"</td>"
										+"<td>"+data[i].count+"</td>"
										+"<td>"+"暂时没写计算金额啊"+"</td>"
										+"<td>"+data[i].unit+"</td>"
										+"<td>"+data[i].goodsDocument.code+"</td>"
										+"<td>"+data[i].goodsDocument.manageLib.id+"</td>"
										+"</tr>");

				}
	 }
	);
	 
</script>