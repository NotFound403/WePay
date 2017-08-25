package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑外部投放授权领券接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertDeliveryItemApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4372527988758782338L;

	/**
	 * 领券时触发的id，在外投场景下，用的是广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道编号，适用于媒体类发券
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 适用于在推广者主站上注册的渠道编号
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 外部流水号，用于区别每次请求的流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券推荐时输出给合作伙伴的id，需要在领券的时候传回来
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/**
	 * 领取优惠的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 推广参与打标(无实际业务作用，后期可供ISV分析不同渠道的推广效能)
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * <p>Getter for the field <code>advId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdvId() {
		return this.advId;
	}
	/**
	 * <p>Setter for the field <code>advId</code>.</p>
	 *
	 * @param advId a {@link java.lang.String} object.
	 */
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	/**
	 * <p>Getter for the field <code>channelCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelCode() {
		return this.channelCode;
	}
	/**
	 * <p>Setter for the field <code>channelCode</code>.</p>
	 *
	 * @param channelCode a {@link java.lang.String} object.
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * <p>Getter for the field <code>channelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelId() {
		return this.channelId;
	}
	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a {@link java.lang.String} object.
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>recommendId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecommendId() {
		return this.recommendId;
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
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>tag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTag() {
		return this.tag;
	}
	/**
	 * <p>Setter for the field <code>tag</code>.</p>
	 *
	 * @param tag a {@link java.lang.String} object.
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

}
