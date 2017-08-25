package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.PublicBindAccount;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7574453142227896865L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 菜单唯一标识
	 */
	@ApiField("menu_key")
	private String menuKey;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("public_bind_account")
	private List<PublicBindAccount> publicBindAccounts;

	/** 
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/**
	 * <p>Setter for the field <code>menuKey</code>.</p>
	 *
	 * @param menuKey a {@link java.lang.String} object.
	 */
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	/**
	 * <p>Getter for the field <code>menuKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMenuKey( ) {
		return this.menuKey;
	}

	/** {@inheritDoc} */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg( ) {
		return this.msg;
	}

	/**
	 * <p>Setter for the field <code>publicBindAccounts</code>.</p>
	 *
	 * @param publicBindAccounts a {@link java.util.List} object.
	 */
	public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts) {
		this.publicBindAccounts = publicBindAccounts;
	}
	/**
	 * <p>Getter for the field <code>publicBindAccounts</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PublicBindAccount> getPublicBindAccounts( ) {
		return this.publicBindAccounts;
	}

	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark( ) {
		return this.remark;
	}

}
