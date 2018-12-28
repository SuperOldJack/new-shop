<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<TITLE>订单浏览</TITLE>



<META content="MSHTML 6.00.6000.16981" name=GENERATOR>
</HEAD>
<BODY>
	<BR>
	<DIV class=STYLE1 align=center>其他入库单查询</DIV>
	<FORM name=form1 method=post>
		<TABLE align=center>
			<TBODY>
				<TR>
					<TD width=50>从日期：</TD>
					<TD width=150><INPUT size=16 value=2010-4-1 name=date1><INPUT
						style="CURSOR: hand" onClick="setDay(date1);return false;"
						type=image height=16 width=18 src="../images/date.gif"></LABEL></TD>
					<TD width=50>到日期：</TD>
					<TD width=150><INPUT size=16 value=2010-4-15 name=date2><INPUT
						style="CURSOR: hand" onClick="setDay(date2);return false;"
						type=image height=16 width=18 src="../images/date.gif"></TD>
					<TD rowSpan=2><INPUT class=button type=submit value=" 查 找 "></TD>
				</TR>
				<TR>
					<TD width=50>供应商：</TD>
					<TD colSpan=3><INPUT id=cust size=45 name=custname><A
						onclick="JavaScript:window.open ('../System/selectcust.htm', 'selectcust', 'height=600, width=800,top=100,left=150, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no')"
						href="#"><IMG height=17 src="../images/choose.gif" width=21
							border=0></A></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
	<INPUT type=hidden name=temp>
	<INPUT id=temp1 onpropertychange=change_key() type=hidden name=temp1>
	<TABLE id=tbl style="WORD-BREAK: break-all" cellSpacing=0 cellPadding=3
		width=850 align=center border=0 empty-cells:show>
		<TBODY>
			<TR
				style="BORDER-BOTTOM: black 2px solid; HEIGHT: 25px; BACKGROUND-COLOR: #999999"
				align=middle bgColor=#ffffff>
				<TH width=120 bgColor=#c5cdd1>单 号</TH>
				<TH width=80 bgColor=#c5cdd1>制单日期</TH>
				<TH width=200 bgColor=#c5cdd1>供应商/客户</TH>
				<TH width=100 bgColor=#c5cdd1>经办人</TH>
				<TH width=200 bgColor=#c5cdd1>操作</TH>
			</TR>
			<TR id=tr onMouseOver="GetDIV('block',1)"
				onMouseOut="GetDIV('none',1)" align=middle bgColor=#ffffff>
				<TD onmousemove=addtext(1)>RK-2010-04-15-0001</TD>
				<TD onmousemove=addtext(1)>2010-4-15</TD>
				<TD onmousemove=addtext(1)>asdf</TD>
				<TD onmousemove=addtext(1)></TD>
				<TD><INPUT class=button onClick="edit('RK-2010-04-15-0001');"
					type=button value=修改> <INPUT class=button
					onClick="del('RK-2010-04-15-0001');" type=button value=删除></TD>
			</TR>
		</TBODY>
	</TABLE>
	<TABLE width=850 align=center border=0>
		<TBODY>
			<TR>
				<TH align=left colSpan=6><FONT style="FONT-FAMILY: Webdings">9
						3</FONT> [1] <FONT style="FONT-FAMILY: Webdings">4 :</FONT> [页次:1/1页]
					[共1条] [20条/页] <SCRIPT>
					function tiaozhuan(){
					var yema=document.getElementById("yema").value
					document.form1.action='#';
					document.form1.submit();
					}
				</SCRIPT> 转到第：<INPUT id=yema size=1>页<LABEL class=button1><INPUT
						onclick=tiaozhuan() type=button value=GO></LABEL></TH>
			</TR>
		</TBODY>
	</TABLE>
	</FORM>
	<DIV class=billdetail id=search_suggest
		style="DISPLAY: none; POSITION: absolute"></DIV>