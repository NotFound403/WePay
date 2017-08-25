package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则（定额）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCommissionClauseQuotaResponse extends AlipayObject {

	private static final long serialVersionUID = 1112553379356119271L;

	/**
	 * 分佣定额(精度2位的非负小数)
	 */
	@ApiField("quota_amount")
	private String quotaAmount;

	/**
	 * <p>Getter for the field <code>quotaAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuotaAmount() {
		return this.quotaAmount;
	}
	/**
	 * <p>Setter for the field <code>quotaAmount</code>.</p>
	 *
	 * @param quotaAmount a {@link java.lang.String} object.
	 */
	public void setQuotaAmount(String quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

}
