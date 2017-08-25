package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Voucher extends AlipayObject {

	private static final long serialVersionUID = 3333877556876565856L;

	/**
	 * 券副标题
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 券的说明条款
	 */
	@ApiListField("clause_terms")
	@ApiField("clause_term")
	private List<ClauseTerm> clauseTerms;

	/**
	 * 延迟生效信息
	 */
	@ApiField("delay_info")
	private DelayInfo delayInfo;

	/**
	 * 券详细说明
最多包含500个字符
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 券使用说明描述列表
	 */
	@ApiListField("desc_detail_list")
	@ApiField("voucher_desc_detail")
	private List<VoucherDescDetail> descDetailList;

	/**
	 * 券的展示信息
	 */
	@ApiField("display_config")
	private DisplayConfig displayConfig;

	/**
	 * 券是否可转赠，默认为可转赠
	 */
	@ApiField("donate_flag")
	private String donateFlag;

	/**
	 * 券生效的方式，目前支持以下方式
立即生效：IMMEDIATELY
延迟生效：DELAY
仅在券有效期类型为相对有效期时生效
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 券有效期的结束时间
仅在券有效期类型为绝对有效期时生效
必须晚于活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 券的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 单品信息
兑换券不允许设置单品信息
减至券必须设置单品信息
其他类型券可按需设置
	 */
	@ApiField("item_info")
	private ItemInfo itemInfo;

	/**
	 * 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 最高优惠金额，单位元
必须为合法金额类型字符串
仅当券类型为DISOUNT有效
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 券核销叠加标识
	 */
	@ApiField("merge_verify_config")
	private MergeVerifyConfig mergeVerifyConfig;

	/**
	 * 券叠加的属性，NO_MULTI:不可叠加;MULTI_USE_WITH_SINGLE:全场优惠和单品优惠的叠加；MULTI_USE_WITH_OTHERS:全场和其他所有优惠都可以叠加
	 */
	@ApiField("multi_use_mode")
	private String multiUseMode;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 折扣率
仅当券类型为折扣券时有效
有效折扣率取值范围0.11-0.99
仅允许保留小数点后两位
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 券相对有效期，单位天
仅在券有效期类型为相对有效期时生效
如，设5表示领券领取后5日内有效
	 */
	@ApiField("relative_time")
	private String relativeTime;

	/**
	 * 券有效期的开始时间
仅在券有效期类型为绝对有效期时生效
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 券类型，目前支持以下类型：
EXCHANGE：兑换券
MONEY：代金券
REDUCETO：减至券
RATE：折扣券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券的使用说明
使用须知最多6条，且每条最多100字
	 */
	@ApiListField("use_instructions")
	@ApiField("string")
	private List<String> useInstructions;

	/**
	 * 券的使用规则信息
	 */
	@ApiField("use_rule")
	private UseRule useRule;

	/**
	 * 券有效期类型，目前支持以下类型：
RELATIVE：相对有效期
FIXED：绝对有效期
	 */
	@ApiField("validate_type")
	private String validateType;

	/**
	 * 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式
USER_CLICK:用户自己点击券上的按钮核销
MERCHANT_SCAN：商户通过APP扫码核销
其他情况下此字段为空
	 */
	@ApiField("verify_mode")
	private String verifyMode;

	/**
	 * 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * 券的备注
	 */
	@ApiField("voucher_note")
	private String voucherNote;

	/**
	 * 券面额，单位元
必须为合法金额类型字符串
券类型为代金券、减至券时，券面额必须设置
单品减至券的券面额必须低于单品原价
	 */
	@ApiField("worth_value")
	private String worthValue;

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
	 * <p>Getter for the field <code>clauseTerms</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ClauseTerm> getClauseTerms() {
		return this.clauseTerms;
	}
	/**
	 * <p>Setter for the field <code>clauseTerms</code>.</p>
	 *
	 * @param clauseTerms a {@link java.util.List} object.
	 */
	public void setClauseTerms(List<ClauseTerm> clauseTerms) {
		this.clauseTerms = clauseTerms;
	}

	/**
	 * <p>Getter for the field <code>delayInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.DelayInfo} object.
	 */
	public DelayInfo getDelayInfo() {
		return this.delayInfo;
	}
	/**
	 * <p>Setter for the field <code>delayInfo</code>.</p>
	 *
	 * @param delayInfo a {@link cn.felord.wepay.ali.sdk.api.domain.DelayInfo} object.
	 */
	public void setDelayInfo(DelayInfo delayInfo) {
		this.delayInfo = delayInfo;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>descDetailList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<VoucherDescDetail> getDescDetailList() {
		return this.descDetailList;
	}
	/**
	 * <p>Setter for the field <code>descDetailList</code>.</p>
	 *
	 * @param descDetailList a {@link java.util.List} object.
	 */
	public void setDescDetailList(List<VoucherDescDetail> descDetailList) {
		this.descDetailList = descDetailList;
	}

	/**
	 * <p>Getter for the field <code>displayConfig</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.DisplayConfig} object.
	 */
	public DisplayConfig getDisplayConfig() {
		return this.displayConfig;
	}
	/**
	 * <p>Setter for the field <code>displayConfig</code>.</p>
	 *
	 * @param displayConfig a {@link cn.felord.wepay.ali.sdk.api.domain.DisplayConfig} object.
	 */
	public void setDisplayConfig(DisplayConfig displayConfig) {
		this.displayConfig = displayConfig;
	}

	/**
	 * <p>Getter for the field <code>donateFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDonateFlag() {
		return this.donateFlag;
	}
	/**
	 * <p>Setter for the field <code>donateFlag</code>.</p>
	 *
	 * @param donateFlag a {@link java.lang.String} object.
	 */
	public void setDonateFlag(String donateFlag) {
		this.donateFlag = donateFlag;
	}

	/**
	 * <p>Getter for the field <code>effectType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEffectType() {
		return this.effectType;
	}
	/**
	 * <p>Setter for the field <code>effectType</code>.</p>
	 *
	 * @param effectType a {@link java.lang.String} object.
	 */
	public void setEffectType(String effectType) {
		this.effectType = effectType;
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
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>itemInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ItemInfo} object.
	 */
	public ItemInfo getItemInfo() {
		return this.itemInfo;
	}
	/**
	 * <p>Setter for the field <code>itemInfo</code>.</p>
	 *
	 * @param itemInfo a {@link cn.felord.wepay.ali.sdk.api.domain.ItemInfo} object.
	 */
	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	/**
	 * <p>Getter for the field <code>logo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogo() {
		return this.logo;
	}
	/**
	 * <p>Setter for the field <code>logo</code>.</p>
	 *
	 * @param logo a {@link java.lang.String} object.
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * <p>Getter for the field <code>maxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxAmount() {
		return this.maxAmount;
	}
	/**
	 * <p>Setter for the field <code>maxAmount</code>.</p>
	 *
	 * @param maxAmount a {@link java.lang.String} object.
	 */
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	/**
	 * <p>Getter for the field <code>mergeVerifyConfig</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MergeVerifyConfig} object.
	 */
	public MergeVerifyConfig getMergeVerifyConfig() {
		return this.mergeVerifyConfig;
	}
	/**
	 * <p>Setter for the field <code>mergeVerifyConfig</code>.</p>
	 *
	 * @param mergeVerifyConfig a {@link cn.felord.wepay.ali.sdk.api.domain.MergeVerifyConfig} object.
	 */
	public void setMergeVerifyConfig(MergeVerifyConfig mergeVerifyConfig) {
		this.mergeVerifyConfig = mergeVerifyConfig;
	}

	/**
	 * <p>Getter for the field <code>multiUseMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMultiUseMode() {
		return this.multiUseMode;
	}
	/**
	 * <p>Setter for the field <code>multiUseMode</code>.</p>
	 *
	 * @param multiUseMode a {@link java.lang.String} object.
	 */
	public void setMultiUseMode(String multiUseMode) {
		this.multiUseMode = multiUseMode;
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
	 * <p>Getter for the field <code>rate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRate() {
		return this.rate;
	}
	/**
	 * <p>Setter for the field <code>rate</code>.</p>
	 *
	 * @param rate a {@link java.lang.String} object.
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * <p>Getter for the field <code>relativeTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRelativeTime() {
		return this.relativeTime;
	}
	/**
	 * <p>Setter for the field <code>relativeTime</code>.</p>
	 *
	 * @param relativeTime a {@link java.lang.String} object.
	 */
	public void setRelativeTime(String relativeTime) {
		this.relativeTime = relativeTime;
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
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>useInstructions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUseInstructions() {
		return this.useInstructions;
	}
	/**
	 * <p>Setter for the field <code>useInstructions</code>.</p>
	 *
	 * @param useInstructions a {@link java.util.List} object.
	 */
	public void setUseInstructions(List<String> useInstructions) {
		this.useInstructions = useInstructions;
	}

	/**
	 * <p>Getter for the field <code>useRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.UseRule} object.
	 */
	public UseRule getUseRule() {
		return this.useRule;
	}
	/**
	 * <p>Setter for the field <code>useRule</code>.</p>
	 *
	 * @param useRule a {@link cn.felord.wepay.ali.sdk.api.domain.UseRule} object.
	 */
	public void setUseRule(UseRule useRule) {
		this.useRule = useRule;
	}

	/**
	 * <p>Getter for the field <code>validateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidateType() {
		return this.validateType;
	}
	/**
	 * <p>Setter for the field <code>validateType</code>.</p>
	 *
	 * @param validateType a {@link java.lang.String} object.
	 */
	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

	/**
	 * <p>Getter for the field <code>verifyMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyMode() {
		return this.verifyMode;
	}
	/**
	 * <p>Setter for the field <code>verifyMode</code>.</p>
	 *
	 * @param verifyMode a {@link java.lang.String} object.
	 */
	public void setVerifyMode(String verifyMode) {
		this.verifyMode = verifyMode;
	}

	/**
	 * <p>Getter for the field <code>voucherImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherImg() {
		return this.voucherImg;
	}
	/**
	 * <p>Setter for the field <code>voucherImg</code>.</p>
	 *
	 * @param voucherImg a {@link java.lang.String} object.
	 */
	public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

	/**
	 * <p>Getter for the field <code>voucherNote</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherNote() {
		return this.voucherNote;
	}
	/**
	 * <p>Setter for the field <code>voucherNote</code>.</p>
	 *
	 * @param voucherNote a {@link java.lang.String} object.
	 */
	public void setVoucherNote(String voucherNote) {
		this.voucherNote = voucherNote;
	}

	/**
	 * <p>Getter for the field <code>worthValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWorthValue() {
		return this.worthValue;
	}
	/**
	 * <p>Setter for the field <code>worthValue</code>.</p>
	 *
	 * @param worthValue a {@link java.lang.String} object.
	 */
	public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}

}
