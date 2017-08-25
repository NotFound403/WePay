package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * trade_voucher商品查询信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ItemQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 2433869552479192221L;

	/**
	 * 口碑商品所属的后台类目id，后台类目数据来源：开放接口koubei.item.category.children.batchquery（查询后台类目树接口）
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 首图
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 商品描述，列表类型，每一项的key，value的描述见下面两行
	 */
	@ApiListField("descriptions")
	@ApiField("koubei_item_description")
	private List<KoubeiItemDescription> descriptions;

	/**
	 * 商品生效时间，商品状态有效并且到达生效时间后才可在客户端（消费者端）展示出来，如果商品生效时间小于当前时间，则立即生效。
说明： 商品的生效时间不能早于创建当天的0点
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 当前库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 该商品当前的状态，共有5个状态：INIT（初始状态）EFFECTIVE（生效）PAUSE（暂停）FREEZE(冻结)INVALID（失效）；详见状态变更图
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 商品类型，交易凭证类：TRADE_VOUCHER
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 标准商品为原价，必填。非标准商品请勿填写，填写无效。价格单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 图片集，本商品所有图片id和URL的对应关系数组
	 */
	@ApiListField("pic_coll")
	@ApiField("string")
	private List<String> picColl;

	/**
	 * 商品详情图，多张图片以英文逗号分隔
	 */
	@ApiField("picture_details")
	private String pictureDetails;

	/**
	 * 标准商品为现价,选填。非标准商品为最小价格（非标商品为xx元起）必填。价格单位为元。如果标准商品现价不填写，则以原价进行售卖；如果现价与原价相等时，则会以原价售卖，并且客户端只展示一个价格（原价）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 标准商品:FIX；非标准商品:FLOAT ，根据该字段判断商品是标准商品或非标商品。
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 适用门店列表
	 */
	@ApiField("shop_ids")
	private String shopIds;

	/**
	 * 商品名称，不超过20汉字，40个字符
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 交易凭证类商品模板信息
	 */
	@ApiListField("trade_voucher_item_template")
	@ApiField("koubei_trade_voucher_item_templete")
	private List<KoubeiTradeVoucherItemTemplete> tradeVoucherItemTemplate;

	/**
	 * 商品顺序权重
	 */
	@ApiField("weight")
	private Long weight;

	/**
	 * <p>Getter for the field <code>categoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryId() {
		return this.categoryId;
	}
	/**
	 * <p>Setter for the field <code>categoryId</code>.</p>
	 *
	 * @param categoryId a {@link java.lang.String} object.
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * <p>Getter for the field <code>cover</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCover() {
		return this.cover;
	}
	/**
	 * <p>Setter for the field <code>cover</code>.</p>
	 *
	 * @param cover a {@link java.lang.String} object.
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * <p>Getter for the field <code>descriptions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KoubeiItemDescription> getDescriptions() {
		return this.descriptions;
	}
	/**
	 * <p>Setter for the field <code>descriptions</code>.</p>
	 *
	 * @param descriptions a {@link java.util.List} object.
	 */
	public void setDescriptions(List<KoubeiItemDescription> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStart() {
		return this.gmtStart;
	}
	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.lang.String} object.
	 */
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	/**
	 * <p>Getter for the field <code>inventory</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getInventory() {
		return this.inventory;
	}
	/**
	 * <p>Setter for the field <code>inventory</code>.</p>
	 *
	 * @param inventory a {@link java.lang.Long} object.
	 */
	public void setInventory(Long inventory) {
		this.inventory = inventory;
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
	 * <p>Getter for the field <code>itemStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemStatus() {
		return this.itemStatus;
	}
	/**
	 * <p>Setter for the field <code>itemStatus</code>.</p>
	 *
	 * @param itemStatus a {@link java.lang.String} object.
	 */
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * <p>Getter for the field <code>itemType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemType() {
		return this.itemType;
	}
	/**
	 * <p>Setter for the field <code>itemType</code>.</p>
	 *
	 * @param itemType a {@link java.lang.String} object.
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
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
	 * <p>Getter for the field <code>picColl</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPicColl() {
		return this.picColl;
	}
	/**
	 * <p>Setter for the field <code>picColl</code>.</p>
	 *
	 * @param picColl a {@link java.util.List} object.
	 */
	public void setPicColl(List<String> picColl) {
		this.picColl = picColl;
	}

	/**
	 * <p>Getter for the field <code>pictureDetails</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPictureDetails() {
		return this.pictureDetails;
	}
	/**
	 * <p>Setter for the field <code>pictureDetails</code>.</p>
	 *
	 * @param pictureDetails a {@link java.lang.String} object.
	 */
	public void setPictureDetails(String pictureDetails) {
		this.pictureDetails = pictureDetails;
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
	 * <p>Getter for the field <code>priceMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPriceMode() {
		return this.priceMode;
	}
	/**
	 * <p>Setter for the field <code>priceMode</code>.</p>
	 *
	 * @param priceMode a {@link java.lang.String} object.
	 */
	public void setPriceMode(String priceMode) {
		this.priceMode = priceMode;
	}

	/**
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopIds() {
		return this.shopIds;
	}
	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.lang.String} object.
	 */
	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <p>Getter for the field <code>tradeVoucherItemTemplate</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KoubeiTradeVoucherItemTemplete> getTradeVoucherItemTemplate() {
		return this.tradeVoucherItemTemplate;
	}
	/**
	 * <p>Setter for the field <code>tradeVoucherItemTemplate</code>.</p>
	 *
	 * @param tradeVoucherItemTemplate a {@link java.util.List} object.
	 */
	public void setTradeVoucherItemTemplate(List<KoubeiTradeVoucherItemTemplete> tradeVoucherItemTemplate) {
		this.tradeVoucherItemTemplate = tradeVoucherItemTemplate;
	}

	/**
	 * <p>Getter for the field <code>weight</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getWeight() {
		return this.weight;
	}
	/**
	 * <p>Setter for the field <code>weight</code>.</p>
	 *
	 * @param weight a {@link java.lang.Long} object.
	 */
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
