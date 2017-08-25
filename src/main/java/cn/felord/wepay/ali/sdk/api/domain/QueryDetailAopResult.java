package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 明细的查询结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryDetailAopResult extends AlipayObject {

	private static final long serialVersionUID = 1763363383974364482L;

	/**
	 * 批次编号；此单据对应的批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 明细编号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 扩展属性；创建付款单时传入的数据
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 失败原因：在status为fail时此字段不为空
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 明细最后一次变更的时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 收／付款金额；单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款人userId
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 付款人userId
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * 服务费，单位为元
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 批次明细状态；注：AVAILABLE：可付款；SUCCESS：付款成功；FAIL：失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>batchNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNo() {
		return this.batchNo;
	}
	/**
	 * <p>Setter for the field <code>batchNo</code>.</p>
	 *
	 * @param batchNo a {@link java.lang.String} object.
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * <p>Getter for the field <code>detailNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetailNo() {
		return this.detailNo;
	}
	/**
	 * <p>Setter for the field <code>detailNo</code>.</p>
	 *
	 * @param detailNo a {@link java.lang.String} object.
	 */
	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	/**
	 * <p>Getter for the field <code>extParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParam() {
		return this.extParam;
	}
	/**
	 * <p>Setter for the field <code>extParam</code>.</p>
	 *
	 * @param extParam a {@link java.lang.String} object.
	 */
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	/**
	 * <p>Getter for the field <code>failMessage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFailMessage() {
		return this.failMessage;
	}
	/**
	 * <p>Setter for the field <code>failMessage</code>.</p>
	 *
	 * @param failMessage a {@link java.lang.String} object.
	 */
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	/**
	 * <p>Getter for the field <code>lastModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getLastModified() {
		return this.lastModified;
	}
	/**
	 * <p>Setter for the field <code>lastModified</code>.</p>
	 *
	 * @param lastModified a {@link java.util.Date} object.
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
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
	 * <p>Getter for the field <code>payeeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeId() {
		return this.payeeId;
	}
	/**
	 * <p>Setter for the field <code>payeeId</code>.</p>
	 *
	 * @param payeeId a {@link java.lang.String} object.
	 */
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	/**
	 * <p>Getter for the field <code>payerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerId() {
		return this.payerId;
	}
	/**
	 * <p>Setter for the field <code>payerId</code>.</p>
	 *
	 * @param payerId a {@link java.lang.String} object.
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
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

}
