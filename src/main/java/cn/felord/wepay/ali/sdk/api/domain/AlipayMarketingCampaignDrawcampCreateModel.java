package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 营销抽奖活动创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDrawcampCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2216723631976853198L;

	/**
	 * 单用户以支付宝账号维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("account_count")
	private String accountCount;

	/**
	 * 以移动设备维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("appid_count")
	private String appidCount;

	/**
	 * 单个用户当前活动允许中奖的最大次数，最大值999999
	 */
	@ApiField("award_count")
	private String awardCount;

	/**
	 * 活动奖品总中奖几率，开发者需传入整数值，如：传入99支付宝默认为99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/**
	 * 活动唯一标识,不能包含除中文、英文、数字以外的字符，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("camp_code")
	private String campCode;

	/**
	 * 活动结束时间，yyyy-MM-dd HH:00:00格式(到小时)，需要大于活动开始时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 活动名称，开发者自定义
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 活动开始时间，yyyy-MM-dd HH:00:00格式（到小时），时间不能早于当前日期的0点
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/**
	 * 凭证验证规则id，通过alipay.marketing.campaign.cert.create 接口创建的凭证id
	 */
	@ApiField("cert_rule_id")
	private String certRuleId;

	/**
	 * 单用户以账户证件号（如身份证号、护照、军官证等）维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("certification_count")
	private String certificationCount;

	/**
	 * 圈人规则id，通过alipay.marketing.campaign.rule.crowd.create 接口创建的规则id
	 */
	@ApiField("crowd_rule_id")
	private String crowdRuleId;

	/**
	 * 以认证手机号（与支付宝账号绑定的手机号）维度的可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("mobile_count")
	private String mobileCount;

	/**
	 * 开发者用于区分商户的唯一标识，由开发者自定义，用于区分是开发者名下哪一个商户的请求，为空则为默认标识
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 奖品模型，至少需要配置一个奖品
	 */
	@ApiListField("prize_list")
	@ApiField("mp_prize_info_model")
	private List<MpPrizeInfoModel> prizeList;

	/**
	 * 营销验证规则id，由支付宝配置
	 */
	@ApiField("promo_rule_id")
	private String promoRuleId;

	/**
	 * 活动触发类型，目前支持
CAMP_USER_TRIGGER：用户触发（开发者调用alipay.marketing.campaign.drawcamp.trigger 接口触发）；
CAMP_SYS_TRIGGER：系统触发，必须配置实时人群验证规则（如：配置了监听用户支付事件，支付宝会根据活动规则自动发奖，无需用户手动触发）。
	 */
	@ApiField("trigger_type")
	private String triggerType;

	/**
	 * 实时人群验证规则id，由支付宝配置
	 */
	@ApiField("trigger_user_rule_id")
	private String triggerUserRuleId;

	/**
	 * 人群验证规则id，由支付宝配置
	 */
	@ApiField("user_rule_id")
	private String userRuleId;

	/**
	 * <p>Getter for the field <code>accountCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountCount() {
		return this.accountCount;
	}
	/**
	 * <p>Setter for the field <code>accountCount</code>.</p>
	 *
	 * @param accountCount a {@link java.lang.String} object.
	 */
	public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}

	/**
	 * <p>Getter for the field <code>appidCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppidCount() {
		return this.appidCount;
	}
	/**
	 * <p>Setter for the field <code>appidCount</code>.</p>
	 *
	 * @param appidCount a {@link java.lang.String} object.
	 */
	public void setAppidCount(String appidCount) {
		this.appidCount = appidCount;
	}

	/**
	 * <p>Getter for the field <code>awardCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAwardCount() {
		return this.awardCount;
	}
	/**
	 * <p>Setter for the field <code>awardCount</code>.</p>
	 *
	 * @param awardCount a {@link java.lang.String} object.
	 */
	public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}

	/**
	 * <p>Getter for the field <code>awardRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAwardRate() {
		return this.awardRate;
	}
	/**
	 * <p>Setter for the field <code>awardRate</code>.</p>
	 *
	 * @param awardRate a {@link java.lang.String} object.
	 */
	public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}

	/**
	 * <p>Getter for the field <code>campCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampCode() {
		return this.campCode;
	}
	/**
	 * <p>Setter for the field <code>campCode</code>.</p>
	 *
	 * @param campCode a {@link java.lang.String} object.
	 */
	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}

	/**
	 * <p>Getter for the field <code>campEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampEndTime() {
		return this.campEndTime;
	}
	/**
	 * <p>Setter for the field <code>campEndTime</code>.</p>
	 *
	 * @param campEndTime a {@link java.lang.String} object.
	 */
	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

	/**
	 * <p>Getter for the field <code>campName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampName() {
		return this.campName;
	}
	/**
	 * <p>Setter for the field <code>campName</code>.</p>
	 *
	 * @param campName a {@link java.lang.String} object.
	 */
	public void setCampName(String campName) {
		this.campName = campName;
	}

	/**
	 * <p>Getter for the field <code>campStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStartTime() {
		return this.campStartTime;
	}
	/**
	 * <p>Setter for the field <code>campStartTime</code>.</p>
	 *
	 * @param campStartTime a {@link java.lang.String} object.
	 */
	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

	/**
	 * <p>Getter for the field <code>certRuleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertRuleId() {
		return this.certRuleId;
	}
	/**
	 * <p>Setter for the field <code>certRuleId</code>.</p>
	 *
	 * @param certRuleId a {@link java.lang.String} object.
	 */
	public void setCertRuleId(String certRuleId) {
		this.certRuleId = certRuleId;
	}

	/**
	 * <p>Getter for the field <code>certificationCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificationCount() {
		return this.certificationCount;
	}
	/**
	 * <p>Setter for the field <code>certificationCount</code>.</p>
	 *
	 * @param certificationCount a {@link java.lang.String} object.
	 */
	public void setCertificationCount(String certificationCount) {
		this.certificationCount = certificationCount;
	}

	/**
	 * <p>Getter for the field <code>crowdRuleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdRuleId() {
		return this.crowdRuleId;
	}
	/**
	 * <p>Setter for the field <code>crowdRuleId</code>.</p>
	 *
	 * @param crowdRuleId a {@link java.lang.String} object.
	 */
	public void setCrowdRuleId(String crowdRuleId) {
		this.crowdRuleId = crowdRuleId;
	}

	/**
	 * <p>Getter for the field <code>mobileCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobileCount() {
		return this.mobileCount;
	}
	/**
	 * <p>Setter for the field <code>mobileCount</code>.</p>
	 *
	 * @param mobileCount a {@link java.lang.String} object.
	 */
	public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}

	/**
	 * <p>Getter for the field <code>mpid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMpid() {
		return this.mpid;
	}
	/**
	 * <p>Setter for the field <code>mpid</code>.</p>
	 *
	 * @param mpid a {@link java.lang.String} object.
	 */
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

	/**
	 * <p>Getter for the field <code>prizeList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MpPrizeInfoModel> getPrizeList() {
		return this.prizeList;
	}
	/**
	 * <p>Setter for the field <code>prizeList</code>.</p>
	 *
	 * @param prizeList a {@link java.util.List} object.
	 */
	public void setPrizeList(List<MpPrizeInfoModel> prizeList) {
		this.prizeList = prizeList;
	}

	/**
	 * <p>Getter for the field <code>promoRuleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoRuleId() {
		return this.promoRuleId;
	}
	/**
	 * <p>Setter for the field <code>promoRuleId</code>.</p>
	 *
	 * @param promoRuleId a {@link java.lang.String} object.
	 */
	public void setPromoRuleId(String promoRuleId) {
		this.promoRuleId = promoRuleId;
	}

	/**
	 * <p>Getter for the field <code>triggerType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTriggerType() {
		return this.triggerType;
	}
	/**
	 * <p>Setter for the field <code>triggerType</code>.</p>
	 *
	 * @param triggerType a {@link java.lang.String} object.
	 */
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	/**
	 * <p>Getter for the field <code>triggerUserRuleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTriggerUserRuleId() {
		return this.triggerUserRuleId;
	}
	/**
	 * <p>Setter for the field <code>triggerUserRuleId</code>.</p>
	 *
	 * @param triggerUserRuleId a {@link java.lang.String} object.
	 */
	public void setTriggerUserRuleId(String triggerUserRuleId) {
		this.triggerUserRuleId = triggerUserRuleId;
	}

	/**
	 * <p>Getter for the field <code>userRuleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserRuleId() {
		return this.userRuleId;
	}
	/**
	 * <p>Setter for the field <code>userRuleId</code>.</p>
	 *
	 * @param userRuleId a {@link java.lang.String} object.
	 */
	public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}

}
