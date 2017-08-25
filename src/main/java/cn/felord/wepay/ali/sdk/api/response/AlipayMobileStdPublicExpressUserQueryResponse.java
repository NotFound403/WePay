package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.express.user.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileStdPublicExpressUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1179738573284837897L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo( ) {
		return this.certNo;
	}

	/**
	 * <p>Setter for the field <code>certType</code>.</p>
	 *
	 * @param certType a {@link java.lang.String} object.
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}
	/**
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType( ) {
		return this.certType;
	}

}
