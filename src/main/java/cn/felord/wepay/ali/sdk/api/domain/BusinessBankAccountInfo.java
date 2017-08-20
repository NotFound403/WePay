package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 企业对公账户信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class BusinessBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4191997698591161946L;

	/**
	 * 企业对公账户名称
	 */
	@ApiField("business_bank_account_name")
	private String businessBankAccountName;

	/**
	 * 企业对公银行账户号
	 */
	@ApiField("business_bank_card_no")
	private String businessBankCardNo;

	/**
	 * 企业对公账户开户行名称
	 */
	@ApiField("business_bank_name")
	private String businessBankName;

	/**
	 * 企业对公账户开户行支行全称
	 */
	@ApiField("business_bank_sub")
	private String businessBankSub;

	public String getBusinessBankAccountName() {
		return this.businessBankAccountName;
	}
	public void setBusinessBankAccountName(String businessBankAccountName) {
		this.businessBankAccountName = businessBankAccountName;
	}

	public String getBusinessBankCardNo() {
		return this.businessBankCardNo;
	}
	public void setBusinessBankCardNo(String businessBankCardNo) {
		this.businessBankCardNo = businessBankCardNo;
	}

	public String getBusinessBankName() {
		return this.businessBankName;
	}
	public void setBusinessBankName(String businessBankName) {
		this.businessBankName = businessBankName;
	}

	public String getBusinessBankSub() {
		return this.businessBankSub;
	}
	public void setBusinessBankSub(String businessBankSub) {
		this.businessBankSub = businessBankSub;
	}

}
