package org.hive.weChat.entity;

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
    private static volatile WeChatPayConfig instance;
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

    public static WeChatPayConfig getInstance() {
        if (instance == null) {
            synchronized (WeChatPayConfig.class) {
                instance = newInstance();
            }
        }
        return instance;
    }

    private static WeChatPayConfig newInstance() {

        InputStream inputStream = ClassLoader.getSystemResourceAsStream("weChatConfig.properties");
        Properties properties = new Properties();
        WeChatPayConfig params = new WeChatPayConfig();
        try {
            properties.load(inputStream);
            params.setAppid(properties.getProperty("appid"));
            params.setMch_id(properties.getProperty("mch_id"));
            params.setNotify_url(properties.getProperty("notify_url"));
            params.setSign_type(properties.getProperty("sign_type"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return params;
    }

    @Override
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Override
    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    @Override
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    @Override
    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }
}
