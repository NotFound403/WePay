package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.toaccount.transfer response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransToaccountTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4887142117348774253L;

	/** 
	 * 支付宝转账单据号，成功一定返回，失败可能不返回也可能返回。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户转账唯一订单号：发起转账来源方定义的转账单据号。请求时对应的参数，原样返回。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付时间：格式为yyyy-MM-dd HH:mm:ss，仅转账成功返回。
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * <p>Setter for the field <code>orderId</code>.</p>
	 *
	 * @param orderId a {@link java.lang.String} object.
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * <p>Getter for the field <code>orderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderId( ) {
		return this.orderId;
	}

	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	/**
	 * <p>Setter for the field <code>payDate</code>.</p>
	 *
	 * @param payDate a {@link java.lang.String} object.
	 */
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	/**
	 * <p>Getter for the field <code>payDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayDate( ) {
		return this.payDate;
	}

}
