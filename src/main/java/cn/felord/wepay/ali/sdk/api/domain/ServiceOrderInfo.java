package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 到位服务订单信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ServiceOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 6511664648677796545L;

	/**
	 * 服务总金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品服务所在类目的id
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 订单创建时间，格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 订单修改时间，格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 订单最后支付时间，格式：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/**
	 * 订单最后退款时间，格式：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 消费者标注订单备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 第三方服务id
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 商品的商家端端SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 第三方服务者id列表，例子：
[“2323”,…]，如果没有服务者，则为[]
	 */
	@ApiListField("out_sp_id")
	@ApiField("string")
	private List<String> outSpId;

	/**
	 * 服务已付金额，单位为元
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 单价，单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 份数
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 服务实际金额，单位为元
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 订单退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 到位的服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务订单号
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

	/**
	 * 商品的内部SKU ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 商品价格单位
	 */
	@ApiField("unit")
	private String unit;

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
	 * <p>Getter for the field <code>categoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryCode() {
		return this.categoryCode;
	}
	/**
	 * <p>Setter for the field <code>categoryCode</code>.</p>
	 *
	 * @param categoryCode a {@link java.lang.String} object.
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtModified() {
		return this.gmtModified;
	}
	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.lang.String} object.
	 */
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * <p>Getter for the field <code>gmtPayment</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtPayment() {
		return this.gmtPayment;
	}
	/**
	 * <p>Setter for the field <code>gmtPayment</code>.</p>
	 *
	 * @param gmtPayment a {@link java.lang.String} object.
	 */
	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

	/**
	 * <p>Getter for the field <code>gmtRefund</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtRefund() {
		return this.gmtRefund;
	}
	/**
	 * <p>Setter for the field <code>gmtRefund</code>.</p>
	 *
	 * @param gmtRefund a {@link java.lang.String} object.
	 */
	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
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
	 * <p>Getter for the field <code>outServiceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutServiceId() {
		return this.outServiceId;
	}
	/**
	 * <p>Setter for the field <code>outServiceId</code>.</p>
	 *
	 * @param outServiceId a {@link java.lang.String} object.
	 */
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	/**
	 * <p>Getter for the field <code>outSkuId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSkuId() {
		return this.outSkuId;
	}
	/**
	 * <p>Setter for the field <code>outSkuId</code>.</p>
	 *
	 * @param outSkuId a {@link java.lang.String} object.
	 */
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	/**
	 * <p>Getter for the field <code>outSpId</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getOutSpId() {
		return this.outSpId;
	}
	/**
	 * <p>Setter for the field <code>outSpId</code>.</p>
	 *
	 * @param outSpId a {@link java.util.List} object.
	 */
	public void setOutSpId(List<String> outSpId) {
		this.outSpId = outSpId;
	}

	/**
	 * <p>Getter for the field <code>paymentAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	/**
	 * <p>Setter for the field <code>paymentAmount</code>.</p>
	 *
	 * @param paymentAmount a {@link java.lang.String} object.
	 */
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.String} object.
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getQuantity() {
		return this.quantity;
	}
	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a {@link java.lang.Long} object.
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 * <p>Getter for the field <code>realAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealAmount() {
		return this.realAmount;
	}
	/**
	 * <p>Setter for the field <code>realAmount</code>.</p>
	 *
	 * @param realAmount a {@link java.lang.String} object.
	 */
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	/**
	 * <p>Getter for the field <code>refundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundAmount() {
		return this.refundAmount;
	}
	/**
	 * <p>Setter for the field <code>refundAmount</code>.</p>
	 *
	 * @param refundAmount a {@link java.lang.String} object.
	 */
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * <p>Getter for the field <code>serviceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceId() {
		return this.serviceId;
	}
	/**
	 * <p>Setter for the field <code>serviceId</code>.</p>
	 *
	 * @param serviceId a {@link java.lang.String} object.
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * <p>Getter for the field <code>serviceOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}
	/**
	 * <p>Setter for the field <code>serviceOrderNo</code>.</p>
	 *
	 * @param serviceOrderNo a {@link java.lang.String} object.
	 */
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

	/**
	 * <p>Getter for the field <code>skuId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSkuId() {
		return this.skuId;
	}
	/**
	 * <p>Setter for the field <code>skuId</code>.</p>
	 *
	 * @param skuId a {@link java.lang.String} object.
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	/**
	 * <p>Getter for the field <code>unit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnit() {
		return this.unit;
	}
	/**
	 * <p>Setter for the field <code>unit</code>.</p>
	 *
	 * @param unit a {@link java.lang.String} object.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
