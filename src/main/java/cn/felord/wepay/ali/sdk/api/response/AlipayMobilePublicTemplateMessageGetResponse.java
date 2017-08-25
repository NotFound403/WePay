package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.template.message.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicTemplateMessageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2685435858134359224L;

	/** 
	 * 消息模板id--商户领取母版后生成的唯一模板id
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/** 
	 * 模板内容
	 */
	@ApiField("template")
	private String template;

	/**
	 * <p>Setter for the field <code>msgTemplateId</code>.</p>
	 *
	 * @param msgTemplateId a {@link java.lang.String} object.
	 */
	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}
	/**
	 * <p>Getter for the field <code>msgTemplateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgTemplateId( ) {
		return this.msgTemplateId;
	}

	/**
	 * <p>Setter for the field <code>template</code>.</p>
	 *
	 * @param template a {@link java.lang.String} object.
	 */
	public void setTemplate(String template) {
		this.template = template;
	}
	/**
	 * <p>Getter for the field <code>template</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplate( ) {
		return this.template;
	}

}
