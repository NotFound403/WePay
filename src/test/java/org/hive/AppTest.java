package org.hive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hive.common.util.BeanUtil;
import org.hive.common.util.MD5Util;

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
        System.out.println(sortedMap);
        StringBuffer stringBuffer=new StringBuffer();
        for (String s: sortedMap.keySet()) {
            stringBuffer.append(s).append("=").append(sortedMap.get(s)).append("&");
        }
        System.out.println(MD5Util.MD5Encode(stringBuffer.append("key=192006250b4c09247ec02edce69f6a2d").toString(),null));
    }
}
