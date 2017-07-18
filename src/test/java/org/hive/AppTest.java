package org.hive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.exception.SignatureException;
import org.hive.common.util.BeanUtil;
import org.hive.common.util.StringUtil;

import java.io.UnsupportedEncodingException;
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

        org.hive.weChat.entity.Test test = new org.hive.weChat.entity.Test();
        test.setAppid("wxd930ea5d5a258f4f");
        test.setMch_id("10000100");
        test.setBody("test");
        test.setDevice_info("1000");
        test.setNonce_str("ibuaiVcKdpRxkhJA");
        Map<String, Object> sortedMap = BeanUtil.beanToSortedTreeMapWithoutNull(test);
        try {
            String sign = StringUtil.signatureGenerator(sortedMap, "", "192006250b4c09247ec02edce69f6a2d");
            System.out.println(sign);
        } catch (SignatureException e) {
            e.printStackTrace();
        }
    }

    public void testA(){
        System.out.println(StringUtil.onceStrGenerator());
        String key="ssssssss";
        try {
            byte[] bytes = "SSSS".getBytes("UTF-8");
            for (byte b:bytes) {
                System.out.println(b);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
      try {
            String r=  StringUtil.encryptBasedDes("ABC",key);
            System.out.println(r);
            String d=StringUtil.decryptBasedDes(r,key);
            System.out.println(d);
        } catch (RequiredParamException e) {
            e.printStackTrace();
        }
    }
}
