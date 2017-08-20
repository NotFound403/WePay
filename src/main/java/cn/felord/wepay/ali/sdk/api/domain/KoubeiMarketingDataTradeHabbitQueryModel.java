package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户会员交易习惯查询接口
 *
 * @author auto create
 * @since 1.0, 2016-11-25 10:43:58
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

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}

}
