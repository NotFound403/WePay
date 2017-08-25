package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.consume.sync response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardConsumeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5814841523822645466L;

	/** 
	 * 外部卡号
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

	/**
	 * <p>Setter for the field <code>externalCardNo</code>.</p>
	 *
	 * @param externalCardNo a {@link java.lang.String} object.
	 */
	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}
	/**
	 * <p>Getter for the field <code>externalCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalCardNo( ) {
		return this.externalCardNo;
	}

}
