package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 修改资金券模板
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCashvoucherTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1176739618985781129L;

	/**
	 * 外部业务单号，用作幂等控制，相同template_id下相同out_biz_no视为同一次修改
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发券。券的发放结束时间和发放开始时间跨度不能大于90天。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss。草稿状态和生效状态可修改
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发券。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss。仅草稿状态可修改。仅草稿状态可修改
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 券标语，用于拼接券名称，最多6个字符，券名称=券标语+券面额+’元代金券’。仅草稿状态可修改
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示券生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发券时间开始到往后推duration个单位时间为止作为券的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发券，那么该券从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

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
	 * <p>Getter for the field <code>publishEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	/**
	 * <p>Setter for the field <code>publishEndTime</code>.</p>
	 *
	 * @param publishEndTime a {@link java.util.Date} object.
	 */
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	/**
	 * <p>Getter for the field <code>publishStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	/**
	 * <p>Setter for the field <code>publishStartTime</code>.</p>
	 *
	 * @param publishStartTime a {@link java.util.Date} object.
	 */
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	/**
	 * <p>Getter for the field <code>slogan</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSlogan() {
		return this.slogan;
	}
	/**
	 * <p>Setter for the field <code>slogan</code>.</p>
	 *
	 * @param slogan a {@link java.lang.String} object.
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * <p>Getter for the field <code>voucherValidPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	/**
	 * <p>Setter for the field <code>voucherValidPeriod</code>.</p>
	 *
	 * @param voucherValidPeriod a {@link java.lang.String} object.
	 */
	public void setVoucherValidPeriod(String voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
