package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * createQrCodeProcessor
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3476155551944461185L;

	/**
	 * 服务窗创建带参二维码接口，开发者自定义信息
	 */
	@ApiField("code_info")
	private CodeInfo codeInfo;

	/**
	 * 二维码类型，目前只支持两种类型：
TEMP：临时的（默认）；
PERM：永久的
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 临时码过期时间，以秒为单位，最大不超过1800秒；
永久码置空
	 */
	@ApiField("expire_second")
	private String expireSecond;

	/**
	 * 二维码中间是否显示服务窗logo，Y：显示；N：不显示（默认）
	 */
	@ApiField("show_logo")
	private String showLogo;

	/**
	 * <p>Getter for the field <code>codeInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CodeInfo} object.
	 */
	public CodeInfo getCodeInfo() {
		return this.codeInfo;
	}
	/**
	 * <p>Setter for the field <code>codeInfo</code>.</p>
	 *
	 * @param codeInfo a {@link cn.felord.wepay.ali.sdk.api.domain.CodeInfo} object.
	 */
	public void setCodeInfo(CodeInfo codeInfo) {
		this.codeInfo = codeInfo;
	}

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
	 * <p>Getter for the field <code>expireSecond</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireSecond() {
		return this.expireSecond;
	}
	/**
	 * <p>Setter for the field <code>expireSecond</code>.</p>
	 *
	 * @param expireSecond a {@link java.lang.String} object.
	 */
	public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}

	/**
	 * <p>Getter for the field <code>showLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowLogo() {
		return this.showLogo;
	}
	/**
	 * <p>Setter for the field <code>showLogo</code>.</p>
	 *
	 * @param showLogo a {@link java.lang.String} object.
	 */
	public void setShowLogo(String showLogo) {
		this.showLogo = showLogo;
	}

}
