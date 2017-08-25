package cn.felord.wepay.ali.service;


import cn.felord.wepay.ali.sdk.api.request.AlipayTradeAppPayRequest;
import cn.felord.wepay.ali.sdk.api.response.AlipayTradeAppPayResponse;
import cn.felord.wepay.ali.entity.AliPayConfig;
import cn.felord.wepay.ali.enumeration.AliPayTypeEnum;
import cn.felord.wepay.ali.sdk.api.AlipayApiException;
import cn.felord.wepay.ali.sdk.api.AlipayClient;
import cn.felord.wepay.ali.sdk.api.DefaultAlipayClient;
import cn.felord.wepay.common.exception.PayException;
import cn.felord.wepay.common.pay.NativeBusiness;
import cn.felord.wepay.common.pay.Params;
import cn.felord.wepay.common.pay.Payable;
import cn.felord.wepay.common.util.ObjectUtils;
import cn.felord.wepay.wechat.entity.RefundRequestParams;
import cn.felord.wepay.wechat.enumeration.OrderIdTypeEnum;

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

    private AliPayConfig aliPayConfig;

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByMicro(Params payRequestParams) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByJsApi(Params payRequestParams) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByApp(Params payRequestParams) throws PayException {
        AlipayClient alipayClient = alipayClientBuilder();
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

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> nativeModeOneCallback(HttpServletRequest request, HttpServletResponse response, NativeBusiness nativeBusinessWrapper) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> nativeModeTwo(Params payRequestParams, HttpServletResponse response) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> payByH5(Params payRequestParams) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> orderQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> closeOrder(String outTradeNo) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> refundQuery(String orderId, OrderIdTypeEnum orderIdTypeEnum) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> refund(RefundRequestParams refundRequestParams) throws PayException {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> billDownload(String billDate) throws PayException {
        return null;
    }

    private AlipayClient alipayClientBuilder() {
        String appId = aliPayConfig.getAppid();
        String privateKey = aliPayConfig.getPrivateKey();
        String format = aliPayConfig.getFormat();
        String charSet = aliPayConfig.getCharset();
        String publicKey = aliPayConfig.getPublicKey();
        return new DefaultAlipayClient(AliPayTypeEnum.PAY.getApi(), appId, privateKey, format, charSet, publicKey);
    }
}
