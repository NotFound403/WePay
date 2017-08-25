package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.whitelist.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDrawcampWhitelistCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3256736955678982965L;

	/** 
	 * 操作结果状态，业务维度，网关返回成功状态码并且业务维度返回true才成功
	 */
	@ApiField("camp_result")
	private Boolean campResult;

	/**
	 * <p>Setter for the field <code>campResult</code>.</p>
	 *
	 * @param campResult a {@link java.lang.Boolean} object.
	 */
	public void setCampResult(Boolean campResult) {
		this.campResult = campResult;
	}
	/**
	 * <p>Getter for the field <code>campResult</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getCampResult( ) {
		return this.campResult;
	}

}
