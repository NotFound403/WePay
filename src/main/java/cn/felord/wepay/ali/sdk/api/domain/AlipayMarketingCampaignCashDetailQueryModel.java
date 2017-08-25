package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 现金活动详情查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3373754536934294764L;

	/**
	 * 要查询的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

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
