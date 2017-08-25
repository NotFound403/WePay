package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 广告投放优惠模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 5762365494418971223L;

	/**
	 * 全场代金的门槛金额
	 */
	@ApiField("apply_condition")
	private String applyCondition;

	/**
	 * 买M送N的描述
	 */
	@ApiField("buy_send_desc")
	private String buySendDesc;

	/**
	 * 折扣率
仅当券类型为折扣券时有效
有效折扣率取值范围0.11-0.99
仅允许保留小数点后两位
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 最近店铺离当前用户的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 优惠结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 券的图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 优惠id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品的一些标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * 减至券的原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("per_price")
	private String perPrice;

	/**
	 * 当券类型是代金券的时候，这个字段代表实际金额；当券类型是减至券的时候，这个字段代表减至到的金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 券推荐语
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 买A送B中，B的描述
	 */
	@ApiField("send_item_name")
	private String sendItemName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 券的店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 已领数
	 */
	@ApiField("sold")
	private String sold;

	/**
	 * 优惠开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("threshold_price")
	private String thresholdPrice;

	/**
	 * 每满减用的字段：每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("top_price")
	private String topPrice;

	/**
	 * 目前有discount:折扣券;cash:代金券;exchange:兑换券;limit_reduce_cash:减至券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券二级类型。all_discount:全场折扣;single_discount:单品折扣;all_cash:全场代金;single_cash：单品代金
	 */
	@ApiField("vol_type")
	private String volType;

	/**
	 * <p>Getter for the field <code>applyCondition</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyCondition() {
		return this.applyCondition;
	}
	/**
	 * <p>Setter for the field <code>applyCondition</code>.</p>
	 *
	 * @param applyCondition a {@link java.lang.String} object.
	 */
	public void setApplyCondition(String applyCondition) {
		this.applyCondition = applyCondition;
	}

	/**
	 * <p>Getter for the field <code>buySendDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuySendDesc() {
		return this.buySendDesc;
	}
	/**
	 * <p>Setter for the field <code>buySendDesc</code>.</p>
	 *
	 * @param buySendDesc a {@link java.lang.String} object.
	 */
	public void setBuySendDesc(String buySendDesc) {
		this.buySendDesc = buySendDesc;
	}

	/**
	 * <p>Getter for the field <code>discount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscount() {
		return this.discount;
	}
	/**
	 * <p>Setter for the field <code>discount</code>.</p>
	 *
	 * @param discount a {@link java.lang.String} object.
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/**
	 * <p>Getter for the field <code>distance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistance() {
		return this.distance;
	}
	/**
	 * <p>Setter for the field <code>distance</code>.</p>
	 *
	 * @param distance a {@link java.lang.String} object.
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.lang.String} object.
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>imageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}
	/**
	 * <p>Setter for the field <code>imageUrl</code>.</p>
	 *
	 * @param imageUrl a {@link java.lang.String} object.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
	 * <p>Getter for the field <code>itemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemName() {
		return this.itemName;
	}
	/**
	 * <p>Setter for the field <code>itemName</code>.</p>
	 *
	 * @param itemName a {@link java.lang.String} object.
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * <p>Getter for the field <code>label</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabel() {
		return this.label;
	}
	/**
	 * <p>Setter for the field <code>label</code>.</p>
	 *
	 * @param label a {@link java.lang.String} object.
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * <p>Getter for the field <code>originalPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalPrice() {
		return this.originalPrice;
	}
	/**
	 * <p>Setter for the field <code>originalPrice</code>.</p>
	 *
	 * @param originalPrice a {@link java.lang.String} object.
	 */
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	/**
	 * <p>Getter for the field <code>perPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPerPrice() {
		return this.perPrice;
	}
	/**
	 * <p>Setter for the field <code>perPrice</code>.</p>
	 *
	 * @param perPrice a {@link java.lang.String} object.
	 */
	public void setPerPrice(String perPrice) {
		this.perPrice = perPrice;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.String} object.
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * <p>Getter for the field <code>reason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReason() {
		return this.reason;
	}
	/**
	 * <p>Setter for the field <code>reason</code>.</p>
	 *
	 * @param reason a {@link java.lang.String} object.
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * <p>Getter for the field <code>sendItemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendItemName() {
		return this.sendItemName;
	}
	/**
	 * <p>Setter for the field <code>sendItemName</code>.</p>
	 *
	 * @param sendItemName a {@link java.lang.String} object.
	 */
	public void setSendItemName(String sendItemName) {
		this.sendItemName = sendItemName;
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
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * <p>Setter for the field <code>shopName</code>.</p>
	 *
	 * @param shopName a {@link java.lang.String} object.
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * <p>Getter for the field <code>sold</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSold() {
		return this.sold;
	}
	/**
	 * <p>Setter for the field <code>sold</code>.</p>
	 *
	 * @param sold a {@link java.lang.String} object.
	 */
	public void setSold(String sold) {
		this.sold = sold;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>thresholdPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThresholdPrice() {
		return this.thresholdPrice;
	}
	/**
	 * <p>Setter for the field <code>thresholdPrice</code>.</p>
	 *
	 * @param thresholdPrice a {@link java.lang.String} object.
	 */
	public void setThresholdPrice(String thresholdPrice) {
		this.thresholdPrice = thresholdPrice;
	}

	/**
	 * <p>Getter for the field <code>topPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTopPrice() {
		return this.topPrice;
	}
	/**
	 * <p>Setter for the field <code>topPrice</code>.</p>
	 *
	 * @param topPrice a {@link java.lang.String} object.
	 */
	public void setTopPrice(String topPrice) {
		this.topPrice = topPrice;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>volType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVolType() {
		return this.volType;
	}
	/**
	 * <p>Setter for the field <code>volType</code>.</p>
	 *
	 * @param volType a {@link java.lang.String} object.
	 */
	public void setVolType(String volType) {
		this.volType = volType;
	}

}
