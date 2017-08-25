package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 菜品诊断类型列表对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ItemDiagnoseType extends AlipayObject {

	private static final long serialVersionUID = 7576252352137263257L;

	/**
	 * 类型
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 对类型的描述
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

	/**
	 * <p>Getter for the field <code>itemDiagnose</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemDiagnose() {
		return this.itemDiagnose;
	}
	/**
	 * <p>Setter for the field <code>itemDiagnose</code>.</p>
	 *
	 * @param itemDiagnose a {@link java.lang.String} object.
	 */
	public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

	/**
	 * <p>Getter for the field <code>itemDiagnoseDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}
	/**
	 * <p>Setter for the field <code>itemDiagnoseDesc</code>.</p>
	 *
	 * @param itemDiagnoseDesc a {@link java.lang.String} object.
	 */
	public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

}
