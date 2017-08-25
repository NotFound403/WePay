package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 测试接口
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>aaa</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAaa() {
		return this.aaa;
	}
	/**
	 * <p>Setter for the field <code>aaa</code>.</p>
	 *
	 * @param aaa a {@link java.lang.String} object.
	 */
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
