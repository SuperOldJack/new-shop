<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
    <script type="text/javascript" src="/js/websocket/BaseSocket.js"></script>
    <script type="text/javascript">
    	var ws = connectionSocket("orderGoodsSelect");
    	ws.onopen = function()
		{
			 $.post("/stock/getNowOutLibCode","json",function(data){ fullCode(data);});
			 
		};
	</script>
    <script type="text/javascript" src="/js/OrderGoodsJs/GoodsInfoManage.js"></script>
	<TABLE align=center border=0>
		<TBODY>
			<TR>
				<TD><BR>
					<FORM  method=post action="/stock/addOutputLib">
						<DIV align=center>
							<SPAN class=style1>出库单</SPAN>
						</DIV>
						<INPUT id=rowcount type=hidden name=rowcount> <INPUT
							id=_check type=hidden value=false name=_check>
						<DIV align=center>
							<SPAN class=style1><LABEL id=tittle_lable></LABEL><INPUT
								id=a type=hidden value=RK-2010-04-15-0001
								name=goodsDocument.code></SPAN>
						</DIV>
						<BR>
						<TABLE id=tbl style="FONT-SIZE: 12px" cellSpacing=0
							borderColorDark=#ffffff cellPadding=2 width=780 align=center
							bgColor=#ffffee borderColorLight=#000000 border=1>
							<TBODY>
								<TR>
									<TD align=right width=70>制单日期</TD>
									<TD width=320><!-- <INPUT id=date readOnly size=16
										value=2010-4-15 name=create_time> --><INPUT style="CURSOR: hand"
										onclick="setDay(date);return false;" type=image height=16
										width=18 src="../images/date.gif"><FONT color=red>*</FONT></TD>
									<TD align=right width=70>客户</TD>
									<TD width=320><INPUT id=cust value="1" size=24 name=client.id><A
										onclick="JavaScript:window.open ('../System/selectcust.htm', 'newwindow', 'left=150,top=100,height=600, width=800, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no')"
										href="#"><IMG height=17 src="../images/choose.gif"
											width=21 border=0></A><FONT color=red>*</FONT></TD>
								</TR>
								<TR>
									<TD align=right>仓&nbsp;&nbsp;&nbsp;&nbsp;库</TD>
									<TD><SELECT id=depot name=goodsDocument.manageLib.id><OPTION value=1
												selected>一号仓库</OPTION></SELECT><FONT color=red>*</FONT></TD>
									<TD align=right>制 单 人</TD>
									<TD><INPUT readOnly size=16 value=1 name=goodsDocument.createMan.id><FONT
										color=red>*</FONT></TD>
								</TR>
								<TR>
									<TD align=right>备 注</TD>
									<TD><INPUT onKeyDown="" size=30 name=goodsDocument.comment></TD>
									<TD align=right>经 办 人</TD>
									<TD>
										<SELECT name=goodsDocument.manageMan.id>
											<OPTION value=1 selected>测试人</OPTION>
										</SELECT>
										<FONT color=red>*</FONT>
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
									<TH width="10%">商品编码</TH>
									<TH width="15%">商品名称</TH>
									<TH width="7%">单位</TH>
									<TH width="10%">商品规格</TH>
									<TH width="10%">说明</TH>
									<TH width="10%">单价</TH>
									<TH width="10%">数量</TH>
									<TH width="10%">金额</TH>
									<TH width="5%">删除</TH>
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


