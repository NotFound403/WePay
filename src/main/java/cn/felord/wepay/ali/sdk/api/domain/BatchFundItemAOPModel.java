package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 批次资金模型。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BatchFundItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 6454238147522927574L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private Long batchNo;

	/**
	 * 退款到银行卡处理中的总金额
	 */
	@ApiField("dback_refundtobank_processing_batch_amount")
	private String dbackRefundtobankProcessingBatchAmount;

	/**
	 * 退款到银行卡成功的总金额
	 */
	@ApiField("dback_refundtobank_success_batch_amount")
	private String dbackRefundtobankSuccessBatchAmount;

	/**
	 * 资金明细列表
	 */
	@ApiListField("fund_item_list")
	@ApiField("fund_item_a_o_p_model")
	private List<FundItemAOPModel> fundItemList;

	/**
	 * 批次创建时间
	 */
	@ApiField("gmt_biz_create_date")
	private Date gmtBizCreateDate;

	/**
	 * 资金单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 包含服务费的总金额
	 */
	@ApiField("total_amount_with_service_fee")
	private String totalAmountWithServiceFee;

	/**
	 * <p>Getter for the field <code>batchNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBatchNo() {
		return this.batchNo;
	}
	/**
	 * <p>Setter for the field <code>batchNo</code>.</p>
	 *
	 * @param batchNo a {@link java.lang.Long} object.
	 */
	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * <p>Getter for the field <code>dbackRefundtobankProcessingBatchAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackRefundtobankProcessingBatchAmount() {
		return this.dbackRefundtobankProcessingBatchAmount;
	}
	/**
	 * <p>Setter for the field <code>dbackRefundtobankProcessingBatchAmount</code>.</p>
	 *
	 * @param dbackRefundtobankProcessingBatchAmount a {@link java.lang.String} object.
	 */
	public void setDbackRefundtobankProcessingBatchAmount(String dbackRefundtobankProcessingBatchAmount) {
		this.dbackRefundtobankProcessingBatchAmount = dbackRefundtobankProcessingBatchAmount;
	}

	/**
	 * <p>Getter for the field <code>dbackRefundtobankSuccessBatchAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackRefundtobankSuccessBatchAmount() {
		return this.dbackRefundtobankSuccessBatchAmount;
	}
	/**
	 * <p>Setter for the field <code>dbackRefundtobankSuccessBatchAmount</code>.</p>
	 *
	 * @param dbackRefundtobankSuccessBatchAmount a {@link java.lang.String} object.
	 */
	public void setDbackRefundtobankSuccessBatchAmount(String dbackRefundtobankSuccessBatchAmount) {
		this.dbackRefundtobankSuccessBatchAmount = dbackRefundtobankSuccessBatchAmount;
	}

	/**
	 * <p>Getter for the field <code>fundItemList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FundItemAOPModel> getFundItemList() {
		return this.fundItemList;
	}
	/**
	 * <p>Setter for the field <code>fundItemList</code>.</p>
	 *
	 * @param fundItemList a {@link java.util.List} object.
	 */
	public void setFundItemList(List<FundItemAOPModel> fundItemList) {
		this.fundItemList = fundItemList;
	}

	/**
	 * <p>Getter for the field <code>gmtBizCreateDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtBizCreateDate() {
		return this.gmtBizCreateDate;
	}
	/**
	 * <p>Setter for the field <code>gmtBizCreateDate</code>.</p>
	 *
	 * @param gmtBizCreateDate a {@link java.util.Date} object.
	 */
	public void setGmtBizCreateDate(Date gmtBizCreateDate) {
		this.gmtBizCreateDate = gmtBizCreateDate;
	}

	/**
	 * <p>Getter for the field <code>orderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderId() {
		return this.orderId;
	}
	/**
	 * <p>Setter for the field <code>orderId</code>.</p>
	 *
	 * @param orderId a {@link java.lang.String} object.
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	/**
	 * <p>Getter for the field <code>totalAmountWithServiceFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmountWithServiceFee() {
		return this.totalAmountWithServiceFee;
	}
	/**
	 * <p>Setter for the field <code>totalAmountWithServiceFee</code>.</p>
	 *
	 * @param totalAmountWithServiceFee a {@link java.lang.String} object.
	 */
	public void setTotalAmountWithServiceFee(String totalAmountWithServiceFee) {
		this.totalAmountWithServiceFee = totalAmountWithServiceFee;
	}

}
