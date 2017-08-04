package org.wepay.common.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wepay.common.pay.Callback;
import org.wepay.common.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/8/3  11:27
 */


public class ProxyCallBack implements InvocationHandler {
    private static final Log log = LogFactory.getLog(ProxyCallBack.class);
    private Callback callback;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public ProxyCallBack(Callback callback, HttpServletRequest request, HttpServletResponse response) {
        this.callback = callback;
        this.request = request;
        this.response = response;
    }

    public Callback initProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class[] interfaceClazzes = callback.getClass().getInterfaces();
        return (Callback) Proxy.newProxyInstance(classLoader, interfaceClazzes, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Map<String, String> result = initRequestData(request);
        String resultCode = result.get("result_code");
        String responseXml = "<xml>" +
                "<return_code><![CDATA[FAIL]]></return_code>" +
                "<return_msg><![CDATA[" + result.get("err_code_des") + "]]></return_msg>" +
                "</xml>";
        Object o = null;
        if ("SUCCESS".equals(resultCode)) {
            o = method.invoke(callback, result);
            responseXml = "<xml>" +
                    "<return_code><![CDATA[SUCCESS]]></return_code>" +
                    "<return_msg><![CDATA[OK]]></return_msg>" +
                    "</xml>";
        }
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(responseXml);
        } catch (IOException e) {
            log.debug("支付回调代理IO异常：", e);
        }
        return o;
    }

    /**
     * 腾讯回调请求中解析的参数.
     *
     * @param request the request
     * @return the string
     */
    private Map<String, String> initRequestData(HttpServletRequest request) {
        StringBuilder requestData = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                requestData.append(str);
            }
        } catch (IOException e) {
            log.debug("支付回调参数解析异常：", e);
        }
        return ObjectUtils.xmlToMap(requestData.toString());
    }
}
