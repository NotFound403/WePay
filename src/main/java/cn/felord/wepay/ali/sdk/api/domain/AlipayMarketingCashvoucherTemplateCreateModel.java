package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建资金券模板
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCashvoucherTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6112115787222496955L;

	/**
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不能小于0，小数点以后最多保留两位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 创建券模板时录入的品牌信息，由商户自定义，在通用模板中展示在券LOGO下方
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 最低额度。设置券使用门槛，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不能小于0，小数点以后最多保留两位。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 出资人登录账号。用于发券的资金会从该账号划拨到发券专用账户上
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 券变动异步通知地址
	 */
	@ApiField("notify_uri")
	private String notifyUri;

	/**
	 * 外部业务单号。用作幂等控制。同一个pid下相同的外部业务单号作唯一键，参数不变的情况下，再次请求返回同样的模板id。请求成功后，修改参数再次提交，需要更换订单号。
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
	 * 重定向地址。支付成功后需要重定向的地址，如果为空则不做重定向。
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 规则配置，JSON字符串，{"PID": "2088512417841101,2088512417841102", "STORE": "123456,678901"}，其中PID表示可以核销该券的pid列表，多个值用英文逗号隔开，PID为必传且需与接口调用PID同属一个商家，STORE表示可以核销该券的内部门店ID，多个值用英文逗号隔开
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 券标语，用于拼接券名称，最多6个字符，券名称=券标语+券面额+’元代金券’,此字段已弃用
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 拟发行券的数量。单位为张。该数值必须是大于0的整数。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/**
	 * 券类型。可枚举，暂时只支持"代金券"(FIX_VOUCHER)，使用示例voucher_type=FIX_VOUCHER
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券使用场景。可枚举，暂时只支持“支付宝充值中心话费流量通用现金券”(ALIPAY_RECHARGE)，使用示例voucher_use_scene=ALIPAY_RECHARGE
	 */
	@ApiField("voucher_use_scene")
	private String voucherUseScene;

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
	 * <p>Getter for the field <code>fundAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	/**
	 * <p>Setter for the field <code>fundAccount</code>.</p>
	 *
	 * @param fundAccount a {@link java.lang.String} object.
	 */
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
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
	 * <p>Getter for the field <code>redirectUri</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRedirectUri() {
		return this.redirectUri;
	}
	/**
	 * <p>Setter for the field <code>redirectUri</code>.</p>
	 *
	 * @param redirectUri a {@link java.lang.String} object.
	 */
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
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
	 * <p>Getter for the field <code>voucherUseScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherUseScene() {
		return this.voucherUseScene;
	}
	/**
	 * <p>Setter for the field <code>voucherUseScene</code>.</p>
	 *
	 * @param voucherUseScene a {@link java.lang.String} object.
	 */
	public void setVoucherUseScene(String voucherUseScene) {
		this.voucherUseScene = voucherUseScene;
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
