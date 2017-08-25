package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商圈集卡数据保存接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolMallPointsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5778198729752113665L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 业务类型(目前只有点卡)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 渲染截止时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 卡片展示内容，卡片如果没有集的count设置为0，本次交易获取的卡片需设置is_new的值为true
	 */
	@ApiField("json_content")
	private String jsonContent;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * trade|lottery|system，表示为交易|领取礼包|系统调整
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 外部幂等id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * collecting|collectSuccess|finish字段中的一种
	 */
	@ApiField("state")
	private String state;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityId() {
		return this.activityId;
	}
	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.String} object.
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.util.Date} object.
	 */
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>jsonContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJsonContent() {
		return this.jsonContent;
	}
	/**
	 * <p>Setter for the field <code>jsonContent</code>.</p>
	 *
	 * @param jsonContent a {@link java.lang.String} object.
	 */
	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
	}

	/**
	 * <p>Getter for the field <code>mallId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMallId() {
		return this.mallId;
	}
	/**
	 * <p>Setter for the field <code>mallId</code>.</p>
	 *
	 * @param mallId a {@link java.lang.String} object.
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	/**
	 * <p>Getter for the field <code>operate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperate() {
		return this.operate;
	}
	/**
	 * <p>Setter for the field <code>operate</code>.</p>
	 *
	 * @param operate a {@link java.lang.String} object.
	 */
	public void setOperate(String operate) {
		this.operate = operate;
	}

	/**
	 * <p>Getter for the field <code>outBizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizId() {
		return this.outBizId;
	}
	/**
	 * <p>Setter for the field <code>outBizId</code>.</p>
	 *
	 * @param outBizId a {@link java.lang.String} object.
	 */
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	/**
	 * <p>Getter for the field <code>state</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * <p>Setter for the field <code>state</code>.</p>
	 *
	 * @param state a {@link java.lang.String} object.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * <p>Getter for the field <code>tradeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeId() {
		return this.tradeId;
	}
	/**
	 * <p>Setter for the field <code>tradeId</code>.</p>
	 *
	 * @param tradeId a {@link java.lang.String} object.
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
