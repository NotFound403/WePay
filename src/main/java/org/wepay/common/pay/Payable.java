package org.wepay.common.pay;

import org.wepay.common.exception.PayException;
import org.wepay.common.exception.RequiredParamException;
import org.wepay.wechat.enumeration.OrderIdTypeEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
     * 公众号内H5发起支付  公众号支付.
     *
     * @param payRequestParams  业务参数   基础参数自动注入
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1">腾讯微信支付统一下单文档</a>
     */
    Map<String, Object> payByJsApi(Params payRequestParams) throws PayException, RequiredParamException;

    /**
     * APP支付.
     *
     * @param payRequestParams 业务参数   基础参数自动注入
     * @return the map
     * @throws PayException the pay exception
     */
    Map<String, Object> payByApp(Params payRequestParams) throws PayException, RequiredParamException;

    /**
     * 扫码模式一.
     *
     * 适用场景自动售卖机 等   此为第一次回调配置  用于生成订单 调用统一支付     统一支付需要配置第二次回调
     *
     * @param request               the request
     * @param response              the response
     * @param nativeBusinessWrapper  业务处理  主要通过product_id 获取业务信息封装成Params 类型的参数
     * @return the map
     * @throws PayException the pay exception
     */
    Map<String, Object> nativeModeOneCallback(HttpServletRequest request, HttpServletResponse response, NativeBusiness nativeBusinessWrapper) throws PayException, RequiredParamException;

    /**
     * 扫码模式二.
     *
     * @param payRequestParams the pay request params
     * @param response         the response
     * @return the map
     * @throws PayException the pay exception
     */
    Map<String, Object> nativeModeTwo(Params payRequestParams, HttpServletResponse response) throws PayException, RequiredParamException;

    /**
     * H5支付.
     *
     * @param payRequestParams the pay request params
     * @return the map
     * @throws PayException the pay exception
     */
    Map<String, Object> payByH5(Params payRequestParams) throws PayException, RequiredParamException;
    /**
     * 通过订单号查询订单.
     *
     * @param orderId         订单号  微信订单号 transaction_id    商户订单号 out_trade_no 二选一
     * @param orderIdTypeEnum 订单号类型
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_2&index=4">腾讯微信支付查询订单</a>
     */
    Map<String, Object> orderQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException;

    /**
     * 关闭订单.
     *
     * @param outTradeNo 此处为商户订单号 不是微信订单号
     * @return the map
     * @throws PayException the pay exception
     */
    Map<String, Object> closeOrder(String outTradeNo) throws PayException;

    /**
     * 查询退款.
     *
     * @param orderId         订单号 四选一
     * @param orderIdTypeEnum 对应订单号的四种类型
     * @return the map
     * @throws PayException the pay exception
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_5&index=7">腾讯微信支付查询退款</a>
     */
    Map<String, Object> refundQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException;

}

