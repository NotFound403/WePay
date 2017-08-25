package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户入驻申请单认证、审核详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantApplyResultRecord extends AlipayObject {

	private static final long serialVersionUID = 8525373348515693936L;

	/**
	 * 签约产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 如审核失败，表示该字段引发的审核失败
	 */
	@ApiField("prop_input_key")
	private String propInputKey;

	/**
	 * 认证、产品签约审核失败原因
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 认证审核、产品签约审核状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	/**
	 * 详情类型，CETIFY为认证，PROD为产品签约，COMMENT为认证审核批注
	 */
	@ApiField("result_type")
	private String resultType;

	/**
	 * <p>Getter for the field <code>prodName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdName() {
		return this.prodName;
	}
	/**
	 * <p>Setter for the field <code>prodName</code>.</p>
	 *
	 * @param prodName a {@link java.lang.String} object.
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * <p>Getter for the field <code>propInputKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPropInputKey() {
		return this.propInputKey;
	}
	/**
	 * <p>Setter for the field <code>propInputKey</code>.</p>
	 *
	 * @param propInputKey a {@link java.lang.String} object.
	 */
	public void setPropInputKey(String propInputKey) {
		this.propInputKey = propInputKey;
	}

	/**
	 * <p>Getter for the field <code>resultMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultMsg() {
		return this.resultMsg;
	}
	/**
	 * <p>Setter for the field <code>resultMsg</code>.</p>
	 *
	 * @param resultMsg a {@link java.lang.String} object.
	 */
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	/**
	 * <p>Getter for the field <code>resultStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultStatus() {
		return this.resultStatus;
	}
	/**
	 * <p>Setter for the field <code>resultStatus</code>.</p>
	 *
	 * @param resultStatus a {@link java.lang.String} object.
	 */
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	/**
	 * <p>Getter for the field <code>resultType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultType() {
		return this.resultType;
	}
	/**
	 * <p>Setter for the field <code>resultType</code>.</p>
	 *
	 * @param resultType a {@link java.lang.String} object.
	 */
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

}
