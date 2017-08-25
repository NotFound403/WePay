package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户券模板创建接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCashlessvoucherTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5673157785211486439L;

	/**
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不能小于0，小数点以后最多保留两位。代金券必填，兑换券不能填
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 品牌名。用于拼接券名称，长度不能超过12个字符，voucher_type值为代金券时：券名称=券面额+’元代金券’，voucher_type值为兑换券时：券名称=品牌名+“兑换券”组成 ，券名称最终用于卡包展示
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 扩展信息，暂为启用
	 */
	@ApiField("extension_info")
	private String extensionInfo;

	/**
	 * 最低额度。设置券使用门槛，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不能小于0，小数点以后最多保留两位。 代金券必填，兑换券不能填
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 券变动异步通知地址
	 */
	@ApiField("notify_uri")
	private String notifyUri;

	/**
	 * 外部业务单号。用作幂等控制。同一个pid下相同的外部业务单号作唯一键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发券。券的发放结束时间和发放开始时间跨度不能大于90天。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发券。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 规则配置，JSON字符串，{"PID": "2088512417841101,2088512417841102", "STORE": "123456,678901"}，其中PID表示可以核销该券的pid列表，多个值用英文逗号隔开，PID为必传且需与接口调用PID同属一个商家，STORE表示可以核销该券的内部门店ID，多个值用英文逗号隔开 ， 兑换券不能指定规则配置
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 券可用时段，JSON数组字符串，空数组即[]，表示不限制，指定每周时间段示例：[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]，数组中每个元素都包含三个key：day_rule, time_begin, time_end，其中day_rule表示周几，取值范围[1, 2, 3, 4, 5, 6, 7]（周7表示星期日），多个值使用英文逗号隔开；time_begin和time_end分别表示生效起始时间和结束时间，格式为HH:mm:ss。另外，数组中各个时间规则是或关系。例如，[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]表示在每周的一，二，三，四，五的早上9点到晚上10点券可用或者每周的星期六和星期日的早上8点到晚上11点券可用。 仅支持代金券
	 */
	@ApiField("voucher_available_time")
	private String voucherAvailableTime;

	/**
	 * 券使用说明。JSON数组字符串，最多可以有10条，每条最多50字。如果没有券使用说明则传入空数组即[]
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 拟发行券的数量。单位为张。该数值必须是大于0的整数。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/**
	 * 券类型，取值范围  代金券：CASHLESS_FIX_VOUCHER；兑换券（暂不支持）：EXCHANGE_VOUCHER；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示券生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发券时间开始到往后推duration个单位时间为止作为券的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发券，那么该券从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>extensionInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtensionInfo() {
		return this.extensionInfo;
	}
	/**
	 * <p>Setter for the field <code>extensionInfo</code>.</p>
	 *
	 * @param extensionInfo a {@link java.lang.String} object.
	 */
	public void setExtensionInfo(String extensionInfo) {
		this.extensionInfo = extensionInfo;
	}

	/**
	 * <p>Getter for the field <code>floorAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFloorAmount() {
		return this.floorAmount;
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
	 * <p>Getter for the field <code>notifyUri</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyUri() {
		return this.notifyUri;
	}
	/**
	 * <p>Setter for the field <code>notifyUri</code>.</p>
	 *
	 * @param notifyUri a {@link java.lang.String} object.
	 */
	public void setNotifyUri(String notifyUri) {
		this.notifyUri = notifyUri;
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
	 * <p>Getter for the field <code>ruleConf</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuleConf() {
		return this.ruleConf;
	}
	/**
	 * <p>Setter for the field <code>ruleConf</code>.</p>
	 *
	 * @param ruleConf a {@link java.lang.String} object.
	 */
	public void setRuleConf(String ruleConf) {
		this.ruleConf = ruleConf;
	}

	/**
	 * <p>Getter for the field <code>voucherAvailableTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherAvailableTime() {
		return this.voucherAvailableTime;
	}
	/**
	 * <p>Setter for the field <code>voucherAvailableTime</code>.</p>
	 *
	 * @param voucherAvailableTime a {@link java.lang.String} object.
	 */
	public void setVoucherAvailableTime(String voucherAvailableTime) {
		this.voucherAvailableTime = voucherAvailableTime;
	}

	/**
	 * <p>Getter for the field <code>voucherDescription</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherDescription() {
		return this.voucherDescription;
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
	 * <p>Getter for the field <code>voucherQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getVoucherQuantity() {
		return this.voucherQuantity;
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
	 * <p>Getter for the field <code>voucherType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherType() {
		return this.voucherType;
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
