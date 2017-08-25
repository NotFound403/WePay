package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantOrderRentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7858613866685766458L;

	/** 
	 * 是否准入:
Y:准入
N:不准入
	 */
	@ApiField("admit_state")
	private String admitState;

	/** 
	 * 资金流水号
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 借用时间
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/** 
	 * 物品名称,最长不能超过14个汉字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/** 
	 * 芝麻信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付金额类型
RENT:租金
DAMAGE:赔偿金
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/** 
	 * 支付状态
PAY_INIT:待支付
PAY_SUCCESS:支付成功
PAY_FAILED:支付失败
PAY_INPROGRESS:支付中
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 归还时间
	 */
	@ApiField("restore_time")
	private String restoreTime;

	/** 
	 * 订单状态:
borrow:借出
restore:归还
cancel:撤销
	 */
	@ApiField("use_state")
	private String useState;

	/** 
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>admitState</code>.</p>
	 *
	 * @param admitState a {@link java.lang.String} object.
	 */
	public void setAdmitState(String admitState) {
		this.admitState = admitState;
	}
	/**
	 * <p>Getter for the field <code>admitState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdmitState( ) {
		return this.admitState;
	}

	/**
	 * <p>Setter for the field <code>alipayFundOrderNo</code>.</p>
	 *
	 * @param alipayFundOrderNo a {@link java.lang.String} object.
	 */
	public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}
	/**
	 * <p>Getter for the field <code>alipayFundOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
	}

	/**
	 * <p>Setter for the field <code>borrowTime</code>.</p>
	 *
	 * @param borrowTime a {@link java.lang.String} object.
	 */
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}
	/**
	 * <p>Getter for the field <code>borrowTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBorrowTime( ) {
		return this.borrowTime;
	}

	/**
	 * <p>Setter for the field <code>goodsName</code>.</p>
	 *
	 * @param goodsName a {@link java.lang.String} object.
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * <p>Getter for the field <code>goodsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsName( ) {
		return this.goodsName;
	}

	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo( ) {
		return this.orderNo;
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
	 * <p>Getter for the field <code>payAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmount( ) {
		return this.payAmount;
	}

	/**
	 * <p>Setter for the field <code>payAmountType</code>.</p>
	 *
	 * @param payAmountType a {@link java.lang.String} object.
	 */
	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}
	/**
	 * <p>Getter for the field <code>payAmountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmountType( ) {
		return this.payAmountType;
	}

	/**
	 * <p>Setter for the field <code>payStatus</code>.</p>
	 *
	 * @param payStatus a {@link java.lang.String} object.
	 */
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * <p>Getter for the field <code>payStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayStatus( ) {
		return this.payStatus;
	}

	/**
	 * <p>Setter for the field <code>payTime</code>.</p>
	 *
	 * @param payTime a {@link java.lang.String} object.
	 */
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	/**
	 * <p>Getter for the field <code>payTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayTime( ) {
		return this.payTime;
	}

	/**
	 * <p>Setter for the field <code>restoreTime</code>.</p>
	 *
	 * @param restoreTime a {@link java.lang.String} object.
	 */
	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
	}
	/**
	 * <p>Getter for the field <code>restoreTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRestoreTime( ) {
		return this.restoreTime;
	}

	/**
	 * <p>Setter for the field <code>useState</code>.</p>
	 *
	 * @param useState a {@link java.lang.String} object.
	 */
	public void setUseState(String useState) {
		this.useState = useState;
	}
	/**
	 * <p>Getter for the field <code>useState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUseState( ) {
		return this.useState;
	}

	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId( ) {
		return this.userId;
	}

}
