package cn.felord.wepay.common.pay;

/**
 * 支付基础配置.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/19  14:10
 */
public interface PayConfig {
    /**
     * Gets appid.
     *
     * @return the appid
     */
    String getAppid();

    /**
     * Gets secret key.
     *
     * @return the secret key
     */
    String getSecretKey();

    /**
     * Gets notify url.
     *
     * @return the notify url
     */
    String getNotify_url();

    /**
     * Gets sign type.
     *
     * @return the sign type
     */
    String getSign_type();

    /**
     * Gets mch id.
     *
     * @return the mch id
     */
    String getMch_id();



    /**
     * Gets dev mode.
     *
     * @return the dev mode
     */
    String getDevMode();

    /**
     * Gets cert path.
     *
     * @return the cert path
     */
    String getCertPath();

    /**
     * Is dev mode boolean.
     *
     * @return the boolean
     */
    boolean isDevMode();
}
