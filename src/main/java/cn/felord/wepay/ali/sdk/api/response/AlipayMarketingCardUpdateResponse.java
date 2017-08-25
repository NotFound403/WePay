package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7754131644119242884L;

	/** 
	 * 二级错误处理结果（如果公用返回结果为false，则可以看这个接口判断明细原因）
如果公用返回为true，则该字段为空
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * <p>Setter for the field <code>resultCode</code>.</p>
	 *
	 * @param resultCode a {@link java.lang.String} object.
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * <p>Getter for the field <code>resultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultCode( ) {
		return this.resultCode;
	}

}
