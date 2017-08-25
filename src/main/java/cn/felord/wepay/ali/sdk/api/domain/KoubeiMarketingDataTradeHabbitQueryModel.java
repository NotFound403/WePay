package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户会员交易习惯查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataTradeHabbitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8219553476567547966L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 门店列表,门店用逗号分割，最多支持10个门店。
不填时,则为商户维度汇总数据
	 */
	@ApiField("store_ids")
	private String storeIds;

	/**
	 * <p>Getter for the field <code>bizDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizDate() {
		return this.bizDate;
	}
	/**
	 * <p>Setter for the field <code>bizDate</code>.</p>
	 *
	 * @param bizDate a {@link java.lang.String} object.
	 */
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	/**
	 * <p>Getter for the field <code>storeIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreIds() {
		return this.storeIds;
	}
	/**
	 * <p>Setter for the field <code>storeIds</code>.</p>
	 *
	 * @param storeIds a {@link java.lang.String} object.
	 */
	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}

}
