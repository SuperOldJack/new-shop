<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<BR>
<DIV class=STYLE1 align=center>选择退货</DIV>
<TABLE align=center border=0>
  <TBODY>
  <TR>
    <TD align=middle>制单日期：起始:<INPUT id=date name=date>   结束:<INPUT id=date name=date></TD>
    <TD align=middle>供应商/客户：<INPUT id=cust name=cust></TD>
    <TD align=middle>销售单号：<INPUT id=cust name=cust> </TD>
    <TD align=middle><INPUT class=button type="button" value=" 查 找 ">  </TD>
  
  	<td><INPUT class="btn btn-light btn-sm" onclick="show()"  data-toggle="modal" data-target="#returnModal" value="退 货 "></td>
  </TR></TBODY></TABLE>


	<TABLE id=tbl width=100% align=center border=0>
	  <THEAD>
		  <TR align=middle>
		    <TH style="text-align: center;" width=150 >单 号</TH>
		    <TH style="text-align: center;" width=100 >制单日期</TH>
		    <TH style="text-align: center;" width=200 >供应商/客户</TH>
		    <TH style="text-align: center;" width=100 >经办人</TH>
	      </TR>
      </THEAD>
	  <c:forEach var="item" items="${data.pageData}">
			<tr align="center" onclick="select(this)" code="${item.goodsDocument.code}">
				<td>${item.goodsDocument.code}</td>
				<td>${item.goodsDocument.create_time}</td>
				<td>${item.client.name}</td>
				<td>${item.goodsDocument.manageMan.name}</td>
			</tr>
			
	  </c:forEach>
	</TABLE>
	<%@include file="/WEB-INF/jsp/page.jsp"%>
	<%@include file="/WEB-INF/jsp/sell/returnModal.jsp"%>
<!-- 选定一个单据 -->
<script type="text/javascript">
	var code;

	function show(){
		$.get("/sellManage/queryGoodsInfo?code="+code,function(data){
			
			//console.log(data);
			
			//调用modal框中的脚本来初始化模态框
			xt_init_modal(code,data);
		},"JSON");
	}
	
	function select(obj){
		var obj = $(obj);
		
		var temp = obj.attr("code");
		if(code !=temp){
			code = temp;
			obj.siblings().css("background-color","");
			obj.css("background-color","red");
		}else{
			obj.siblings().css("background-color","");
			obj.css("background-color","");
			code = null;
		}
		
	}
</script>