package org.hive.common.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/17  10:28
 */


public class ProxyFactory extends AbstractProxyWrapper implements InvocationHandler {
    private static final Log log = LogFactory.getLog(ProxyFactory.class);

    public ProxyFactory(Object target, PayHandler payHandler, Object o) {
        super(target, payHandler, o);
    }


  /*    public static ProxyFactory getInstance(Object target, PayHandler payHandler) {
        if (instance == null) {
            synchronized (ProxyFactory.class) {
                instance = new ProxyFactory(target, payHandler);
            }
        }
        return instance;
    }*/

    public Object initProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaceClazzs = super.getTarget().getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaceClazzs, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //TODO  支付相关的业务逻辑
        log.info(" pay service is running");
        Object object = method.invoke(super.getTarget(), args);
        //TODO 支付相关的业务逻辑
        return object;
    }
}
