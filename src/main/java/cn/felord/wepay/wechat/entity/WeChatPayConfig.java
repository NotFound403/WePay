package cn.felord.wepay.wechat.entity;

import cn.felord.wepay.common.exception.PayException;
import cn.felord.wepay.common.pay.Decryptable;
import cn.felord.wepay.common.pay.PayConfig;

import java.io.Serializable;
import java.util.ResourceBundle;

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

    public WeChatPayConfig(Decryptable decryptable) throws PayException {
        ResourceBundle resource = ResourceBundle.getBundle("weChatConfig");

        String appId = resource.getString("appId");
        String mchId = resource.getString("mchId");
        String secKey = resource.getString("secretKey");
        String notifyUrl = resource.getString("notifyUrl");
        String openId = null;
        if (resource.containsKey("openId")) {
            openId = resource.getString("openId");
        }
        String dev = null;
        if (resource.containsKey("devMode")) {
            dev = resource.getString("devMode");
        }
        String cert = null;
        if (resource.containsKey("devMode")) {
            cert = resource.getString("certPath");
        }
        String signType = resource.getString("signType");


        if (decryptable != null) {
            this.appid = verifyParam(decryptable.decrypt(appId), "appid");
            this.mch_id = verifyParam(decryptable.decrypt(mchId), "mch_id");
            this.secretKey = verifyParam(decryptable.decrypt(secKey), "secretKey");
            this.notify_url = verifyParam(decryptable.decrypt(notifyUrl), "notify_url");
            this.sign_type = verifyParam(signType, "sign_type");
            this.openid = openId != null ? decryptable.decrypt(openId) : null;
            this.certPath = cert != null ? decryptable.decrypt(cert) : null;
            this.devMode = dev;
        } else {
            this.appid = appId;
            this.mch_id = mchId;
            this.secretKey = secKey;
            this.notify_url = notifyUrl;
            this.openid = openId;
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
