package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 网商银行余利宝签约
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankFinanceYulibaoCapitalPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 6261852393965642165L;

	/**
	 * 余利宝申购金额，单位是“分”。如amount=123456表示申购1234.56元的余利宝份额。
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 金额对应的币种，目前仅支持CNY，即人民币。
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 余利宝申购流水号，用于幂等控制。流水号必须长度在30到40位之间，且仅能由数字、字母、字符“-”和字符“_”组成。建议使用UUID，如“c39c24f1-73e5-497d-9b1f-0f585ae192c1”，或者使用自定义的数字流水号，如“201608150000000000000000000000000001”。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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
	 * <p>Getter for the field <code>currency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrency() {
		return this.currency;
	}
	/**
	 * <p>Setter for the field <code>currency</code>.</p>
	 *
	 * @param currency a {@link java.lang.String} object.
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * <p>Getter for the field <code>fundCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	/**
	 * <p>Setter for the field <code>fundCode</code>.</p>
	 *
	 * @param fundCode a {@link java.lang.String} object.
	 */
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
