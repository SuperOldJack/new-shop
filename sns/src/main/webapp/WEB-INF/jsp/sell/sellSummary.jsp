<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<DIV class=style1 align=center>
货品销售汇总
</DIV>

<INPUT id=temp type=hidden name=temp>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		
		name=sql>
	<%@include file="/WEB-INF/jsp/condition/allCondition.jsp"%>
	<TABLE id=tbl  width=1351 align=center >
		<thead>
			<TR align=center>
				<th style="text-align: center;" width=20 >货品编码</th>
				<th style="text-align: center;" width=60 >货品名称</th>
				<th style="text-align: center;" width=50 >货品规格</th>
				<th style="text-align: center;" width=20 >单位</th>
				<th style="text-align: center;" width=20 >销售数量</th>
				<th style="text-align: center;" width=60 >销售金额</th>
				<th style="text-align: center;" width=20 >退货数量</th>
				<th style="text-align: center;" width=60 >退货金额</th>
				<th style="text-align: center;" width=20 >总金额</th>
				<th style="text-align: center;" width=20 >总数量</th>
			</TR>
		
		
		</thead>
		<TBODY>
			
		
			<c:forEach var="item" items="${data.pageData}">
				
				<tr style="text-align: center;"> 
					<td>${item.shopInfo.shop.id}</td>
					<td>${item.shopInfo.shop.name}</td>
					<td>${item.shopInfo.specification.specificationType}</td>
					<td>${item.shopInfo.unit.unit_name}</td>
					<td>${item.handleCount}</td>
					<td>${item.handleMoney}</td>
					<td>${item.returnCount}</td>
					<td>${item.returnMoney}</td>
					<td>${item.handleMoney - item.returnMoney} </td>
					<td>${item.handleCount-item.returnCount}</td>
				</tr>
			</c:forEach>
		</TBODY>
		<TBODY>
			<TR onmouseover=over() onclick=change() onmouseout=out()>
			</TR>
		</TBODY>
	</TABLE>

	<%@include file="/WEB-INF/jsp/page.jsp"%>

