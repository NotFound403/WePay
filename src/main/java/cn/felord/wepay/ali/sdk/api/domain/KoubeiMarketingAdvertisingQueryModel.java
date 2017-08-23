package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询广告接口
 *
 * @author auto create
 * @since 1.0, 2017-04-18 11:55:21
 */
public class KoubeiMarketingAdvertisingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6198447585713338558L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

}