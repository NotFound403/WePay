package org.wepay.ali.service;

import org.wepay.common.exception.PayException;
import org.wepay.common.pay.NativeBusiness;
import org.wepay.common.pay.Params;
import org.wepay.common.pay.Payable;
import org.wepay.wechat.entity.RefundRequestParams;
import org.wepay.wechat.enumeration.OrderIdTypeEnum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/8/16  16:10
 */


public class AliPayService implements Payable {
    @Override
    public Map<String, Object> payByJsApi(Params payRequestParams) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> payByApp(Params payRequestParams) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> nativeModeOneCallback(HttpServletRequest request, HttpServletResponse response, NativeBusiness nativeBusinessWrapper) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> nativeModeTwo(Params payRequestParams, HttpServletResponse response) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> payByH5(Params payRequestParams) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> orderQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> closeOrder(String outTradeNo) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> refundQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> refund(RefundRequestParams refundRequestParams) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> billDownload(String billDate) throws PayException {
        return null;
    }
}
