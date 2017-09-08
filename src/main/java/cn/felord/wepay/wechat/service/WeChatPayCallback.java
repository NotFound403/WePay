package cn.felord.wepay.wechat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.felord.wepay.common.pay.Callback;
import cn.felord.wepay.common.util.HttpKit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 微信支付回调.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/7  12:48
 */
public class WeChatPayCallback implements Callback {
    private static final Logger log = LoggerFactory.getLogger(WeChatPayCallback.class);
    private HttpServletRequest request;
    private HttpServletResponse response;

    /**
     * Instantiates a new We chat pay callback.
     *
     * @param request  the request
     * @param response the response
     */
    public WeChatPayCallback(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void payCallback() {
        Map<String, Object> result = HttpKit.resolveRequestData(request);
        String returnMsg = (String) result.get("return_msg");
        response.setCharacterEncoding("UTF-8");
        String xml=xmlTemplate(returnMsg);
        log.debug("微信请求：{}",xml);
        try {
            response.getWriter().write(xml);
        } catch (IOException e) {
            log.debug("callback request resolve params：" + result, e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpServletRequest getRequest() {
        return request;
    }

    private String xmlTemplate(String returnMsg) {
        return "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[" + returnMsg + "]]></return_msg></xml>";
    }
}
