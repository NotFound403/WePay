package org.wepay.common.pay;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 回调业务处理
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/19  17:12
 */


public interface Callback {
    <T> T businessHandler(Map<String, String> map);
}
