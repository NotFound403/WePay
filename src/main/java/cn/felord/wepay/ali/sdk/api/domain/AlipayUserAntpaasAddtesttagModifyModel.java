package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 给支付宝账户打测试账号标记
 *
 * @author auto create
 * @since 1.0, 2017-06-30 11:13:29
 */
public class AlipayUserAntpaasAddtesttagModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6465363618674285964L;

	/**
	 * 支付宝账户id
	 */
	@ApiField("account_no")
	private String accountNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

}
