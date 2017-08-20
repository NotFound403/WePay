package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 提交审核确认
 *
 * @author auto create
 * @since 1.0, 2016-12-22 23:46:41
 */
public class AlipayOpenServicemarketCommodityAuditConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3348312938899292967L;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
