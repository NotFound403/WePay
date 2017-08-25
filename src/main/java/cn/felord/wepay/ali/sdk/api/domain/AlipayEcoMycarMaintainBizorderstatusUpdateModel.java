package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单状态变更通知接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainBizorderstatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8392737968843736744L;

	/**
	 * 支付宝交易流水号
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * ISV订单业务状态文案，车主平台状态和ISV订单状态存在差异时，记录ISV对应的业务状态。
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 行业类目标识
洗车-015；保养-016；4S-020
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 物流公司编号。支付宝支持物流公司编号。具体查看 
支付宝支持物流公司编码.zip。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流公司名称。支付宝支付物流公司名称。具体查看 支付宝支持物流公司编码.zip。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 流单号， ISV上传商品物流单号，用于物流流水的查询。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 车主平台业务订单状态
1-未支付；
4-已关闭；
6-支付完成；
7-已出库；
8-已收货； 
11-服务开始；
55-服务完成/已核销；
56-订单完成；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付宝账号
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 支付时间yyyy-MM-dd HH:mm:ss
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 订单发货地址。记录订单发货的详细地址。省^^^市^^^区^^^详细地址。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("sender_addr")
	private String senderAddr;

	/**
	 * <p>Getter for the field <code>alipayTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	/**
	 * <p>Setter for the field <code>alipayTradeNo</code>.</p>
	 *
	 * @param alipayTradeNo a {@link java.lang.String} object.
	 */
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	/**
	 * <p>Getter for the field <code>bizStatusTxt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}
	/**
	 * <p>Setter for the field <code>bizStatusTxt</code>.</p>
	 *
	 * @param bizStatusTxt a {@link java.lang.String} object.
	 */
	public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

	/**
	 * <p>Getter for the field <code>industryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndustryCode() {
		return this.industryCode;
	}
	/**
	 * <p>Setter for the field <code>industryCode</code>.</p>
	 *
	 * @param industryCode a {@link java.lang.String} object.
	 */
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	/**
	 * <p>Getter for the field <code>logisticsCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	/**
	 * <p>Setter for the field <code>logisticsCode</code>.</p>
	 *
	 * @param logisticsCode a {@link java.lang.String} object.
	 */
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	/**
	 * <p>Getter for the field <code>logisticsCompany</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	/**
	 * <p>Setter for the field <code>logisticsCompany</code>.</p>
	 *
	 * @param logisticsCompany a {@link java.lang.String} object.
	 */
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	/**
	 * <p>Getter for the field <code>logisticsNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	/**
	 * <p>Setter for the field <code>logisticsNo</code>.</p>
	 *
	 * @param logisticsNo a {@link java.lang.String} object.
	 */
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
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
	 * <p>Getter for the field <code>payAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAccount() {
		return this.payAccount;
	}
	/**
	 * <p>Setter for the field <code>payAccount</code>.</p>
	 *
	 * @param payAccount a {@link java.lang.String} object.
	 */
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	/**
	 * <p>Getter for the field <code>payTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayTime() {
		return this.payTime;
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
	 * <p>Getter for the field <code>senderAddr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSenderAddr() {
		return this.senderAddr;
	}
	/**
	 * <p>Setter for the field <code>senderAddr</code>.</p>
	 *
	 * @param senderAddr a {@link java.lang.String} object.
	 */
	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
