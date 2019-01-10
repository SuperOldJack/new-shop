<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>销售明细</div>

<DIV class=style1 align=center>销售明细表</DIV>
<INPUT id=temp type=hidden name=temp>
</FORM>
<FORM name=excel action=../inc/excel.asp method=post target=_blank>
	<INPUT type=hidden value=R_Goodssaledetail name=table><INPUT
		type=hidden
		
		name=sql>
	<TABLE id=tbl onclick=sortColumn(event) width=1351 align=center
		border=0>
		<TBODY>
			<TR align=middle>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品编码</td>
				<td style="CURSOR: pointer" width=200 type="CaseInsensitiveString">货品名称</td>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">货品规格</td>
				<td style="CURSOR: pointer" width=70 type="CaseInsensitiveString">业务类型</td>
				<td style="CURSOR: pointer" width=81 type="CaseInsensitiveString">开单日期</td>
				<td style="CURSOR: pointer" width=60 type="Number">单价</td>
				<td style="CURSOR: pointer" width=50 type="CaseInsensitiveString">业务员</td>
				<td style="CURSOR: pointer" width=60 type="Number">数量</td>
				<td style="CURSOR: pointer" width=80 type="Number">金额</td>
				<td style="CURSOR: pointer" width=40 type="CaseInsensitiveString">单位</td>
				<td style="CURSOR: pointer" width=140 type="CaseInsensitiveString">单据号</td>
				<td style="CURSOR: pointer" width=80 type="CaseInsensitiveString">出货仓</td>
				<td style="CURSOR: pointer" width=150 type="CaseInsensitiveString">备注</td>
			</TR>
		
			
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
			
		<c:forEach var="item" items="${data.pageData}">
			<tr> 
				<td>${item.shop.id}</td>
				<td>${item.shop.name}</td>
				<td>${item.specification.specificationType}</td>
				<td>${item.goodsDocument.documentType.type_name}</td>
				<td>${item.goodsDocument.create_time}</td>
				<td>${item.price}</td>
				<td>${item.goodsDocument.manageMan.name}</td>
				<td>${item.count}</td>
				<td>暂时没写计算金额啊}</td>
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