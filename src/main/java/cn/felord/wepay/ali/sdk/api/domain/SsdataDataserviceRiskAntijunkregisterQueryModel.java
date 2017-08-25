package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚁盾垃圾注册测试
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskAntijunkregisterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3542644782591648493L;

	/**
	 * 行为发生时的Apdid值
	 */
	@ApiField("apdid")
	private String apdid;

	/**
	 * 行为发生时的IP值
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 调用服务的商户id ，如果是第三方服务商，需要将其实际的商户id透传过来，如果是普通商户传入自己的appid即可
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 行为发生时的手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 风险场景码，不传该参数，则走默认的场景
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 业务场景，不传该参数，则走默认的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 版本号
	 */
	@ApiField("sys_version")
	private String sysVersion;

	/**
	 * 行为发生时的UMID值
	 */
	@ApiField("umid")
	private String umid;

	/**
	 * <p>Getter for the field <code>apdid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApdid() {
		return this.apdid;
	}
	/**
	 * <p>Setter for the field <code>apdid</code>.</p>
	 *
	 * @param apdid a {@link java.lang.String} object.
	 */
	public void setApdid(String apdid) {
		this.apdid = apdid;
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
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * <p>Getter for the field <code>phone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhone() {
		return this.phone;
	}
	/**
	 * <p>Setter for the field <code>phone</code>.</p>
	 *
	 * @param phone a {@link java.lang.String} object.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * <p>Getter for the field <code>riskCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskCode() {
		return this.riskCode;
	}
	/**
	 * <p>Setter for the field <code>riskCode</code>.</p>
	 *
	 * @param riskCode a {@link java.lang.String} object.
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**
	 * <p>Getter for the field <code>sceneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneCode() {
		return this.sceneCode;
	}
	/**
	 * <p>Setter for the field <code>sceneCode</code>.</p>
	 *
	 * @param sceneCode a {@link java.lang.String} object.
	 */
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	/**
	 * <p>Getter for the field <code>sysVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSysVersion() {
		return this.sysVersion;
	}
	/**
	 * <p>Setter for the field <code>sysVersion</code>.</p>
	 *
	 * @param sysVersion a {@link java.lang.String} object.
	 */
	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	/**
	 * <p>Getter for the field <code>umid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUmid() {
		return this.umid;
	}
	/**
	 * <p>Setter for the field <code>umid</code>.</p>
	 *
	 * @param umid a {@link java.lang.String} object.
	 */
	public void setUmid(String umid) {
		this.umid = umid;
	}

}
