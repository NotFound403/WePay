package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 受理外汇交易请求
 *
 * @author auto create
 * @since 1.0, 2017-07-20 10:41:43
 */
public class AlipayAccountExrateTraderequestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4495337556333756647L;

	/**
	 * 交易请求对象内容
	 */
	@ApiField("trade_request")
	private TradeRequestVO tradeRequest;

	public TradeRequestVO getTradeRequest() {
		return this.tradeRequest;
	}
	public void setTradeRequest(TradeRequestVO tradeRequest) {
		this.tradeRequest = tradeRequest;
	}

}
