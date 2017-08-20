package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 优惠活动查看
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class AlipayMarketingCampaignDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3135678514861845979L;

	/**
	 * 活动id
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
