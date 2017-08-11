package org.wepay.wechat.demo;

import org.junit.Test;
import org.wepay.common.exception.PayException;
import org.wepay.common.pay.PayConfig;
import org.wepay.common.pay.Payable;
import org.wepay.common.pay.PreBusinessService;
import org.wepay.common.proxy.ProxyPayHandler;
import org.wepay.wechat.entity.PayRequestParams;
import org.wepay.wechat.entity.WeChatPayConfig;
import org.wepay.wechat.service.WeChatPayService;

import java.util.Map;

import static org.wepay.wechat.service.WeChatPayService.PARAMS_KEY;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-11
 * Time: 下午9:32
 */


public class WeChatPayTest {


    /**
     * 微信支付APP支付例子 开发时请使用开发模式便于调试 开启方式参看wiki中配置实例.
     * <p>
     * 其他支付雷同  回调同样的模式
     *
     * @return the map
     */
    @Test
    public void test() {
        System.out.println(appPay());
    }

    public Map<String, Object> appPay() {
        String ip = "192.168.1.102";
        String body = "wePay-test";
        String outTradeNo = "f7dsa9f676dsa0";
//        支付金额先转为分单位在注入实体类
        int totalFee = 1000 * 100;
        PayRequestParams params = new PayRequestParams();
        params.setBody(body);
        params.setSpbill_create_ip(ip);
        params.setOut_trade_no(outTradeNo);
        params.setTotal_fee(totalFee);
        try {
            PayConfig payConfig = WeChatPayConfig.initBaseConfig(null);
            Payable weChatPayService = new WeChatPayService(payConfig);
            ProxyPayHandler proxy = new ProxyPayHandler(weChatPayService, new PreBusinessService() {
                @Override
                public <T> T preHandler(Map<String, Object> result) {
//TODO                     统一下单后业务处理 实现  额外参数 请采用 实现类注入
                    PayRequestParams payRequestParams = (PayRequestParams) result.get(PARAMS_KEY);
//                    todo 实现业务   不用判断参数为空 已经在注入前进行了处理 所以此处的业务是  统一下单后你具体对应的业务
                    return null;
                }
            });
            Payable payable = proxy.initProxy();
            return payable.payByApp(params);
        } catch (PayException e) {
            e.printStackTrace();
        }
        return null;
    }
}
