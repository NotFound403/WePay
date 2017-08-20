package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 到位服务保障信息
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:30:10
 */
public class AssuranceInfo extends AlipayObject {

	private static final long serialVersionUID = 5131882827128211182L;

	/**
	 * 服务保障的描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 服务保障的标题
	 */
	@ApiField("title")
	private String title;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
