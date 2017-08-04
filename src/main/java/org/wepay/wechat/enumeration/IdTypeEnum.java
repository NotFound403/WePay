package org.wepay.wechat.enumeration;

/**
 * Created with IntelliJ IDEA.
 * 订单号类型枚举
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/4  15:18
 */


public enum IdTypeEnum {
    /**
     * 微信订单号.
     */
    TRANSACTION_ID,
    /**
     * 商户订单号 同一商户号下唯一.
     */
    OUT_TRADE_NO,
    /**
     * 商户退款单号 商户系统内部唯一.
     */
    OUT_REFUND_NO,
    /**
     * 微信退款单号.
     */
    REFUND_ID

}
