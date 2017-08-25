package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员通用设备、环境相关信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 8231351338173398922L;

	/**
	 * 扩展信息，json格式的字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 移动设备国际身份码缩写：移动设备国际身份码缩写。仅移动端
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * ipv4地址
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * mac地址，冒号分隔
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 操作系统名称
	 */
	@ApiField("os_name")
	private String osName;

	/**
	 * 操作系统版本号
	 */
	@ApiField("os_version")
	private String osVersion;

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
	 * <p>Getter for the field <code>imei</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImei() {
		return this.imei;
	}
	/**
	 * <p>Setter for the field <code>imei</code>.</p>
	 *
	 * @param imei a {@link java.lang.String} object.
	 */
	public void setImei(String imei) {
		this.imei = imei;
	}

	/**
	 * <p>Getter for the field <code>ip</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIp() {
		return this.ip;
	}
	/**
	 * <p>Setter for the field <code>ip</code>.</p>
	 *
	 * @param ip a {@link java.lang.String} object.
	 */
	public void setIp(String ip) {
		this.ip = ip;
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

	/**
	 * <p>Getter for the field <code>osName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOsName() {
		return this.osName;
	}
	/**
	 * <p>Setter for the field <code>osName</code>.</p>
	 *
	 * @param osName a {@link java.lang.String} object.
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}

	/**
	 * <p>Getter for the field <code>osVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOsVersion() {
		return this.osVersion;
	}
	/**
	 * <p>Setter for the field <code>osVersion</code>.</p>
	 *
	 * @param osVersion a {@link java.lang.String} object.
	 */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

}
