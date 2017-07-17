package org.hive.weChat.entity;

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


public final class RequiredParams {
    private static volatile RequiredParams instance;
    // 微信开放平台审核通过的应用APPID 必传
    private String appId;
    // 私钥  签名算法使用 必传
    private String secretKey;
    // 微信支付分配的商户号 必传
    private String mchId;
    // 通知地址  必传
    private String notifyUrl;
    // 签名算法 默认MD5
    private String signType;

    public static RequiredParams getInstance() {
        if (instance == null) {
            synchronized (RequiredParams.class) {
                instance = newInstance();
            }
        }
        return instance;
    }

    private static RequiredParams newInstance() {

        InputStream inputStream =ClassLoader.getSystemResourceAsStream("weChatConfig.properties");
        Properties properties = new Properties();
        RequiredParams params = new RequiredParams();
        try {
            properties.load(inputStream);
            params.setAppId(properties.getProperty("appId"));
            params.setMchId(properties.getProperty("mchId"));
            params.setNotifyUrl(properties.getProperty("notifyUrl"));
            params.setSecretKey(properties.getProperty("secretKey"));
            params.setSignType(properties.getProperty("signType"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return params;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
