package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容上下架接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignRetailDmSetModel extends AlipayObject {

	private static final long serialVersionUID = 5797521598343951179L;

	/**
	 * 下架时间，仅上架操作时使用，必须晚于当前时间
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 内容ID，调用koubei.marketing.campaign.retail.dm.create创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 上下架操作类型，上架：ONLINE，下架：OFFLINE，注意：请先调用创建内容接口再进行上架操作，下架内容不得再上架。
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * <p>Getter for the field <code>campaignEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}
	/**
	 * <p>Setter for the field <code>campaignEndTime</code>.</p>
	 *
	 * @param campaignEndTime a {@link java.util.Date} object.
	 */
	public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

	/**
	 * <p>Getter for the field <code>contentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentId() {
		return this.contentId;
	}
	/**
	 * <p>Setter for the field <code>contentId</code>.</p>
	 *
	 * @param contentId a {@link java.lang.String} object.
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
