package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 账号信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PaymentAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3726637954382541826L;

	/**
	 * 账号名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号类型：ALIPAY(支付宝)，MYBK(网商银行卡)
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 金额：单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 账单备注
	 */
	@ApiField("content")
	private String content;

	/**
	 * <p>Getter for the field <code>accountName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountName() {
		return this.accountName;
	}
	/**
	 * <p>Setter for the field <code>accountName</code>.</p>
	 *
	 * @param accountName a {@link java.lang.String} object.
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * <p>Getter for the field <code>accountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountNo() {
		return this.accountNo;
	}
	/**
	 * <p>Setter for the field <code>accountNo</code>.</p>
	 *
	 * @param accountNo a {@link java.lang.String} object.
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * <p>Getter for the field <code>accountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * <p>Setter for the field <code>accountType</code>.</p>
	 *
	 * @param accountType a {@link java.lang.String} object.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

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
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
