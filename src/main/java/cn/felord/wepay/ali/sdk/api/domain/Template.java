package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Template extends AlipayObject {

	private static final long serialVersionUID = 7577847599426926799L;

	/**
	 * 消息模板上下文，即模板中定义的参数及参数值
	 */
	@ApiField("context")
	private Context context;

	/**
	 * 消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * <p>Getter for the field <code>context</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Context} object.
	 */
	public Context getContext() {
		return this.context;
	}
	/**
	 * <p>Setter for the field <code>context</code>.</p>
	 *
	 * @param context a {@link cn.felord.wepay.ali.sdk.api.domain.Context} object.
	 */
	public void setContext(Context context) {
		this.context = context;
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

}
