<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/js/finance/pay.js"></script>
<div class="main_div">
	<h3>付款单</h3>
	<hr/>
	<table class="table">
		<thead>
			<tr>
				<td>付款单号
				<td>入库单号
				<td>金额
				<td>备注
				<td>操作
		</thead>
		<tbody id="payInfoTable">
			<tr>
				<td>测试-付款单
				<td>测试-入库单
				<td>测试-金额
				<td>测试-备注
				<td><button class='btn btn-primary'onclick='relatedDoc(this)'>相关单据</button>
	<button class='btn btn-primary' onclick='detailed(this)'>查看详情</button>
		</tbody>
	</table>
</div>

