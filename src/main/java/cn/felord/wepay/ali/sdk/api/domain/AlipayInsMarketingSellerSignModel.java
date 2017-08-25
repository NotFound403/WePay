package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险受托代扣签约
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingSellerSignModel extends AlipayObject {

	private static final long serialVersionUID = 3599887218847913525L;

	/**
	 * 商户生成的外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码；由蚂蚁保险平台分配，商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险)
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private InsPerson seller;

	/**
	 * 签约的用户支付宝id
	 */
	@ApiField("sign_alipay_id")
	private String signAlipayId;

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

	/**
	 * <p>Getter for the field <code>seller</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getSeller() {
		return this.seller;
	}
	/**
	 * <p>Setter for the field <code>seller</code>.</p>
	 *
	 * @param seller a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setSeller(InsPerson seller) {
		this.seller = seller;
	}

	/**
	 * <p>Getter for the field <code>signAlipayId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignAlipayId() {
		return this.signAlipayId;
	}
	/**
	 * <p>Setter for the field <code>signAlipayId</code>.</p>
	 *
	 * @param signAlipayId a {@link java.lang.String} object.
	 */
	public void setSignAlipayId(String signAlipayId) {
		this.signAlipayId = signAlipayId;
	}

}
