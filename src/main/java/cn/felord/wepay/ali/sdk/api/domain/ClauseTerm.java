package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券的说明条款
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
public class ClauseTerm extends AlipayObject {

	private static final long serialVersionUID = 4849439213438987524L;

	/**
	 * 说明描述内容
	 */
	@ApiListField("descriptions")
	@ApiField("string")
	private List<String> descriptions;

	/**
	 * 说明title
	 */
	@ApiField("title")
	private String title;

	public List<String> getDescriptions() {
		return this.descriptions;
	}
	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
