package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 统一对外错误码测试测试
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppCodetesttestModel extends AlipayObject {

	private static final long serialVersionUID = 4242865564836873185L;

	/**
	 * 测试参数1
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * 测试测试
	 */
	@ApiField("testtestparam")
	private String testtestparam;

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
	 * <p>Getter for the field <code>testtestparam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTesttestparam() {
		return this.testtestparam;
	}
	/**
	 * <p>Setter for the field <code>testtestparam</code>.</p>
	 *
	 * @param testtestparam a {@link java.lang.String} object.
	 */
	public void setTesttestparam(String testtestparam) {
		this.testtestparam = testtestparam;
	}

}
