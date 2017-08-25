package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayAccount;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6155276177844222593L;

	/** 
	 * 支付宝用户账户信息
	 */
	@ApiField("alipay_account")
	private AlipayAccount alipayAccount;

	/**
	 * <p>Setter for the field <code>alipayAccount</code>.</p>
	 *
	 * @param alipayAccount a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayAccount} object.
	 */
	public void setAlipayAccount(AlipayAccount alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	/**
	 * <p>Getter for the field <code>alipayAccount</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayAccount} object.
	 */
	public AlipayAccount getAlipayAccount( ) {
		return this.alipayAccount;
	}

}
