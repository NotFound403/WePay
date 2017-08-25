package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议鉴权确认接口
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>agreementNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementNo() {
		return this.agreementNo;
	}
	/**
	 * <p>Setter for the field <code>agreementNo</code>.</p>
	 *
	 * @param agreementNo a {@link java.lang.String} object.
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	/**
	 * <p>Getter for the field <code>applyToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyToken() {
		return this.applyToken;
	}
	/**
	 * <p>Setter for the field <code>applyToken</code>.</p>
	 *
	 * @param applyToken a {@link java.lang.String} object.
	 */
	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

	/**
	 * <p>Getter for the field <code>authConfirmNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthConfirmNo() {
		return this.authConfirmNo;
	}
	/**
	 * <p>Setter for the field <code>authConfirmNo</code>.</p>
	 *
	 * @param authConfirmNo a {@link java.lang.String} object.
	 */
	public void setAuthConfirmNo(String authConfirmNo) {
		this.authConfirmNo = authConfirmNo;
	}

}
