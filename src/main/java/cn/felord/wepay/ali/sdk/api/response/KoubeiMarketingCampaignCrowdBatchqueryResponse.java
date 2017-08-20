package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-15 16:30:54
 */
public class KoubeiMarketingCampaignCrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6493854575443363137L;

	/** 
	 * 人群组的基本信息，id表示人群分组的ID，name表示人群分组的名称，status表示人群分组的状态，目前只有status=ENABLE有效状态才返回，已经删除的为DISABLE的不返回
	 */
	@ApiField("crowd_group_sets")
	private String crowdGroupSets;

	/** 
	 * 返回接记录的总条数
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setCrowdGroupSets(String crowdGroupSets) {
		this.crowdGroupSets = crowdGroupSets;
	}
	public String getCrowdGroupSets( ) {
		return this.crowdGroupSets;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
