package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.capital.purchase response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankFinanceYulibaoCapitalPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8864448122214861966L;

	/** 
	 * 余利宝内部的交易流水号。
	 */
	@ApiField("inner_biz_no")
	private String innerBizNo;

	/** 
	 * 交易结果的备注信息。
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 交易结果，目前会有3种状态值，1：success，表示交易成功、2：fail，表示交易失败:、3：inprocess，表示交易处理中。其中交易处理中的状态可以使用回查交易历史的方式查看其处理结果。
	 */
	@ApiField("trans_result")
	private String transResult;

	/**
	 * <p>Setter for the field <code>innerBizNo</code>.</p>
	 *
	 * @param innerBizNo a {@link java.lang.String} object.
	 */
	public void setInnerBizNo(String innerBizNo) {
		this.innerBizNo = innerBizNo;
	}
	/**
	 * <p>Getter for the field <code>innerBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInnerBizNo( ) {
		return this.innerBizNo;
	}

	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark( ) {
		return this.remark;
	}

	/**
	 * <p>Setter for the field <code>transResult</code>.</p>
	 *
	 * @param transResult a {@link java.lang.String} object.
	 */
	public void setTransResult(String transResult) {
		this.transResult = transResult;
	}
	/**
	 * <p>Getter for the field <code>transResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransResult( ) {
		return this.transResult;
	}

}
