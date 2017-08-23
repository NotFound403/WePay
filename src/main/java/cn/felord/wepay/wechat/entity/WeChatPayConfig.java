package cn.felord.wepay.wechat.entity;

import cn.felord.wepay.common.exception.PayException;
import cn.felord.wepay.common.pay.Decryptable;
import cn.felord.wepay.common.pay.PayConfig;
import cn.felord.wepay.common.util.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Map;

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
    // 证书路径
    private String certPath;
    // 开发模式开关
    private String devMode;

    /**
     * Instantiates a new We chat pay config.
     *
     * @param decryptable the decryptable
     */
    public <C extends Configuration> WeChatPayConfig(Decryptable decryptable, Class<C> clazz) throws PayException, IllegalAccessException, InstantiationException {
        C c = clazz.newInstance();
        Map<Object, Object> config = c == null ? Configuration.readDefault() : c.read();
        String appId = (String) config.get("appId");
        String mchId = (String) config.get("mchId");
        String secKey = (String) config.get("secretKey");
        String notifyUrl = (String) config.get("notifyUrl");
        String signType = (String) config.get("signType");
        String cert = (String) config.get("certPath");
        String dev = (String) config.get("devMode");
        if (decryptable != null) {
            this.appid = decryptable.decrypt(appId);
            this.mch_id = decryptable.decrypt(mchId);
            this.secretKey = decryptable.decrypt(secKey);
            this.notify_url = decryptable.decrypt(notifyUrl);
            this.sign_type = signType;
            this.certPath = cert != null ? decryptable.decrypt(cert) : null;
            this.devMode = dev;
        } else {
            this.appid = appId;
            this.mch_id = mchId;
            this.secretKey = secKey;
            this.notify_url = notifyUrl;
            this.sign_type = signType;
            this.certPath = cert;
            this.devMode = dev;
        }
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

    @Override
    public String getDevMode() {
        return devMode;
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
                ", certPath:" + certPath +
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
