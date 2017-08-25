package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 家庭成员信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class UserDetails extends AlipayObject {

	private static final long serialVersionUID = 1489917967267233299L;

	/**
	 * 用户变更手机号，替换旧的手机号
	 */
	@ApiField("user_change_mobile")
	private String userChangeMobile;

	/**
	 * 孩子家长的手机号
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 张三
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 孩子与家长的关系： 1、爸爸  2、妈妈  3、爷爷  4、奶奶  5、外公  6、外婆  7、家长
	 */
	@ApiField("user_relation")
	private String userRelation;

	/**
	 * <p>Getter for the field <code>userChangeMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserChangeMobile() {
		return this.userChangeMobile;
	}
	/**
	 * <p>Setter for the field <code>userChangeMobile</code>.</p>
	 *
	 * @param userChangeMobile a {@link java.lang.String} object.
	 */
	public void setUserChangeMobile(String userChangeMobile) {
		this.userChangeMobile = userChangeMobile;
	}

	/**
	 * <p>Getter for the field <code>userMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserMobile() {
		return this.userMobile;
	}
	/**
	 * <p>Setter for the field <code>userMobile</code>.</p>
	 *
	 * @param userMobile a {@link java.lang.String} object.
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
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

	/**
	 * <p>Getter for the field <code>userRelation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserRelation() {
		return this.userRelation;
	}
	/**
	 * <p>Setter for the field <code>userRelation</code>.</p>
	 *
	 * @param userRelation a {@link java.lang.String} object.
	 */
	public void setUserRelation(String userRelation) {
		this.userRelation = userRelation;
	}

}
