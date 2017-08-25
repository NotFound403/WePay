package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.modify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5592349857241743669L;

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

	/**
	 * <p>Setter for the field <code>auditStatus</code>.</p>
	 *
	 * @param auditStatus a {@link java.lang.String} object.
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * <p>Getter for the field <code>auditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	/**
	 * <p>Setter for the field <code>campStatus</code>.</p>
	 *
	 * @param campStatus a {@link java.lang.String} object.
	 */
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	/**
	 * <p>Getter for the field <code>campStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStatus( ) {
		return this.campStatus;
	}

}
