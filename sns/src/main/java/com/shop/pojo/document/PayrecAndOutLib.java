package com.shop.pojo.document;

/**
 * 收付款与出库单关系
 * @author Administrator
 *
 */
public class PayrecAndOutLib {
    private Integer id;

    /**
     * 收付款详情表id
     */
    private Payment payment;

    /**
     * 出库单id
     */
    private Outputlib outputlib;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Outputlib getOutputlib() {
		return outputlib;
	}

	public void setOutputlib(Outputlib outputlib) {
		this.outputlib = outputlib;
	}

}