package org.hive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import org.hive.common.util.BeanUtil;
import org.hive.common.util.StringUtil;
import org.hive.weChat.entity.PayRequestParams;

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

      PayRequestParams test =new PayRequestParams();
        test.setAppid("wxd930ea5d5a258f4f");
        test.setMch_id("10000100");
        test.setBody("test");
        test.setDevice_info("1000");
        test.setNonce_str("ibuaiVcKdpRxkhJA");
        Map<String, Object> sortedMap = BeanUtil.beanToSortedTreeMapWithoutNull(test);
        try {
            String sign = StringUtil.signatureGenerator(sortedMap, "", "192006250b4c09247ec02edce69f6a2d");
            sortedMap.put("sign",sign);
          String XML=  StringUtil.mapToXML(sortedMap);
            System.out.println(XML);
        } catch (SignatureException |RequiredParamException e) {
            e.printStackTrace();
        }
    }

    public void testA() {
        String E = StringUtil.encryptBasedDes("吴亚奇");
        System.out.println(E);
        System.out.println(StringUtil.decryptBasedDes(E));
    }
}
