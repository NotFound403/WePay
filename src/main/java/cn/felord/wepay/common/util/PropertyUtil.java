package cn.felord.wepay.common.util;

import cn.felord.wepay.common.exception.PayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 * 读取配置文件.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /8/23  10:10
 */


public class PropertyUtil {
    private static final Logger log = LoggerFactory.getLogger(PropertyUtil.class);
    private static Properties props;

    static {
        loadProps();
    }

    private static synchronized void loadProps() {

        props = new Properties();

        try (InputStream in = PropertyUtil.class.getClassLoader().getResourceAsStream("weChatConfig.properties")) {
            props.load(in);
        } catch (FileNotFoundException e) {
            log.debug("weChatConfig.properties  is not found", e);
        } catch (IOException e) {
            log.debug("read weChatConfig.properties IOException", e);
        }
    }

    /**
     * Get property string.
     *
     * @param key the key
     * @return the string
     */
    public static String getProperty(String key) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    /**
     * Gets property.
     *
     * @param key          the key
     * @param defaultValue the default value
     * @return the property
     */
    public static String getProperty(String key, String defaultValue) {
        if (null == props) {
            loadProps();
        }

        return props.getProperty(key, defaultValue);
    }

    /**
     * Read to map map.
     *
     * @return the map
     * @throws PayException the pay exception
     */
    public static Map<Object, Object> readToMap() throws PayException {
        if (null == props) {
            loadProps();
        }
        verifyKey();
        return props;
    }

    private static void verifyKey() throws PayException {
        String[] keys = {"appId", "mchId", "secretKey", "signType", "notifyUrl", "openId", "certPath"};
        for (String key : keys) {
            String value = props.getProperty(key);
            if ( "".equals(value) ||value==null) {
                throw new PayException("配置文件中 必配参数 " + key + " 未找到");
            }
        }
    }
}
