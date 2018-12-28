package com.shop.pojo;

import com.shop.pojo.document.Inputlib;

/**
 * 收付款与入库单关系
 * @author Administrator
 *
 */
public class PayrecAndInLib {
    private Integer id;

    /**
     * 收付款id
     */
    private Payment payment;

    /**
     * 入库单
     */
    private Inputlib inLibAndSup;

    public Inputlib getInLibAndSup() {
		return inLibAndSup;
	}

	public void setInLibAndSup(Inputlib inLibAndSup) {
		this.inLibAndSup = inLibAndSup;
	}

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


}