package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 给支付宝账户打测试账号标记
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAntpaasAddtesttagModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6465363618674285964L;

	/**
	 * 支付宝账户id
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * <p>Getter for the field <code>accountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountNo() {
		return this.accountNo;
	}
	/**
	 * <p>Setter for the field <code>accountNo</code>.</p>
	 *
	 * @param accountNo a {@link java.lang.String} object.
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

}
