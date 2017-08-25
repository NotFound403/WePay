package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 社区物业物业费账单明细条目列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CPAliveBillEntrySet extends AlipayObject {

	private static final long serialVersionUID = 8129631443115971494L;

	/**
	 * 物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 未能删除的账单明细条目状态，状态值：
FINISH_PAYMENT - 用户完成支付和销账
UNDER_PAYMENT - 账单锁定待用户完成支付
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>billEntryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillEntryId() {
		return this.billEntryId;
	}
	/**
	 * <p>Setter for the field <code>billEntryId</code>.</p>
	 *
	 * @param billEntryId a {@link java.lang.String} object.
	 */
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
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
