package com.shop.pojo.document;

/**
 * 交易对象明细
 * 描述交易对象在本季度的情况
 * @author Administrator
 *
 */
public abstract class ObjectSummary {

	private Integer returnCount;

	private Integer returnMoney;
	
	private Integer handleCount;
	
	private Integer handleMoney;
	
	
	
	
	/**
	 * 实际金额
	 * 获得处理金额减去回退金额得到实际金额
	 * @return
	 */
	public int getMoney() {
		
		return handleMoney - returnMoney;
		
	}
	
	/**
	 * 实际总数量
	 * 获得处理总数量减去回退总数量得到实际总数量
	 * @return
	 */
	public int getCount() {
		int handleCount = this.handleCount == null ? 0:this.handleCount.intValue();
		int returnCount = this.returnCount == null ? 0:this.returnCount.intValue();
		
		return handleCount - returnCount;
		
	}
	
	
	
	
	
	
	
	protected abstract Object getSummaryObject();
	
	/**
	 * 获得退回总数量
	 * @return 总数量
	 */
	public Integer getReturnCount() {
		return returnCount;
	}

	/**
	 * 修改退货总数量
	 * @param 退货总数量
	 */
	public void setReturnCount(Integer returnCounts) {
		this.returnCount = returnCounts;
	}

	/**
	 * 获得退货总金额
	 * @return 总金额
	 */
	public Integer getReturnMoney() {
		return returnMoney;
	}

	/**
	 * 修改退货总金额
	 * @param 总金额
	 */
	public void setReturnMoney(Integer returnMoney) {
		this.returnMoney = returnMoney;
	}

	/**
	 * 获得处理总数
	 * @return 总数量
	 */
	public Integer getHandleCount() {
		return handleCount;
	}

	/**
	 * 修改处理总数
	 * @param 处理总数
	 */
	public void setHandleCount(Integer handelCounts) {
		this.handleCount = handelCounts;
	}

	/**
	 * 获得处理总金额
	 * @return 总金额
	 */
	public Integer getHandleMoney() {
		return handleMoney;
	}

	/**
	 * 修改处理总金额
	 * @param 处理总金额
	 */
	public void setHandleMoney(Integer handelMoney) {
		this.handleMoney = handelMoney;
	}
}
