<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
客户销售汇总
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
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">业务类型</td>
				<td style="CURSOR: pointer" width=81 type="CaseInsensitiveString">开单日期</td>
				<td style="CURSOR: pointer" width=60 type="Number">单价</td>
				<td style="CURSOR: pointer" width=50 type="CaseInsensitiveString">业务员</td>
				<td style="CURSOR: pointer" width=60 type="Number">数量</td>
				<td style="CURSOR: pointer" width=80 type="Number">金额</td>
				<td style="CURSOR: pointer" width=40 type="CaseInsensitiveString">单位</td>
				<td style="CURSOR: pointer" width=140 type="CaseInsensitiveString">单据号</td>
				<td style="CURSOR: pointer" width=80 type="CaseInsensitiveString">出货仓</td>
				<td style="CURSOR: pointer" width=150 type="CaseInsensitiveString">备注</td>
			</TR>
		
			
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

<script type="text/javascript" src="/js/OrderGoodsJs/orderGoodsSelect.js"></script>