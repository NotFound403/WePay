package org.wepay.common.pay;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/9  13:26
 */


public interface Params {
    /**
     * Sets appid.
     *
     * @param appId the app id
     */
    void setAppid(String appId);

    /**
     * Sets mch id.
     *
     * @param mchId the mch id
     */
    void setMch_id(String mchId);

    /**
     * Sets notify url.
     *
     * @param notifyUrl the notify url
     */
    void setNotify_url(String notifyUrl);

    /**
     * Sets sign type.
     *
     * @param signType the sign type
     */
    void setSign_type(String signType);

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    void setTrade_type(String tradeType);

    /**
     * Sets openid.
     *
     * @param openId the open id
     */
    void setOpenid(String openId);

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    void setProduct_id(String productId);

}
