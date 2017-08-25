package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.bizadviser.myreport.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataBizadviserMyreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2538183255888663594L;

	/** 
	 * 不同uniq_key 返回不同参数，详细请看：https://doc.open.alipay.com/docs/doc.htm?spm=0.0.0.0.1Zq3by&docType=1&articleId=107061&previewCode=F30AA2D06B7CC0817AC7221A8CE288A4
	 */
	@ApiField("result")
	private String result;

	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link java.lang.String} object.
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResult( ) {
		return this.result;
	}

}
