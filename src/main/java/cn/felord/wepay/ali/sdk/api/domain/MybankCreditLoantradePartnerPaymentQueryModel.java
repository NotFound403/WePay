package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询代收付结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradePartnerPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5594713984922714391L;

	/**
	 * 网商内部申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	/**
	 * <p>Getter for the field <code>inApplyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInApplyNo() {
		return this.inApplyNo;
	}
	/**
	 * <p>Setter for the field <code>inApplyNo</code>.</p>
	 *
	 * @param inApplyNo a {@link java.lang.String} object.
	 */
	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

}
