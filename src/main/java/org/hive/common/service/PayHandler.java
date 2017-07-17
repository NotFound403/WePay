package org.hive.common.service;

import org.hive.common.pay.Payable;
import org.hive.weChat.entity.PayRequestParams;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/17  17:21
 */


public class PayHandler implements Payable {
    @Override
    public Map<String, Object> unifiedorder(PayRequestParams payRequestParams) {
        return null;
    }
}
