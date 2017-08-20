package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.openid.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-06 17:38:21
 */
public class AlipayPlatformOpenidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2234673386194457982L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * id字典，key为userId和老的openId，value为新的openId
	 */
	@ApiField("dict")
	private String dict;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setDict(String dict) {
		this.dict = dict;
	}
	public String getDict( ) {
		return this.dict;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
