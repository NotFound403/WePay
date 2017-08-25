package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZdatafrontDatatransferedSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7691422621372684485L;

	/** 
	 * 表示数据传输是否成功
	 */
	@ApiField("success")
	private String success;

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
