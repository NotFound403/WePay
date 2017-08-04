package org.wepay.common.pay;

import org.wepay.common.exception.PayException;
import org.wepay.wechat.enumeration.IdTypeEnum;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  11:54
 */


public interface Payable {
    /**
     * 统一下单.
     *
     * @param weChatPayTypeEnum 交易类型
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1">腾讯微信支付统一下单文档</a>
     */
    Map<String, String> unifiedOrder(PayType weChatPayTypeEnum) throws PayException;

    /**
     * 通过订单号查询订单.
     *
     * @param orderId    订单号  微信订单号 transaction_id    商户订单号 out_trade_no 二选一
     * @param idTypeEnum 订单号类型
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_2&index=4">腾讯微信支付查询订单</a>
     */
    Map<String, String> orderQuery(String orderId, IdTypeEnum idTypeEnum) throws PayException;

    /**
     * 关闭订单.
     *
     * @param outTradeNo 此处为商户订单号 不是微信订单号
     * @return the map
     * @throws PayException the pay exception
     */
    Map<String, String> closeOrder(String outTradeNo) throws PayException;

    /**
     * 查询退款.
     *
     * @param orderId    订单号 四选一
     * @param idTypeEnum 对应订单号的四种类型
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_5&index=7">腾讯微信支付查询退款</a>
     */
    Map<String, String> refundQuery(String orderId, IdTypeEnum idTypeEnum) throws PayException;

}

