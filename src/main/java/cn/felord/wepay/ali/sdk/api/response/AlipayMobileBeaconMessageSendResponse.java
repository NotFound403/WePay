package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-28 11:13:19
 */
public class AlipayMobileBeaconMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6296943949643921429L;

	/** 
	 * 操作返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 操作提示文案
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
