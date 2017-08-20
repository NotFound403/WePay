package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动查询
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:15
 */
public class AlipayMarketingCampaignDrawcampQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1537335417811587248L;

	/**
	 * 抽奖活动id，通过alipay.marketing.campaign.drawcamp.create接口返回
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
