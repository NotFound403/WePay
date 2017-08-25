package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 冻结订单详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class UnfreezeOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 6525299278122148793L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 冻结订单的商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 冻结金额（含服务费）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单状态：I：初始，S：成功，F：失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 解冻金额（含服务费）
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

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
	 * <p>Getter for the field <code>orderAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderAmount() {
		return this.orderAmount;
	}
	/**
	 * <p>Setter for the field <code>orderAmount</code>.</p>
	 *
	 * @param orderAmount a {@link java.lang.String} object.
	 */
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
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
	 * <p>Getter for the field <code>unfreezeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	/**
	 * <p>Setter for the field <code>unfreezeAmount</code>.</p>
	 *
	 * @param unfreezeAmount a {@link java.lang.String} object.
	 */
	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

}
