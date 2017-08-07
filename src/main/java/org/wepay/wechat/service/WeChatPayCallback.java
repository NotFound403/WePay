package org.wepay.wechat.service;

import org.wepay.common.pay.Callback;
import org.wepay.common.util.HttpKit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/7  12:48
 */


public class WeChatPayCallback implements Callback {
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

    @Override
    public void payCallback() {
        Map<String, String> result = HttpKit.resolveRequestData(request);
        String resultCode = result.get("result_code");
        String returnMsg = "SUCCESS".equals(resultCode) ? "OK" : result.get("err_code");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(xmlTemplate(resultCode, returnMsg));
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    @Override
    public HttpServletRequest getRequest() {
        return request;
    }

    private String xmlTemplate(String returnCode, String returnMsg) {
        return "<xml>" + "<return_code>" + "<![CDATA[" + returnCode + "]]>" + "</return_code>" +
                "<return_msg>" + "<![CDATA[" + returnMsg + "</return_msg>" + "</xml>";
    }
}
