package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CampBaseDto;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-13 11:44:45
 */
public class KoubeiMarketingCampaignActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2856645515841914269L;

	/** 
	 * 活动列表
	 */
	@ApiListField("camp_sets")
	@ApiField("camp_base_dto")
	private List<CampBaseDto> campSets;

	/** 
	 * 总数量
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setCampSets(List<CampBaseDto> campSets) {
		this.campSets = campSets;
	}
	public List<CampBaseDto> getCampSets( ) {
		return this.campSets;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
