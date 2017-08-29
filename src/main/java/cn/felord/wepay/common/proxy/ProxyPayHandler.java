package cn.felord.wepay.common.proxy;

import cn.felord.wepay.common.pay.Payable;
import cn.felord.wepay.common.pay.PreBusinessService;
import cn.felord.wepay.wechat.enumeration.CollectionKeyEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * @since 2017 /7/25  14:37
 */
public class ProxyPayHandler implements InvocationHandler {
    private static final Logger log= LoggerFactory.getLogger(ProxyPayHandler.class);
    private Payable target;
    private PreBusinessService preBusinessService;

    /**
     * Instantiates a new Proxy pay handler.
     *
     * @param target             the target
     * @param preBusinessService the pre business service
     */
    public ProxyPayHandler(Payable target, PreBusinessService preBusinessService) {
        this.target = target;
        this.preBusinessService = preBusinessService;
    }

    /**
     * Init proxy payable.
     *
     * @return the payable
     */
    public Payable initProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaceClazzs = target.getClass().getInterfaces();
        return (Payable) Proxy.newProxyInstance(classLoader, interfaceClazzs, this);
    }

    /** {@inheritDoc} */
    @Override
    @SuppressWarnings("unchecked")
    public Object invoke(Object proxy, Method method, Object[] args) {

        Map<String, Object> map=null;
        try {
        map = (Map<String, Object>)method.invoke(target, args) ;
            if (preBusinessService != null) {
                preBusinessService.preHandler(map);
            }
            if (map.containsKey(CollectionKeyEnum.params_key.name())) {
                map.remove(CollectionKeyEnum.params_key.name());
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
           log.debug("payment proxy invoke is defeated",e);
        }
        return map;
    }
}
