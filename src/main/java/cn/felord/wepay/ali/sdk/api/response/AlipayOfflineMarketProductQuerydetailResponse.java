package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemDescription;
import cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemSalesRule;
import cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemVoucherTemplete;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.product.querydetail response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketProductQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 5523775562517873198L;

	/** 
	 * 商品首图，尺寸比例在65:53范围内且图片大小不超过10k皆可
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 商品描述，只有单品代金券有商品描述
	 */
	@ApiListField("descriptions")
	@ApiField("alipay_data_item_description")
	private List<AlipayDataItemDescription> descriptions;

	/** 
	 * 商品下架时间，不得早于商品生效时间，商品下架
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/** 
	 * 商品生效时间，到达生效时间后才可在客户端展示出来
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/** 
	 * 商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/** 
	 * 是否自动延期，默认false
	 */
	@ApiField("is_auto_expanded")
	private Boolean isAutoExpanded;

	/** 
	 * 该商品当前的状态，共有四个状态：
INIT（初始化状态）
EFFECTIVE（上架/售卖中）
PAUSE（暂停售卖）
INVALID（下架/失效状态）
说明： 处于暂停售卖状态的商品还可以变成上架/售卖中状态，但一旦INVALID就相当于删除了该商品，无法再做其他操作
	 */
	@ApiField("item_status")
	private String itemStatus;

	/** 
	 * 商品类型，券类型为固定值VOUCHER
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 商品购买类型：
OBTAIN为领取
AUTO_OBTAIN为自动领取
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/** 
	 * 销售规则，如用户一天只能领取一次等
	 */
	@ApiField("sales_rule")
	private AlipayDataItemSalesRule salesRule;

	/** 
	 * 上架门店id列表，即传入一个或多个shop_id，必须是创建商品partnerId下的店铺，目前支持的店铺最大100个，如果超过100个店铺需要报备
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/** 
	 * 商品名称，请勿超过15个汉字，30个字符
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 券模板信息
	 */
	@ApiField("voucher_templete")
	private AlipayDataItemVoucherTemplete voucherTemplete;

	/** 
	 * 商品顺序权重，必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private Long weight;

	/**
	 * <p>Setter for the field <code>cover</code>.</p>
	 *
	 * @param cover a {@link java.lang.String} object.
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}
	/**
	 * <p>Getter for the field <code>cover</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCover( ) {
		return this.cover;
	}

	/**
	 * <p>Setter for the field <code>descriptions</code>.</p>
	 *
	 * @param descriptions a {@link java.util.List} object.
	 */
	public void setDescriptions(List<AlipayDataItemDescription> descriptions) {
		this.descriptions = descriptions;
	}
	/**
	 * <p>Getter for the field <code>descriptions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayDataItemDescription> getDescriptions( ) {
		return this.descriptions;
	}

	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.util.Date} object.
	 */
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtEnd( ) {
		return this.gmtEnd;
	}

	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.util.Date} object.
	 */
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}
	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtStart( ) {
		return this.gmtStart;
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
	 * <p>Getter for the field <code>inventory</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getInventory( ) {
		return this.inventory;
	}

	/**
	 * <p>Setter for the field <code>isAutoExpanded</code>.</p>
	 *
	 * @param isAutoExpanded a {@link java.lang.Boolean} object.
	 */
	public void setIsAutoExpanded(Boolean isAutoExpanded) {
		this.isAutoExpanded = isAutoExpanded;
	}
	/**
	 * <p>Getter for the field <code>isAutoExpanded</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsAutoExpanded( ) {
		return this.isAutoExpanded;
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
	 * <p>Getter for the field <code>itemStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemStatus( ) {
		return this.itemStatus;
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
	 * <p>Getter for the field <code>itemType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemType( ) {
		return this.itemType;
	}

	/**
	 * <p>Setter for the field <code>picColl</code>.</p>
	 *
	 * @param picColl a {@link java.lang.String} object.
	 */
	public void setPicColl(String picColl) {
		this.picColl = picColl;
	}
	/**
	 * <p>Getter for the field <code>picColl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPicColl( ) {
		return this.picColl;
	}

	/**
	 * <p>Setter for the field <code>purchaseMode</code>.</p>
	 *
	 * @param purchaseMode a {@link java.lang.String} object.
	 */
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}
	/**
	 * <p>Getter for the field <code>purchaseMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPurchaseMode( ) {
		return this.purchaseMode;
	}

	/**
	 * <p>Setter for the field <code>salesRule</code>.</p>
	 *
	 * @param salesRule a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemSalesRule} object.
	 */
	public void setSalesRule(AlipayDataItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}
	/**
	 * <p>Getter for the field <code>salesRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemSalesRule} object.
	 */
	public AlipayDataItemSalesRule getSalesRule( ) {
		return this.salesRule;
	}

	/**
	 * <p>Setter for the field <code>shopList</code>.</p>
	 *
	 * @param shopList a {@link java.util.List} object.
	 */
	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}
	/**
	 * <p>Getter for the field <code>shopList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopList( ) {
		return this.shopList;
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
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject( ) {
		return this.subject;
	}

	/**
	 * <p>Setter for the field <code>voucherTemplete</code>.</p>
	 *
	 * @param voucherTemplete a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemVoucherTemplete} object.
	 */
	public void setVoucherTemplete(AlipayDataItemVoucherTemplete voucherTemplete) {
		this.voucherTemplete = voucherTemplete;
	}
	/**
	 * <p>Getter for the field <code>voucherTemplete</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemVoucherTemplete} object.
	 */
	public AlipayDataItemVoucherTemplete getVoucherTemplete( ) {
		return this.voucherTemplete;
	}

	/**
	 * <p>Setter for the field <code>weight</code>.</p>
	 *
	 * @param weight a {@link java.lang.Long} object.
	 */
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	/**
	 * <p>Getter for the field <code>weight</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getWeight( ) {
		return this.weight;
	}

}
