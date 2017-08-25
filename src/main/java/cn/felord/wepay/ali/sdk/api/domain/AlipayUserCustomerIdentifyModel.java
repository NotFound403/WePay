package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 账户互通产品查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCustomerIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 5529986895121327717L;

	/**
	 * 预留参数，用于商户区分同一appId下的不同业务场景。默认场景不用传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 设备及环境信息
	 */
	@ApiField("device_info")
	private AlipayUserDeviceInfo deviceInfo;

	/**
	 * 预留业务扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用户主体信息。要求AlipayUserPrincipalInfo中的user_id、mobile、email属性，有且只有一个非空。否则接口会忽略除去优先级最高的属性之外的其他属性。
	 */
	@ApiField("principal")
	private AlipayUserPrincipalInfo principal;

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>deviceInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayUserDeviceInfo} object.
	 */
	public AlipayUserDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	/**
	 * <p>Setter for the field <code>deviceInfo</code>.</p>
	 *
	 * @param deviceInfo a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayUserDeviceInfo} object.
	 */
	public void setDeviceInfo(AlipayUserDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
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
	 * <p>Getter for the field <code>principal</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayUserPrincipalInfo} object.
	 */
	public AlipayUserPrincipalInfo getPrincipal() {
		return this.principal;
	}
	/**
	 * <p>Setter for the field <code>principal</code>.</p>
	 *
	 * @param principal a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayUserPrincipalInfo} object.
	 */
	public void setPrincipal(AlipayUserPrincipalInfo principal) {
		this.principal = principal;
	}

}
