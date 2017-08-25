package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车险向行业平台收费确认
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsAutoFeeReceiveConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1747133977622235418L;

	/**
	 * 外部业务单号，幂等字段，必填。和保险公司交互时同收单系统的outTradeNo
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易总金额 ;单位分
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

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

	/**
	 * <p>Getter for the field <code>tradeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	/**
	 * <p>Setter for the field <code>tradeAmount</code>.</p>
	 *
	 * @param tradeAmount a {@link java.lang.Long} object.
	 */
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

}
