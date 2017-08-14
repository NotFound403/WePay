package org.wepay.common.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wepay.common.pay.Payable;
import org.wepay.common.pay.PreBusinessService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

import static org.wepay.wechat.service.WeChatPayService.PARAMS_KEY;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/25  14:37
 */


public class ProxyPayHandler implements InvocationHandler {
    private static final Logger log = LoggerFactory.getLogger(ProxyPayHandler.class);
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
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
//        System.out.println(method.getName());
        Object payResult = method.invoke(target, args);
        Map<String, Object> map = (Map<String, Object>) payResult;
        if (preBusinessService != null) {
            preBusinessService.preHandler(map);
        }
        if (map.containsKey(PARAMS_KEY)) {
            map.remove(PARAMS_KEY);
        }
        return map;
    }
}
