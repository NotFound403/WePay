package org.hive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.RandomStringUtils;
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

       String string= RandomStringUtils.randomAlphanumeric(32);
        System.out.println(string);
        System.out.println(WeChatPayTypeEnum.APP.getMethod());
    }
}
