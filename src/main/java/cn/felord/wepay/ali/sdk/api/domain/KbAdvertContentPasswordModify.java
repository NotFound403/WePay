package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建口令红包模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertContentPasswordModify extends AlipayObject {

	private static final long serialVersionUID = 2555568374723492983L;

	/**
	 * 口令红包背景图的django ID
	 */
	@ApiField("background_img_id")
	private String backgroundImgId;

	/**
	 * 口令红包品牌名称（品牌名称不能超过20位）
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 红包口令（口令不能超过20位，口令只能是中文、英文、数字组合,不能纯数字）
	 */
	@ApiField("password")
	private String password;

	/**
	 * 口令红包券LOGO的django ID
	 */
	@ApiField("voucher_logo_id")
	private String voucherLogoId;

	/**
	 * <p>Getter for the field <code>backgroundImgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBackgroundImgId() {
		return this.backgroundImgId;
	}
	/**
	 * <p>Setter for the field <code>backgroundImgId</code>.</p>
	 *
	 * @param backgroundImgId a {@link java.lang.String} object.
	 */
	public void setBackgroundImgId(String backgroundImgId) {
		this.backgroundImgId = backgroundImgId;
	}

	/**
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>password</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * <p>Setter for the field <code>password</code>.</p>
	 *
	 * @param password a {@link java.lang.String} object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <p>Getter for the field <code>voucherLogoId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherLogoId() {
		return this.voucherLogoId;
	}
	/**
	 * <p>Setter for the field <code>voucherLogoId</code>.</p>
	 *
	 * @param voucherLogoId a {@link java.lang.String} object.
	 */
	public void setVoucherLogoId(String voucherLogoId) {
		this.voucherLogoId = voucherLogoId;
	}

}
