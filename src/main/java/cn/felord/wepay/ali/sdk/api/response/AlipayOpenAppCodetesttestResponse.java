package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.codetesttest response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppCodetesttestResponse extends AlipayResponse {

	private static final long serialVersionUID = 3843711446348482499L;

	/** 
	 * 测试测试测试
	 */
	@ApiField("testtesttest")
	private String testtesttest;

	/**
	 * <p>Setter for the field <code>testtesttest</code>.</p>
	 *
	 * @param testtesttest a {@link java.lang.String} object.
	 */
	public void setTesttesttest(String testtesttest) {
		this.testtesttest = testtesttest;
	}
	/**
	 * <p>Getter for the field <code>testtesttest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTesttesttest( ) {
		return this.testtesttest;
	}

}
