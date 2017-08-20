package org.wepay.ali.sdk.api.internal.parser.xml;

import org.wepay.ali.sdk.api.AlipayApiException;
import org.wepay.ali.sdk.api.AlipayParser;
import org.wepay.ali.sdk.api.AlipayRequest;
import org.wepay.ali.sdk.api.AlipayResponse;
import org.wepay.ali.sdk.api.SignItem;
import org.wepay.ali.sdk.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectXmlParser<T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    public ObjectXmlParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new XmlConverter();
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

    /** 
     * @see org.wepay.ali.sdk.api.AlipayParser#getSignItem(org.wepay.ali.sdk.api.AlipayRequest, String)
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
                                                                              throws AlipayApiException {

        Converter converter = new XmlConverter();

        return converter.getSignItem(request, responseBody);
    }

    /** 
     * @see org.wepay.ali.sdk.api.AlipayParser#encryptSourceData(org.wepay.ali.sdk.api.AlipayRequest, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                       String encryptType, String encryptKey, String charset)
                                                                                             throws AlipayApiException {

        Converter converter = new XmlConverter();

        return converter.encryptSourceData(request, body, format, encryptType, encryptKey,
            charset);
    }

}
