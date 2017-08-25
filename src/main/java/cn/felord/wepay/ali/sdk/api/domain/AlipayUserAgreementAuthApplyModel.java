package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议鉴权申请接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAgreementAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4846381993281373376L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 支付宝给用户下发短信校验码;
用户在商户提供页面中回填该校验码，商户调支付宝的鉴权确认接口，完全最终的鉴权确认
	 */
	@ApiField("auth_confirm_type")
	private String authConfirmType;

	/**
	 * 鉴权申请的场景，目前可传入的值：AUTH/PAY
	 */
	@ApiField("auth_scene")
	private String authScene;

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
	 * <p>Getter for the field <code>authConfirmType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthConfirmType() {
		return this.authConfirmType;
	}
	/**
	 * <p>Setter for the field <code>authConfirmType</code>.</p>
	 *
	 * @param authConfirmType a {@link java.lang.String} object.
	 */
	public void setAuthConfirmType(String authConfirmType) {
		this.authConfirmType = authConfirmType;
	}

	/**
	 * <p>Getter for the field <code>authScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthScene() {
		return this.authScene;
	}
	/**
	 * <p>Setter for the field <code>authScene</code>.</p>
	 *
	 * @param authScene a {@link java.lang.String} object.
	 */
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

}
