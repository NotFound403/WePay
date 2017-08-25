package cn.felord.wepay.common.pay;

/**
 * 支付方式.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  11:32
 */
public interface PayType {
    /**
     * 获取支付方式.
     *
     * @return the type
     */
    String getType();

    /**
     * 获取支付的具体接口.
     *
     * @return the api url
     */
    String getApi();

}
