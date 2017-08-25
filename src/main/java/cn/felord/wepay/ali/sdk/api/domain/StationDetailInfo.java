package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 购票站点信息，包含站点名称，站点编码，站点外部编码
 *
 * @author auto create
 * @version $Id: $Id
 */
public class StationDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3481891484976943979L;

	/**
	 * 站点编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 站点外部编码
	 */
	@ApiField("ext_code")
	private String extCode;

	/**
	 * 站点中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>extCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtCode() {
		return this.extCode;
	}
	/**
	 * <p>Setter for the field <code>extCode</code>.</p>
	 *
	 * @param extCode a {@link java.lang.String} object.
	 */
	public void setExtCode(String extCode) {
		this.extCode = extCode;
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
