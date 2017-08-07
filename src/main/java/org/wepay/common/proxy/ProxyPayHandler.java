package org.wepay.common.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wepay.common.exception.PayException;
import org.wepay.common.pay.Payable;
import org.wepay.common.pay.PreBusinessService;

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
 * @since 2017/7/25  14:37
 */


public class ProxyPayHandler implements InvocationHandler {
    private static final Log log = LogFactory.getLog(ProxyPayHandler.class);
    private Payable target;
    private PreBusinessService preBusinessService;

    public ProxyPayHandler(Payable target, PreBusinessService preBusinessService) {
        this.target = target;
        this.preBusinessService = preBusinessService;
    }

    public Payable initProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaceClazzs = target.getClass().getInterfaces();
        return (Payable) Proxy.newProxyInstance(classLoader, interfaceClazzs, this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object invoke(Object proxy, Method method, Object[] args) throws PayException, InvocationTargetException, IllegalAccessException {
        Object payResult = method.invoke(target, args);
        Map<String, String> map = (Map<String, String>) payResult;
        String resultCode = map != null ? map.get("result_code") : null;
        if ("SUCCESS".equals(resultCode)) {
            log.info("预支付成功 开始处理回调前的业务……");
            preBusinessService.preHandler();
            return payResult;
        }
        String returnMsg = "";
        if (map != null) {
            returnMsg = map.get("err_code_des");
        }
        throw new PayException(returnMsg);
    }
}
