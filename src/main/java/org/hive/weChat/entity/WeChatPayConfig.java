package org.hive.weChat.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
 * @since 2017/7/17  15:06
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

    private WeChatPayConfig() {
        log.info("开始加载配置文件 " + PROPERTY_PLACEHOLDER);
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(PROPERTY_PLACEHOLDER);
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            this.appid = properties.getProperty("appid");
            this.mch_id = properties.getProperty("mch_id");
            this.secretKey = properties.getProperty("secretKey");
            this.notify_url = properties.getProperty("notify_url");
            this.sign_type = properties.getProperty("sign_type");
        } catch (IOException e) {
            log.debug("配置文件 " + PROPERTY_PLACEHOLDER + " 不存在 或者路径 参数错误", e);
        }
    }

    public static PayConfig initBaseConfig() {
        if (WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get() == null) {
            synchronized (WeChatPayConfig.class) {
                if (WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get() == null) {
                    return new WeChatPayConfig();
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

}
