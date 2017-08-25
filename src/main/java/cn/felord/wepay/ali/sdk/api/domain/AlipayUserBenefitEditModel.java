package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作权益编辑接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserBenefitEditModel extends AlipayObject {

	private static final long serialVersionUID = 4655499862783426371L;

	/**
	 * 权益专区码，在创建权益前应该先向蚂蚁会员平台申请一个合适的专区码。 专区必须存在。
	 */
	@ApiField("benefit_area_code")
	private String benefitAreaCode;

	/**
	 * 权益图标地址
	 */
	@ApiField("benefit_icon_url")
	private String benefitIconUrl;

	/**
	 * 权益的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益的名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 是否将权益的名称用作专区的副标题, 若为true,则会使用该权益的名称自动覆盖所属专区的副标题(暂未实现)
	 */
	@ApiField("benefit_name_as_area_subtitle")
	private String benefitNameAsAreaSubtitle;

	/**
	 * 权益详情页面地址
	 */
	@ApiField("benefit_page_url")
	private String benefitPageUrl;

	/**
	 * 权益兑换消耗的积分数(修改时必填，防止默认不传的时候被修改成0)
	 */
	@ApiField("benefit_point")
	private Long benefitPoint;

	/**
	 * 权益使用场景索引ID，接入时需要咨询@田豫如何取值
	 */
	@ApiField("benefit_rec_biz_id")
	private String benefitRecBizId;

	/**
	 * 支付宝商家券 ALIPAY_MERCHANT_COUPON
口碑商家券 KOUBEI_MERCHANT_COUPON
花呗分期免息券 HUABEI_FENQI_FREE_INTEREST_COUP
淘系通用券 TAOBAO_COMMON_COUPON
淘系商家券 TAOBAO_MERCHANT_COUPON
国际线上商家券 INTER_ONLINE_MERCHANT_COUPON
国际线下商家券 INTER_OFFLINE_MERCHANT_COUPON
通用商户权益 COMMON_MERCHANT_GOODS
其它 OTHERS, 接入是需要咨询@田豫如何选值
	 */
	@ApiField("benefit_rec_type")
	private String benefitRecType;

	/**
	 * 权益的副标题，用于补充描述权益
	 */
	@ApiField("benefit_subtitle")
	private String benefitSubtitle;

	/**
	 * 支付宝的营销活动id，若不走支付宝活动，则不需要填
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * primary,golden,platinum,diamond分别对应大众、黄金、铂金、钻石会员等级。eligible_grade属性用于限制能够兑换当前权益的用户等级，用户必须不低于配置的等级才能进行兑换。如果没有等级要求，则不要填写该字段。
	 */
	@ApiField("eligible_grade")
	private String eligibleGrade;

	/**
	 * 权益展示结束时间，填如自January 1, 1970, 00:00:00 GMT到目标时间的毫秒数，参考(new Date()).getTime()
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 兑换规则以及不满足该规则后给用户的提示文案，规则id和文案用:分隔；可配置多个，多个之间用,分隔。(分隔符皆是英文半角字符)规则id联系蚂蚁会员pd或运营提供
	 */
	@ApiField("exchange_rule_ids")
	private String exchangeRuleIds;

	/**
	 * 该权益对应每个等级会员的兑换折扣。等级和折扣用:分隔，多组折扣规则用:分隔。折扣0~1。分隔符皆为英文半角字符
	 */
	@ApiField("grade_discount")
	private String gradeDiscount;

	/**
	 * 权益展示起始时间，填如自January 1, 1970, 00:00:00 GMT到目标时间的毫秒数，参考(new Date()).getTime()
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * <p>Getter for the field <code>benefitAreaCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitAreaCode() {
		return this.benefitAreaCode;
	}
	/**
	 * <p>Setter for the field <code>benefitAreaCode</code>.</p>
	 *
	 * @param benefitAreaCode a {@link java.lang.String} object.
	 */
	public void setBenefitAreaCode(String benefitAreaCode) {
		this.benefitAreaCode = benefitAreaCode;
	}

	/**
	 * <p>Getter for the field <code>benefitIconUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitIconUrl() {
		return this.benefitIconUrl;
	}
	/**
	 * <p>Setter for the field <code>benefitIconUrl</code>.</p>
	 *
	 * @param benefitIconUrl a {@link java.lang.String} object.
	 */
	public void setBenefitIconUrl(String benefitIconUrl) {
		this.benefitIconUrl = benefitIconUrl;
	}

	/**
	 * <p>Getter for the field <code>benefitId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitId() {
		return this.benefitId;
	}
	/**
	 * <p>Setter for the field <code>benefitId</code>.</p>
	 *
	 * @param benefitId a {@link java.lang.String} object.
	 */
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	/**
	 * <p>Getter for the field <code>benefitName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitName() {
		return this.benefitName;
	}
	/**
	 * <p>Setter for the field <code>benefitName</code>.</p>
	 *
	 * @param benefitName a {@link java.lang.String} object.
	 */
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	/**
	 * <p>Getter for the field <code>benefitNameAsAreaSubtitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitNameAsAreaSubtitle() {
		return this.benefitNameAsAreaSubtitle;
	}
	/**
	 * <p>Setter for the field <code>benefitNameAsAreaSubtitle</code>.</p>
	 *
	 * @param benefitNameAsAreaSubtitle a {@link java.lang.String} object.
	 */
	public void setBenefitNameAsAreaSubtitle(String benefitNameAsAreaSubtitle) {
		this.benefitNameAsAreaSubtitle = benefitNameAsAreaSubtitle;
	}

	/**
	 * <p>Getter for the field <code>benefitPageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitPageUrl() {
		return this.benefitPageUrl;
	}
	/**
	 * <p>Setter for the field <code>benefitPageUrl</code>.</p>
	 *
	 * @param benefitPageUrl a {@link java.lang.String} object.
	 */
	public void setBenefitPageUrl(String benefitPageUrl) {
		this.benefitPageUrl = benefitPageUrl;
	}

	/**
	 * <p>Getter for the field <code>benefitPoint</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBenefitPoint() {
		return this.benefitPoint;
	}
	/**
	 * <p>Setter for the field <code>benefitPoint</code>.</p>
	 *
	 * @param benefitPoint a {@link java.lang.Long} object.
	 */
	public void setBenefitPoint(Long benefitPoint) {
		this.benefitPoint = benefitPoint;
	}

	/**
	 * <p>Getter for the field <code>benefitRecBizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitRecBizId() {
		return this.benefitRecBizId;
	}
	/**
	 * <p>Setter for the field <code>benefitRecBizId</code>.</p>
	 *
	 * @param benefitRecBizId a {@link java.lang.String} object.
	 */
	public void setBenefitRecBizId(String benefitRecBizId) {
		this.benefitRecBizId = benefitRecBizId;
	}

	/**
	 * <p>Getter for the field <code>benefitRecType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitRecType() {
		return this.benefitRecType;
	}
	/**
	 * <p>Setter for the field <code>benefitRecType</code>.</p>
	 *
	 * @param benefitRecType a {@link java.lang.String} object.
	 */
	public void setBenefitRecType(String benefitRecType) {
		this.benefitRecType = benefitRecType;
	}

	/**
	 * <p>Getter for the field <code>benefitSubtitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitSubtitle() {
		return this.benefitSubtitle;
	}
	/**
	 * <p>Setter for the field <code>benefitSubtitle</code>.</p>
	 *
	 * @param benefitSubtitle a {@link java.lang.String} object.
	 */
	public void setBenefitSubtitle(String benefitSubtitle) {
		this.benefitSubtitle = benefitSubtitle;
	}

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}

	/**
	 * <p>Getter for the field <code>eligibleGrade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEligibleGrade() {
		return this.eligibleGrade;
	}
	/**
	 * <p>Setter for the field <code>eligibleGrade</code>.</p>
	 *
	 * @param eligibleGrade a {@link java.lang.String} object.
	 */
	public void setEligibleGrade(String eligibleGrade) {
		this.eligibleGrade = eligibleGrade;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.lang.String} object.
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>exchangeRuleIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExchangeRuleIds() {
		return this.exchangeRuleIds;
	}
	/**
	 * <p>Setter for the field <code>exchangeRuleIds</code>.</p>
	 *
	 * @param exchangeRuleIds a {@link java.lang.String} object.
	 */
	public void setExchangeRuleIds(String exchangeRuleIds) {
		this.exchangeRuleIds = exchangeRuleIds;
	}

	/**
	 * <p>Getter for the field <code>gradeDiscount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGradeDiscount() {
		return this.gradeDiscount;
	}
	/**
	 * <p>Setter for the field <code>gradeDiscount</code>.</p>
	 *
	 * @param gradeDiscount a {@link java.lang.String} object.
	 */
	public void setGradeDiscount(String gradeDiscount) {
		this.gradeDiscount = gradeDiscount;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.lang.String} object.
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
