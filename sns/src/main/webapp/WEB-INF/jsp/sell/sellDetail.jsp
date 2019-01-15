<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<DIV class=style1 align=center>销售明细表</DIV>
<INPUT id=temp type=hidden name=temp>
<%@include file="/WEB-INF/jsp/condition/allCondition.jsp"%>
<FORM name=excel action=../inc/excel.asp method=post target=_blank>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		
		name=sql>
		
	<TABLE id=tbl onclick=sortColumn(event) width=1351 align=center
		border=0>
		<thead>
			<TR align=center>
				<td style="text-align: center;" width=70 >货品编码</td>
				<td style="text-align: center;" width=200 >货品名称</td>
				<td style="text-align: center;" width=70 >货品规格</td>
				<td style="text-align: center;" width=70 >业务类型</td>
				<td style="text-align: center;" width=81 >开单日期</td>
				<td style="text-align: center;" width=60 >单价</td>
				<td style="text-align: center;" width=50 >业务员</td>
				<td style="text-align: center;" width=60 >数量</td>
				<td style="text-align: center;" width=80 >金额</td>
				<td style="text-align: center;" width=40 >单位</td>
				<td style="text-align: center;" width=140 >单据号</td>
				<td style="text-align: center;" width=80 >出货仓</td>
				<td style="text-align: center;" width=150 >备注</td>
			</TR>
		
			
		</thead>
		<TBODY>
			<TR onmouseover=over() onclick=change() onmouseout=out()>
				<TD align=center>小计</TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center>2</TD>
				<TD align=center>0</TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
				<TD align=center></TD>
			</TR>
			
		<c:forEach var="item" items="${data.pageData}">
			<tr  align="center"> 
				<td>${item.shop.id}</td>
				<td>${item.shop.name}</td>
				<td>${item.specification.specificationType}</td>
				<td>${item.goodsDocument.documentType.type_name}</td>
				<td>${item.goodsDocument.create_time}</td>
				<td>${item.price}</td>
				<td>${item.goodsDocument.manageMan.name}</td>
				<td>${item.count}</td>
				<td>${item.count*item.price}</td>
				<td>${item.unit}</td>
				<td>${item.goodsDocument.code}</td>
				<td>${item.goodsDocument.manageLib.name}</td>
				<td>${item.goodsDocument.comment}</td>
			
				
			</tr>
			
		</c:forEach>
		</TBODY>
	</TABLE>
	
</FORM>

<%@include file="/WEB-INF/jsp/page.jsp"%>