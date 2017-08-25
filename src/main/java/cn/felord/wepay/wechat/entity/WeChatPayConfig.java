package cn.felord.wepay.wechat.entity;

import cn.felord.wepay.common.annotation.PayParam;
import cn.felord.wepay.common.exception.PayException;
import cn.felord.wepay.common.pay.Decryptable;
import cn.felord.wepay.common.pay.PayConfig;
import cn.felord.wepay.common.util.Configuration;
import cn.felord.wepay.wechat.enumeration.BaseParamEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Modifier;
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
    @PayParam(fieldName = BaseParamEnum.appid)
    private String appid;
    // 私钥  签名算法使用 必传
    @PayParam(fieldName = BaseParamEnum.secretKey)
    private String secretKey;
    // 微信支付分配的商户号 必传
    @PayParam(fieldName = BaseParamEnum.mch_id)
    private String mch_id;
    // 完整的通知地址  必传
    @PayParam(fieldName = BaseParamEnum.notify_url)
    private String notify_url;
    // 签名算法 默认MD5
    @PayParam(fieldName = BaseParamEnum.sign_type)
    private String sign_type;
    // 证书路径
    @PayParam(fieldName = BaseParamEnum.certPath)
    private String certPath;
    // 开发模式开关
    @PayParam(fieldName = BaseParamEnum.devMode)
    private String devMode;


    private WeChatPayConfig(Builder builder) {
        this.appid = builder.appId;
        this.secretKey = builder.secretKey;
        this.mch_id = builder.mchId;
        this.sign_type = builder.signType;
        this.certPath = builder.certPath;
        this.notify_url = builder.notifyUrl;
        this.devMode = builder.devMode;
    }

    /** {@inheritDoc} */
    @Override
    public String getAppid() {
        return appid;
    }

    /** {@inheritDoc} */
    @Override
    public String getMch_id() {
        return mch_id;
    }

    /** {@inheritDoc} */
    @Override
    public String getSecretKey() {
        return secretKey;
    }

    /** {@inheritDoc} */
    @Override
    public String getNotify_url() {
        return notify_url;
    }

    /** {@inheritDoc} */
    @Override
    public String getSign_type() {
        return sign_type;
    }

    /** {@inheritDoc} */
    @Override
    public String getDevMode() {
        return devMode;
    }

    /** {@inheritDoc} */
    @Override
    public String getCertPath() {
        return certPath;
    }

    /** {@inheritDoc} */
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

    /**
     * The type Builder.
     */
    public static class Builder {
        private String appId;
        private String secretKey;
        private String mchId;
        private String signType;
        private String certPath;
        private String notifyUrl;
        private String devMode;

        /**
         * Instantiates a new Builder.
         *
         * @param decryptable the decryptable
         * @param clazz       the clazz
         * @throws PayException the pay exception
         */
        public <C extends Configuration> Builder(Decryptable decryptable, Class<C> clazz) throws PayException {
//            String appId, String secretKey, String mchId, String signType, String certPath
            Map<Object, Object> config = null;
            try {
                config = Modifier.isAbstract(clazz.getModifiers()) ? Configuration.readDefault() : clazz.newInstance().read();
            } catch (InstantiationException | IllegalAccessException e) {
                log.debug(" can not create new Instance ", e);
            }
            if (config != null) {
                String id = (String) config.get("appId");
                String _mchId = (String) config.get("mchId");
                String secKey = (String) config.get("secretKey");
                String _notifyUrl = (String) config.get("notifyUrl");
                String _signType = (String) config.get("signType");
                String cert = (String) config.get("certPath");
                String dev = (String) config.get("devMode");
                if (decryptable != null) {
                    this.appId = decryptable.decrypt(id);
                    this.mchId = decryptable.decrypt(_mchId);
                    this.secretKey = decryptable.decrypt(secKey);
                    this.certPath = cert != null ? decryptable.decrypt(cert) : null;
                } else {
                    this.appId = id;
                    this.mchId = _mchId;
                    this.secretKey = secKey;
                    this.certPath = cert;

                }
                this.signType = _signType;
                this.devMode = dev;
                this.notifyUrl = _notifyUrl;
            }
        }

        /**
         * Build pay config.
         *
         * @return the pay config
         */
        public PayConfig build() {
            return new WeChatPayConfig(this);
        }
    }
}
