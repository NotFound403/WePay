package org.hive.weChat.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import org.hive.common.pay.PayType;
import org.hive.common.pay.Payable;
import org.hive.common.util.HttpKit;
import org.hive.common.util.ObjectUtils;
import org.hive.weChat.entity.PayRequestParams;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  17:21
 */


public class WeChatPayHandler implements Payable {
    private static final Log log = LogFactory.getLog(WeChatPayHandler.class);
    private PayType weChatPayTypeEnum;
    private PayRequestParams payRequestParams;

    /**
     * Instantiates a new Pay handler.
     *
     * @param weChatPayTypeEnum the we chat pay type enum
     * @param payRequestParams  the pay request params
     */
    public WeChatPayHandler(PayType weChatPayTypeEnum, PayRequestParams payRequestParams) {
        this.weChatPayTypeEnum = weChatPayTypeEnum;
        this.payRequestParams = payRequestParams;
    }

    @Override
    public Map<String, String> unifiedOrder() {
        payRequestParams.setNonce_str(ObjectUtils.onceStrGenerator());
        payRequestParams.setSecretKey(null);
        String secretKey = payRequestParams.getSecretKey();
        Map<String, Object> sortedMap = ObjectUtils.paramsSorter(payRequestParams);
        try {
            String sign = ObjectUtils.signatureGenerator(sortedMap, "UTF-8", secretKey);
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String xml = ObjectUtils.mapToXML(sortedMap);
            String xmlResult = HttpKit.httpPost(weChatPayTypeEnum.getApi(), xml);
            if (StringUtils.isNotEmpty(xmlResult)) {
                String responseXml = new String(xmlResult.getBytes("ISO-8859-1"), "UTF-8");
                return ObjectUtils.xmlToMap(responseXml);
            }
        } catch (SignatureException | UnsupportedEncodingException | RequiredParamException e) {
            log.debug("统一下单调用异常", e);
        }
        return null;
    }
}
