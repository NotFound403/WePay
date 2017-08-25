package cn.felord.wepay.ali.sdk.api.internal.parser.json;

import cn.felord.wepay.ali.sdk.api.AlipayApiException;
import cn.felord.wepay.ali.sdk.api.AlipayParser;
import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.AlipayResponse;
import cn.felord.wepay.ali.sdk.api.SignItem;
import cn.felord.wepay.ali.sdk.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 *
 * @author carver.gu
 * @version $Id: $Id
 */
public class ObjectJsonParser<T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    /**
     * <p>Constructor for ObjectJsonParser.</p>
     *
     * @param clazz a {@link java.lang.Class} object.
     */
    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    /** {@inheritDoc} */
    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new JsonConverter();
        return converter.toResponse(rsp, clazz);
    }

    /**
     * <p>getResponseClass.</p>
     *
     * @return a {@link java.lang.Class} object.
     */
    public Class<T> getResponseClass() {
        return clazz;
    }

    /** {@inheritDoc} */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
                                                                              throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.getSignItem(request, responseBody);
    }

    /** {@inheritDoc} */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                       String encryptType, String encryptKey, String charset)
                                                                                             throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.encryptSourceData(request, body, format, encryptType, encryptKey,
            charset);
    }

}
