package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISP功能测试接口
 *
 * @author auto create
 * @since 1.0, 2016-09-21 21:43:09
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

	public String getTestparam() {
		return this.testparam;
	}
	public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

	public String getTesttest() {
		return this.testtest;
	}
	public void setTesttest(String testtest) {
		this.testtest = testtest;
	}

}
