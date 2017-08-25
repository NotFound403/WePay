package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4238455985986574119L;

	/** 
	 * 活动审批状态，
仅限服务商代商户创建活动时返回
AUDITING，审核中,REJECT为驳回，不返回表示通过
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动状态，目前返回以下状态，
STARTING，活动启动中
STARTED，活动已启动
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
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}
	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId( ) {
		return this.campId;
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
