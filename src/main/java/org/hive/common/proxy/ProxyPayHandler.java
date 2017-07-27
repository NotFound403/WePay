package org.hive.common.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hive.common.exception.PayException;
import org.hive.common.pay.Payable;
import org.hive.common.pay.PreBusinessHandler;

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
    private PreBusinessHandler preBusinessHandler;

    public ProxyPayHandler(Payable target, PreBusinessHandler preBusinessHandler) {
        this.target = target;
        this.preBusinessHandler = preBusinessHandler;
    }

    public Payable initProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaceClazzs = target.getClass().getInterfaces();
        return (Payable) Proxy.newProxyInstance(classLoader, interfaceClazzs, this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object invoke(Object proxy, Method method, Object[] args) throws PayException {
        Object payResult = null;
        try {
            payResult = method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.debug("通过反射调用支付方法失败", e);
        }
        Map<String, String> map = (Map<String, String>) payResult;
        String returnCode = map != null ? map.get("return_code") : null;
        if ("SUCCESS".equals(returnCode)) {
            log.info("预支付成功 开始处理回调前的业务……");
          boolean f=  preBusinessHandler.prehandler();
            System.out.println(f);
            return payResult;
        }
        String returnMsg = map != null ? map.get("return_msg") : null;
        throw new PayException(returnMsg);
    }
}
