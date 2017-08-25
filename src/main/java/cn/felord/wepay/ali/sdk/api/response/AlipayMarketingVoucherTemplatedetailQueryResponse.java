package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.templatedetail.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherTemplatedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1652514734818966416L;

	/** 
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 最低额度。券的最低使用门槛金额，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不小于0，小数点以后最多保留两位。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/** 
	 * 已发放总金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("publish_amount")
	private String publishAmount;

	/** 
	 * 已发放张数。单位为张。该数值是大于0的整数。
	 */
	@ApiField("publish_count")
	private Long publishCount;

	/** 
	 * 发放结束时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 发放开始时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/** 
	 * 退回金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("recycle_amount")
	private String recycleAmount;

	/** 
	 * 模板状态，可枚举。分别为‘草稿’(I)、‘生效’(S)、‘删除’(D)和‘过期’(E)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 总金额面额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。仅代金券
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 已使用总金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("used_amount")
	private String usedAmount;

	/** 
	 * 已使用张数。单位为张。该数值是大于0的整数。
	 */
	@ApiField("used_count")
	private Long usedCount;

	/** 
	 * 券使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/** 
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/** 
	 * 拟发行券的数量。单位为张。该数值是大于0的整数。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/** 
	 * 券类型。可枚举，暂时只支持"代金券"(FIX_VOUCHER)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示券生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发券时间开始到往后推duration个单位时间为止作为券的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发券，那么该券从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount( ) {
		return this.amount;
	}

	/**
	 * <p>Setter for the field <code>floorAmount</code>.</p>
	 *
	 * @param floorAmount a {@link java.lang.String} object.
	 */
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}
	/**
	 * <p>Getter for the field <code>floorAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFloorAmount( ) {
		return this.floorAmount;
	}

	/**
	 * <p>Setter for the field <code>publishAmount</code>.</p>
	 *
	 * @param publishAmount a {@link java.lang.String} object.
	 */
	public void setPublishAmount(String publishAmount) {
		this.publishAmount = publishAmount;
	}
	/**
	 * <p>Getter for the field <code>publishAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublishAmount( ) {
		return this.publishAmount;
	}

	/**
	 * <p>Setter for the field <code>publishCount</code>.</p>
	 *
	 * @param publishCount a {@link java.lang.Long} object.
	 */
	public void setPublishCount(Long publishCount) {
		this.publishCount = publishCount;
	}
	/**
	 * <p>Getter for the field <code>publishCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPublishCount( ) {
		return this.publishCount;
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
	 * <p>Getter for the field <code>publishEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishEndTime( ) {
		return this.publishEndTime;
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
	 * <p>Getter for the field <code>publishStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishStartTime( ) {
		return this.publishStartTime;
	}

	/**
	 * <p>Setter for the field <code>recycleAmount</code>.</p>
	 *
	 * @param recycleAmount a {@link java.lang.String} object.
	 */
	public void setRecycleAmount(String recycleAmount) {
		this.recycleAmount = recycleAmount;
	}
	/**
	 * <p>Getter for the field <code>recycleAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecycleAmount( ) {
		return this.recycleAmount;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
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
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId( ) {
		return this.templateId;
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
	 * <p>Setter for the field <code>usedAmount</code>.</p>
	 *
	 * @param usedAmount a {@link java.lang.String} object.
	 */
	public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}
	/**
	 * <p>Getter for the field <code>usedAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUsedAmount( ) {
		return this.usedAmount;
	}

	/**
	 * <p>Setter for the field <code>usedCount</code>.</p>
	 *
	 * @param usedCount a {@link java.lang.Long} object.
	 */
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}
	/**
	 * <p>Getter for the field <code>usedCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getUsedCount( ) {
		return this.usedCount;
	}

	/**
	 * <p>Setter for the field <code>voucherDescription</code>.</p>
	 *
	 * @param voucherDescription a {@link java.lang.String} object.
	 */
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}
	/**
	 * <p>Getter for the field <code>voucherDescription</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherDescription( ) {
		return this.voucherDescription;
	}

	/**
	 * <p>Setter for the field <code>voucherName</code>.</p>
	 *
	 * @param voucherName a {@link java.lang.String} object.
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	/**
	 * <p>Getter for the field <code>voucherName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherName( ) {
		return this.voucherName;
	}

	/**
	 * <p>Setter for the field <code>voucherQuantity</code>.</p>
	 *
	 * @param voucherQuantity a {@link java.lang.Long} object.
	 */
	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}
	/**
	 * <p>Getter for the field <code>voucherQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getVoucherQuantity( ) {
		return this.voucherQuantity;
	}

	/**
	 * <p>Setter for the field <code>voucherType</code>.</p>
	 *
	 * @param voucherType a {@link java.lang.String} object.
	 */
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	/**
	 * <p>Getter for the field <code>voucherType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherType( ) {
		return this.voucherType;
	}

	/**
	 * <p>Setter for the field <code>voucherValidPeriod</code>.</p>
	 *
	 * @param voucherValidPeriod a {@link java.lang.String} object.
	 */
	public void setVoucherValidPeriod(String voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}
	/**
	 * <p>Getter for the field <code>voucherValidPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherValidPeriod( ) {
		return this.voucherValidPeriod;
	}

}
