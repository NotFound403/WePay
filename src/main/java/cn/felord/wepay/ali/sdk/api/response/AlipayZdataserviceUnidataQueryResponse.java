package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataservice.unidata.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZdataserviceUnidataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5471554573618465474L;

	/** 
	 * 查询结果集，统一用string方式返回
	 */
	@ApiField("query_result")
	private String queryResult;

	/** 
	 * 查询是否成功具体描述
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 查询是否成功
	 */
	@ApiField("success")
	private String success;

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

	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.String} object.
	 */
	public void setSuccess(String success) {
		this.success = success;
	}
	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSuccess( ) {
		return this.success;
	}

}
