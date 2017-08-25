package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 推广数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoteDataModel extends AlipayObject {

	private static final long serialVersionUID = 5476321566773131229L;

	/**
	 * 核销数
	 */
	@ApiField("checked_voucher_num")
	private Long checkedVoucherNum;

	/**
	 * 领券数
	 */
	@ApiField("claim_voucher_num")
	private Long claimVoucherNum;

	/**
	 * 分佣金额
	 */
	@ApiField("commission_amount")
	private String commissionAmount;

	/**
	 * <p>Getter for the field <code>checkedVoucherNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCheckedVoucherNum() {
		return this.checkedVoucherNum;
	}
	/**
	 * <p>Setter for the field <code>checkedVoucherNum</code>.</p>
	 *
	 * @param checkedVoucherNum a {@link java.lang.Long} object.
	 */
	public void setCheckedVoucherNum(Long checkedVoucherNum) {
		this.checkedVoucherNum = checkedVoucherNum;
	}

	/**
	 * <p>Getter for the field <code>claimVoucherNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getClaimVoucherNum() {
		return this.claimVoucherNum;
	}
	/**
	 * <p>Setter for the field <code>claimVoucherNum</code>.</p>
	 *
	 * @param claimVoucherNum a {@link java.lang.Long} object.
	 */
	public void setClaimVoucherNum(Long claimVoucherNum) {
		this.claimVoucherNum = claimVoucherNum;
	}

	/**
	 * <p>Getter for the field <code>commissionAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionAmount() {
		return this.commissionAmount;
	}
	/**
	 * <p>Setter for the field <code>commissionAmount</code>.</p>
	 *
	 * @param commissionAmount a {@link java.lang.String} object.
	 */
	public void setCommissionAmount(String commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

}
