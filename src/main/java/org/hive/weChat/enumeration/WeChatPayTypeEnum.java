package org.hive.weChat.enumeration;

import org.hive.common.pay.PayType;

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
    JS_API("pay/unifiedorder"),
    /**
     * 扫码支付.
     */
    NATIVE(WeChatPayTypeEnum.JS_API.uri),
    /**
     * APP支付.
     */
    APP(WeChatPayTypeEnum.JS_API.uri),
    /**
     * H5支付.
     */
    H5("UNAWARE"),
    /**
     * 微信小程序支付.
     */
    WXA_API("UNAWARE");

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
