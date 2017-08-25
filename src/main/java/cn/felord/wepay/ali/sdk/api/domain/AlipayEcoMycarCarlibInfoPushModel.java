package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 同步车型库
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarCarlibInfoPushModel extends AlipayObject {

	private static final long serialVersionUID = 7338293377363767583L;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 排量
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 厂商
	 */
	@ApiField("company")
	private String company;

	/**
	 * 发动机型号
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 销售名字
	 */
	@ApiField("marker")
	private String marker;

	/**
	 * 生产年份
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 车系
	 */
	@ApiField("serie")
	private String serie;

	/**
	 * 车款
	 */
	@ApiField("style")
	private String style;

	/**
	 * <p>Getter for the field <code>brand</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrand() {
		return this.brand;
	}
	/**
	 * <p>Setter for the field <code>brand</code>.</p>
	 *
	 * @param brand a {@link java.lang.String} object.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * <p>Getter for the field <code>cc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCc() {
		return this.cc;
	}
	/**
	 * <p>Setter for the field <code>cc</code>.</p>
	 *
	 * @param cc a {@link java.lang.String} object.
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}

	/**
	 * <p>Getter for the field <code>company</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompany() {
		return this.company;
	}
	/**
	 * <p>Setter for the field <code>company</code>.</p>
	 *
	 * @param company a {@link java.lang.String} object.
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * <p>Getter for the field <code>engine</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngine() {
		return this.engine;
	}
	/**
	 * <p>Setter for the field <code>engine</code>.</p>
	 *
	 * @param engine a {@link java.lang.String} object.
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * <p>Getter for the field <code>marker</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarker() {
		return this.marker;
	}
	/**
	 * <p>Setter for the field <code>marker</code>.</p>
	 *
	 * @param marker a {@link java.lang.String} object.
	 */
	public void setMarker(String marker) {
		this.marker = marker;
	}

	/**
	 * <p>Getter for the field <code>prodYear</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdYear() {
		return this.prodYear;
	}
	/**
	 * <p>Setter for the field <code>prodYear</code>.</p>
	 *
	 * @param prodYear a {@link java.lang.String} object.
	 */
	public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}

	/**
	 * <p>Getter for the field <code>serie</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerie() {
		return this.serie;
	}
	/**
	 * <p>Setter for the field <code>serie</code>.</p>
	 *
	 * @param serie a {@link java.lang.String} object.
	 */
	public void setSerie(String serie) {
		this.serie = serie;
	}

	/**
	 * <p>Getter for the field <code>style</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStyle() {
		return this.style;
	}
	/**
	 * <p>Setter for the field <code>style</code>.</p>
	 *
	 * @param style a {@link java.lang.String} object.
	 */
	public void setStyle(String style) {
		this.style = style;
	}

}
