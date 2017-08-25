package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险发票申请项目明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsInvoiceApplyItem extends AlipayObject {

	private static final long serialVersionUID = 2338724489469279585L;

	/**
	 * 申请发票开票维度;BUSINESS_ORDER:业务单;
	 */
	@ApiField("apply_scope")
	private String applyScope;

	/**
	 * 费用类型;PREMIUM:保费;
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 业务单号;apply_scope为BUSINESS_ORDER时必填;
	 */
	@ApiField("ins_biz_no")
	private String insBizNo;

	/**
	 * 业务单类型;APPLICATION:投保订单;POLICY:保单;ENDORSEMENT:批单;RECOVERY;追偿单.
apply_scope为BUSINESS_ORDER时必填;
	 */
	@ApiField("ins_biz_type")
	private String insBizType;

	/**
	 * <p>Getter for the field <code>applyScope</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyScope() {
		return this.applyScope;
	}
	/**
	 * <p>Setter for the field <code>applyScope</code>.</p>
	 *
	 * @param applyScope a {@link java.lang.String} object.
	 */
	public void setApplyScope(String applyScope) {
		this.applyScope = applyScope;
	}

	/**
	 * <p>Getter for the field <code>expenseType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpenseType() {
		return this.expenseType;
	}
	/**
	 * <p>Setter for the field <code>expenseType</code>.</p>
	 *
	 * @param expenseType a {@link java.lang.String} object.
	 */
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	/**
	 * <p>Getter for the field <code>insBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInsBizNo() {
		return this.insBizNo;
	}
	/**
	 * <p>Setter for the field <code>insBizNo</code>.</p>
	 *
	 * @param insBizNo a {@link java.lang.String} object.
	 */
	public void setInsBizNo(String insBizNo) {
		this.insBizNo = insBizNo;
	}

	/**
	 * <p>Getter for the field <code>insBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInsBizType() {
		return this.insBizType;
	}
	/**
	 * <p>Setter for the field <code>insBizType</code>.</p>
	 *
	 * @param insBizType a {@link java.lang.String} object.
	 */
	public void setInsBizType(String insBizType) {
		this.insBizType = insBizType;
	}

}
