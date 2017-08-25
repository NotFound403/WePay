package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.order.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPointOrderGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5584286181937441356L;

	/** 
	 * 支付宝集分宝发放流水号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 发放时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 支付宝集分宝发放者用户ID
	 */
	@ApiField("dispatch_user_id")
	private String dispatchUserId;

	/** 
	 * 向用户展示集分宝发放备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * isv提供的发放号订单号，由数字和字母组成，最大长度为32为，需要保证每笔发放的唯一性，支付宝会对该参数做唯一性控制。如果使用同样的订单号，支付宝将返回订单号已经存在的错误
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 集分宝发放流水状态，I表示处理中，S表示成功，F表示失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 发放集分宝的数量
	 */
	@ApiField("point_count")
	private Long pointCount;

	/** 
	 * 支付宝集分宝接收者用户ID
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

	/**
	 * <p>Setter for the field <code>alipayOrderNo</code>.</p>
	 *
	 * @param alipayOrderNo a {@link java.lang.String} object.
	 */
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	/**
	 * <p>Getter for the field <code>alipayOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
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
	 * <p>Getter for the field <code>createTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreateTime( ) {
		return this.createTime;
	}

	/**
	 * <p>Setter for the field <code>dispatchUserId</code>.</p>
	 *
	 * @param dispatchUserId a {@link java.lang.String} object.
	 */
	public void setDispatchUserId(String dispatchUserId) {
		this.dispatchUserId = dispatchUserId;
	}
	/**
	 * <p>Getter for the field <code>dispatchUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDispatchUserId( ) {
		return this.dispatchUserId;
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
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo( ) {
		return this.memo;
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
	 * <p>Getter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
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
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	/**
	 * <p>Setter for the field <code>pointCount</code>.</p>
	 *
	 * @param pointCount a {@link java.lang.Long} object.
	 */
	public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}
	/**
	 * <p>Getter for the field <code>pointCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPointCount( ) {
		return this.pointCount;
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
	 * <p>Getter for the field <code>receiveUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiveUserId( ) {
		return this.receiveUserId;
	}

}
