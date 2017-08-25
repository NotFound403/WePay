package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 支付宝脱机交易结算
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceTransportOfflinepayTradeSettleModel extends AlipayObject {

	private static final long serialVersionUID = 5847563894369678679L;

	/**
	 * 脱机交易列表
	 */
	@ApiListField("trade_list")
	@ApiField("alipay_offline_trade")
	private List<AlipayOfflineTrade> tradeList;

	/**
	 * <p>Getter for the field <code>tradeList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayOfflineTrade> getTradeList() {
		return this.tradeList;
	}
	/**
	 * <p>Setter for the field <code>tradeList</code>.</p>
	 *
	 * @param tradeList a {@link java.util.List} object.
	 */
	public void setTradeList(List<AlipayOfflineTrade> tradeList) {
		this.tradeList = tradeList;
	}

}
