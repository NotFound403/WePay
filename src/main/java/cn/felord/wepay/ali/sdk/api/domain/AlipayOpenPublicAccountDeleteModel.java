package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 解除绑定商户会员号
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicAccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7626983554234393946L;

	/**
	 * 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId() {
		return this.agreementId;
	}
	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	/**
	 * <p>Getter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindAccountNo() {
		return this.bindAccountNo;
	}
	/**
	 * <p>Setter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @param bindAccountNo a {@link java.lang.String} object.
	 */
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

}
