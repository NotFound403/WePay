package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议鉴权确认接口
 *
 * @author auto create
 * @since 1.0, 2017-07-12 16:30:43
 */
public class AlipayUserAgreementAuthConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1495378249767998551L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 鉴权申请token，其格式和内容，由支付宝定义。在该接口中，商户可根据申请操作成功时返回的申请token，进行鉴权确认操作。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/**
	 * 鉴权确认码
	 */
	@ApiField("auth_confirm_no")
	private String authConfirmNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getApplyToken() {
		return this.applyToken;
	}
	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

	public String getAuthConfirmNo() {
		return this.authConfirmNo;
	}
	public void setAuthConfirmNo(String authConfirmNo) {
		this.authConfirmNo = authConfirmNo;
	}

}
