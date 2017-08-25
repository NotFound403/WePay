package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3385948214939386431L;

	/**
	 * 用户信息 填写则作为附加条件查询
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 扩展信息，暂时没有
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作卡号。
target_card_no为业务卡号，由开卡流程中，支付宝返回的业务卡号
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型（会员卡查询，只能提供支付宝端的卡号）
BIZ_CARD：支付宝卡号
D_QR_CODE：动态二维码（业务卡号对应的）
D_BAR_CODE：动态条码（业务卡号对应的）
如果卡号不空，则类型不能为空
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	/**
	 * <p>Getter for the field <code>cardUserInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CardUserInfo} object.
	 */
	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	/**
	 * <p>Setter for the field <code>cardUserInfo</code>.</p>
	 *
	 * @param cardUserInfo a {@link cn.felord.wepay.ali.sdk.api.domain.CardUserInfo} object.
	 */
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>targetCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	/**
	 * <p>Setter for the field <code>targetCardNo</code>.</p>
	 *
	 * @param targetCardNo a {@link java.lang.String} object.
	 */
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	/**
	 * <p>Getter for the field <code>targetCardNoType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	/**
	 * <p>Setter for the field <code>targetCardNoType</code>.</p>
	 *
	 * @param targetCardNoType a {@link java.lang.String} object.
	 */
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
