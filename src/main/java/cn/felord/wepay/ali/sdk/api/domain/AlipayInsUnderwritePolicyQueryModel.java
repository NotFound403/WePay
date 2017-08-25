package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保单查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsUnderwritePolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2853595588991815669L;

	/**
	 * 商户生成的外部投保业务号;当保单凭证号不传时则必传.
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保单凭证号;商户生成的外部投保业务号不传时则必传.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品编码;当保单凭证号不传时则必传.
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>policyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPolicyNo() {
		return this.policyNo;
	}
	/**
	 * <p>Setter for the field <code>policyNo</code>.</p>
	 *
	 * @param policyNo a {@link java.lang.String} object.
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
