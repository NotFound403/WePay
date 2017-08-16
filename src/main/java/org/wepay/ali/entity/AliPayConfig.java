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
    private String notify_url;
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
        return notify_url;
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


    public void setAppid(String appid) {
        this.app_id = app_id;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public String getAppAuthToken() {
        return app_auth_token;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.app_auth_token = appAuthToken;
    }

    public String getBizContent() {
        return biz_content;
    }

    public void setBizContent(String bizContent) {
        this.biz_content = bizContent;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notify_url = notifyUrl;
    }
}
