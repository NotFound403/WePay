package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券简要信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 5521336525973762498L;

	/**
	 * 发券时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 券状态，可枚举，分别为“可用”(ENABLED)和“不可用”(DISABLED)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * <p>Getter for the field <code>sendTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getSendTime() {
		return this.sendTime;
	}
	/**
	 * <p>Setter for the field <code>sendTime</code>.</p>
	 *
	 * @param sendTime a {@link java.util.Date} object.
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId() {
		return this.voucherId;
	}
	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
