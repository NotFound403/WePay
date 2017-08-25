package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.delete response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardBenefitDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6712449272638632238L;

	/** 
	 * 权益删除结果；true成功，false失败
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link java.lang.Boolean} object.
	 */
	public void setResult(Boolean result) {
		this.result = result;
	}
	/**
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getResult( ) {
		return this.result;
	}

}
