package cn.felord.wepay.ali.sdk.api.internal.mapping;

import cn.felord.wepay.ali.sdk.api.AlipayApiException;
import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.AlipayResponse;
import cn.felord.wepay.ali.sdk.api.SignItem;

/**
 * 动态格式转换器。
 *
 * @author carver.gu
 * @version $Id: $Id
 */
public interface Converter {

    /**
     * 把字符串转换为响应对象。
     *
     * @param rsp   响应字符串
     * @param clazz 领域类型
     * @return 响应对象 t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
            throws AlipayApiException;

    /**
     * 获取响应内的签名数据
     *
     * @param request      the request
     * @param responseBody the response body
     * @return sign item
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    SignItem getSignItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException;

    /**
     * 获取解密后的响应内的真实内容
     *
     * @param request     the request
     * @param body        the body
     * @param format      the format
     * @param encryptType the encrypt type
     * @param encryptKey  the encrypt key
     * @param charset     the charset
     * @return string string
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    String encryptSourceData(AlipayRequest<?> request, String body, String format,
                             String encryptType, String encryptKey, String charset)
            throws AlipayApiException;

}
