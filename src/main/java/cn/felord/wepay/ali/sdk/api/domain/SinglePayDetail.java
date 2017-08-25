package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 小额支付单笔支付
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SinglePayDetail extends AlipayObject {

	private static final long serialVersionUID = 5241981555322195762L;

	/**
	 * 支付宝冻结订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 本次支付金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 本次支付url地址
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 收款人的userId
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

	/**
	 * 本次支付的支付宝流水号
	 */
	@ApiField("transfer_order_no")
	private String transferOrderNo;

	/**
	 * 本次支付的外部单据号
	 */
	@ApiField("transfer_out_order_no")
	private String transferOutOrderNo;

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
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
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
	 * <p>Getter for the field <code>payUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayUrl() {
		return this.payUrl;
	}
	/**
	 * <p>Setter for the field <code>payUrl</code>.</p>
	 *
	 * @param payUrl a {@link java.lang.String} object.
	 */
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	/**
	 * <p>Getter for the field <code>receiveUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiveUserId() {
		return this.receiveUserId;
	}
	/**
	 * <p>Setter for the field <code>receiveUserId</code>.</p>
	 *
	 * @param receiveUserId a {@link java.lang.String} object.
	 */
	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	/**
	 * <p>Getter for the field <code>transferOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransferOrderNo() {
		return this.transferOrderNo;
	}
	/**
	 * <p>Setter for the field <code>transferOrderNo</code>.</p>
	 *
	 * @param transferOrderNo a {@link java.lang.String} object.
	 */
	public void setTransferOrderNo(String transferOrderNo) {
		this.transferOrderNo = transferOrderNo;
	}

	/**
	 * <p>Getter for the field <code>transferOutOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransferOutOrderNo() {
		return this.transferOutOrderNo;
	}
	/**
	 * <p>Setter for the field <code>transferOutOrderNo</code>.</p>
	 *
	 * @param transferOutOrderNo a {@link java.lang.String} object.
	 */
	public void setTransferOutOrderNo(String transferOutOrderNo) {
		this.transferOutOrderNo = transferOutOrderNo;
	}

}
