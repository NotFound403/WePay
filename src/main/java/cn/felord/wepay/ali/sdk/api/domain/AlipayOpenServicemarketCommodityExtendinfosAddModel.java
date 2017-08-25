package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 服务插件扩展信息补充
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketCommodityExtendinfosAddModel extends AlipayObject {

	private static final long serialVersionUID = 6827568451868198553L;

	/**
	 * 公服扩展信息列表
	 */
	@ApiListField("commodity_ext_infos")
	@ApiField("commodity_public_ext_infos")
	private List<CommodityPublicExtInfos> commodityExtInfos;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 应用ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>commodityExtInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CommodityPublicExtInfos> getCommodityExtInfos() {
		return this.commodityExtInfos;
	}
	/**
	 * <p>Setter for the field <code>commodityExtInfos</code>.</p>
	 *
	 * @param commodityExtInfos a {@link java.util.List} object.
	 */
	public void setCommodityExtInfos(List<CommodityPublicExtInfos> commodityExtInfos) {
		this.commodityExtInfos = commodityExtInfos;
	}

	/**
	 * <p>Getter for the field <code>commodityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityId() {
		return this.commodityId;
	}
	/**
	 * <p>Setter for the field <code>commodityId</code>.</p>
	 *
	 * @param commodityId a {@link java.lang.String} object.
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
