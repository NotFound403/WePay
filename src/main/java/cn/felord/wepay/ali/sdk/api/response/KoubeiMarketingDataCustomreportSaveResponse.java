package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.save response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataCustomreportSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4661272695249589537L;

	/** 
	 * 自定义报表的规则ID
	 */
	@ApiField("condition_key")
	private String conditionKey;

	/**
	 * <p>Setter for the field <code>conditionKey</code>.</p>
	 *
	 * @param conditionKey a {@link java.lang.String} object.
	 */
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}
	/**
	 * <p>Getter for the field <code>conditionKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConditionKey( ) {
		return this.conditionKey;
	}

}
