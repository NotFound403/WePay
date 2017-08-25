package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券的说明条款
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>descriptions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getDescriptions() {
		return this.descriptions;
	}
	/**
	 * <p>Setter for the field <code>descriptions</code>.</p>
	 *
	 * @param descriptions a {@link java.util.List} object.
	 */
	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
