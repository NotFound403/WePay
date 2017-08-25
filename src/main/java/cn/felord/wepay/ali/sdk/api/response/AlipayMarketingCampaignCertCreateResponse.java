package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cert.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3765495374237299649L;

	/** 
	 * 凭证id
	 */
	@ApiField("lot_number")
	private String lotNumber;

	/**
	 * <p>Setter for the field <code>lotNumber</code>.</p>
	 *
	 * @param lotNumber a {@link java.lang.String} object.
	 */
	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	/**
	 * <p>Getter for the field <code>lotNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLotNumber( ) {
		return this.lotNumber;
	}

}
