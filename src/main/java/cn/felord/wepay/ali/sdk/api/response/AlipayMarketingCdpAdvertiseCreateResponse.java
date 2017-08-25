package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpAdvertiseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859782421498812271L;

	/** 
	 * 创建广告唯一标识
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * <p>Setter for the field <code>adId</code>.</p>
	 *
	 * @param adId a {@link java.lang.String} object.
	 */
	public void setAdId(String adId) {
		this.adId = adId;
	}
	/**
	 * <p>Getter for the field <code>adId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdId( ) {
		return this.adId;
	}

}
