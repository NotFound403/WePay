package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 小额支付冻结订单详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MicroPayOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 6857485158112947387L;

	/**
	 * 支付宝订单号，此订单号作为后续支付冻结金以及转账的订单标识
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付方的支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 可用于支付的金额（除去服务费）
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 冻结资金的到期自动解冻时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 冻结金额（不包含服务费）
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户订单号,这个是调用传入的
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 订单状态：I：初始，S：成功
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付的金额（含服务费）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 冻结资金支付确认方式， NO_CONFIRM：不需要付款确认，调用接口直接扣款 PAY_PASSWORD: 在转账需要付款方用支付密码确认，才可以转账成功
	 */
	@ApiField("pay_confirm")
	private String payConfirm;

	/**
	 * <p>Getter for the field <code>alipayOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	/**
	 * <p>Setter for the field <code>alipayOrderNo</code>.</p>
	 *
	 * @param alipayOrderNo a {@link java.lang.String} object.
	 */
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	/**
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

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
	 * <p>Getter for the field <code>createTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * <p>Setter for the field <code>createTime</code>.</p>
	 *
	 * @param createTime a {@link java.util.Date} object.
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireTime() {
		return this.expireTime;
	}
	/**
	 * <p>Setter for the field <code>expireTime</code>.</p>
	 *
	 * @param expireTime a {@link java.util.Date} object.
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * <p>Getter for the field <code>freezeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	/**
	 * <p>Setter for the field <code>freezeAmount</code>.</p>
	 *
	 * @param freezeAmount a {@link java.lang.String} object.
	 */
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
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
	 * <p>Getter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	/**
	 * <p>Setter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @param merchantOrderNo a {@link java.lang.String} object.
	 */
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	/**
	 * <p>Getter for the field <code>modifiedTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	/**
	 * <p>Setter for the field <code>modifiedTime</code>.</p>
	 *
	 * @param modifiedTime a {@link java.util.Date} object.
	 */
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/**
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus() {
		return this.orderStatus;
	}
	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link java.lang.String} object.
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * <p>Getter for the field <code>payAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmount() {
		return this.payAmount;
	}
	/**
	 * <p>Setter for the field <code>payAmount</code>.</p>
	 *
	 * @param payAmount a {@link java.lang.String} object.
	 */
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * <p>Getter for the field <code>payConfirm</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayConfirm() {
		return this.payConfirm;
	}
	/**
	 * <p>Setter for the field <code>payConfirm</code>.</p>
	 *
	 * @param payConfirm a {@link java.lang.String} object.
	 */
	public void setPayConfirm(String payConfirm) {
		this.payConfirm = payConfirm;
	}

}
