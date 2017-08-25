package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 吱口令解码接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingSharetokenDecodeModel extends AlipayObject {

	private static final long serialVersionUID = 1121172926348279982L;

	/**
	 * 码类型，可空，默认为吱口令类型『share_code』
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 扩展属性，key-value json串
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 8位吱口令token
	 */
	@ApiField("token")
	private String token;

	/**
	 * <p>Getter for the field <code>codeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeType() {
		return this.codeType;
	}
	/**
	 * <p>Setter for the field <code>codeType</code>.</p>
	 *
	 * @param codeType a {@link java.lang.String} object.
	 */
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	/**
	 * <p>Getter for the field <code>extData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtData() {
		return this.extData;
	}
	/**
	 * <p>Setter for the field <code>extData</code>.</p>
	 *
	 * @param extData a {@link java.lang.String} object.
	 */
	public void setExtData(String extData) {
		this.extData = extData;
	}

	/**
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return this.token;
	}
	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
