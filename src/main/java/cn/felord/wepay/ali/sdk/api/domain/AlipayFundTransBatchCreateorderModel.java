package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 如果有创建AA收款，江湖救急等业务场景的话，创建批次后，可以调用此接口创建付款单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransBatchCreateorderModel extends AlipayObject {

	private static final long serialVersionUID = 2415838645719725554L;

	/**
	 * 批次编号：创建批次时生成的批次号；表示这笔付款是这个批次下面的一条明细
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 必须是map<String,String>的json串，长度限制为100
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 金额，单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款方userId
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 付款方userId
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * token；创建批次时和批次编号一起下发的token串
	 */
	@ApiField("token")
	private String token;

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
	 * <p>Getter for the field <code>token</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return this.token;
	}
	/**
	 * <p>Setter for the field <code>token</code>.</p>
	 *
	 * @param token a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
