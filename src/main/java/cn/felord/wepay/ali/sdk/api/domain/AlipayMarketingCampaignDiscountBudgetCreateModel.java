package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销立减活动预算创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDiscountBudgetCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6816545869387848821L;

	/**
	 * 业务名称，和out_biz_no一起进行幂等控制
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 预算库使用结束时间，格式：yyyy-MM-dd mm:hh:ss
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 预算名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 预算创建业务号，和biz_from一起进行幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 积分预算库ID
	 */
	@ApiField("out_budget_no")
	private String outBudgetNo;

	/**
	 * 发行人支付宝登录账号
	 */
	@ApiField("publisher_logon_id")
	private String publisherLogonId;

	/**
	 * 预算金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>bizFrom</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizFrom() {
		return this.bizFrom;
	}
	/**
	 * <p>Setter for the field <code>bizFrom</code>.</p>
	 *
	 * @param bizFrom a {@link java.lang.String} object.
	 */
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
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
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>outBudgetNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBudgetNo() {
		return this.outBudgetNo;
	}
	/**
	 * <p>Setter for the field <code>outBudgetNo</code>.</p>
	 *
	 * @param outBudgetNo a {@link java.lang.String} object.
	 */
	public void setOutBudgetNo(String outBudgetNo) {
		this.outBudgetNo = outBudgetNo;
	}

	/**
	 * <p>Getter for the field <code>publisherLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublisherLogonId() {
		return this.publisherLogonId;
	}
	/**
	 * <p>Setter for the field <code>publisherLogonId</code>.</p>
	 *
	 * @param publisherLogonId a {@link java.lang.String} object.
	 */
	public void setPublisherLogonId(String publisherLogonId) {
		this.publisherLogonId = publisherLogonId;
	}

	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount() {
		return this.totalAmount;
	}
	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
