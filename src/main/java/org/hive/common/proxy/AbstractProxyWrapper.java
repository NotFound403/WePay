package org.hive.common.proxy;

import org.hive.common.service.PayHandler;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/17  13:55
 */


public abstract class AbstractProxyWrapper {

    private Object target;
    private PayHandler payHandler;
    private Object o;

    public AbstractProxyWrapper(Object target, PayHandler payHandler,Object o) {
        this.target = target;
        this.payHandler = payHandler;
        this.o=o;
    }

    public Object getTarget() {
        return target;
    }

    public PayHandler getPayHandler() {
        return payHandler;
    }
}
