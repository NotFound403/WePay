package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.userid.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPlatformUseridGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3311365596999815383L;

	/** 
	 * id字典，key为openId，value为userId
	 */
	@ApiField("dict")
	private String dict;

	/**
	 * <p>Setter for the field <code>dict</code>.</p>
	 *
	 * @param dict a {@link java.lang.String} object.
	 */
	public void setDict(String dict) {
		this.dict = dict;
	}
	/**
	 * <p>Getter for the field <code>dict</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDict( ) {
		return this.dict;
	}

}
