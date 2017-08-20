package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 指定优惠金额
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ReduceToAmtDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 8414215176951859742L;

	/**
	 * 优惠后价格
	 */
	@ApiField("reduct_to_amt")
	private String reductToAmt;

	public String getReductToAmt() {
		return this.reductToAmt;
	}
	public void setReductToAmt(String reductToAmt) {
		this.reductToAmt = reductToAmt;
	}

}
