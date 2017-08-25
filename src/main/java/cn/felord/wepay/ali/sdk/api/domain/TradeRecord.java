package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝交易明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TradeRecord extends AlipayObject {

	private static final long serialVersionUID = 6486571264699927346L;

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
	 * 资金流入流程类型,in表示收入,out表示支出
	 */
	@ApiField("in_out_type")
	private String inOutType;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 对方支付宝登录号，需要隐藏
	 */
	@ApiField("opposite_logon_id")
	private String oppositeLogonId;

	/**
	 * 对方姓名，需要隐藏
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 对方支付宝账号
	 */
	@ApiField("opposite_user_id")
	private String oppositeUserId;

	/**
	 * 订单来源，为空查询所有来源。淘宝(taobao)，支付宝(alipay)，其它(other)
	 */
	@ApiField("order_from")
	private String orderFrom;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单的名称，描述订单的摘要信息，如交易的商品名称
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 本方支付宝登录号，需要隐藏
	 */
	@ApiField("owner_logon_id")
	private String ownerLogonId;

	/**
	 * 本方姓名，需要隐藏
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 本方支付宝账号
	 */
	@ApiField("owner_user_id")
	private String ownerUserId;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 订单服务费
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
	 * <p>Getter for the field <code>inOutType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInOutType() {
		return this.inOutType;
	}
	/**
	 * <p>Setter for the field <code>inOutType</code>.</p>
	 *
	 * @param inOutType a {@link java.lang.String} object.
	 */
	public void setInOutType(String inOutType) {
		this.inOutType = inOutType;
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
	 * <p>Getter for the field <code>oppositeLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeLogonId() {
		return this.oppositeLogonId;
	}
	/**
	 * <p>Setter for the field <code>oppositeLogonId</code>.</p>
	 *
	 * @param oppositeLogonId a {@link java.lang.String} object.
	 */
	public void setOppositeLogonId(String oppositeLogonId) {
		this.oppositeLogonId = oppositeLogonId;
	}

	/**
	 * <p>Getter for the field <code>oppositeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeName() {
		return this.oppositeName;
	}
	/**
	 * <p>Setter for the field <code>oppositeName</code>.</p>
	 *
	 * @param oppositeName a {@link java.lang.String} object.
	 */
	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

	/**
	 * <p>Getter for the field <code>oppositeUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeUserId() {
		return this.oppositeUserId;
	}
	/**
	 * <p>Setter for the field <code>oppositeUserId</code>.</p>
	 *
	 * @param oppositeUserId a {@link java.lang.String} object.
	 */
	public void setOppositeUserId(String oppositeUserId) {
		this.oppositeUserId = oppositeUserId;
	}

	/**
	 * <p>Getter for the field <code>orderFrom</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderFrom() {
		return this.orderFrom;
	}
	/**
	 * <p>Setter for the field <code>orderFrom</code>.</p>
	 *
	 * @param orderFrom a {@link java.lang.String} object.
	 */
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
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
	 * <p>Getter for the field <code>orderTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderTitle() {
		return this.orderTitle;
	}
	/**
	 * <p>Setter for the field <code>orderTitle</code>.</p>
	 *
	 * @param orderTitle a {@link java.lang.String} object.
	 */
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	/**
	 * <p>Getter for the field <code>orderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderType() {
		return this.orderType;
	}
	/**
	 * <p>Setter for the field <code>orderType</code>.</p>
	 *
	 * @param orderType a {@link java.lang.String} object.
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * <p>Getter for the field <code>ownerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerLogonId() {
		return this.ownerLogonId;
	}
	/**
	 * <p>Setter for the field <code>ownerLogonId</code>.</p>
	 *
	 * @param ownerLogonId a {@link java.lang.String} object.
	 */
	public void setOwnerLogonId(String ownerLogonId) {
		this.ownerLogonId = ownerLogonId;
	}

	/**
	 * <p>Getter for the field <code>ownerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerName() {
		return this.ownerName;
	}
	/**
	 * <p>Setter for the field <code>ownerName</code>.</p>
	 *
	 * @param ownerName a {@link java.lang.String} object.
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * <p>Getter for the field <code>ownerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerUserId() {
		return this.ownerUserId;
	}
	/**
	 * <p>Setter for the field <code>ownerUserId</code>.</p>
	 *
	 * @param ownerUserId a {@link java.lang.String} object.
	 */
	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * <p>Getter for the field <code>serviceCharge</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceCharge() {
		return this.serviceCharge;
	}
	/**
	 * <p>Setter for the field <code>serviceCharge</code>.</p>
	 *
	 * @param serviceCharge a {@link java.lang.String} object.
	 */
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount() {
		return this.totalAmount;
	}
	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
