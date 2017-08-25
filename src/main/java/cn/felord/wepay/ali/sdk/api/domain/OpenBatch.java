package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收单品批次
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenBatch extends AlipayObject {

	private static final long serialVersionUID = 8624552936943288181L;

	/**
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 批次状态
0，未检测
1，检测中
2，未通过
3，已通过
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/**
	 * 单品数
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * <p>Getter for the field <code>batchId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchId() {
		return this.batchId;
	}
	/**
	 * <p>Setter for the field <code>batchId</code>.</p>
	 *
	 * @param batchId a {@link java.lang.String} object.
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	/**
	 * <p>Getter for the field <code>batchStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchStatus() {
		return this.batchStatus;
	}
	/**
	 * <p>Setter for the field <code>batchStatus</code>.</p>
	 *
	 * @param batchStatus a {@link java.lang.String} object.
	 */
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	/**
	 * <p>Getter for the field <code>itemNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemNum() {
		return this.itemNum;
	}
	/**
	 * <p>Setter for the field <code>itemNum</code>.</p>
	 *
	 * @param itemNum a {@link java.lang.String} object.
	 */
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

}
