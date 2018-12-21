<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script type="text/javascript">
	 $.post("/sellManage/showOrderGoods",
		"json",function(data){
				
				for(var i = 0; i < data.length; i++){
					$("#tbl").append("<tr> <td>"+data[i].goodsDocument.code+"</td><td>"+data[i].goodsDocument.create_time+"</td><td>"+data[i].client.name+"</td><td>"+data[i].goodsDocument.manageMan.name+"</td></tr>");

				}
	 }
	);
	 
</script>

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
<FORM name=excel action=../inc/excel.asp method=post target=_blank><INPUT 
type=hidden value=selectback1 name=table><INPUT type=hidden 
value="select distinct billcode,adddate,custname,username from ((select * from s_billdetail where billtype='销售出库'  and 1=1 and 1=1 order by adddate desc) as s1 left join (select planbillcode,goodscode,iif(sum(number) is null,0,sum(number)) as t_tnum from s_billdetail group by planbillcode,goodscode) as s2 on s2.planbillcode = s1.billcode) where number > t_tnum" 
name=sql>
<TABLE id=tbl onclick=sortColumn(event) width=550 align=center border=0>
  <THEAD>
  <TR align=middle>
    <TH style="CURSOR: pointer" width=150 type="CaseInsensitiveString">单 号</TH>
    <TH style="CURSOR: pointer" width=100 type="CaseInsensitiveString">制单日期</TH>
    <TH style="CURSOR: pointer" width=200 
    type="CaseInsensitiveString">供应商/客户</TH>
    <TH style="CURSOR: pointer" width=100 
  type="CaseInsensitiveString">经办人</TH></TR></THEAD>
  <TBODY>
  </TBODY></TABLE>
<TABLE width=550 align=center border=0>
  <TBODY>
  <TR>
    <TH align=left colSpan=4><FONT style="FONT-FAMILY: Webdings">9 3</FONT> 
      [1] <FONT style="FONT-FAMILY: Webdings">4 :</FONT> [页次:1/1页] [共1条] [20条/页]
      <SCRIPT>
function tiaozhuan(){
var yema=document.getElementById("yema").value
document.form1.action='#';
document.form1.submit();
}
</SCRIPT>
       转到第：<INPUT id=yema size=1>页<LABEL class=button1><INPUT onclick=tiaozhuan() type=button value=GO></LABEL> 
      <LABEL 
class=button1><INPUT type=submit value=Excel></LABEL></TH></TR></TBODY></TABLE></FORM>
