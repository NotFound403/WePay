package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑权益发放接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignBenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 1146556576681874294L;

	/**
	 * 领券渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 优惠类型
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 触发权益的优惠id，当discount_type是ITEM的时候这个内容是商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部流水号，用于控制幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 领券的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>channel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannel() {
		return this.channel;
	}
	/**
	 * <p>Setter for the field <code>channel</code>.</p>
	 *
	 * @param channel a {@link java.lang.String} object.
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * <p>Getter for the field <code>discountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountType() {
		return this.discountType;
	}
	/**
	 * <p>Setter for the field <code>discountType</code>.</p>
	 *
	 * @param discountType a {@link java.lang.String} object.
	 */
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
