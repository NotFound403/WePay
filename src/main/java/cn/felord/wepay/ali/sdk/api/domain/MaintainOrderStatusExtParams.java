package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单状态扩展参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MaintainOrderStatusExtParams extends AlipayObject {

	private static final long serialVersionUID = 7823837817521524257L;

	/**
	 * 编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 快递发货商
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 快递单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 4S订单状态
	 */
	@ApiField("order_status_txt")
	private String orderStatusTxt;

	/**
	 * 收货地址
	 */
	@ApiField("receiver_addr")
	private String receiverAddr;

	/**
	 * 发货地址
	 */
	@ApiField("sender_addr")
	private String senderAddr;

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
	 * <p>Getter for the field <code>orderStatusTxt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatusTxt() {
		return this.orderStatusTxt;
	}
	/**
	 * <p>Setter for the field <code>orderStatusTxt</code>.</p>
	 *
	 * @param orderStatusTxt a {@link java.lang.String} object.
	 */
	public void setOrderStatusTxt(String orderStatusTxt) {
		this.orderStatusTxt = orderStatusTxt;
	}

	/**
	 * <p>Getter for the field <code>receiverAddr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverAddr() {
		return this.receiverAddr;
	}
	/**
	 * <p>Setter for the field <code>receiverAddr</code>.</p>
	 *
	 * @param receiverAddr a {@link java.lang.String} object.
	 */
	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
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
