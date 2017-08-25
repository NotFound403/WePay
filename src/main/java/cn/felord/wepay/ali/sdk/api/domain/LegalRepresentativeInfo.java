package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 企业级商户法人信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LegalRepresentativeInfo extends AlipayObject {

	private static final long serialVersionUID = 8482812487618445778L;

	/**
	 * 法人证件有效期，YYYY-MM-DD格式
	 */
	@ApiField("legal_representative_cert_indate")
	private String legalRepresentativeCertIndate;

	/**
	 * 法人证件号码
	 */
	@ApiField("legal_representative_cert_no")
	private String legalRepresentativeCertNo;

	/**
	 * 法人证件背面照片（如证件为身份证则上传身份证国徽面图片）
	 */
	@ApiField("legal_representative_cert_pic_back")
	private String legalRepresentativeCertPicBack;

	/**
	 * 法人证件正面照片（如证件为身份证则上传身份证头像面图片）
	 */
	@ApiField("legal_representative_cert_pic_front")
	private String legalRepresentativeCertPicFront;

	/**
	 * 法人证件类型，支持传入的类型为：RESIDENT(居民身份证)括号中为每种类型的释义，不需要将括号中的内容当参数内容传入。
	 */
	@ApiField("legal_representative_cert_type")
	private String legalRepresentativeCertType;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_representative_name")
	private String legalRepresentativeName;

	/**
	 * <p>Getter for the field <code>legalRepresentativeCertIndate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalRepresentativeCertIndate() {
		return this.legalRepresentativeCertIndate;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeCertIndate</code>.</p>
	 *
	 * @param legalRepresentativeCertIndate a {@link java.lang.String} object.
	 */
	public void setLegalRepresentativeCertIndate(String legalRepresentativeCertIndate) {
		this.legalRepresentativeCertIndate = legalRepresentativeCertIndate;
	}

	/**
	 * <p>Getter for the field <code>legalRepresentativeCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalRepresentativeCertNo() {
		return this.legalRepresentativeCertNo;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeCertNo</code>.</p>
	 *
	 * @param legalRepresentativeCertNo a {@link java.lang.String} object.
	 */
	public void setLegalRepresentativeCertNo(String legalRepresentativeCertNo) {
		this.legalRepresentativeCertNo = legalRepresentativeCertNo;
	}

	/**
	 * <p>Getter for the field <code>legalRepresentativeCertPicBack</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalRepresentativeCertPicBack() {
		return this.legalRepresentativeCertPicBack;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeCertPicBack</code>.</p>
	 *
	 * @param legalRepresentativeCertPicBack a {@link java.lang.String} object.
	 */
	public void setLegalRepresentativeCertPicBack(String legalRepresentativeCertPicBack) {
		this.legalRepresentativeCertPicBack = legalRepresentativeCertPicBack;
	}

	/**
	 * <p>Getter for the field <code>legalRepresentativeCertPicFront</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalRepresentativeCertPicFront() {
		return this.legalRepresentativeCertPicFront;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeCertPicFront</code>.</p>
	 *
	 * @param legalRepresentativeCertPicFront a {@link java.lang.String} object.
	 */
	public void setLegalRepresentativeCertPicFront(String legalRepresentativeCertPicFront) {
		this.legalRepresentativeCertPicFront = legalRepresentativeCertPicFront;
	}

	/**
	 * <p>Getter for the field <code>legalRepresentativeCertType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalRepresentativeCertType() {
		return this.legalRepresentativeCertType;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeCertType</code>.</p>
	 *
	 * @param legalRepresentativeCertType a {@link java.lang.String} object.
	 */
	public void setLegalRepresentativeCertType(String legalRepresentativeCertType) {
		this.legalRepresentativeCertType = legalRepresentativeCertType;
	}

	/**
	 * <p>Getter for the field <code>legalRepresentativeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLegalRepresentativeName() {
		return this.legalRepresentativeName;
	}
	/**
	 * <p>Setter for the field <code>legalRepresentativeName</code>.</p>
	 *
	 * @param legalRepresentativeName a {@link java.lang.String} object.
	 */
	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

}
