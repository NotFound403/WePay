package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据标签圈人的过滤器
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Filter extends AlipayObject {

	private static final long serialVersionUID = 5612859978416186144L;

	/**
	 * 标签组发圈人条件
	 */
	@ApiField("context")
	private LabelContext context;

	/**
	 * 过滤器模板，${a}是一个变量，会被context参数中的a参数替换，从而展开为最终的表达式，template最多支持两个参数，支持and及or连接符。
and：同时满足条件；
or：只需满足其中一个条件
	 */
	@ApiField("template")
	private String template;

	/**
	 * <p>Getter for the field <code>context</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.LabelContext} object.
	 */
	public LabelContext getContext() {
		return this.context;
	}
	/**
	 * <p>Setter for the field <code>context</code>.</p>
	 *
	 * @param context a {@link cn.felord.wepay.ali.sdk.api.domain.LabelContext} object.
	 */
	public void setContext(LabelContext context) {
		this.context = context;
	}

	/**
	 * <p>Getter for the field <code>template</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplate() {
		return this.template;
	}
	/**
	 * <p>Setter for the field <code>template</code>.</p>
	 *
	 * @param template a {@link java.lang.String} object.
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

}
