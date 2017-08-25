package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券模板批量查询响应
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherTemplateLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 5871554935192742458L;

	/**
	 * 模板激活时间。草稿状态的模板该项为空
	 */
	@ApiField("activate_time")
	private Date activateTime;

	/**
	 * 模板创建时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 发放结束时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券模板发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 模板状态，可枚举。分别为‘草稿’(I)、‘生效’(S)和‘过期’(E)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * <p>Getter for the field <code>activateTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getActivateTime() {
		return this.activateTime;
	}
	/**
	 * <p>Setter for the field <code>activateTime</code>.</p>
	 *
	 * @param activateTime a {@link java.util.Date} object.
	 */
	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}

	/**
	 * <p>Getter for the field <code>createTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * <p>Setter for the field <code>createTime</code>.</p>
	 *
	 * @param createTime a {@link java.util.Date} object.
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * <p>Getter for the field <code>publishEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	/**
	 * <p>Setter for the field <code>publishEndTime</code>.</p>
	 *
	 * @param publishEndTime a {@link java.util.Date} object.
	 */
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	/**
	 * <p>Getter for the field <code>publishStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	/**
	 * <p>Setter for the field <code>publishStartTime</code>.</p>
	 *
	 * @param publishStartTime a {@link java.util.Date} object.
	 */
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
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
	 * <p>Getter for the field <code>voucherName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherName() {
		return this.voucherName;
	}
	/**
	 * <p>Setter for the field <code>voucherName</code>.</p>
	 *
	 * @param voucherName a {@link java.lang.String} object.
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
