package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.InsCertificate;
import cn.felord.wepay.ali.sdk.api.domain.InsProduct;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.coupon.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneCouponSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7256964687722799964L;

	/** 
	 * 发奖凭证
	 */
	@ApiField("certificate")
	private InsCertificate certificate;

	/** 
	 * 活动ID
	 */
	@ApiField("compaign_id")
	private String compaignId;

	/** 
	 * 发奖流水ID
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

	/**
	 * <p>Setter for the field <code>certificate</code>.</p>
	 *
	 * @param certificate a {@link cn.felord.wepay.ali.sdk.api.domain.InsCertificate} object.
	 */
	public void setCertificate(InsCertificate certificate) {
		this.certificate = certificate;
	}
	/**
	 * <p>Getter for the field <code>certificate</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsCertificate} object.
	 */
	public InsCertificate getCertificate( ) {
		return this.certificate;
	}

	/**
	 * <p>Setter for the field <code>compaignId</code>.</p>
	 *
	 * @param compaignId a {@link java.lang.String} object.
	 */
	public void setCompaignId(String compaignId) {
		this.compaignId = compaignId;
	}
	/**
	 * <p>Getter for the field <code>compaignId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompaignId( ) {
		return this.compaignId;
	}

	/**
	 * <p>Setter for the field <code>flowId</code>.</p>
	 *
	 * @param flowId a {@link java.lang.String} object.
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	/**
	 * <p>Getter for the field <code>flowId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFlowId( ) {
		return this.flowId;
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
