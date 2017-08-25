package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 此api为了让第三方渠道端调用 ，记录他们的调用数据，然后根据数据比对进行计费功能
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMsaasPromotionCpainfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3417897936931476933L;

	/**
	 * 唯一应用
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 应用版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * bundle_id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 调试数据
	 */
	@ApiField("debug")
	private String debug;

	/**
	 * 扩展信息
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * IDFA
	 */
	@ApiField("idfa")
	private String idfa;

	/**
	 * IOS版本
	 */
	@ApiField("ios_version")
	private String iosVersion;

	/**
	 * MAC
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * <p>Getter for the field <code>appId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppId() {
		return this.appId;
	}
	/**
	 * <p>Setter for the field <code>appId</code>.</p>
	 *
	 * @param appId a {@link java.lang.String} object.
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * <p>Getter for the field <code>appVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppVersion() {
		return this.appVersion;
	}
	/**
	 * <p>Setter for the field <code>appVersion</code>.</p>
	 *
	 * @param appVersion a {@link java.lang.String} object.
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	/**
	 * <p>Getter for the field <code>bundleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBundleId() {
		return this.bundleId;
	}
	/**
	 * <p>Setter for the field <code>bundleId</code>.</p>
	 *
	 * @param bundleId a {@link java.lang.String} object.
	 */
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	/**
	 * <p>Getter for the field <code>channelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelId() {
		return this.channelId;
	}
	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a {@link java.lang.String} object.
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * <p>Getter for the field <code>debug</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDebug() {
		return this.debug;
	}
	/**
	 * <p>Setter for the field <code>debug</code>.</p>
	 *
	 * @param debug a {@link java.lang.String} object.
	 */
	public void setDebug(String debug) {
		this.debug = debug;
	}

	/**
	 * <p>Getter for the field <code>extend</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtend() {
		return this.extend;
	}
	/**
	 * <p>Setter for the field <code>extend</code>.</p>
	 *
	 * @param extend a {@link java.lang.String} object.
	 */
	public void setExtend(String extend) {
		this.extend = extend;
	}

	/**
	 * <p>Getter for the field <code>idfa</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdfa() {
		return this.idfa;
	}
	/**
	 * <p>Setter for the field <code>idfa</code>.</p>
	 *
	 * @param idfa a {@link java.lang.String} object.
	 */
	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	/**
	 * <p>Getter for the field <code>iosVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIosVersion() {
		return this.iosVersion;
	}
	/**
	 * <p>Setter for the field <code>iosVersion</code>.</p>
	 *
	 * @param iosVersion a {@link java.lang.String} object.
	 */
	public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	/**
	 * <p>Getter for the field <code>mac</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMac() {
		return this.mac;
	}
	/**
	 * <p>Setter for the field <code>mac</code>.</p>
	 *
	 * @param mac a {@link java.lang.String} object.
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

}
