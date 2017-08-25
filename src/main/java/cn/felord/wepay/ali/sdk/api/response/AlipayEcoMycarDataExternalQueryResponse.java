package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.data.external.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataExternalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6391324779662382668L;

	/** 
	 * 30
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/** 
	 * outter_response
	 */
	@ApiField("query_result")
	private String queryResult;

	/**
	 * <p>Setter for the field <code>externalSystemName</code>.</p>
	 *
	 * @param externalSystemName a {@link java.lang.String} object.
	 */
	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}
	/**
	 * <p>Getter for the field <code>externalSystemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalSystemName( ) {
		return this.externalSystemName;
	}

	/**
	 * <p>Setter for the field <code>queryResult</code>.</p>
	 *
	 * @param queryResult a {@link java.lang.String} object.
	 */
	public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}
	/**
	 * <p>Getter for the field <code>queryResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQueryResult( ) {
		return this.queryResult;
	}

}
