<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="modal fade" id="returnModal">
  <div class="modal-dialog">
    <div class="modal-content"  style="width: 100%; margin-top: 20%;">
 
      <!-- 模态框头部 -->
      <div class="modal-header">
        <h4 class="modal-title">退款申请</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
      </div>
 	  
      <!-- 模态框主体 -->
      <div class="modal-body">
      单号:<span class='this_code'></span>
		
		<button type="button" class="btn btn-primary" onclick='xt_cheked()'>退货已选中商品</button>
      	<button type="button" class="btn btn-primary" onclick='xt_cheked_all()'>退货全部商品</button>
		<button type="button" class="btn btn-primary" onclick='xt_checked_remove()'>取消退货商品</button>
		<table id='this_shop_info' width=100% align=center>
			<thead>
				<tr style="text-align: center;">
					<th></th>
					<th>货品名</th>
					<th>单价</th>
					<th>总数</th>
					<th>合计</th>
					<th>单位</th>
					<th>规格</th>
				</tr>
			</thead>
		</table>
      </div>
      <form action="/sellManage/orderGoodsReturn" method="post">	
      <div class="modal-body">
		
		<hr/>
		<h4 align="center">退款单预览</h4>
			<input class=this_code type=hidden name=sell_gdc value=>
			应退金额:<input type="text" readonly="readonly" name="amount_money" id="rm_amount">&nbsp;
			实际金额:<input type="text" name="actual_money">&nbsp;
			制单人:<INPUT readOnly size=16 value=1 name=goodsDocument.createMan.id>&nbsp;
			仓库: <SELECT id=rm_lib name=goodsDocument.manageLib.id> <OPTION value=1 selected>一号仓库</OPTION></SELECT>
			卡号:<select name="card_id" id="rm_cardInfo"> <option value=''>请选择卡号</option> </select>
			客户:<SELECT id=rm_client name=client_id> <OPTION value=1 selected>测试用户</OPTION></SELECT>
			
			<!-- <input type="text" readonly="readonly" name=""><span>点击此处选择</span>&nbsp; -->
			经办人:<input type="text" readonly="readonly" name="goodsDocument.manageMan.id" value=1>&nbsp;
			制单人:<input type="text" readonly="readonly" name="goodsDocument.createMan.id" value=1>&nbsp;
			<div style="padding: 5px 0">
			<textarea style="resize:none;" rows="3" cols="80" placeholder="退款理由...." name="cause"></textarea>&nbsp;
			</div>
			备注:<input type="text" name="comment">&nbsp;
			
			<table id='this_sell_return' width=100% align=center>
				<thead>
					<tr style="text-align: center;">
						<th></th>
						<th>货品名</th>
						<th>单价</th>
						<th>总数</th>
						<th>合计</th>
						<th>单位</th>
						<th>规格</th>
					</tr>
				</thead>
			</table>
		
      </div>
 	  
      <!-- 模态框底部 -->
      <div class="modal-footer">
      	<button type="submit" class="btn btn-primary" >提交退款单</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
      </div>
	  </form>
    </div>
  </div>
</div>

<!-- 初始化设置 -->
<script type="text/javascript" src="/js/Card/getCard.js"></script>
<script type="text/javascript">
	var node = $("#rm_cardInfo");
	//添加卡号
	
	getCard(node);
</script>

<!-- 退货信息管理 -->
<script>
	function sum(){
		setCount();
	}

	//添加退货商品
	function addReturnShop(node){
		var c_shop =$(node).clone();
		
		var shopId = c_shop.attr("shop_id");
		
		//修改节点为可输入控件
		replaceNode(c_shop,shopId);
		/* var price = c_shop.find("[name='shop_price']").text();
		var count = c_shop.find("[name='shop_count']").text();
		c_shop.find("[name='shop_price']").replaceWith("<input id='price_"+shopId+"' onchange=shop_count($(this).val(),$('#count_"+shopId+"').val(),$('#sum_"+shopId+"')) type=number value="+price+">");
		c_shop.find("[name='shop_count']").replaceWith("<input id='count_"+shopId+"' onchange=shop_count($('#price_"+shopId+"').val(),$(this).val(),$('#sum_"+shopId+"')) type=number value="+count+">");
		c_shop.find("[name='sum']").attr("id","sum_"+shopId).attr("class","rm_price");
	 	*/	
	 	
	 	
		setTimeout(sum,100);
		
		return c_shop;
	}
	//替换节点控件为退货商品
	function replaceNode(c_shop,shopId){
		var price = c_shop.find("[name='shop_price']").text();
		var count = c_shop.find("[name='shop_count']").text();
		c_shop.find("[name='shop_price']").replaceWith("<input name=goodsPrice id='price_"+shopId+"' onchange=shop_count($(this).val(),$('#count_"+shopId+"').val(),$('#sum_"+shopId+"')) type=number value="+price+">");
		c_shop.find("[name='shop_count']").replaceWith("<input name=goodsCount id='count_"+shopId+"' onchange=shop_count($('#price_"+shopId+"').val(),$(this).val(),$('#sum_"+shopId+"')) type=number value="+count+">");
		c_shop.find("[name='sum']").attr("id","sum_"+shopId).attr("class","rm_price");
		
	}


	/* 获取数据初始化模态框   需要单号以及货品集合 */
	function xt_init_modal(code,data){
		//初始化销售单
		var codeNode = $(".this_code")
		codeNode.text(code);
		codeNode.val(code);
		
		
		if(data != null){
			
			$("#this_shop_info .xs_shop_info").remove();
			
			
			$.each(data,function(){
				$("#this_shop_info").append( "<tr class='xs_shop_info' shop_id="+this.shop.id+">"
				+"<input type=hidden name=shopId value="+this.shop.id+">"
				+"<input type=hidden name=shopUnit value="+this.unitId+">"
				
				+"<input type=hidden name=shopSpecification value="+this.specification.id+">"
				+"<td><input type='checkbox' class='isReturn'></td>"		
				+"<td>"+this.shop.name+"</td>"
				+"<td><span name='shop_price'>"+this.price+"</span></td>"
				+"<td><span name='shop_count'>"+this.count+"</span></td>"
				+"<td name='sum'>"+(parseInt(this.price)*parseInt(this.count))+"</td>"
				+"<td>"+this.unit+"</td>"
				+"<td>"+this.specification.specificationType+"</td>"
				+"</tr>");
			});
		}
	}
	
	/* 选取全部 */
	function xt_cheked_all(){
		var check = $("#this_shop_info .xs_shop_info");
		
		var xt_table =$("#this_sell_return");
		var xt_shop =$("#this_sell_return .xs_shop_info");
		xt_shop.remove();
		
		check.each(function(){
			
			xt_table.append(addReturnShop(this));
			
		});
		$("#this_sell_return .isReturn").remove();
	}
	
	function xt_checked_remove(){
		var xt_shop =$("#this_sell_return .xs_shop_info");
		xt_shop.remove();
	}
	
	//将已选中的商品退货
	function xt_cheked(){
		var check = $("#this_shop_info input:checked");
		
		var xt_table =$("#this_sell_return");
		var xt_shop =$("#this_sell_return .xs_shop_info");
		
		check.each(function(){
			var c_shop =$(this).parents("tr");
			var c_shopId = c_shop.attr("shop_id");
			
			//遍历查找商品ID对应的已选中商品
			for(var i = 0; i < xt_shop.length;i++){
				var r_shopId = $(xt_shop.get(i)).attr("shop_id");
				
				if(r_shopId == c_shopId){
					$("#this_sell_return .xs_shop_info[shop_id="+r_shopId+"]").replaceWith(addReturnShop(c_shop))
					$("#this_sell_return .isReturn").remove();
					return;
				}
				
			}

			xt_table.append(addReturnShop(c_shop));
			
		});
		$("#this_sell_return .isReturn").remove();
	}
</script>

<!-- 计算应收金额的脚本 -->
<script>

</script>

<!-- 合计计算 -->
<script>
	var countNode = $("#rm_amount");

	function setCount(){
		
		var money = 0;
		
		$.each($(".rm_price"),function(){
			
			var node = $(this);
			money += parseInt(node.text());
			//alert(money);
		});
		countNode.val(money);
	}

	
	
	/* 计算合计 */
	function shop_count(price,count,node){
		node.text(parseInt(price)*parseInt(count));
		setCount();
	}
</script> 