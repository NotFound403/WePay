package org.hive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hive.common.pay.Payable;
import org.hive.common.pay.PreBusinessHandler;
import org.hive.common.proxy.ProxyPayHandler;
import org.hive.common.service.PayHandler;
import org.hive.common.util.HttpKit;
import org.hive.common.util.StringUtil;
import org.hive.weChat.entity.PayRequestParams;
import org.hive.weChat.enumeration.WeChatPayTypeEnum;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        PayRequestParams test = new PayRequestParams();
        test.setAppid("wxd930ea5d5a258f4f");
        test.setMch_id("10000100");
        test.setBody("test");
        test.setDevice_info("1000");
        test.setNonce_str("ibuaiVcKdpRxkhJA");
        PayHandler payHandler = new PayHandler(WeChatPayTypeEnum.APP, test);
        PreBusinessHandler preBusinessHandler = new PreBusinessHandler() {
            @Override
            public Object prehandler() {
                System.out.println("开始处理预处理任务");
                return true;
            }
        };
        ProxyPayHandler proxyPayHandler = new ProxyPayHandler(payHandler,preBusinessHandler);
        Payable payable = proxyPayHandler.initProxy();
        payable.unifiedOrder();
    }

    public void testA() {
        String E = StringUtil.encryptBasedDes("吴亚奇");
        System.out.println(E);
        System.out.println(StringUtil.decryptBasedDes(E));
    }

    public void testB() {
        String url = "https://way.jd.com/he/freeweather";
        String s = HttpKit.httpPost(url, "city=zhengzhou&appkey=86ecfe69876b60bdbc1e67f9a3c77462");
        System.out.println(s);
    }

    public void testc() {
        String xml = "<xml>\n" +
                "    <stringName>jack</stringName>\n" +
                "    <age>18</age>\n" +
                "    <address>河南郑州</address>\n" +
                "    <description><![CDATA[<test demo>]]></description>\n" +
                "</xml>";
        System.out.println(StringUtil.XMLToMap(xml));
    }

    public void testD() {

    }
}
