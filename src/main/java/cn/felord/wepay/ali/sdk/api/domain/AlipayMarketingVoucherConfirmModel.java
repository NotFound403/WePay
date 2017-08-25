package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户确认领券
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3128889614123975478L;

	/**
	 * 用于决定在用户确认领券后是否重定向。可枚举：true表示需要重定向，false表示不需要重定向，不区分大小写
	 */
	@ApiField("need_redirect")
	private Boolean needRedirect;

	/**
	 * 外部业务单号。用作幂等控制。同一个template_id、user_id、out_biz_no返回相同的发券码
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 重定向地址，用于接收支付宝返回的领取码
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 指定用户确认页面的主题名称。目前提供5套主题，分别为：red, blue, yellow, green, orange
	 */
	@ApiField("theme")
	private String theme;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>needRedirect</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getNeedRedirect() {
		return this.needRedirect;
	}
	/**
	 * <p>Setter for the field <code>needRedirect</code>.</p>
	 *
	 * @param needRedirect a {@link java.lang.Boolean} object.
	 */
	public void setNeedRedirect(Boolean needRedirect) {
		this.needRedirect = needRedirect;
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
	 * <p>Getter for the field <code>theme</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTheme() {
		return this.theme;
	}
	/**
	 * <p>Setter for the field <code>theme</code>.</p>
	 *
	 * @param theme a {@link java.lang.String} object.
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
