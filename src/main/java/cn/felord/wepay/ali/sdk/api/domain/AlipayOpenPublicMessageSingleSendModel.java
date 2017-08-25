package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 单发模板消息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMessageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 2786788292515189434L;

	/**
	 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
	 */
	@ApiField("template")
	private Template template;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

	/**
	 * <p>Getter for the field <code>template</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Template} object.
	 */
	public Template getTemplate() {
		return this.template;
	}
	/**
	 * <p>Setter for the field <code>template</code>.</p>
	 *
	 * @param template a {@link cn.felord.wepay.ali.sdk.api.domain.Template} object.
	 */
	public void setTemplate(Template template) {
		this.template = template;
	}

	/**
	 * <p>Getter for the field <code>toUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToUserId() {
		return this.toUserId;
	}
	/**
	 * <p>Setter for the field <code>toUserId</code>.</p>
	 *
	 * @param toUserId a {@link java.lang.String} object.
	 */
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
