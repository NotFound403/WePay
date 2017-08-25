package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.PublicBindAccount;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.account.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileStdPublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7823915594417539223L;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("public_bind_account")
	private List<PublicBindAccount> publicBindAccounts;

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

}
