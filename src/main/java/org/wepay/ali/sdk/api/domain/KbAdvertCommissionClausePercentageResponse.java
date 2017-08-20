package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则（比例）
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
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

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getMaxLimit() {
		return this.maxLimit;
	}
	public void setMaxLimit(String maxLimit) {
		this.maxLimit = maxLimit;
	}

}
