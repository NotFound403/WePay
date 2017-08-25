package cn.felord.wepay.ali.sdk.api;

/**
 * 响应解释器接口。响应格式可以是JSON, XML等等。
 *
 * @param <T> the type parameter
 * @author carver.gu
 * @version $Id: $Id
 */
public interface AlipayParser<T extends AlipayResponse> {

    /**
     * 把响应字符串解释成相应的领域对象。
     *
     * @param rsp 响应字符串
     * @return 领域对象 t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    T parse(String rsp) throws AlipayApiException;

    /**
     * 获取响应类类型。
     *
     * @return the response class
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    Class<T> getResponseClass() throws AlipayApiException;

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
     * 获取实际串：如果是加密内容则返回内容已经是解密后的实际内容了
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
