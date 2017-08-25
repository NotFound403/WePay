package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻认证数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AliTrustCert extends AlipayObject {

	private static final long serialVersionUID = 4266398127549692824L;

	/**
	 * 点击信用认证图标之后的跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 通过信用认证的图标链接
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当通过信用认证时,取值为"T";否则为"F".
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 芝麻认证等级，取值为1,2,3
	 */
	@ApiField("level")
	private String level;

	/**
	 * 当用户未通过芝麻认证时给出的原因提示
	 */
	@ApiField("message")
	private String message;

	/**
	 * <p>Getter for the field <code>forwardUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getForwardUrl() {
		return this.forwardUrl;
	}
	/**
	 * <p>Setter for the field <code>forwardUrl</code>.</p>
	 *
	 * @param forwardUrl a {@link java.lang.String} object.
	 */
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

	/**
	 * <p>Getter for the field <code>iconUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIconUrl() {
		return this.iconUrl;
	}
	/**
	 * <p>Setter for the field <code>iconUrl</code>.</p>
	 *
	 * @param iconUrl a {@link java.lang.String} object.
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * <p>Getter for the field <code>isCertified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsCertified() {
		return this.isCertified;
	}
	/**
	 * <p>Setter for the field <code>isCertified</code>.</p>
	 *
	 * @param isCertified a {@link java.lang.String} object.
	 */
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	/**
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevel() {
		return this.level;
	}
	/**
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.String} object.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * <p>Getter for the field <code>message</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessage() {
		return this.message;
	}
	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link java.lang.String} object.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
