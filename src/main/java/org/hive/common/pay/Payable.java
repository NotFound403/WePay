package org.hive.common.pay;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  11:54
 */


public interface Payable {
    /**
     * 统一支付.
     *
     * @return the t
     */
    Map<String, String> unifiedOrder();
}

