package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.InsProduct;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.coupon.receive response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneCouponReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7313117675133885219L;

	/** 
	 * 保单凭证号;商户生成的外部投保业务号不传时则必传
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

	/**
	 * <p>Setter for the field <code>policyNo</code>.</p>
	 *
	 * @param policyNo a {@link java.lang.String} object.
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	/**
	 * <p>Getter for the field <code>policyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	/**
	 * <p>Setter for the field <code>product</code>.</p>
	 *
	 * @param product a {@link cn.felord.wepay.ali.sdk.api.domain.InsProduct} object.
	 */
	public void setProduct(InsProduct product) {
		this.product = product;
	}
	/**
	 * <p>Getter for the field <code>product</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsProduct} object.
	 */
	public InsProduct getProduct( ) {
		return this.product;
	}

}
