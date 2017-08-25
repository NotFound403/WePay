package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.CreditResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.credit.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodCreditGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8466476428413512194L;

	/** 
	 * 授信结果
	 */
	@ApiField("credit_result")
	private CreditResult creditResult;

	/** 
	 * 为了保持幂等性，返回唯一请求号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Setter for the field <code>creditResult</code>.</p>
	 *
	 * @param creditResult a {@link cn.felord.wepay.ali.sdk.api.domain.CreditResult} object.
	 */
	public void setCreditResult(CreditResult creditResult) {
		this.creditResult = creditResult;
	}
	/**
	 * <p>Getter for the field <code>creditResult</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CreditResult} object.
	 */
	public CreditResult getCreditResult( ) {
		return this.creditResult;
	}

	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId( ) {
		return this.requestId;
	}

}
