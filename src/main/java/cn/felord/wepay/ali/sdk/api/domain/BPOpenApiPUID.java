package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 流程全局唯一ID
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BPOpenApiPUID extends AlipayObject {

	private static final long serialVersionUID = 8682518598892818626L;

	/**
	 * 系统名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务ID，对应业务单条记录的ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型。不要填写下划线、点等特殊符号
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 一般留空。如果一个biz_id可发起多个流程实例，则填写此值
	 */
	@ApiField("unique_key")
	private String uniqueKey;

	/**
	 * <p>Getter for the field <code>appName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppName() {
		return this.appName;
	}
	/**
	 * <p>Setter for the field <code>appName</code>.</p>
	 *
	 * @param appName a {@link java.lang.String} object.
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

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
	 * <p>Getter for the field <code>uniqueKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqueKey() {
		return this.uniqueKey;
	}
	/**
	 * <p>Setter for the field <code>uniqueKey</code>.</p>
	 *
	 * @param uniqueKey a {@link java.lang.String} object.
	 */
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

}
