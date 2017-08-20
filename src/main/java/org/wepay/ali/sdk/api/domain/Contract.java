package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 贷款相关的各种合约，如贷款协议、征信授权协议等
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:07:31
 */
public class Contract extends AlipayObject {

	private static final long serialVersionUID = 4118726546388235528L;

	/**
	 * 合约文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 合约标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 合约类型
	 */
	@ApiField("type")
	private String type;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
