package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDrawcampUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6631835181262986988L;

	/** 
	 * 操作结果状态，true表示修改成功立即生效，false表示修改失败
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
