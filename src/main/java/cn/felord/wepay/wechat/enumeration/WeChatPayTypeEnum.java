package cn.felord.wepay.wechat.enumeration;

import cn.felord.wepay.common.pay.PayType;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 支付方式枚举
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  11:23
 */


public enum WeChatPayTypeEnum implements PayType {
    /**
     * 刷卡支付.
     */
    MICRO_PAY("pay/micropay"),
    /**
     * 微信公众号支付.
     */
    JSAPI("pay/unifiedorder"),
    /**
     * 扫码支付.
     */
    NATIVE(WeChatPayTypeEnum.JSAPI.uri),
    /**
     * APP支付.
     */
    APP(WeChatPayTypeEnum.JSAPI.uri),
    /**
     * H5支付.
     */
    MWEB(WeChatPayTypeEnum.JSAPI.uri),

    /**
     * 查询订单.
     */
    ORDER_QUERY("pay/orderquery"),
    /**
     * 关闭订单.
     */
    ORDER_CLOSE("pay/closeorder"),
    /**
     * 退款.
     */
    REFUND("secapi/pay/refund"),
    /**
     * 查询退款.
     */
    REFUND_QUERY("pay/refundquery"),
    /**
     * 下载对账单.
     */
    BILL_DOWNLOAD("pay/downloadbill");


    private static final String WE_CHAT_PAY_URL = "https://api.mch.weixin.qq.com/";
    private final String uri;

    WeChatPayTypeEnum(String uri) {
        this.uri = uri;
    }

    @Override
    public String getType() {
        return this.name();
    }

    @Override
    public String getApi() {
        return WE_CHAT_PAY_URL + this.uri;
    }
}
