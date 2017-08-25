package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.recommend.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileRecommendGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6415631924288996752L;

	/** 
	 * 推荐结果的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 推荐结果集合, json数组对象, 每个元素至少包含entity_id的属性,其他属性由推荐方案决定。
	 */
	@ApiField("items")
	private String items;

	/** 
	 * 本次推荐的唯一标识
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo( ) {
		return this.extInfo;
	}

	/**
	 * <p>Setter for the field <code>items</code>.</p>
	 *
	 * @param items a {@link java.lang.String} object.
	 */
	public void setItems(String items) {
		this.items = items;
	}
	/**
	 * <p>Getter for the field <code>items</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItems( ) {
		return this.items;
	}

	/**
	 * <p>Setter for the field <code>recommendId</code>.</p>
	 *
	 * @param recommendId a {@link java.lang.String} object.
	 */
	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	/**
	 * <p>Getter for the field <code>recommendId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecommendId( ) {
		return this.recommendId;
	}

}
