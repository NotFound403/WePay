package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡删卡
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6787369691897918861L;

	/**
	 * 删卡扩展参数，json格式。
用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
目前支持如下key：
new_card_no：新卡号
donee_user_id：受赠人userId
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户端删卡业务流水号（商户确保流水号唯一性）
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 删卡原因
USER_UNBUND：用户解绑（可以重新绑定）
CANCEL：销户（完成销户后，就不能再重新绑定）
PRESENT：转赠（可以重新绑定）
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
BIZ_CARD：支付宝卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

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

	/**
	 * <p>Getter for the field <code>reasonCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReasonCode() {
		return this.reasonCode;
	}
	/**
	 * <p>Setter for the field <code>reasonCode</code>.</p>
	 *
	 * @param reasonCode a {@link java.lang.String} object.
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
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
