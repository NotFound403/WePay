package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 固定金额
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertQuotaCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 8348758631383973724L;

	/**
	 * 固定金额
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
