<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<BR>
<DIV class=STYLE1 align=center>选择退货</DIV>
<FORM name=form1  method=post>
<TABLE align=center border=0>
  <TBODY>
  <TR>
    <TD align=middle>制单日期：<INPUT id=date name=date><INPUT style="CURSOR: hand" 
      onclick="setDay(date);return false;" type=image height=16 width=18 
      src="../images/date.gif"></TD>
    <TD align=middle>供应商/客户：<INPUT id=cust name=cust><A 
      onclick="JavaScript:window.open ('../System/selectcust.htm', 'newwindow', 'height=600, width=800,top=100,left=150, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no')" 
      href="#"><IMG 
      height=17 src="../images/choose.gif" width=21 border=0></A></TD>
    <TD align=middle><INPUT class=button type="button" value=" 查 找 "> 
  </TD></TR></TBODY></TABLE></FORM>
<FORM name=backbill action=backbill.asp?type=XT method=post>
<DIV align=center><INPUT class="button but_mar" onClick="return check();" type=submit value=" 退 货 "></DIV><INPUT 
id=temp type=hidden name=temp></FORM>

	<TABLE id=tbl onclick=sortColumn(event) width=550 align=center border=0>
	  <THEAD>
	  <TR align=middle>
	    <TH style="CURSOR: pointer" width=150 type="CaseInsensitiveString">单 号</TH>
	    <TH style="CURSOR: pointer" width=100 type="CaseInsensitiveString">制单日期</TH>
	    <TH style="CURSOR: pointer" width=200 
	    type="CaseInsensitiveString">供应商/客户</TH>
	    <TH style="CURSOR: pointer" width=100 
	  type="CaseInsensitiveString">经办人</TH></TR></THEAD>
	</TABLE>'
