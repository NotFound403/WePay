package org.hive.common.pay;

import org.hive.common.exception.PayException;

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
     * @return the t
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1">腾讯微信支付统一下单文档</a>
     */
    Map<String, String> unifiedOrder() throws PayException;

    /**
     * 通过订单号查询订单.
     *
     * @param orderId         订单号  微信订单号 transaction_id    商户订单号 out_trade_no 二选一
     * @param isTransactionId 是否采用微信订单号
     * @return the map
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_2&index=4">腾讯微信支付查询订单</a>
     */
    Map<String, String> orderQuery(String orderId, boolean isTransactionId) throws PayException;
}

