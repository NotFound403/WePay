package org.hive.common.pay;

/**
 * Created with IntelliJ IDEA.
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
}
