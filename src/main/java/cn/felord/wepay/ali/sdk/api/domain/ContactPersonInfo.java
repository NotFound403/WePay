package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 企业联系人信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ContactPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 8524573863748531862L;

	/**
	 * 联系人邮箱地址，入驻申请审核结果会发送至该邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号，入驻申请结果会通过短信的形式发送至该手机号码
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 企业联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人类型，MERCHANT_CONTACT (普通联系人),DATA_RETURN (数据反馈联系人),PROT_CONTACT(客服人员),OBJECTION_HANDLE (异议处理联系人)，如不填默认为MERCHANT_CONTACT
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * <p>Getter for the field <code>contactEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactEmail() {
		return this.contactEmail;
	}
	/**
	 * <p>Setter for the field <code>contactEmail</code>.</p>
	 *
	 * @param contactEmail a {@link java.lang.String} object.
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * <p>Getter for the field <code>contactMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactMobile() {
		return this.contactMobile;
	}
	/**
	 * <p>Setter for the field <code>contactMobile</code>.</p>
	 *
	 * @param contactMobile a {@link java.lang.String} object.
	 */
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	/**
	 * <p>Getter for the field <code>contactName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactName() {
		return this.contactName;
	}
	/**
	 * <p>Setter for the field <code>contactName</code>.</p>
	 *
	 * @param contactName a {@link java.lang.String} object.
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * <p>Getter for the field <code>contactType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactType() {
		return this.contactType;
	}
	/**
	 * <p>Setter for the field <code>contactType</code>.</p>
	 *
	 * @param contactType a {@link java.lang.String} object.
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

}
