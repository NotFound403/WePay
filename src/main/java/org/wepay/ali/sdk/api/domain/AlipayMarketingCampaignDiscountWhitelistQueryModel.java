package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 优惠活动白名单查询
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:48:04
 */
public class AlipayMarketingCampaignDiscountWhitelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3239134553978876425L;

	/**
	 * 活动od
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
