package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询广告接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingAdvertisingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6198447585713338558L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * <p>Getter for the field <code>adId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdId() {
		return this.adId;
	}
	/**
	 * <p>Setter for the field <code>adId</code>.</p>
	 *
	 * @param adId a {@link java.lang.String} object.
	 */
	public void setAdId(String adId) {
		this.adId = adId;
	}

}
