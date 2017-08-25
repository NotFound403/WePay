package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险发奖凭证
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsCertificate extends AlipayObject {

	private static final long serialVersionUID = 1895226546376537458L;

	/**
	 * 发奖凭证ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 发奖凭证类型;GIFT_INSURANCE:赠险
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 发奖凭证值
	 */
	@ApiField("certificate_value")
	private String certificateValue;

	/**
	 * <p>Getter for the field <code>certificateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificateId() {
		return this.certificateId;
	}
	/**
	 * <p>Setter for the field <code>certificateId</code>.</p>
	 *
	 * @param certificateId a {@link java.lang.String} object.
	 */
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	/**
	 * <p>Getter for the field <code>certificateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificateType() {
		return this.certificateType;
	}
	/**
	 * <p>Setter for the field <code>certificateType</code>.</p>
	 *
	 * @param certificateType a {@link java.lang.String} object.
	 */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	/**
	 * <p>Getter for the field <code>certificateValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificateValue() {
		return this.certificateValue;
	}
	/**
	 * <p>Setter for the field <code>certificateValue</code>.</p>
	 *
	 * @param certificateValue a {@link java.lang.String} object.
	 */
	public void setCertificateValue(String certificateValue) {
		this.certificateValue = certificateValue;
	}

}
