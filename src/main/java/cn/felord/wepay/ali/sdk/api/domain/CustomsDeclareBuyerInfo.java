package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 报关订购人信息，即用户留在商户处的身份信息。可用于与支付单的身份信息作比对。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CustomsDeclareBuyerInfo extends AlipayObject {

	private static final long serialVersionUID = 2433235384412215497L;

	/**
	 * 订购人身份证号。即订购人留在商户处的身份证信息
	 */
	@ApiField("buyer_cert_no")
	private String buyerCertNo;

	/**
	 * 订购人姓名。即订购人留在商户处的姓名信息
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * <p>Getter for the field <code>buyerCertNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerCertNo() {
		return this.buyerCertNo;
	}
	/**
	 * <p>Setter for the field <code>buyerCertNo</code>.</p>
	 *
	 * @param buyerCertNo a {@link java.lang.String} object.
	 */
	public void setBuyerCertNo(String buyerCertNo) {
		this.buyerCertNo = buyerCertNo;
	}

	/**
	 * <p>Getter for the field <code>buyerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerName() {
		return this.buyerName;
	}
	/**
	 * <p>Setter for the field <code>buyerName</code>.</p>
	 *
	 * @param buyerName a {@link java.lang.String} object.
	 */
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

}
