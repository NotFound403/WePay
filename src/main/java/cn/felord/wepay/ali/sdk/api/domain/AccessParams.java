package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 签约接入信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AccessParams extends AlipayObject {

    private static final long serialVersionUID = 2798414365189565798L;

    /**
     * 目前支持以下值：
     * 1. ALIPAYAPP  （钱包h5页面签约）
     * 2. QRCODE(扫码签约)
     * 3. QRCODEORSMS(扫码签约或者短信签约)
     */
    @ApiField("channel")
    private String channel;

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

}
