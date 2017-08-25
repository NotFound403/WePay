package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.DmActivityShopData;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.retail.dm.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataRetailDmQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4325524535894235947L;

	/** 
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 店面DM营销数据，包括商品的PV、UV、曝光。
	 */
	@ApiListField("dm_marketing_datas")
	@ApiField("dm_activity_shop_data")
	private List<DmActivityShopData> dmMarketingDatas;

	/** 
	 * 商品码
	 */
	@ApiField("item_code")
	private String itemCode;

	/** 
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * <p>Setter for the field <code>contentId</code>.</p>
	 *
	 * @param contentId a {@link java.lang.String} object.
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	/**
	 * <p>Getter for the field <code>contentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentId( ) {
		return this.contentId;
	}

	/**
	 * <p>Setter for the field <code>dmMarketingDatas</code>.</p>
	 *
	 * @param dmMarketingDatas a {@link java.util.List} object.
	 */
	public void setDmMarketingDatas(List<DmActivityShopData> dmMarketingDatas) {
		this.dmMarketingDatas = dmMarketingDatas;
	}
	/**
	 * <p>Getter for the field <code>dmMarketingDatas</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DmActivityShopData> getDmMarketingDatas( ) {
		return this.dmMarketingDatas;
	}

	/**
	 * <p>Setter for the field <code>itemCode</code>.</p>
	 *
	 * @param itemCode a {@link java.lang.String} object.
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * <p>Getter for the field <code>itemCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemCode( ) {
		return this.itemCode;
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
	 * <p>Getter for the field <code>itemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemName( ) {
		return this.itemName;
	}

}
