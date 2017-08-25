package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户红包
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Coupon extends AlipayObject {

	private static final long serialVersionUID = 7221991451589647636L;

	/**
	 * 当前可用面额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 红包编号
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 可优惠面额
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 有效期开始时间
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 有效期结束时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 红包使用说明
	 */
	@ApiField("instructions")
	private String instructions;

	/**
	 * 红包详情说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户id
	 */
	@ApiField("merchant_uniq_id")
	private String merchantUniqId;

	/**
	 * 是否可叠加
	 */
	@ApiField("multi_use_flag")
	private String multiUseFlag;

	/**
	 * 红包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否可退款标识
	 */
	@ApiField("refund_flag")
	private String refundFlag;

	/**
	 * 红包状态信息
	 */
	@ApiField("status")
	private String status;

	/**
	 * 红包模板编号
	 */
	@ApiField("template_no")
	private String templateNo;

	/**
	 * 用户openid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>availableAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvailableAmount() {
		return this.availableAmount;
	}
	/**
	 * <p>Setter for the field <code>availableAmount</code>.</p>
	 *
	 * @param availableAmount a {@link java.lang.String} object.
	 */
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	/**
	 * <p>Getter for the field <code>couponNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponNo() {
		return this.couponNo;
	}
	/**
	 * <p>Setter for the field <code>couponNo</code>.</p>
	 *
	 * @param couponNo a {@link java.lang.String} object.
	 */
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	/**
	 * <p>Getter for the field <code>deductAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeductAmount() {
		return this.deductAmount;
	}
	/**
	 * <p>Setter for the field <code>deductAmount</code>.</p>
	 *
	 * @param deductAmount a {@link java.lang.String} object.
	 */
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	/**
	 * <p>Getter for the field <code>gmtActive</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtActive() {
		return this.gmtActive;
	}
	/**
	 * <p>Setter for the field <code>gmtActive</code>.</p>
	 *
	 * @param gmtActive a {@link java.lang.String} object.
	 */
	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtCreate() {
		return this.gmtCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.lang.String} object.
	 */
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * <p>Getter for the field <code>gmtExpired</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtExpired() {
		return this.gmtExpired;
	}
	/**
	 * <p>Setter for the field <code>gmtExpired</code>.</p>
	 *
	 * @param gmtExpired a {@link java.lang.String} object.
	 */
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	/**
	 * <p>Getter for the field <code>instructions</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstructions() {
		return this.instructions;
	}
	/**
	 * <p>Setter for the field <code>instructions</code>.</p>
	 *
	 * @param instructions a {@link java.lang.String} object.
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>merchantUniqId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantUniqId() {
		return this.merchantUniqId;
	}
	/**
	 * <p>Setter for the field <code>merchantUniqId</code>.</p>
	 *
	 * @param merchantUniqId a {@link java.lang.String} object.
	 */
	public void setMerchantUniqId(String merchantUniqId) {
		this.merchantUniqId = merchantUniqId;
	}

	/**
	 * <p>Getter for the field <code>multiUseFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMultiUseFlag() {
		return this.multiUseFlag;
	}
	/**
	 * <p>Setter for the field <code>multiUseFlag</code>.</p>
	 *
	 * @param multiUseFlag a {@link java.lang.String} object.
	 */
	public void setMultiUseFlag(String multiUseFlag) {
		this.multiUseFlag = multiUseFlag;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>refundFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundFlag() {
		return this.refundFlag;
	}
	/**
	 * <p>Setter for the field <code>refundFlag</code>.</p>
	 *
	 * @param refundFlag a {@link java.lang.String} object.
	 */
	public void setRefundFlag(String refundFlag) {
		this.refundFlag = refundFlag;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>templateNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateNo() {
		return this.templateNo;
	}
	/**
	 * <p>Setter for the field <code>templateNo</code>.</p>
	 *
	 * @param templateNo a {@link java.lang.String} object.
	 */
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
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
