package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则（比例）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCommissionClausePercentageResponse extends AlipayObject {

	private static final long serialVersionUID = 6239555884948245336L;

	/**
	 * 分佣比例(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * 封顶金额(精度2位的非负小数)
	 */
	@ApiField("max_limit")
	private String maxLimit;

	/**
	 * <p>Getter for the field <code>commissionRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionRate() {
		return this.commissionRate;
	}
	/**
	 * <p>Setter for the field <code>commissionRate</code>.</p>
	 *
	 * @param commissionRate a {@link java.lang.String} object.
	 */
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	/**
	 * <p>Getter for the field <code>maxLimit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxLimit() {
		return this.maxLimit;
	}
	/**
	 * <p>Setter for the field <code>maxLimit</code>.</p>
	 *
	 * @param maxLimit a {@link java.lang.String} object.
	 */
	public void setMaxLimit(String maxLimit) {
		this.maxLimit = maxLimit;
	}

}
