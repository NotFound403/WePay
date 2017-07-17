package org.hive.common.pay;

import org.hive.weChat.entity.PayRequestParams;

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
     * @param payRequestParams the pay request params
     * @return the t
     */
    Map<String, Object> unifiedorder(PayRequestParams payRequestParams);
}
