package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑客券的使用说明
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>details</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getDetails() {
		return this.details;
	}
	/**
	 * <p>Setter for the field <code>details</code>.</p>
	 *
	 * @param details a {@link java.util.List} object.
	 */
	public void setDetails(List<String> details) {
		this.details = details;
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
