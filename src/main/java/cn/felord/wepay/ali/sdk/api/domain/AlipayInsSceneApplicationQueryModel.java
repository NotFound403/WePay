package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保单查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneApplicationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1479419546121734278L;

	/**
	 * 投保订单号;当商户生成的外部投保业务号不传时则必传
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 商户生成的外部投保业务号;当投保订单号不传时必传
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;当投保订单号不传时必传.
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * <p>Getter for the field <code>applicationNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	/**
	 * <p>Setter for the field <code>applicationNo</code>.</p>
	 *
	 * @param applicationNo a {@link java.lang.String} object.
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

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

}
