package org.hive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import org.hive.common.util.BeanUtil;
import org.hive.common.util.HttpKit;
import org.hive.common.util.StringUtil;
import org.hive.weChat.entity.PayRequestParams;
import org.hive.weChat.enumeration.WeChatPayTypeEnum;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

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
        Map<String, Object> sortedMap = BeanUtil.beanToSortedTreeMapWithoutNull(test);
        try {
            String sign = StringUtil.signatureGenerator(sortedMap, "", "192006250b4c09247ec02edce69f6a2d");
            sortedMap.put("sign", sign);
            String XML = StringUtil.mapToXML(sortedMap);
            System.out.println(XML);
            String s = HttpKit.httpPost(WeChatPayTypeEnum.APP.getApi(), XML);

            String d = new String(s.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(d);
        } catch (SignatureException | UnsupportedEncodingException | RequiredParamException e) {
            e.printStackTrace();
        }
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
}
