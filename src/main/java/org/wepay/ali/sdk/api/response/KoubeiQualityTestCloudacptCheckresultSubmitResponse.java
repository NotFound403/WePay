package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.checkresult.submit response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-15 15:06:55
 */
public class KoubeiQualityTestCloudacptCheckresultSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5475839853874149549L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次
	 */
	@ApiField("batch_id")
	private String batchId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

}
