package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * The type Alipay operator mobile bind response.
 *
 * @author lenovo
 * @version $Id: $Id
 */
public class AlipayOperatorMobileBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6228156566872171489L;

	@ApiField("alipay_user_id")
	private String alipayUserId;

	@ApiField("certificate")
	private String certificate;

	@ApiField("mobile_no")
	private String mobileNo;

	@ApiField("status")
	private String status;

	@ApiField("user_name")
	private String userName;

	/**
	 * Sets alipay user id.
	 *
	 * @param alipayUserId the alipay user id
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	/**
	 * Gets alipay user id.
	 *
	 * @return the alipay user id
	 */
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	/**
	 * Sets certificate.
	 *
	 * @param certificate the certificate
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	/**
	 * Gets certificate.
	 *
	 * @return the certificate
	 */
	public String getCertificate( ) {
		return this.certificate;
	}

	/**
	 * Sets mobile no.
	 *
	 * @param mobileNo the mobile no
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * Gets mobile no.
	 *
	 * @return the mobile no
	 */
	public String getMobileNo( ) {
		return this.mobileNo;
	}

	/**
	 * Sets status.
	 *
	 * @param status the status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets status.
	 *
	 * @return the status
	 */
	public String getStatus( ) {
		return this.status;
	}

	/**
	 * Sets user name.
	 *
	 * @param userName the user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets user name.
	 *
	 * @return the user name
	 */
	public String getUserName( ) {
		return this.userName;
	}

}
