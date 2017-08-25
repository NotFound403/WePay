package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.OpenBatch;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.batch.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiQualityTestCloudacptBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2779693542226588283L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次列表
	 */
	@ApiListField("batch_list")
	@ApiField("open_batch")
	private List<OpenBatch> batchList;

	/** 
	 * 单品批次数
	 */
	@ApiField("batch_num")
	private String batchNum;

	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.String} object.
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityId( ) {
		return this.activityId;
	}

	/**
	 * <p>Setter for the field <code>batchList</code>.</p>
	 *
	 * @param batchList a {@link java.util.List} object.
	 */
	public void setBatchList(List<OpenBatch> batchList) {
		this.batchList = batchList;
	}
	/**
	 * <p>Getter for the field <code>batchList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenBatch> getBatchList( ) {
		return this.batchList;
	}

	/**
	 * <p>Setter for the field <code>batchNum</code>.</p>
	 *
	 * @param batchNum a {@link java.lang.String} object.
	 */
	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}
	/**
	 * <p>Getter for the field <code>batchNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNum( ) {
		return this.batchNum;
	}

}
