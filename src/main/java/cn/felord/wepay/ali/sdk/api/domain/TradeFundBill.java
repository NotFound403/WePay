package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 交易支付的渠道属性
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TradeFundBill extends AlipayObject {

	private static final long serialVersionUID = 4298983876477591125L;

	/**
	 * 该支付工具类型所使用的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易使用的资金渠道，详见 <a href="https://doc.open.alipay.com/doc2/detail?treeId=26&articleId=103259&docType=1">支付渠道列表</a>
	 */
	@ApiField("fund_channel")
	private String fundChannel;

	/**
	 * 渠道所使用的资金类型,目前只在资金渠道(fund_channel)是银行卡渠道(BANKCARD)的情况下才返回该信息(DEBIT_CARD:借记卡,CREDIT_CARD:信用卡,MIXED_CARD:借贷合一卡)
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 渠道实际付款金额
	 */
	@ApiField("real_amount")
	private String realAmount;

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
	 * <p>Getter for the field <code>fundChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundChannel() {
		return this.fundChannel;
	}
	/**
	 * <p>Setter for the field <code>fundChannel</code>.</p>
	 *
	 * @param fundChannel a {@link java.lang.String} object.
	 */
	public void setFundChannel(String fundChannel) {
		this.fundChannel = fundChannel;
	}

	/**
	 * <p>Getter for the field <code>fundType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundType() {
		return this.fundType;
	}
	/**
	 * <p>Setter for the field <code>fundType</code>.</p>
	 *
	 * @param fundType a {@link java.lang.String} object.
	 */
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	/**
	 * <p>Getter for the field <code>realAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealAmount() {
		return this.realAmount;
	}
	/**
	 * <p>Setter for the field <code>realAmount</code>.</p>
	 *
	 * @param realAmount a {@link java.lang.String} object.
	 */
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
