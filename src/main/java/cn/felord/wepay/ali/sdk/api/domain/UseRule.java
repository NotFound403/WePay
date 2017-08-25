package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券的使用规则信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class UseRule extends AlipayObject {

	private static final long serialVersionUID = 7569253139772825823L;

	/**
	 * 扩展属性，无需设置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券的不可用时间
	 */
	@ApiField("forbidden_time")
	private ForbbidenTime forbiddenTime;

	/**
	 * 优惠券的使用支付渠道限制规则，
不受支付渠道限制:USE_NO_LIMIT;
仅限储值卡支付时可用:USE_ON_CURRENT_PAY_CHANNEL;
储值卡支付时不可用:NOT_ALLOWED_USE;
【备注】
支付渠道限制不允许修改
	 */
	@ApiField("limit_rule")
	private String limitRule;

	/**
	 * 券核销的最低消费门槛，单位元
	 */
	@ApiField("min_consume")
	private String minConsume;

	/**
	 * 券买单跳转链接
	 */
	@ApiField("pay_redirect_url")
	private String payRedirectUrl;

	/**
	 * 券适用门店列表
仅品牌商发起的招商活动可为空
直发奖类型活动必须与活动适用门店一致
最多支持10w家门店
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	/**
	 * 券可用时间段
	 */
	@ApiListField("use_time")
	@ApiField("use_time")
	private List<UseTime> useTime;

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
	 * <p>Getter for the field <code>forbiddenTime</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ForbbidenTime} object.
	 */
	public ForbbidenTime getForbiddenTime() {
		return this.forbiddenTime;
	}
	/**
	 * <p>Setter for the field <code>forbiddenTime</code>.</p>
	 *
	 * @param forbiddenTime a {@link cn.felord.wepay.ali.sdk.api.domain.ForbbidenTime} object.
	 */
	public void setForbiddenTime(ForbbidenTime forbiddenTime) {
		this.forbiddenTime = forbiddenTime;
	}

	/**
	 * <p>Getter for the field <code>limitRule</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLimitRule() {
		return this.limitRule;
	}
	/**
	 * <p>Setter for the field <code>limitRule</code>.</p>
	 *
	 * @param limitRule a {@link java.lang.String} object.
	 */
	public void setLimitRule(String limitRule) {
		this.limitRule = limitRule;
	}

	/**
	 * <p>Getter for the field <code>minConsume</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinConsume() {
		return this.minConsume;
	}
	/**
	 * <p>Setter for the field <code>minConsume</code>.</p>
	 *
	 * @param minConsume a {@link java.lang.String} object.
	 */
	public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
	}

	/**
	 * <p>Getter for the field <code>payRedirectUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayRedirectUrl() {
		return this.payRedirectUrl;
	}
	/**
	 * <p>Setter for the field <code>payRedirectUrl</code>.</p>
	 *
	 * @param payRedirectUrl a {@link java.lang.String} object.
	 */
	public void setPayRedirectUrl(String payRedirectUrl) {
		this.payRedirectUrl = payRedirectUrl;
	}

	/**
	 * <p>Getter for the field <code>suitShops</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSuitShops() {
		return this.suitShops;
	}
	/**
	 * <p>Setter for the field <code>suitShops</code>.</p>
	 *
	 * @param suitShops a {@link java.util.List} object.
	 */
	public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

	/**
	 * <p>Getter for the field <code>useTime</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<UseTime> getUseTime() {
		return this.useTime;
	}
	/**
	 * <p>Setter for the field <code>useTime</code>.</p>
	 *
	 * @param useTime a {@link java.util.List} object.
	 */
	public void setUseTime(List<UseTime> useTime) {
		this.useTime = useTime;
	}

}
