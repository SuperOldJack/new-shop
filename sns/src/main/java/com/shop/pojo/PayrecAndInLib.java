package com.shop.pojo;

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
    private InLibAndSup inLibAndSup;

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

	public InLibAndSup getInLibAndSup() {
		return inLibAndSup;
	}

	public void setInLibAndSup(InLibAndSup inLibAndSup) {
		this.inLibAndSup = inLibAndSup;
	}

}