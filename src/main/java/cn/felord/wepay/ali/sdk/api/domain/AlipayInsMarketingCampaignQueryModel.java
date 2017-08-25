package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据活动id查询活动信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingCampaignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6158637969447974552L;

	/**
	 * 保险营销活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 请求流水Id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Getter for the field <code>campaignId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampaignId() {
		return this.campaignId;
	}
	/**
	 * <p>Setter for the field <code>campaignId</code>.</p>
	 *
	 * @param campaignId a {@link java.lang.String} object.
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
