package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignRetailDmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2772237976779229588L;

	/**
	 * 内容id，通过调用koubei.marketing.campaign.retail.dm.create接口创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * <p>Getter for the field <code>contentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentId() {
		return this.contentId;
	}
	/**
	 * <p>Setter for the field <code>contentId</code>.</p>
	 *
	 * @param contentId a {@link java.lang.String} object.
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
