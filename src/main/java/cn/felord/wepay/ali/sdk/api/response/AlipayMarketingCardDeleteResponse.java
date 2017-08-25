package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.delete response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1156911795839154415L;

	/** 
	 * 支付宝端删卡业务流水号
	 */
	@ApiField("biz_serial_no")
	private String bizSerialNo;

	/**
	 * <p>Setter for the field <code>bizSerialNo</code>.</p>
	 *
	 * @param bizSerialNo a {@link java.lang.String} object.
	 */
	public void setBizSerialNo(String bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}
	/**
	 * <p>Getter for the field <code>bizSerialNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizSerialNo( ) {
		return this.bizSerialNo;
	}

}
