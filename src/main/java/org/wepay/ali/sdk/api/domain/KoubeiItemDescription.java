package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商品描述
 *
 * @author auto create
 * @since 1.0, 2016-11-15 15:35:12
 */
public class KoubeiItemDescription extends AlipayObject {

	private static final long serialVersionUID = 6672617538452589112L;

	/**
	 * 标题下的描述列表，列表类型，每项不得超过100个中文字符,最多10项
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 描述标题，不得超过15个中文字符
	 */
	@ApiField("title")
	private String title;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
