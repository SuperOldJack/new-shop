<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
货品销售汇总
</div>

<INPUT id=temp type=hidden name=temp>
</FORM>
<FORM name=excel action=../inc/excel.asp method=post target=_blank>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		
		name=sql>
	<%@include file="/WEB-INF/jsp/condition/idCondition.jsp"%>
	<TABLE id=tbl onclick=sortColumn(event) width=1351 align=center border=0>
		<TBODY>
			<TR align=middle>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品编码</td>
				<td style="CURSOR: pointer" width=200 type="CaseInsensitiveString">货品名称</td>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品规格</td>
				<td style="CURSOR: pointer" width=60 type="Number">单价</td>
				<td style="CURSOR: pointer" width=60 type="Number">销售数量</td>
				<td style="CURSOR: pointer" width=80 type="Number">销售金额</td>
				<td style="CURSOR: pointer" width=60 type="Number">退货数量</td>
				<td style="CURSOR: pointer" width=80 type="Number">退货金额</td>
				<td style="CURSOR: pointer" width=60 type="Number">总金额</td>
				<td style="CURSOR: pointer" width=80 type="Number">总数量</td>
			</TR>
		
			<c:forEach var="item" items="${data.pageData}">
				
				<tr> 
					<td>${item.shopInfo.shop.id}</td>
					<td>${item.shopInfo.shop.name}</td>
					<td>${item.shopInfo.specification.specificationType}</td>
					<td>${item.shopInfo.unit.unit_name}</td>
					<td>${item.handleCount}</td>
					<td>${item.handleMoney}</td>
					<td>${item.returnCount}</td>
					<td>${item.returnMoney}</td>
					<td>${item.returnMoney - item.returnMoney} </td>
					<td>${item.handleCount-item.returnCount}</td>
				</tr>
			</c:forEach>
		</TBODY>
		<TBODY>
			<TR onmouseover=over() onclick=change() onmouseout=out()>
			</TR>
		</TBODY>
	</TABLE>
	
</FORM>

	<%@include file="/WEB-INF/jsp/page.jsp"%>

