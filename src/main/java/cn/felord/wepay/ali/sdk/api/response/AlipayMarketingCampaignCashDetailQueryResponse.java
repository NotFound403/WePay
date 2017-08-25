package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.detail.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4459488214363534952L;

	/** 
	 * 活动状态，CREATED: 已创建未打款
PAID:已打款
READY:活动已开始
PAUSE:活动已暂停
CLOSED:活动已结束
SETTLE:活动已清算
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/** 
	 * 活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动文案,用户在账单中看到的红包描述
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/** 
	 * 现金红包的发放形式, fixed为固定金额,random为随机金额
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 活动已发放金额
	 */
	@ApiField("send_amount")
	private String sendAmount;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 活动总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 红包总个数
	 */
	@ApiField("total_num")
	private Long totalNum;

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

	/**
	 * <p>Setter for the field <code>couponName</code>.</p>
	 *
	 * @param couponName a {@link java.lang.String} object.
	 */
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	/**
	 * <p>Getter for the field <code>couponName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponName( ) {
		return this.couponName;
	}

	/**
	 * <p>Setter for the field <code>crowdNo</code>.</p>
	 *
	 * @param crowdNo a {@link java.lang.String} object.
	 */
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}
	/**
	 * <p>Getter for the field <code>crowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdNo( ) {
		return this.crowdNo;
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
	 * <p>Setter for the field <code>originCrowdNo</code>.</p>
	 *
	 * @param originCrowdNo a {@link java.lang.String} object.
	 */
	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}
	/**
	 * <p>Getter for the field <code>originCrowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
	}

	/**
	 * <p>Setter for the field <code>prizeMsg</code>.</p>
	 *
	 * @param prizeMsg a {@link java.lang.String} object.
	 */
	public void setPrizeMsg(String prizeMsg) {
		this.prizeMsg = prizeMsg;
	}
	/**
	 * <p>Getter for the field <code>prizeMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeMsg( ) {
		return this.prizeMsg;
	}

	/**
	 * <p>Setter for the field <code>prizeType</code>.</p>
	 *
	 * @param prizeType a {@link java.lang.String} object.
	 */
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}
	/**
	 * <p>Getter for the field <code>prizeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeType( ) {
		return this.prizeType;
	}

	/**
	 * <p>Setter for the field <code>sendAmount</code>.</p>
	 *
	 * @param sendAmount a {@link java.lang.String} object.
	 */
	public void setSendAmount(String sendAmount) {
		this.sendAmount = sendAmount;
	}
	/**
	 * <p>Getter for the field <code>sendAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendAmount( ) {
		return this.sendAmount;
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
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime( ) {
		return this.startTime;
	}

	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	/**
	 * <p>Setter for the field <code>totalNum</code>.</p>
	 *
	 * @param totalNum a {@link java.lang.Long} object.
	 */
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * <p>Getter for the field <code>totalNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
