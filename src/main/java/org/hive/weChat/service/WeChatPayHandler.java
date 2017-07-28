package org.hive.weChat.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import org.hive.common.pay.Payable;
import org.hive.common.util.BeanUtil;
import org.hive.common.util.HttpKit;
import org.hive.common.util.StringUtil;
import org.hive.weChat.entity.PayRequestParams;
import org.hive.weChat.enumeration.WeChatPayTypeEnum;

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
    private WeChatPayTypeEnum weChatPayTypeEnum;
    private PayRequestParams payRequestParams;

    /**
     * Instantiates a new Pay handler.
     *
     * @param weChatPayTypeEnum the we chat pay type enum
     * @param payRequestParams  the pay request params
     */
    public WeChatPayHandler(WeChatPayTypeEnum weChatPayTypeEnum, PayRequestParams payRequestParams) {
        this.weChatPayTypeEnum = weChatPayTypeEnum;
        this.payRequestParams = payRequestParams;
    }

    @Override
    public Map<String, String> unifiedOrder() {
        payRequestParams.setNonce_str(StringUtil.onceStrGenerator());
        String secretKey=payRequestParams.getSecretKey();
        payRequestParams.setSecretKey(null);
        Map<String, Object> sortedMap = BeanUtil.paramsSorter(payRequestParams);
        try {
            String sign = StringUtil.signatureGenerator(sortedMap, "UTF-8", secretKey);
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String xml = StringUtil.mapToXML(sortedMap);
            String xmlResult = HttpKit.httpPost(weChatPayTypeEnum.getApi(), xml);
            if (StringUtils.isNotEmpty(xmlResult)) {
                String responseXml = new String(xmlResult.getBytes("ISO-8859-1"), "UTF-8");
                return StringUtil.xmlToMap(responseXml);
            }
        } catch (SignatureException | UnsupportedEncodingException | RequiredParamException e) {
            log.debug("统一下单调用异常", e);
        }
        return null;
    }
}