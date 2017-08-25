package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.operator.mobile.bind response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOperatorMobileBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6228156566872171489L;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 身份证号：显示前1位+*（实际位数）+后1位，如：5****************9
	 */
	@ApiField("certificate")
	private String certificate;

	/** 
	 * 用户手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/** 
	 * 绑定状态：
&#61548;	S表示绑定成功
&#61548;	F表示绑定失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 显示除姓名第一个字以外的其它部分
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	/**
	 * <p>Setter for the field <code>certificate</code>.</p>
	 *
	 * @param certificate a {@link java.lang.String} object.
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	/**
	 * <p>Getter for the field <code>certificate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificate( ) {
		return this.certificate;
	}

	/**
	 * <p>Setter for the field <code>mobileNo</code>.</p>
	 *
	 * @param mobileNo a {@link java.lang.String} object.
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * <p>Getter for the field <code>mobileNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobileNo( ) {
		return this.mobileNo;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
	}

	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName( ) {
		return this.userName;
	}

}
