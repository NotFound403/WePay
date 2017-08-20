package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.instance.add response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-31 15:33:21
 */
public class AlipayPassInstanceAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3196266918236896342L;

	/** 
	 * 接口调用返回结果信息
serialNumber：唯一核销凭证串号（必须由动态传参指定）
passId：券唯一id
operation：本次调用的操作类型，ADD
errorCode：处理结果码（错误码）
errorMsg：处理结果说明（错误说明）
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
