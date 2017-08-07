package org.wepay.common.pay;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/7  12:26
 */


public interface PostBusiness {
    /**
     * 失败后业务处理.
     *
     * @param <T> the type parameter
     * @param t   the t
     */
    <T> void failureBusinessHandler(T t);

    /**
     * 成功后业务处理.
     *
     * @param <T> the type parameter
     * @param t   the t
     */
    <T> void successBusinessHandler(T t);
}
