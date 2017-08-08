package org.wepay.common.proxy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wepay.common.exception.PayException;
import org.wepay.common.pay.Callback;
import org.wepay.common.pay.PostBusiness;
import org.wepay.common.util.HttpKit;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/7  11:12
 */


public class ProxyPayCallback implements InvocationHandler {
    private static final Logger log = LoggerFactory.getLogger(ProxyPayCallback.class);
    private Callback callback;
    private PostBusiness postBusiness;


    /**
     * Instantiates a new Proxy pay callback.
     *
     * @param callback     the callback
     * @param postBusiness the post business
     */
    public ProxyPayCallback(Callback callback, PostBusiness postBusiness) {
        this.callback = callback;
        this.postBusiness = postBusiness;
    }

    /**
     * Init proxy callback.
     *
     * @return the callback
     */
    public Callback initProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class[] interfaces = callback.getClass().getInterfaces();
        return (Callback) Proxy.newProxyInstance(classLoader, interfaces, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws PayException {
        HttpServletRequest request = callback.getRequest();
        Map<String, Object> result = HttpKit.resolveRequestData(request);
        String resultCode = (String) result.get("result_code");
        log.info("\u56de\u8c03 resultCode: " + resultCode);
        if ("SUCCESS".equals(resultCode)) {
            postBusiness.successBusinessHandler(result);
        }
        if ("FAIL".equals(resultCode)) {
            postBusiness.failureBusinessHandler(result);
        }
        try {
            return method.invoke(callback, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.debug("调用回调异常：", e);
        }
        throw new PayException("回调异常");
    }
}
