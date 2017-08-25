package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则(比例)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCommissionClausePercentage extends AlipayObject {

	private static final long serialVersionUID = 7657376418845455687L;

	/**
	 * 分佣比例结束范围(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate_end")
	private String commissionRateEnd;

	/**
	 * 分佣比例开始范围(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate_start")
	private String commissionRateStart;

	/**
	 * 封顶金额结束范围(精度2位的非负小数)
	 */
	@ApiField("max_limit_end")
	private String maxLimitEnd;

	/**
	 * 封顶金额开始范围(精度2位的非负小数)
	 */
	@ApiField("max_limit_start")
	private String maxLimitStart;

	/**
	 * <p>Getter for the field <code>commissionRateEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionRateEnd() {
		return this.commissionRateEnd;
	}
	/**
	 * <p>Setter for the field <code>commissionRateEnd</code>.</p>
	 *
	 * @param commissionRateEnd a {@link java.lang.String} object.
	 */
	public void setCommissionRateEnd(String commissionRateEnd) {
		this.commissionRateEnd = commissionRateEnd;
	}

	/**
	 * <p>Getter for the field <code>commissionRateStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionRateStart() {
		return this.commissionRateStart;
	}
	/**
	 * <p>Setter for the field <code>commissionRateStart</code>.</p>
	 *
	 * @param commissionRateStart a {@link java.lang.String} object.
	 */
	public void setCommissionRateStart(String commissionRateStart) {
		this.commissionRateStart = commissionRateStart;
	}

	/**
	 * <p>Getter for the field <code>maxLimitEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxLimitEnd() {
		return this.maxLimitEnd;
	}
	/**
	 * <p>Setter for the field <code>maxLimitEnd</code>.</p>
	 *
	 * @param maxLimitEnd a {@link java.lang.String} object.
	 */
	public void setMaxLimitEnd(String maxLimitEnd) {
		this.maxLimitEnd = maxLimitEnd;
	}

	/**
	 * <p>Getter for the field <code>maxLimitStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxLimitStart() {
		return this.maxLimitStart;
	}
	/**
	 * <p>Setter for the field <code>maxLimitStart</code>.</p>
	 *
	 * @param maxLimitStart a {@link java.lang.String} object.
	 */
	public void setMaxLimitStart(String maxLimitStart) {
		this.maxLimitStart = maxLimitStart;
	}

}
