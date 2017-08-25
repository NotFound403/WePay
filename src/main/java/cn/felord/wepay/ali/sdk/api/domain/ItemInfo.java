package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券的单品信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ItemInfo extends AlipayObject {

	private static final long serialVersionUID = 8818397684186455512L;

	/**
	 * 券适用的单品码列表
最少配置1个单品码
最多配置500个单品码
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 单品图片列表
单品图片不能超过3张
	 */
	@ApiListField("item_imgs")
	@ApiField("string")
	private List<String> itemImgs;

	/**
	 * 单品券详细介绍跳转链接
	 */
	@ApiField("item_link")
	private String itemLink;

	/**
	 * 单品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单品券说明
	 */
	@ApiField("item_text")
	private String itemText;

	/**
	 * 最高优惠商品件数
	 */
	@ApiField("max_discount_num")
	private String maxDiscountNum;

	/**
	 * 最低购买商品件数
	 */
	@ApiField("min_consume_num")
	private String minConsumeNum;

	/**
	 * 单品的原价，单位元
必须为合法金额类型字符串，如9.99
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * <p>Getter for the field <code>itemIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getItemIds() {
		return this.itemIds;
	}
	/**
	 * <p>Setter for the field <code>itemIds</code>.</p>
	 *
	 * @param itemIds a {@link java.util.List} object.
	 */
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	/**
	 * <p>Getter for the field <code>itemImgs</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getItemImgs() {
		return this.itemImgs;
	}
	/**
	 * <p>Setter for the field <code>itemImgs</code>.</p>
	 *
	 * @param itemImgs a {@link java.util.List} object.
	 */
	public void setItemImgs(List<String> itemImgs) {
		this.itemImgs = itemImgs;
	}

	/**
	 * <p>Getter for the field <code>itemLink</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemLink() {
		return this.itemLink;
	}
	/**
	 * <p>Setter for the field <code>itemLink</code>.</p>
	 *
	 * @param itemLink a {@link java.lang.String} object.
	 */
	public void setItemLink(String itemLink) {
		this.itemLink = itemLink;
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
	 * <p>Getter for the field <code>itemText</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemText() {
		return this.itemText;
	}
	/**
	 * <p>Setter for the field <code>itemText</code>.</p>
	 *
	 * @param itemText a {@link java.lang.String} object.
	 */
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	/**
	 * <p>Getter for the field <code>maxDiscountNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaxDiscountNum() {
		return this.maxDiscountNum;
	}
	/**
	 * <p>Setter for the field <code>maxDiscountNum</code>.</p>
	 *
	 * @param maxDiscountNum a {@link java.lang.String} object.
	 */
	public void setMaxDiscountNum(String maxDiscountNum) {
		this.maxDiscountNum = maxDiscountNum;
	}

	/**
	 * <p>Getter for the field <code>minConsumeNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinConsumeNum() {
		return this.minConsumeNum;
	}
	/**
	 * <p>Setter for the field <code>minConsumeNum</code>.</p>
	 *
	 * @param minConsumeNum a {@link java.lang.String} object.
	 */
	public void setMinConsumeNum(String minConsumeNum) {
		this.minConsumeNum = minConsumeNum;
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

}
