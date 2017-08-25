package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.packagetest response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppPackagetestResponse extends AlipayResponse {

	private static final long serialVersionUID = 7274684722422794898L;

	/** 
	 * testtest
	 */
	@ApiField("testtesttesttest")
	private String testtesttesttest;

	/**
	 * <p>Setter for the field <code>testtesttesttest</code>.</p>
	 *
	 * @param testtesttesttest a {@link java.lang.String} object.
	 */
	public void setTesttesttesttest(String testtesttesttest) {
		this.testtesttesttest = testtesttesttest;
	}
	/**
	 * <p>Getter for the field <code>testtesttesttest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTesttesttesttest( ) {
		return this.testtesttesttest;
	}

}
