package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户会员
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantMenber extends AlipayObject {

	private static final long serialVersionUID = 7712592572826281284L;

	/**
	 * 生日 yyyy-MM-dd
	 */
	@ApiField("birth")
	private String birth;

	/**
	 * 手机号
	 */
	@ApiField("cell")
	private String cell;

	/**
	 * 性别（男：MALE；女：FEMALE）
	 */
	@ApiField("gende")
	private String gende;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>birth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBirth() {
		return this.birth;
	}
	/**
	 * <p>Setter for the field <code>birth</code>.</p>
	 *
	 * @param birth a {@link java.lang.String} object.
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * <p>Getter for the field <code>cell</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCell() {
		return this.cell;
	}
	/**
	 * <p>Setter for the field <code>cell</code>.</p>
	 *
	 * @param cell a {@link java.lang.String} object.
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}

	/**
	 * <p>Getter for the field <code>gende</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGende() {
		return this.gende;
	}
	/**
	 * <p>Setter for the field <code>gende</code>.</p>
	 *
	 * @param gende a {@link java.lang.String} object.
	 */
	public void setGende(String gende) {
		this.gende = gende;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
