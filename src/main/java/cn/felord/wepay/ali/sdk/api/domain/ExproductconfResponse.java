package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品（学校）模型-输出参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExproductconfResponse extends AlipayObject {

	private static final long serialVersionUID = 6448259148162834445L;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_name")
	private String chargeinstName;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 销账机构中文名称
	 */
	@ApiField("chargeoffinst_name")
	private String chargeoffinstName;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 扩展字段
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 产品状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst() {
		return this.chargeInst;
	}
	/**
	 * <p>Setter for the field <code>chargeInst</code>.</p>
	 *
	 * @param chargeInst a {@link java.lang.String} object.
	 */
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	/**
	 * <p>Getter for the field <code>chargeinstName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeinstName() {
		return this.chargeinstName;
	}
	/**
	 * <p>Setter for the field <code>chargeinstName</code>.</p>
	 *
	 * @param chargeinstName a {@link java.lang.String} object.
	 */
	public void setChargeinstName(String chargeinstName) {
		this.chargeinstName = chargeinstName;
	}

	/**
	 * <p>Getter for the field <code>chargeoffInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	/**
	 * <p>Setter for the field <code>chargeoffInst</code>.</p>
	 *
	 * @param chargeoffInst a {@link java.lang.String} object.
	 */
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	/**
	 * <p>Getter for the field <code>chargeoffinstName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeoffinstName() {
		return this.chargeoffinstName;
	}
	/**
	 * <p>Setter for the field <code>chargeoffinstName</code>.</p>
	 *
	 * @param chargeoffinstName a {@link java.lang.String} object.
	 */
	public void setChargeoffinstName(String chargeoffinstName) {
		this.chargeoffinstName = chargeoffinstName;
	}

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>extend</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtend() {
		return this.extend;
	}
	/**
	 * <p>Setter for the field <code>extend</code>.</p>
	 *
	 * @param extend a {@link java.lang.String} object.
	 */
	public void setExtend(String extend) {
		this.extend = extend;
	}

	/**
	 * <p>Getter for the field <code>province</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvince() {
		return this.province;
	}
	/**
	 * <p>Setter for the field <code>province</code>.</p>
	 *
	 * @param province a {@link java.lang.String} object.
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
