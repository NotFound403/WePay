package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.YLBPriceDetailInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.price.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankFinanceYulibaoPriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7566137795735366533L;

	/** 
	 * 余利宝行情信息列表
	 */
	@ApiListField("ylb_price_detail_infos")
	@ApiField("y_l_b_price_detail_info")
	private List<YLBPriceDetailInfo> ylbPriceDetailInfos;

	/**
	 * <p>Setter for the field <code>ylbPriceDetailInfos</code>.</p>
	 *
	 * @param ylbPriceDetailInfos a {@link java.util.List} object.
	 */
	public void setYlbPriceDetailInfos(List<YLBPriceDetailInfo> ylbPriceDetailInfos) {
		this.ylbPriceDetailInfos = ylbPriceDetailInfos;
	}
	/**
	 * <p>Getter for the field <code>ylbPriceDetailInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<YLBPriceDetailInfo> getYlbPriceDetailInfos( ) {
		return this.ylbPriceDetailInfos;
	}

}
