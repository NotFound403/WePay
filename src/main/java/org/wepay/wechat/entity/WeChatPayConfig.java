package org.wepay.wechat.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wepay.common.exception.PayException;
import org.wepay.common.pay.Decryptable;
import org.wepay.common.pay.PayConfig;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
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


public class WeChatPayConfig implements PayConfig, Serializable {
    private static final long serialVersionUID = 9096980878564215572L;
    private static final Logger log = LoggerFactory.getLogger(WeChatPayConfig.class);
    private static final String PROPERTY_PLACEHOLDER = "weChatConfig.properties";
    private static final ThreadLocal<WeChatPayConfig> WE_CHAT_PAY_CONFIG_THREAD_LOCAL = new ThreadLocal<>();
    // 微信开放平台审核通过的应用 appid 必传
    private String appid;
    // 私钥  签名算法使用 必传
    private String secretKey;
    // 微信支付分配的商户号 必传
    private String mch_id;
    // 完整的通知地址  必传
    private String notify_url;
    // 签名算法 默认MD5
    private String sign_type;
    private String openid;
    private String devMode;

    private WeChatPayConfig(Decryptable decryptable) throws PayException {
        decryptable = decryptable == null ? new Decryptable() {
            @Override
            public String decrypt(String original) {
                return doDecrypt(original);
            }

            private String doDecrypt(String original) {
                byte[] k = {65, 55, 70, 56, 102, 51, 118, 52, 68, 48, 111, 106, 57, 42, 12, 17};
                try {
                    SecretKeySpec skeySpec = new SecretKeySpec(k, "AES");
                    Cipher cipher = Cipher.getInstance("AES");
                    cipher.init(2, skeySpec);
                    byte[] encrypted1 = hex2byte(original);
                    byte[] bytes = cipher.doFinal(encrypted1);
                    return new String(bytes, "utf-8");
                } catch (Exception e) {
                    log.debug("解密错误：", e);
                }
                return null;
            }

            private byte[] hex2byte(String hex) {
                byte[] b = null;
                if (hex != null && hex.length() % 2 != 1) {
                    int l = hex.length();
                    b = new byte[l / 2];
                    for (int i = 0; i != l / 2; i++) {
                        b[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
                    }
                }
                return b;
            }
        } : decryptable;
        log.info("开始加载配置文件 " + PROPERTY_PLACEHOLDER);

        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(PROPERTY_PLACEHOLDER)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            this.appid = decryptable.decrypt(verifyParam(properties.getProperty("appId")));
            this.mch_id = decryptable.decrypt(verifyParam(properties.getProperty("mchId")));
            this.secretKey = decryptable.decrypt(verifyParam(properties.getProperty("secretKey")));
            this.notify_url = decryptable.decrypt(verifyParam(properties.getProperty("notifyUrl")));
            this.openid = decryptable.decrypt(properties.getProperty("openId"));
            this.sign_type = verifyParam(properties.getProperty("signType"));
            this.devMode = properties.getProperty("devMode");
        } catch (IOException e) {
            log.debug("配置文件 " + PROPERTY_PLACEHOLDER + " 读取异常", e);
        }
    }

    /**
     * Init base config pay config.
     *
     * @param decryptable 解密算法接口  最好自己实现
     * @return the pay config
     * @throws PayException the pay exception
     */
    public static PayConfig initBaseConfig(Decryptable decryptable) throws PayException {
        if (WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get() == null) {
            synchronized (WeChatPayConfig.class) {
                if (WE_CHAT_PAY_CONFIG_THREAD_LOCAL.get() == null) {
                    WeChatPayConfig weChatPayConfig = new WeChatPayConfig(decryptable);
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
    public String getOpenid() {
        return openid;
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

    @Override
    public String getDevMode() {
        return devMode;
    }

    private String verifyParam(String str) throws PayException {
        if (!"".equals(str)) {
            return str;
        }
        throw new PayException("配置项参数没有值，请检查");
    }
}
