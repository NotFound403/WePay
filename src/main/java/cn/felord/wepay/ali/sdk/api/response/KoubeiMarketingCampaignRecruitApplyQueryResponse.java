package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.RecruitItemApplyData;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.apply.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignRecruitApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432367294953384551L;

	/** 
	 * 活动开始购买时间
	 */
	@ApiField("bought_time")
	private Date boughtTime;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 招商报名数据总数
	 */
	@ApiField("item_count")
	private String itemCount;

	/** 
	 * 招商报名数据
	 */
	@ApiListField("item_info")
	@ApiField("recruit_item_apply_data")
	private List<RecruitItemApplyData> itemInfo;

	/** 
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 预热开始时间 2016-12-12 10:10:10
	 */
	@ApiField("prehot_time")
	private Date prehotTime;

	/**
	 * <p>Setter for the field <code>boughtTime</code>.</p>
	 *
	 * @param boughtTime a {@link java.util.Date} object.
	 */
	public void setBoughtTime(Date boughtTime) {
		this.boughtTime = boughtTime;
	}
	/**
	 * <p>Getter for the field <code>boughtTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getBoughtTime( ) {
		return this.boughtTime;
	}

	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime( ) {
		return this.endTime;
	}

	/**
	 * <p>Setter for the field <code>itemCount</code>.</p>
	 *
	 * @param itemCount a {@link java.lang.String} object.
	 */
	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}
	/**
	 * <p>Getter for the field <code>itemCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemCount( ) {
		return this.itemCount;
	}

	/**
	 * <p>Setter for the field <code>itemInfo</code>.</p>
	 *
	 * @param itemInfo a {@link java.util.List} object.
	 */
	public void setItemInfo(List<RecruitItemApplyData> itemInfo) {
		this.itemInfo = itemInfo;
	}
	/**
	 * <p>Getter for the field <code>itemInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RecruitItemApplyData> getItemInfo( ) {
		return this.itemInfo;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName( ) {
		return this.name;
	}

	/**
	 * <p>Setter for the field <code>prehotTime</code>.</p>
	 *
	 * @param prehotTime a {@link java.util.Date} object.
	 */
	public void setPrehotTime(Date prehotTime) {
		this.prehotTime = prehotTime;
	}
	/**
	 * <p>Getter for the field <code>prehotTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPrehotTime( ) {
		return this.prehotTime;
	}

}
