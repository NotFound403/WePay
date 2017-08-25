package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 单个主记录+对应资金明细信息模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SingleFundDetailItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 7612667549142118633L;

	/**
	 * 批次资金明细模型列表
	 */
	@ApiListField("batch_fund_item_model_list")
	@ApiField("batch_fund_item_a_o_p_model")
	private List<BatchFundItemAOPModel> batchFundItemModelList;

	/**
	 * 消费记录主记录
	 */
	@ApiField("consume_record")
	private ConsumeRecordAOPModel consumeRecord;

	/**
	 * <p>Getter for the field <code>batchFundItemModelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BatchFundItemAOPModel> getBatchFundItemModelList() {
		return this.batchFundItemModelList;
	}
	/**
	 * <p>Setter for the field <code>batchFundItemModelList</code>.</p>
	 *
	 * @param batchFundItemModelList a {@link java.util.List} object.
	 */
	public void setBatchFundItemModelList(List<BatchFundItemAOPModel> batchFundItemModelList) {
		this.batchFundItemModelList = batchFundItemModelList;
	}

	/**
	 * <p>Getter for the field <code>consumeRecord</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ConsumeRecordAOPModel} object.
	 */
	public ConsumeRecordAOPModel getConsumeRecord() {
		return this.consumeRecord;
	}
	/**
	 * <p>Setter for the field <code>consumeRecord</code>.</p>
	 *
	 * @param consumeRecord a {@link cn.felord.wepay.ali.sdk.api.domain.ConsumeRecordAOPModel} object.
	 */
	public void setConsumeRecord(ConsumeRecordAOPModel consumeRecord) {
		this.consumeRecord = consumeRecord;
	}

}
