package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 测试接口
 *
 * @author auto create
 * @since 1.0, 2017-07-06 15:27:01
 */
public class AlipayOpenWangyanTestDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2834778651699748671L;

	/**
	 * 1
	 */
	@ApiField("aaa")
	private String aaa;

	/**
	 * 2
	 */
	@ApiField("user_name")
	private String userName;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
