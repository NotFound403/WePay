package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.data.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainDataUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1681389791757475392L;

	/** 
	 * 具体返回的处理结果
	 */
	@ApiField("info")
	private String info;

	/**
	 * <p>Setter for the field <code>info</code>.</p>
	 *
	 * @param info a {@link java.lang.String} object.
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * <p>Getter for the field <code>info</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInfo( ) {
		return this.info;
	}

}
