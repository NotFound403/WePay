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
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>campSets</code>.</p>
	 *
	 * @param campSets a {@link java.util.List} object.
	 */
	public void setCampSets(List<CampBaseDto> campSets) {
		this.campSets = campSets;
	}
	/**
	 * <p>Getter for the field <code>campSets</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CampBaseDto> getCampSets( ) {
		return this.campSets;
	}

	/**
	 * <p>Setter for the field <code>totalNumber</code>.</p>
	 *
	 * @param totalNumber a {@link java.lang.String} object.
	 */
	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	/**
	 * <p>Getter for the field <code>totalNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
