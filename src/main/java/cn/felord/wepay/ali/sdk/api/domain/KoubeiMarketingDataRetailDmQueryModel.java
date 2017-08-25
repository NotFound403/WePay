package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 快消店铺DM浏览数据查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataRetailDmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6666559769513313672L;

	/**
	 * 内容ID，调用koubei.marketing.campaign.retail.dm.create创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 门店ID
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

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

	/**
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds() {
		return this.shopIds;
	}
	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.util.List} object.
	 */
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
