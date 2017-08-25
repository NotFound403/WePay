package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组详情查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignCrowdDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4666647814418374834L;

	/**
	 * 人群组ID，人群组创建成功时返回的ID
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * <p>Getter for the field <code>crowdGroupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCrowdGroupId() {
		return this.crowdGroupId;
	}
	/**
	 * <p>Setter for the field <code>crowdGroupId</code>.</p>
	 *
	 * @param crowdGroupId a {@link java.lang.String} object.
	 */
	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

}
