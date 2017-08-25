package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑订单商品凭证模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbOrderVoucherModel extends AlipayObject {

	private static final long serialVersionUID = 7132637211478137714L;

	/**
	 * 商品凭证过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 商品凭证核销／退款对应的资金流水号
	 */
	@ApiField("funds_voucher_no")
	private String fundsVoucherNo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 退款理由，由消费者选择或填写内容，系统退款可以为空。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款类型，ROLE_DAEMON（超期未使用），ROLE_USER（消费者主动）；
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 商品凭证核销门店ID,核销后会存在该字段
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品凭证核销门店外部ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商品凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * <p>Getter for the field <code>expireDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireDate() {
		return this.expireDate;
	}
	/**
	 * <p>Setter for the field <code>expireDate</code>.</p>
	 *
	 * @param expireDate a {@link java.util.Date} object.
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * <p>Getter for the field <code>fundsVoucherNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundsVoucherNo() {
		return this.fundsVoucherNo;
	}
	/**
	 * <p>Setter for the field <code>fundsVoucherNo</code>.</p>
	 *
	 * @param fundsVoucherNo a {@link java.lang.String} object.
	 */
	public void setFundsVoucherNo(String fundsVoucherNo) {
		this.fundsVoucherNo = fundsVoucherNo;
	}

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>refundReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundReason() {
		return this.refundReason;
	}
	/**
	 * <p>Setter for the field <code>refundReason</code>.</p>
	 *
	 * @param refundReason a {@link java.lang.String} object.
	 */
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	/**
	 * <p>Getter for the field <code>refundType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundType() {
		return this.refundType;
	}
	/**
	 * <p>Setter for the field <code>refundType</code>.</p>
	 *
	 * @param refundType a {@link java.lang.String} object.
	 */
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
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
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
	}
	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	/**
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId() {
		return this.voucherId;
	}
	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
