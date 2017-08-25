package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 奖品剩余数量查询
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}

	/**
	 * <p>Getter for the field <code>prizeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeId() {
		return this.prizeId;
	}
	/**
	 * <p>Setter for the field <code>prizeId</code>.</p>
	 *
	 * @param prizeId a {@link java.lang.String} object.
	 */
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

}
