package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.StdPublicBindAccount;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.account.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5355825647788671172L;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("std_public_bind_account")
	private List<StdPublicBindAccount> publicBindAccounts;

	/**
	 * <p>Setter for the field <code>publicBindAccounts</code>.</p>
	 *
	 * @param publicBindAccounts a {@link java.util.List} object.
	 */
	public void setPublicBindAccounts(List<StdPublicBindAccount> publicBindAccounts) {
		this.publicBindAccounts = publicBindAccounts;
	}
	/**
	 * <p>Getter for the field <code>publicBindAccounts</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<StdPublicBindAccount> getPublicBindAccounts( ) {
		return this.publicBindAccounts;
	}

}
