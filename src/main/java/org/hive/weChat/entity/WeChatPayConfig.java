package org.hive.weChat.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hive.common.exception.RequiredParamException;
import org.hive.common.pay.PayConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 配置参数
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017 /7/17  15:06
 */


public final class WeChatPayConfig implements PayConfig {
    private static final Log log = LogFactory.getLog(WeChatPayConfig.class);
    private static final String PROPERTY_PLACEHOLDER = "weChatConfig.properties";
    private static final ThreadLocal<WeChatPayConfig> WE_CHAT_PAY_CONFIG_THREAD_LOCAL = new ThreadLocal<>();
    // 微信开放平台审核通过的应用APPID 必传
    private String appid;
    // 私钥  签名算法使用 必传
    private String secretKey;
    // 微信支付分配的商户号 必传
    private String mch_id;
    // 完整的通知地址  必传
    private String notify_url;
    // 签名算法 默认MD5
    private String sign_type;

    private WeChatPayConfig() throws RequiredParamException {
        log.info("开始加载配置文件 " + PROPERTY_PLACEHOLDER);
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(PROPERTY_PLACEHOLDER)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            this.appid = verifyParam(properties.getProperty("appid"));
            this.mch_id = verifyParam(properties.getProperty("mch_id"));
            this.secretKey = verifyParam(properties.getProperty("secretKey"));
            this.notify_url = verifyParam(properties.getProperty("notify_url"));
            this.sign_type = verifyParam(properties.getProperty("sign_type"));
        } catch (IOException e) {
            log.debug("配置文件 " + PROPERTY_PLACEHOLDER + " 读取异常", e);
        }
    }

    /**
     * Init base config pay config.
     *
     * @return the pay config
     */
    public static PayConfig initBaseConfig() throws RequiredParamException {
        if (WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get() == null) {
            synchronized (WeChatPayConfig.class) {
                if (WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get() == null) {
                    WeChatPayConfig weChatPayConfig = new WeChatPayConfig();
                    WE_CHAT_PAY_CONFIG_THREAD_LOCAL.set(weChatPayConfig);
                    return weChatPayConfig;
                }
            }
        }
        return WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get();
    }

    @Override
    public String getAppid() {
        return appid;
    }

    @Override
    public String getMch_id() {
        return mch_id;
    }

    @Override
    public String getSecretKey() {
        return secretKey;
    }

    @Override
    public String getNotify_url() {
        return notify_url;
    }

    @Override
    public String getSign_type() {
        return sign_type;
    }

    private String verifyParam(String str) throws RequiredParamException {
        if (!"".equals(str)) {
            return str;
        }
        throw new RequiredParamException("配置参数未填写或者为空，请检查");
    }
}
