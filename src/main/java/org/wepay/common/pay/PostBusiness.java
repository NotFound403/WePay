package org.wepay.common.pay;

import java.util.Map;

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
     */
    <T extends Map<String, Object>> void failureBusinessHandler(T t);

    /**
     * 成功后业务处理.
     */
    <T extends Map<String, Object>> void successBusinessHandler(T t);
}
