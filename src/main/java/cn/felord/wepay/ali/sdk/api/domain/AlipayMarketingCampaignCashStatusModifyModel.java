package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 更改现金活动状态
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6671839235317498631L;

	/**
	 * 修改后的活动状态, PAUSE或者READY或者CLOSED
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 要修改的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * <p>Getter for the field <code>campStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStatus() {
		return this.campStatus;
	}
	/**
	 * <p>Setter for the field <code>campStatus</code>.</p>
	 *
	 * @param campStatus a {@link java.lang.String} object.
	 */
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	/**
	 * <p>Getter for the field <code>crowdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdNo() {
		return this.crowdNo;
	}
	/**
	 * <p>Setter for the field <code>crowdNo</code>.</p>
	 *
	 * @param crowdNo a {@link java.lang.String} object.
	 */
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
