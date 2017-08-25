package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 权益信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BenefitInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 4535468132593111251L;

	/**
	 * PRE_FUND：实际核销或者商户赠送的金额
DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）
COUPON：实际核销或者商户赠送的券
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 权益类型
PRE_FUND（卡面额）
DISCOUNT：折扣金额
COUPON：券
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * COUPON：当核销或者赠送券时，可以设置该值
	 */
	@ApiField("count")
	private String count;

	/**
	 * 产生核销或者赠送权益的描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>benefitType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitType() {
		return this.benefitType;
	}
	/**
	 * <p>Setter for the field <code>benefitType</code>.</p>
	 *
	 * @param benefitType a {@link java.lang.String} object.
	 */
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCount() {
		return this.count;
	}
	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.String} object.
	 */
	public void setCount(String count) {
		this.count = count;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
