package org.wepay.ali.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import org.wepay.ali.enumeration.AliPayTypeEnum;
import org.wepay.common.exception.PayException;
import org.wepay.common.pay.NativeBusiness;
import org.wepay.common.pay.Params;
import org.wepay.common.pay.PayConfig;
import org.wepay.common.pay.Payable;
import org.wepay.common.util.ObjectUtils;
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

    private PayConfig aliPayConfig;

    @Override
    public Map<String, Object> payByJsApi(Params payRequestParams) throws PayException {
        return null;
    }

    @Override
    public Map<String, Object> payByApp(Params payRequestParams) throws PayException {
        String appId = aliPayConfig.getAppid();
        AlipayClient alipayClient = new DefaultAlipayClient(AliPayTypeEnum.PAY.getApi(), appId, "", "", "", "");
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        request.setBizContent(ObjectUtils.beanToJson(payRequestParams));

        try {
            AlipayTradeAppPayResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                System.out.println("success");
            } else {
                System.out.println("fail");
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }


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
