package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户会员
 *
 * @author auto create
 * @since 1.0, 2017-06-07 13:29:46
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

	public String getBirth() {
		return this.birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCell() {
		return this.cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getGende() {
		return this.gende;
	}
	public void setGende(String gende) {
		this.gende = gende;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
