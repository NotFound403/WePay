package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询代收付结果
 *
 * @author auto create
 * @since 1.0, 2017-06-14 15:31:27
 */
public class MybankCreditLoantradePartnerPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5594713984922714391L;

	/**
	 * 网商内部申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	public String getInApplyNo() {
		return this.inApplyNo;
	}
	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

}
