package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 指定优惠金额
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ReduceToAmtDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 8414215176951859742L;

	/**
	 * 优惠后价格
	 */
	@ApiField("reduct_to_amt")
	private String reductToAmt;

	/**
	 * <p>Getter for the field <code>reductToAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReductToAmt() {
		return this.reductToAmt;
	}
	/**
	 * <p>Setter for the field <code>reductToAmt</code>.</p>
	 *
	 * @param reductToAmt a {@link java.lang.String} object.
	 */
	public void setReductToAmt(String reductToAmt) {
		this.reductToAmt = reductToAmt;
	}

}
