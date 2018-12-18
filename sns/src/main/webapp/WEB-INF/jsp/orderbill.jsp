<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<HEAD>
<title>啊啊啊啊</title>
<SCRIPT language=JavaScript src="/js/date.js"></SCRIPT>

<SCRIPT language=JavaScript src="/js/xmlhttp.js"></SCRIPT>

<SCRIPT language=JavaScript src="/js/order.js"></SCRIPT>

<SCRIPT language=JavaScript src="/js/showphoto.js"></SCRIPT>

<SCRIPT language=JavaScript src="/js/addrow.js"></SCRIPT>


<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="/css/style.css" type=text/css rel=stylesheet>
<META http-equiv=Pragma content=no-cache>
<SCRIPT language=JavaScript src="/js/addrow.js"></SCRIPT>

<SCRIPT language=JavaScript src="/js/jquery.js"></SCRIPT>


<META content="MSHTML 6.00.6000.16981" name=GENERATOR>
</HEAD>
<BODY>
	<form action="/sellManage/orderGoodsAdd" method="post">
		<input name="comment" type="text">
		<input  type="submit">
	</form>

	<TABLE align=center border=0>
		<TBODY>
			<TR>
				<TD><BR>
					<FORM  method=post action="/sellManage/orderGoodsAdd">
						<DIV align=center>
							<SPAN class=style1>销售订单</SPAN>
						</DIV>
						<INPUT id=rowcount type=hidden name=rowcount> <INPUT
							id=_check type=hidden value=false name=_check>
						<DIV align=center>
							<SPAN class=style1><LABEL id=tittle_lable>XD-2010-04-15-0001</LABEL><INPUT
								id=billcode_input type=hidden value=XD-2010-04-15-0001
								name=orderGoods.goodsDocument.code></SPAN>
						</DIV>
						<BR>
						<TABLE id=tbl style="FONT-SIZE: 12px" cellSpacing=0
							borderColorDark=#ffffff cellPadding=2 width=780 align=center
							bgColor=#ffffee borderColorLight=#000000 border=1>
							<TBODY>
								<TR>
									<TD align=right width=70>制单日期</TD>
									<TD width=320><INPUT id=date readOnly size=16
										value=2010-4-15 name=orderGoods.goodsDocument.create_time><INPUT style="CURSOR: hand"
										onclick="setDay(date);return false;" type=image height=16
										width=18 src="../images/date.gif"><FONT color=red>*</FONT></TD>
									<TD align=right width=70>客&nbsp;&nbsp;&nbsp;&nbsp;户</TD>
									<TD width=320><INPUT id=cust size=24 name=orderGoods.client_id><A
										onclick="JavaScript:window.open ('../System/selectcust.htm', 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no')"
										href="#"><IMG height=17 src="../images/choose.gif"
											width=21 border=0></A><FONT color=red>*</FONT></TD>
								</TR>
								<TR>
									<TD align=right>仓&nbsp;&nbsp;&nbsp;&nbsp;库</TD>
									<TD><SELECT id=depot name=orderGoods.goodsDocument.manageLib.id><OPTION value=1
												selected>一号仓库</OPTION></SELECT><FONT color=red>*</FONT></TD>
									<TD align=right>制 单 人</TD>
									<TD><INPUT readOnly size=16 value=1 name=goodsDocument.createMan.id><FONT
										color=red>*</FONT></TD>
								</TR>
								<TR>
									<TD align=right>备 注</TD>
									<TD><INPUT onKeyDown="" size=30 name=comment></TD>
									<TD align=right>经 办 人</TD>
									<TD>
										<SELECT name=orderGoods.goodsDocument.manageMan.id>
											<OPTION value=1 selected>测试人</OPTION>
										</SELECT>
										<FONT color=red>*</FONT>
									</TD>
								</TR>
								<TR>
									<TD align=right>预 收 款</TD>
									<TD><INPUT size=30 value=0 name=orderGoods.amount_money></TD>
									<TD align=right>帐 户</TD>
									<TD><SELECT name=orderGoods.card_id>
											<OPTION value="1" selected>祖传账户</OPTION>
										</SELECT>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
						<DIV class=but_mar>
							<INPUT class=button onclick=add_row() type=button value="添 加"
								name=add> <INPUT class=button onclick=del_row()
								type=button value="删 除" name=del> &nbsp;&nbsp;条码录入框<INPUT
								id=barcode onkeyup=bar(); size=16 name=barcode>
						</DIV>
						<TABLE id=sqd style="FONT-SIZE: 12px" cellSpacing=0
							borderColorDark=#ffffff cellPadding=2 width=780 align=center
							bgColor=#ffffee borderColorLight=#000000 border=1>
							<TBODY>
								<TR align=middle>
									<TH width="3%">&nbsp;</TH>
									<TH width="5%">删除</TH>
									<TH width="10%">商品编码</TH>
									<TH width="15%">商品名称</TH>
									<TH width="10%">商品规格</TH>
									<TH width="7%">单位</TH>
									<TH width="10%">单价</TH>
									<TH width="10%">数量</TH>
									<TH width="10%">金额</TH>
									<TH width="20%">备注</TH>
								</TR>
							</TBODY>
						</TABLE>
						<DIV class=but_mar align=center>
							<INPUT class=button type=submit value="创  建" name=B1>
						</DIV>
					</FORM></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
