package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云验收单品批次
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
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

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchStatus() {
		return this.batchStatus;
	}
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

}
