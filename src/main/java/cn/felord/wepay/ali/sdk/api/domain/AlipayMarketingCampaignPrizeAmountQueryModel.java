package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 奖品剩余数量查询
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:01
 */
public class AlipayMarketingCampaignPrizeAmountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5266272212529791823L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

}
