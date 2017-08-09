package org.wepay.common.pay;

import org.wepay.wechat.entity.PayRequestParams;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/8/9  17:37
 */


public interface NativeBusiness {
    PayRequestParams getParams(String productId);
}
