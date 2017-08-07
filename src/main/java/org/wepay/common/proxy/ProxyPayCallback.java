package org.wepay.common.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wepay.common.pay.Callback;
import org.wepay.common.pay.PostBusiness;
import org.wepay.common.util.HttpKit;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationHandler;
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
    private static final Log log = LogFactory.getLog(ProxyPayCallback.class);
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
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HttpServletRequest request = callback.getRequest();
        Map<String, String> result = HttpKit.resolveRequestData(request);
        String resultCode = result.get("result_code");
        log.info("回调 resultCode: " + resultCode);
        if ("SUCCESS".equals(resultCode)) {
            postBusiness.successBusinessHandler(result);
        }
        if ("FAIL".equals(resultCode)) {
            postBusiness.failureBusinessHandler(result);
        }
        return method.invoke(callback, args);
    }
}
