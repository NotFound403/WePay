package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险营销活动DTO对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 1488159873315683999L;

	/**
	 * 保险营销活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动奖品发行量
	 */
	@ApiField("circulation")
	private Long circulation;

	/**
	 * 活动权益配置
	 */
	@ApiField("coupon_config")
	private InsMktCouponConfigDTO couponConfig;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 活动标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 保险营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 发奖金额算法
	 */
	@ApiField("send_algorithm")
	private String sendAlgorithm;

	/**
	 * 发奖规则类型：
1. 基于账户做发奖控制
2. 基于身份证做发奖控制
3. 基于业务单号做发奖控制
	 */
	@ApiField("send_frqnc_type")
	private Long sendFrqncType;

	/**
	 * 发奖规则值，频次为3
	 */
	@ApiField("send_frqnc_value")
	private Long sendFrqncValue;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态：
5：活动已发布，待生效
6：活动已生效
7：活动已失效
8：活动已下线
	 */
	@ApiField("status")
	private Long status;

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
	 * <p>Getter for the field <code>circulation</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCirculation() {
		return this.circulation;
	}
	/**
	 * <p>Setter for the field <code>circulation</code>.</p>
	 *
	 * @param circulation a {@link java.lang.Long} object.
	 */
	public void setCirculation(Long circulation) {
		this.circulation = circulation;
	}

	/**
	 * <p>Getter for the field <code>couponConfig</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsMktCouponConfigDTO} object.
	 */
	public InsMktCouponConfigDTO getCouponConfig() {
		return this.couponConfig;
	}
	/**
	 * <p>Setter for the field <code>couponConfig</code>.</p>
	 *
	 * @param couponConfig a {@link cn.felord.wepay.ali.sdk.api.domain.InsMktCouponConfigDTO} object.
	 */
	public void setCouponConfig(InsMktCouponConfigDTO couponConfig) {
		this.couponConfig = couponConfig;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
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
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>mktObjects</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsMktObjectDTO> getMktObjects() {
		return this.mktObjects;
	}
	/**
	 * <p>Setter for the field <code>mktObjects</code>.</p>
	 *
	 * @param mktObjects a {@link java.util.List} object.
	 */
	public void setMktObjects(List<InsMktObjectDTO> mktObjects) {
		this.mktObjects = mktObjects;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
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
	 * <p>Getter for the field <code>sendAlgorithm</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendAlgorithm() {
		return this.sendAlgorithm;
	}
	/**
	 * <p>Setter for the field <code>sendAlgorithm</code>.</p>
	 *
	 * @param sendAlgorithm a {@link java.lang.String} object.
	 */
	public void setSendAlgorithm(String sendAlgorithm) {
		this.sendAlgorithm = sendAlgorithm;
	}

	/**
	 * <p>Getter for the field <code>sendFrqncType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSendFrqncType() {
		return this.sendFrqncType;
	}
	/**
	 * <p>Setter for the field <code>sendFrqncType</code>.</p>
	 *
	 * @param sendFrqncType a {@link java.lang.Long} object.
	 */
	public void setSendFrqncType(Long sendFrqncType) {
		this.sendFrqncType = sendFrqncType;
	}

	/**
	 * <p>Getter for the field <code>sendFrqncValue</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSendFrqncValue() {
		return this.sendFrqncValue;
	}
	/**
	 * <p>Setter for the field <code>sendFrqncValue</code>.</p>
	 *
	 * @param sendFrqncValue a {@link java.lang.Long} object.
	 */
	public void setSendFrqncValue(Long sendFrqncValue) {
		this.sendFrqncValue = sendFrqncValue;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.Long} object.
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

}
