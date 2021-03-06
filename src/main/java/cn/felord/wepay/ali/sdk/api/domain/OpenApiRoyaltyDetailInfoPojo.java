package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * OpenApiRoyaltyDetailInfoPojo
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenApiRoyaltyDetailInfoPojo extends AlipayObject {

	private static final long serialVersionUID = 4678662337132194765L;

	/**
	 * 分账的金额，单位为元
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。
	 */
	@ApiField("amount_percentage")
	private Long amountPercentage;

	/**
	 * 分账描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 分账收入方账户，类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 分账支出方账户，类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.Long} object.
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>amountPercentage</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAmountPercentage() {
		return this.amountPercentage;
	}
	/**
	 * <p>Setter for the field <code>amountPercentage</code>.</p>
	 *
	 * @param amountPercentage a {@link java.lang.Long} object.
	 */
	public void setAmountPercentage(Long amountPercentage) {
		this.amountPercentage = amountPercentage;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>transIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransIn() {
		return this.transIn;
	}
	/**
	 * <p>Setter for the field <code>transIn</code>.</p>
	 *
	 * @param transIn a {@link java.lang.String} object.
	 */
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	/**
	 * <p>Getter for the field <code>transOut</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransOut() {
		return this.transOut;
	}
	/**
	 * <p>Setter for the field <code>transOut</code>.</p>
	 *
	 * @param transOut a {@link java.lang.String} object.
	 */
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

}
