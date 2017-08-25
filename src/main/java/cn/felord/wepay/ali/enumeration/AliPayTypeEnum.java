package cn.felord.wepay.ali.enumeration;

import cn.felord.wepay.common.pay.PayType;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-14
 * Time: 下午11:18
 *
 * @author lenovo
 * @version $Id: $Id
 */
public enum AliPayTypeEnum implements PayType {
    /**
     * 统一收单交易退款查询.
     */
    REFUND_QUERY("alipay.trade.fastpay.refund.query"),
    /**
     * 统一收单交易结算接口.
     */
    ORDER_SETTLE("alipay.trade.order.settle"),
    /**
     * 统一收单交易关闭接口.
     */
    ORDER_CLOSE("alipay.trade.close"),
    /**
     * 统一收单交易撤销接口.
     */
    TRADE_CANCEL("alipay.trade.cancel"),
    /**
     * 统一收单交易退款接口.
     */
    REFUND("alipay.trade.refund"),
    /**
     * 统一收单交易支付接口.
     */
    PAY("alipay.trade.pay"),
    /**
     * 统一收单线下交易预创建.
     */
    PRECREATE("alipay.trade.precreate"),
    /**
     * 统一收单交易创建接口.
     */
    CREATE("alipay.trade.create"),
    /**
     * 统一收单线下交易查询.
     */
    ORDER_QUERY("alipay.trade.query");

    /** Constant <code>ALI_PAY_URL="https://openapi.alipay.com/gateway.do"</code> */
    private static final String ALI_PAY_URL = "https://openapi.alipay.com/gateway.do";
    private final String method;

    AliPayTypeEnum(String method) {
        this.method = method;
    }

    /** {@inheritDoc} */
    @Override
    public String getType() {
        return method;
    }

    /** {@inheritDoc} */
    @Override
    public String getApi() {
        return ALI_PAY_URL;
    }
}
