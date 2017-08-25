package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡开卡（内部无需授权）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardOpenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2182343124881886363L;

	/**
	 * 外部卡信息(biz_card_no无需填写)
	 */
	@ApiField("card_ext_info")
	private MerchantCard cardExtInfo;

	/**
	 * 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 发卡用户信息
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 商户会员信息
	 */
	@ApiField("member_ext_info")
	private MerchantMenber memberExtInfo;

	/**
	 * 外部商户流水号（商户需要确保唯一性控制，类似request_id唯一请求标识）
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * <p>Getter for the field <code>cardExtInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public MerchantCard getCardExtInfo() {
		return this.cardExtInfo;
	}
	/**
	 * <p>Setter for the field <code>cardExtInfo</code>.</p>
	 *
	 * @param cardExtInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public void setCardExtInfo(MerchantCard cardExtInfo) {
		this.cardExtInfo = cardExtInfo;
	}

	/**
	 * <p>Getter for the field <code>cardTemplateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	/**
	 * <p>Setter for the field <code>cardTemplateId</code>.</p>
	 *
	 * @param cardTemplateId a {@link java.lang.String} object.
	 */
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

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
	 * <p>Getter for the field <code>memberExtInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantMenber} object.
	 */
	public MerchantMenber getMemberExtInfo() {
		return this.memberExtInfo;
	}
	/**
	 * <p>Setter for the field <code>memberExtInfo</code>.</p>
	 *
	 * @param memberExtInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantMenber} object.
	 */
	public void setMemberExtInfo(MerchantMenber memberExtInfo) {
		this.memberExtInfo = memberExtInfo;
	}

	/**
	 * <p>Getter for the field <code>outSerialNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	/**
	 * <p>Setter for the field <code>outSerialNo</code>.</p>
	 *
	 * @param outSerialNo a {@link java.lang.String} object.
	 */
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

}
