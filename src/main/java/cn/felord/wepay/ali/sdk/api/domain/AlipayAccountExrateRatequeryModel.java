package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 对于部分签约境内当面付的商家，为了能够在境外进行推广，因此需要汇率进行币种之间的转换，本接口提供此业务场景下的汇率查询服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExrateRatequeryModel extends AlipayObject {

    private static final long serialVersionUID = 5131734914628151851L;

    /**
     * 需要查询汇率的货币对，如果为空则返回当前支持的所有货币对的汇率
     */
    @ApiField("currency_pair")
    private String currencyPair;

    /**
     * Gets currency pair.
     *
     * @return the currency pair
     */
    public String getCurrencyPair() {
        return this.currencyPair;
    }

    /**
     * Sets currency pair.
     *
     * @param currencyPair the currency pair
     */
    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

}
