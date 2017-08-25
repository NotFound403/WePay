package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISP功能测试接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppPackagetestModel extends AlipayObject {

	private static final long serialVersionUID = 7187342647238127495L;

	/**
	 * testtest
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * testtest
	 */
	@ApiField("testtest")
	private String testtest;

	/**
	 * <p>Getter for the field <code>testparam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTestparam() {
		return this.testparam;
	}
	/**
	 * <p>Setter for the field <code>testparam</code>.</p>
	 *
	 * @param testparam a {@link java.lang.String} object.
	 */
	public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

	/**
	 * <p>Getter for the field <code>testtest</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTesttest() {
		return this.testtest;
	}
	/**
	 * <p>Setter for the field <code>testtest</code>.</p>
	 *
	 * @param testtest a {@link java.lang.String} object.
	 */
	public void setTesttest(String testtest) {
		this.testtest = testtest;
	}

}
