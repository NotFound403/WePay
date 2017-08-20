package org.wepay.ali.entity;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-14
 * Time: 下午11:08
 */


public class AliPayConfig {

    private String app_id;
    private String charset;
    private String sign_type;
    private String sign;
    private String timestamp;
    private String notify_url;
    private String app_auth_token;
    private String biz_content;
    private String privateKey;
    private String publicKey;

    public String getFormat() {
        return "JSON";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getAppid() {
        return app_id;
    }

    public void setAppid(String app_id) {
        this.app_id = app_id;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSignType() {
        return sign_type;
    }

    public void setSignType(String sign_type) {
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

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getApp_auth_token() {
        return app_auth_token;
    }

    public void setApp_auth_token(String app_auth_token) {
        this.app_auth_token = app_auth_token;
    }

    public String getBiz_content() {
        return biz_content;
    }

    public void setBiz_content(String biz_content) {
        this.biz_content = biz_content;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
