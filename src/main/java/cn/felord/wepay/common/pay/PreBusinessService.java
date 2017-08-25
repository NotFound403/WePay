package cn.felord.wepay.common.pay;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 预处理业务
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/19  17:07
 */
public interface PreBusinessService {
    /**
     * <p>preHandler.</p>
     *
     * @param result a {@link java.util.Map} object.
     * @param <T> a T object.
     * @return a T object.
     */
    <T> T preHandler(Map<String, Object> result);
}
