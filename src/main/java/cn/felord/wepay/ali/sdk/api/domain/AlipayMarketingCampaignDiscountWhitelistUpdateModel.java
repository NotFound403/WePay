package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 优惠活动白名单设置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignDiscountWhitelistUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8826743282189142834L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 白名单。逗号分隔开
	 */
	@ApiField("user_white_list")
	private String userWhiteList;

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
	}

	/**
	 * <p>Getter for the field <code>userWhiteList</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserWhiteList() {
		return this.userWhiteList;
	}
	/**
	 * <p>Setter for the field <code>userWhiteList</code>.</p>
	 *
	 * @param userWhiteList a {@link java.lang.String} object.
	 */
	public void setUserWhiteList(String userWhiteList) {
		this.userWhiteList = userWhiteList;
	}

}
