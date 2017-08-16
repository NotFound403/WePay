package org.wepay.ali.entity;

import org.wepay.common.pay.PayConfig;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-14
 * Time: 下午11:08
 */


public class AliPayConfig implements PayConfig {

    private String app_id;
    private String charset;
    private String sign_type;
    private String sign;
    private String  timestamp;
    private final String version="1.0";
    private String app_auth_token;
    private String biz_content;
    @Override
    public String getAppid() {
        return app_id;
    }

    @Override
    public String getSecretKey() {
        return null;
    }

    @Override
    public String getNotify_url() {
        return null;
    }

    @Override
    public String getSign_type() {
        return sign_type;
    }

    @Override
    public String getMch_id() {
        return null;
    }

    @Override
    public String getOpenid() {
        return null;
    }

    @Override
    public String getDevMode() {
        return null;
    }

    @Override
    public String getCertPath() {
        return null;
    }

    @Override
    public boolean isDevMode() {
        return false;
    }
}
