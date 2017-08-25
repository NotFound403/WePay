package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商圈店铺活动信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingMallShoppromoinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3514951621315846164L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 商圈下店铺id列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * <p>Getter for the field <code>mallId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMallId() {
		return this.mallId;
	}
	/**
	 * <p>Setter for the field <code>mallId</code>.</p>
	 *
	 * @param mallId a {@link java.lang.String} object.
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
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
