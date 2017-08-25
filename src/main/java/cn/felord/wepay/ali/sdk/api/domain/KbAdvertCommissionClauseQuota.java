package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则(定额)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCommissionClauseQuota extends AlipayObject {

	private static final long serialVersionUID = 1759747971556168864L;

	/**
	 * 定额结束范围(精度2位的非负小数)
	 */
	@ApiField("quota_amount_end")
	private String quotaAmountEnd;

	/**
	 * 定额开始范围(精度2位的非负小数)
	 */
	@ApiField("quota_amount_start")
	private String quotaAmountStart;

	/**
	 * <p>Getter for the field <code>quotaAmountEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuotaAmountEnd() {
		return this.quotaAmountEnd;
	}
	/**
	 * <p>Setter for the field <code>quotaAmountEnd</code>.</p>
	 *
	 * @param quotaAmountEnd a {@link java.lang.String} object.
	 */
	public void setQuotaAmountEnd(String quotaAmountEnd) {
		this.quotaAmountEnd = quotaAmountEnd;
	}

	/**
	 * <p>Getter for the field <code>quotaAmountStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuotaAmountStart() {
		return this.quotaAmountStart;
	}
	/**
	 * <p>Setter for the field <code>quotaAmountStart</code>.</p>
	 *
	 * @param quotaAmountStart a {@link java.lang.String} object.
	 */
	public void setQuotaAmountStart(String quotaAmountStart) {
		this.quotaAmountStart = quotaAmountStart;
	}

}
