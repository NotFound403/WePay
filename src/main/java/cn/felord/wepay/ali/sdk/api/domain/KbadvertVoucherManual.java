package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑客券的使用说明
 *
 * @author auto create
 * @since 1.0, 2017-02-20 21:18:14
 */
public class KbadvertVoucherManual extends AlipayObject {

	private static final long serialVersionUID = 6434417999927928647L;

	/**
	 * 说明
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 标题
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
