package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.template.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassTemplateUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6791922742366191764L;

	/** 
	 * 接口调用返回结果信息(json字串):
errorCode：处理结果码（错误码）；
errorMsg：处理结果说明（错误说明）；
tpl_id：模板编号，预期在调发券接口时必须传入；
tpl_params：动态参数（变量）列表，预期在调发券接口时传入；
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
