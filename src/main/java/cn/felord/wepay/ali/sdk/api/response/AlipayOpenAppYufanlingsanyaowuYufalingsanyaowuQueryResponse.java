package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufanlingsanyaowu.yufalingsanyaowu.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1534667332754271462L;

	/** 
	 * 10
	 */
	@ApiField("userid")
	private String userid;

	/**
	 * <p>Setter for the field <code>userid</code>.</p>
	 *
	 * @param userid a {@link java.lang.String} object.
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * <p>Getter for the field <code>userid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserid( ) {
		return this.userid;
	}

}
