package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 为服务窗合作伙伴（如YunOS），提供操作服务窗菜单的功能
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPartnerMenuOperateModel extends AlipayObject {

	private static final long serialVersionUID = 1249344684553774998L;

	/**
	 * 行为参数
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 行为类型(in，out，api)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 服务窗id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 第三方账号ID ,银行卡号/户号/手机号
	 */
	@ApiField("third_account_id")
	private String thirdAccountId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>actionParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionParam() {
		return this.actionParam;
	}
	/**
	 * <p>Setter for the field <code>actionParam</code>.</p>
	 *
	 * @param actionParam a {@link java.lang.String} object.
	 */
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	/**
	 * <p>Getter for the field <code>actionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionType() {
		return this.actionType;
	}
	/**
	 * <p>Setter for the field <code>actionType</code>.</p>
	 *
	 * @param actionType a {@link java.lang.String} object.
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

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
	 * <p>Getter for the field <code>publicId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicId() {
		return this.publicId;
	}
	/**
	 * <p>Setter for the field <code>publicId</code>.</p>
	 *
	 * @param publicId a {@link java.lang.String} object.
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	/**
	 * <p>Getter for the field <code>thirdAccountId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThirdAccountId() {
		return this.thirdAccountId;
	}
	/**
	 * <p>Setter for the field <code>thirdAccountId</code>.</p>
	 *
	 * @param thirdAccountId a {@link java.lang.String} object.
	 */
	public void setThirdAccountId(String thirdAccountId) {
		this.thirdAccountId = thirdAccountId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
