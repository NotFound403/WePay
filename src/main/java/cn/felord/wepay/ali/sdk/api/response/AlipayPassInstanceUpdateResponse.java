package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.instance.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassInstanceUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8675742467288577356L;

	/** 
	 * 接口调用返回结果信息
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

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
