package org.hive.common.service;

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
import org.hive.weChat.entity.WeChatPayConfig;
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


public class PayHandler implements Payable {
    private static final Log log = LogFactory.getLog(PayHandler.class);
    private WeChatPayTypeEnum weChatPayTypeEnum;
    private PayRequestParams payRequestParams;

    /**
     * Instantiates a new Pay handler.
     *
     * @param weChatPayTypeEnum the we chat pay type enum
     * @param payRequestParams  the pay request params
     */
    public PayHandler(WeChatPayTypeEnum weChatPayTypeEnum, PayRequestParams payRequestParams) {
        this.weChatPayTypeEnum = weChatPayTypeEnum;
        this.payRequestParams = payRequestParams;
    }

    @Override
    public Map<String, String> unifiedOrder() {
        WeChatPayConfig weChatPayConfig = new WeChatPayConfig();
        payRequestParams.setNonce_str(StringUtil.onceStrGenerator());
        payRequestParams.setAppid(weChatPayConfig.getAppid());
        payRequestParams.setMch_id(weChatPayConfig.getMch_id());
        payRequestParams.setSign_type("MD5");
        payRequestParams.setNotify_url(weChatPayConfig.getNotify_url());
        Map<String, Object> sortedMap = BeanUtil.beanToSortedTreeMapWithoutNull(payRequestParams);
        try {
            String sign = StringUtil.signatureGenerator(sortedMap, "UTF-8", weChatPayConfig.getSecretKey());
            log.info("生成签名：" + sign);
            sortedMap.put("sign", sign);
            String XML = StringUtil.mapToXML(sortedMap);
            String xmlResult = HttpKit.httpPost(weChatPayTypeEnum.getApi(), XML);
            if (StringUtils.isNotEmpty(xmlResult)) {
                String responseXml = new String(xmlResult.getBytes("ISO-8859-1"), "UTF-8");
                return StringUtil.XMLToMap(responseXml);
            }
        } catch (SignatureException | UnsupportedEncodingException | RequiredParamException e) {
            log.debug("统一下单调用异常", e);
        }
        return null;
    }
}
