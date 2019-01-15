<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
客户销售汇总
</div>

<INPUT id=temp type=hidden name=temp>
<FORM name=excel action=../inc/excel.asp method=post target=_blank>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		
		name=sql>
		
	<%@include file="/WEB-INF/jsp/condition/allCondition.jsp"%>
	<TABLE id=tbl  width=100% align=center>
		<thead>
			<TR align=center>
				<th style="text-align: center;" width=70 >客户名称</th>
				<th style="text-align: center;" width=70 >销售金额</th>
				
				<th style="text-align: center;" width=70 >销售数量</th>
				<th style="text-align: center;" width=81 >退货金额</th>
				<th style="text-align: center;" width=81 >退货数量</th>
				<th style="text-align: center;" width=81 >合计金额</th>
			</TR>
		</thead>
		<TBODY>
			
				<c:forEach var="item" items="${data.pageData}">
				
					<tr align=center> 
						<td>${item.user.name}</td>
						<td>${item.handleMoney}</td>
						<td>${item.handleCount}</td>
						<td>${item.returnMoney}</td>
						<td>${item.returnCount}</td>
						<td>${item.handleMoney-item.returnMoney}</td>
					</tr>
				</c:forEach>
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
		</TBODY>
	</TABLE>
	
	<%@include file="/WEB-INF/jsp/page.jsp"%>
</FORM>