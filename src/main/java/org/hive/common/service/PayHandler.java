package org.hive.common.service;

import org.hive.common.exception.SignatureException;
import org.hive.common.pay.Payable;
import org.hive.common.util.BeanUtil;
import org.hive.common.util.StringUtil;
import org.hive.weChat.entity.PayRequestParams;
import org.hive.weChat.entity.WeChatPayConfig;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/17  17:21
 */


public class PayHandler implements Payable {
    private static final WeChatPayConfig WE_CHAT_PAY_CONFIG = WeChatPayConfig.getInstance();

    @Override
    public Map<String, Object> unifiedOrder(PayRequestParams payRequestParams) {
        payRequestParams.setNonce_str(StringUtil.onceStrGenerator());
        payRequestParams.setAppid(WE_CHAT_PAY_CONFIG.getAppid());
        payRequestParams.setMch_id(WE_CHAT_PAY_CONFIG.getMch_id());
        payRequestParams.setSign_type("MD5");
        payRequestParams.setNotify_url(WE_CHAT_PAY_CONFIG.getNotify_url());
        Map<String, Object> sortedMap = BeanUtil.beanToSortedTreeMapWithoutNull(payRequestParams);
        try {
            String sign = StringUtil.signatureGenerator(sortedMap, "UTF-8", WE_CHAT_PAY_CONFIG.getSecretKey());
            sortedMap.put("sign", sign);

        } catch (SignatureException e) {
            e.printStackTrace();
        }
        return null;
    }
}
