package cn.felord.wepay.wechat.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.felord.wepay.common.exception.PayException;
import cn.felord.wepay.common.pay.Decryptable;
import cn.felord.wepay.common.pay.PayConfig;

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
    private static ThreadLocal<WeChatPayConfig> configThreadLocal = new ThreadLocal<>();
    private static final Decryptable DEFAULT_DECRYPTABLE = new Decryptable() {
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
            byte[] bytes = null;
            int radix = 16;
            if (hex != null && hex.length() % 2 != 1) {
                int len = hex.length();
                bytes = new byte[len / 2];
                for (int i = 0; i != len / 2; i++) {
                    bytes[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), radix);
                }
            }
            return bytes;
        }
    };
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
    // 证书路径
    private String certPath;
    // 开发模式开关
    private String devMode;

    private WeChatPayConfig(Decryptable decryptable) throws PayException {
        Decryptable dec = decryptable == null ? DEFAULT_DECRYPTABLE : decryptable;
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(PROPERTY_PLACEHOLDER)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String appId = properties.getProperty("appId");
            String mchId = properties.getProperty("mchId");
            String secKey = properties.getProperty("secretKey");
            String notifyUrl = properties.getProperty("notifyUrl");
            String openId = properties.getProperty("openId");
            String signType = properties.getProperty("signType");
            String dev = properties.getProperty("devMode");
            String certPath = properties.getProperty("certPath");
            this.appid = verifyParam(dec.decrypt(appId), "appid");
            this.mch_id = verifyParam(dec.decrypt(mchId), "mch_id");
            this.secretKey = verifyParam(dec.decrypt(secKey), "secretKey");
            this.notify_url = verifyParam(dec.decrypt(notifyUrl), "notify_url");
            this.openid = dec.decrypt(openId);
            this.sign_type = verifyParam(signType, "sign_type");
            this.certPath = dec.decrypt(certPath);
            this.devMode = dev;
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
        if (configThreadLocal.get() == null) {
            synchronized (WeChatPayConfig.class) {
                if (configThreadLocal.get() == null) {
                    WeChatPayConfig weChatPayConfig = new WeChatPayConfig(decryptable);
                    configThreadLocal.set(weChatPayConfig);
                    return weChatPayConfig;
                }
            }
        }
        return configThreadLocal.get();
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

    private String verifyParam(String str, String fieldName) throws PayException {
        if (str != null && !"".equals(str)) {
            return str;
        }
        throw new PayException("配置项参数 " + fieldName + " 没有值或者解密失败，请检查");
    }

    @Override
    public String getCertPath() {
        return certPath;
    }

    @Override
    public String toString() {
        return "{" +
                "appid:" + appid +
                ", secretKey:" + secretKey +
                ", mch_id:" + mch_id +
                ", notify_url:" + notify_url +
                ", sign_type:" + sign_type +
                ", openid:" + openid +
                ", devMode:" + devMode +
                '}';
    }

    /**
     * Is dev mode boolean.
     *
     * @return the boolean
     */
    public boolean isDevMode() {
        return "true".equals(devMode);
    }
}
