package cn.felord.wepay.common.pay;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/7  10:34
 */
public interface Callback {
    /**
     * Pay callback.
     */
    void payCallback();

    /**
     * Gets request.
     *
     * @return the request
     */
    HttpServletRequest getRequest();
}
