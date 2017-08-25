package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 提供给ISV和开发者查询广告的接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpAdvertiseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5649336638758483664L;

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
