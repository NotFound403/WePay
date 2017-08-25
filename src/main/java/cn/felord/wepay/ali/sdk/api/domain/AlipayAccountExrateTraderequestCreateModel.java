package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 受理外汇交易请求
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExrateTraderequestCreateModel extends AlipayObject {

    private static final long serialVersionUID = 4495337556333756647L;

    /**
     * 交易请求对象内容
     */
    @ApiField("trade_request")
    private TradeRequestVO tradeRequest;

    /**
     * Gets trade request.
     *
     * @return the trade request
     */
    public TradeRequestVO getTradeRequest() {
        return this.tradeRequest;
    }

    /**
     * Sets trade request.
     *
     * @param tradeRequest the trade request
     */
    public void setTradeRequest(TradeRequestVO tradeRequest) {
        this.tradeRequest = tradeRequest;
    }

}
