package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业平台写请求
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataExternalSendModel extends AlipayObject {

	private static final long serialVersionUID = 3497538521626199678L;

	/**
	 * external_system_name
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/**
	 * is_transfer_uid
	 */
	@ApiField("is_transfer_uid")
	private String isTransferUid;

	/**
	 * operate_type
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * send_data
	 */
	@ApiField("send_data")
	private String sendData;

	/**
	 * <p>Getter for the field <code>externalSystemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalSystemName() {
		return this.externalSystemName;
	}
	/**
	 * <p>Setter for the field <code>externalSystemName</code>.</p>
	 *
	 * @param externalSystemName a {@link java.lang.String} object.
	 */
	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

	/**
	 * <p>Getter for the field <code>isTransferUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsTransferUid() {
		return this.isTransferUid;
	}
	/**
	 * <p>Setter for the field <code>isTransferUid</code>.</p>
	 *
	 * @param isTransferUid a {@link java.lang.String} object.
	 */
	public void setIsTransferUid(String isTransferUid) {
		this.isTransferUid = isTransferUid;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * <p>Getter for the field <code>sendData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendData() {
		return this.sendData;
	}
	/**
	 * <p>Setter for the field <code>sendData</code>.</p>
	 *
	 * @param sendData a {@link java.lang.String} object.
	 */
	public void setSendData(String sendData) {
		this.sendData = sendData;
	}

}
