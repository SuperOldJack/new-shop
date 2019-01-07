<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<P align=center>
	<SPAN class=STYLE1>销售单查询</SPAN>
</P>

<FORM name=form1 method=post>
	<TABLE width=780 align=center border=0>
		<TBODY>
			<TR>
				<TD align=middle>制单日期：<INPUT id=date name=date><INPUT
					style="CURSOR: hand" onclick="setDay(date);return false;"
					type=image height=16 width=18 src="../images/date.gif"></TD>
				<TD align=middle>供应商/客户：<INPUT id=cust name=cust><A
					onclick="JavaScript:window.open ('../System/selectcust.htm', 'newwindow', 'height=600, width=800,top=100,left=150, toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no, status=no')"
					href="#"><IMG height=17 src="../images/choose.gif" width=21
						border=0></A></TD>
				<TD align=middle><INPUT class=button type="button"
					value=" 查 找 "></TD>
			</TR>
		</TBODY>
	</TABLE>
</FORM>
<TABLE id=tbl width=800 align=center>
	<TBODY>
		<TR align=middle>
			<TH>&nbsp;</TH>
			<TH>单 号</TH>
			<TH>单据类型</TH>
			<TH>制单日期</TH>
			<TH>客 户</TH>
			<TH>仓库</TH>
			<TH>经办人</TH>
		</TR>
		<c:forEach var="item" items="${data.pageData}">
			<tr>
				<td>我不做删除修改了jojo</td> 
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