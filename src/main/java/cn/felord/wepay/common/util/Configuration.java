package cn.felord.wepay.common.util;

import cn.felord.wepay.common.annotation.ConfigProperties;
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
@ConfigProperties
public abstract class Configuration {
    private static final Logger log = LoggerFactory.getLogger(Configuration.class);


    private static void verifyProperties(String devMode, Properties props) throws PayException {
        if ("true".equals(devMode)) {
            String[] keys = {"appId", "mchId", "secretKey", "signType", "certPath"};
            for (String key : keys) {
                String value = props.getProperty(key);
                if ("".equals(value) || value == null) {
                    throw new PayException("require param  " + key + "  in properties is  not found");
                }
            }
        }
    }

    /**
     * Read default map.
     *
     * @return the map
     * @throws PayException the pay exception
     */
    public static Map<Object, Object> readDefault() throws PayException {

        ConfigProperties configProperties = AnnotationUtil.getAnnotation(Configuration.class, ConfigProperties.class);
        String fileName = "weChatConfig";
        if (configProperties != null) {
            fileName = configProperties.fileName();
        }
        Properties props = new Properties();
        try (InputStream in = Configuration.class.getClassLoader().getResourceAsStream(fileName + ".properties")) {
            props.load(in);
        } catch (FileNotFoundException e) {
            log.debug(fileName + ".properties  is not found", e);
        } catch (IOException e) {
            log.debug("read " + fileName + ".properties IOException", e);
        }
        String devMode = props.getProperty("devMode");
        if ("true".equals(devMode)) {
            verifyProperties(devMode, props);
        }
        return props;
    }


    /**
     * Read   map.
     *
     * @return the map
     * @throws PayException the pay exception
     */
    public Map<Object, Object> read() throws PayException {

        ConfigProperties configProperties = AnnotationUtil.getAnnotation(this.getClass(), ConfigProperties.class);
        String fileName = "weChatConfig";
        String notifyUrl = null;
        if (configProperties != null) {
            fileName = configProperties.fileName();
            notifyUrl = configProperties.notifyUrl();
        }
        Properties props = new Properties();
        try (InputStream in = Configuration.class.getClassLoader().getResourceAsStream(fileName + ".properties")) {
            props.load(in);
        } catch (FileNotFoundException e) {
            log.debug(fileName + ".properties  is not found", e);
        } catch (IOException e) {
            log.debug("read  " + fileName + ".properties IOException", e);
        }

        String devMode = props.getProperty("devMode");
        if (notifyUrl != null && !"".equals(notifyUrl)) {
            props.setProperty("notifyUrl", notifyUrl);
        }
        if ("true".equals(devMode)) {
            verifyProperties(devMode, props);
        }
        return props;
    }
}
