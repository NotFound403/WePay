package org.hive.common.service;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 业务处理类
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  10:51
 */


public interface ServiceHandler {
    /**
     * Pre pay service handle t.
     * <p>
     * 支付前业务处理
     *
     * @param <T>     the type parameter
     * @param service the service
     * @return the t
     */
    <T> T prePayServiceHandle(Object service);

    /**
     * Pay response handle t.
     * <p>
     * 支付后业务处理
     *
     * @param <T>     the type parameter
     * @param service the service
     * @return the t
     */
    <T> T payResponseHandle(Object service);
}
