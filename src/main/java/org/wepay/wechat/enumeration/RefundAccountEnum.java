package org.wepay.wechat.enumeration;

/**
 * Created with IntelliJ IDEA.
 * 退款资金来源 仅针对老资金流商户使用
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/15  10:55
 */


public enum RefundAccountEnum {
    /**
     * 未结算资金退款.
     */
    REFUND_SOURCE_UNSETTLED_FUNDS,
    /**
     * 可用余额退款.
     */
    REFUND_SOURCE_RECHARGE_FUNDS
}
