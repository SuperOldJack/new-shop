<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<P align=center>
	<SPAN class=STYLE1>销售单查询</SPAN>
</P>

<%@include file="/WEB-INF/jsp/condition/taiCondition.jsp"%>

<TABLE id=tbl width=100% align=center>
	<thead align="center">
		<TR >
			<TH style="text-align: center;">&nbsp;</TH>
			<TH style="text-align: center;">单 号</TH>
			<TH style="text-align: center;">单据类型</TH>
			<TH style="text-align: center;">制单日期</TH>
			<TH style="text-align: center;">客 户</TH>
			<TH style="text-align: center;">仓库</TH>
			<TH style="text-align: center;">经办人</TH>
		</TR>
	</thead>
		
	<TBODY>
		<c:forEach var="item" items="${data.pageData}">
			<tr align="center">
				<td><input type="button" value="修改"><input type="button" value="删除"></td> 
				<td>${item.goodsDocument.code}</td>
				<td>${item.goodsDocument.documentType.type_name}</td>
				<td>${item.goodsDocument.create_time}</td>
				<td>${item.client.name}</td>
				<td>${item.goodsDocument.manageLib.name}</td>
				<td>${item.goodsDocument.manageMan.name}</td>
			</tr>
			
		</c:forEach>
	</TBODY>
</TABLE>
<TBODY>
	<%@include file="/WEB-INF/jsp/page.jsp"%>