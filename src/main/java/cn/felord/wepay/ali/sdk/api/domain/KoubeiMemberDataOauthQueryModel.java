package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑业务授权令牌查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMemberDataOauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5376449451711296261L;

	/**
	 * 授权业务类型，目前统一只有pay_member
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 授权码，用于换取授权信息如操作人id等.获取方式:跳转isv地址中会带有此code参数。auth_code一次有效，auth_code有效期为3分钟到24小时（开放平台规则会根据具体的业务场景动态调整auth_code的有效期，但是不会低于3分钟，同时也不会超过24小时），超过有效期的auth_code即使未使用也将无法使用。用户的每次授权动作都会生成一个新的auth_code。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展参数，目前保留未用，开发者请忽略此参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * <p>Getter for the field <code>authType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthType() {
		return this.authType;
	}
	/**
	 * <p>Setter for the field <code>authType</code>.</p>
	 *
	 * @param authType a {@link java.lang.String} object.
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
