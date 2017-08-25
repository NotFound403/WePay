package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分佣配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbadvertCommissionLimit extends AlipayObject {

	private static final long serialVersionUID = 1789992226989759437L;

	/**
	 * 推广者类型
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	/**
	 * 层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 比例分佣的最大金额
	 */
	@ApiField("max_max_amount")
	private String maxMaxAmount;

	/**
	 * 固定金额上限
	 */
	@ApiField("max_quota_amount")
	private String maxQuotaAmount;

	/**
	 * 最小分佣比例
	 */
	@ApiField("min_commission_percentage")
	private String minCommissionPercentage;

	/**
	 * 最小固定金额
	 */
	@ApiField("min_quota_amount")
	private String minQuotaAmount;

	/**
	 * <p>Getter for the field <code>commissionUserType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionUserType() {
		return this.commissionUserType;
	}
	/**
	 * <p>Setter for the field <code>commissionUserType</code>.</p>
	 *
	 * @param commissionUserType a {@link java.lang.String} object.
	 */
	public void setCommissionUserType(String commissionUserType) {
		this.commissionUserType = commissionUserType;
	}

	/**
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getLevel() {
		return this.level;
	}
	/**
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.Long} object.
	 */
	public void setLevel(Long level) {
		this.level = level;
	}

	/**
	 * <p>Getter for the field <code>maxMaxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxMaxAmount() {
		return this.maxMaxAmount;
	}
	/**
	 * <p>Setter for the field <code>maxMaxAmount</code>.</p>
	 *
	 * @param maxMaxAmount a {@link java.lang.String} object.
	 */
	public void setMaxMaxAmount(String maxMaxAmount) {
		this.maxMaxAmount = maxMaxAmount;
	}

	/**
	 * <p>Getter for the field <code>maxQuotaAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxQuotaAmount() {
		return this.maxQuotaAmount;
	}
	/**
	 * <p>Setter for the field <code>maxQuotaAmount</code>.</p>
	 *
	 * @param maxQuotaAmount a {@link java.lang.String} object.
	 */
	public void setMaxQuotaAmount(String maxQuotaAmount) {
		this.maxQuotaAmount = maxQuotaAmount;
	}

	/**
	 * <p>Getter for the field <code>minCommissionPercentage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinCommissionPercentage() {
		return this.minCommissionPercentage;
	}
	/**
	 * <p>Setter for the field <code>minCommissionPercentage</code>.</p>
	 *
	 * @param minCommissionPercentage a {@link java.lang.String} object.
	 */
	public void setMinCommissionPercentage(String minCommissionPercentage) {
		this.minCommissionPercentage = minCommissionPercentage;
	}

	/**
	 * <p>Getter for the field <code>minQuotaAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinQuotaAmount() {
		return this.minQuotaAmount;
	}
	/**
	 * <p>Setter for the field <code>minQuotaAmount</code>.</p>
	 *
	 * @param minQuotaAmount a {@link java.lang.String} object.
	 */
	public void setMinQuotaAmount(String minQuotaAmount) {
		this.minQuotaAmount = minQuotaAmount;
	}

}
