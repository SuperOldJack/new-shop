<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<P align=center><SPAN class=STYLE1>销售单查询</SPAN></P>
<FORM name=form1   method=post>
<TABLE width=780 align=center border=0>
  <TBODY>
  <TR>
    <TD align=middle>制单日期：<INPUT id=date name=date><INPUT style="CURSOR: hand" 
      onclick="setDay(date);return false;" type=image height=16 width=18 
      src="../images/date.gif"></TD>
    <TD align=middle>供应商/客户：<INPUT id=cust name=cust><A 
      onclick="JavaScript:window.open ('../System/selectcust.htm', 'newwindow', 'height=600, width=800,top=100,left=150, toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no, status=no')" 
      href="#"><IMG 
      height=17 src="../images/choose.gif" width=21 border=0></A></TD>
    <TD align=middle><INPUT class=button type="button" value=" 查 找 "> 
  </TD></TR></TBODY></TABLE></FORM>
<TABLE id=tbl width=800 align=center>
  <TBODY>
  <TR align=middle>
    <TH>&nbsp;</TH>
    <TH>单 号</TH>
    <TH>单据类型</TH>
    <TH>制单日期</TH>
    <TH>客 户</TH>
    <TH>仓库</TH>
    <TH>经办人</TH></TR>
  <TR onmouseover=over() onclick=change() onmouseout=out() align=middle>
    <TD><A 
      href="editbill.htm">修改</A>&nbsp;&nbsp;&nbsp;&nbsp;<A 
      onclick="del('XS-2010-04-15-0001')" 
      href="#">删除</A>&nbsp;&nbsp;&nbsp;&nbsp;<A 
      href="detail.htm">详情</A></TD>
    <TD>XS-2010-04-15-0001</TD>
    <TD>销售出库</TD>
    <TD>2010-4-15</TD>
    <TD>asdf</TD>
    <TD>库房</TD>
    <TD></TD></TR></TBODY></TABLE>
<TABLE width=800 align=center border=0>
  <TBODY>
  <TR>
    <TH align=left colSpan=6><FONT style="FONT-FAMILY: Webdings">9 3</FONT> 
      [1] <FONT style="FONT-FAMILY: Webdings">4 :</FONT> [页次:1/1页] [共1条] [20条/页]
      <SCRIPT>
function tiaozhuan(){
var yema=document.getElementById("yema").value
document.form1.action='/lenobs/bsjxc/Bills/selectbill.asp?type=xs&page='+yema;
document.form1.submit();
}
</SCRIPT>
       转到第：<INPUT id=yema size=1>页<LABEL class=button1><INPUT onclick=tiaozhuan() type=button value=GO></LABEL> 
  </TH></TR>