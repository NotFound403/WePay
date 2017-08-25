package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 天猫机具解绑接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderEquipmentAuthRemoveModel extends AlipayObject {

	private static final long serialVersionUID = 4271943269174143418L;

	/**
	 * 机具编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 机具类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 扩展信息，传json格式的字符串，包含auth_alipay_card_no =授权的商户支付宝卡号
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 机具厂商PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作人名称
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * <p>Getter for the field <code>deviceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceId() {
		return this.deviceId;
	}
	/**
	 * <p>Setter for the field <code>deviceId</code>.</p>
	 *
	 * @param deviceId a {@link java.lang.String} object.
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * <p>Getter for the field <code>deviceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceType() {
		return this.deviceType;
	}
	/**
	 * <p>Setter for the field <code>deviceType</code>.</p>
	 *
	 * @param deviceType a {@link java.lang.String} object.
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
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
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid() {
		return this.merchantPid;
	}
	/**
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	/**
	 * <p>Getter for the field <code>operator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperator() {
		return this.operator;
	}
	/**
	 * <p>Setter for the field <code>operator</code>.</p>
	 *
	 * @param operator a {@link java.lang.String} object.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
