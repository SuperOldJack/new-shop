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
		
	<%@include file="/WEB-INF/jsp/condition/timeCondition.jsp"%>
	<TABLE id=tbl onclick=sortColumn(event) width=1351 align=center
		border=0>
		<TBODY>
			<TR align=middle>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">客户名称</td>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">销售金额</td>
				
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">销售数量</td>
				<td style="CURSOR: pointer" width=81 type="CaseInsensitiveString">退货金额</td>
				<td style="CURSOR: pointer" width=81 type="CaseInsensitiveString">退货数量</td>
				<td style="CURSOR: pointer" width=81 type="CaseInsensitiveString">合计金额</td>
			</TR>
			<tr>
				<c:forEach var="item" items="${data.pageData}">
				
					<tr> 
						<td>${item.user.name}</td>
						<td>${item.handleMoney}</td>
						<td>${item.handleCount}</td>
						<td>${item.returnMoney}</td>
						<td>${item.returnCount}</td>
						<td>${item.handleMoney-item.returnMoney}</td>
					</tr>
				</c:forEach>
			</tr>
			
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
	
	<%@include file="/WEB-INF/jsp/page.jsp"%>
</FORM>