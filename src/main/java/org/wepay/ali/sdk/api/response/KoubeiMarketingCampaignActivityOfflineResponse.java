package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.offline response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-25 15:07:50
 */
public class KoubeiMarketingCampaignActivityOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879539381697931424L;

	/** 
	 * 活动子状态，如审核中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

}
