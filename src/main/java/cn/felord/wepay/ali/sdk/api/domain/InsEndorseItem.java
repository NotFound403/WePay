package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险批单项
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsEndorseItem extends AlipayObject {

	private static final long serialVersionUID = 5383863214129175327L;

	/**
	 * 批单项新值
	 */
	@ApiField("new_value")
	private String newValue;

	/**
	 * 批单项旧值
	 */
	@ApiField("old_value")
	private String oldValue;

	/**
	 * 批单类型;303:保单改期;311:批改保单标的
	 */
	@ApiField("type")
	private Long type;

	/**
	 * <p>Getter for the field <code>newValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNewValue() {
		return this.newValue;
	}
	/**
	 * <p>Setter for the field <code>newValue</code>.</p>
	 *
	 * @param newValue a {@link java.lang.String} object.
	 */
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	/**
	 * <p>Getter for the field <code>oldValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOldValue() {
		return this.oldValue;
	}
	/**
	 * <p>Setter for the field <code>oldValue</code>.</p>
	 *
	 * @param oldValue a {@link java.lang.String} object.
	 */
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.Long} object.
	 */
	public void setType(Long type) {
		this.type = type;
	}

}
