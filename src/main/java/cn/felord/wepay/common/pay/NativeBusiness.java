package cn.felord.wepay.common.pay;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/9  17:37
 */


public interface NativeBusiness {
    /**
     * Gets params.
     *
     * @param productId 扫码支付模式一中的 product_id  用来查询 等  处理业务 并封装成参数集
     * @return the params
     */
    Params getParams(String productId);
}
