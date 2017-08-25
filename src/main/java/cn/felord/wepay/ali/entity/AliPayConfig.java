package cn.felord.wepay.ali.entity;

/**
 * Created with IntelliJ IDEA.
 * Author: Dax
 * Description:
 * Date: 17-8-14
 * Time: 下午11:08
 *
 * @author lenovo
 * @version $Id: $Id
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

    /**
     * <p>getFormat.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFormat() {
        return "JSON";
    }

    /**
     * <p>getVersion.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getVersion() {
        return "1.0";
    }

    /**
     * <p>getAppid.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppid() {
        return app_id;
    }

    /**
     * <p>setAppid.</p>
     *
     * @param app_id a {@link java.lang.String} object.
     */
    public void setAppid(String app_id) {
        this.app_id = app_id;
    }

    /**
     * <p>Getter for the field <code>charset</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCharset() {
        return charset;
    }

    /**
     * <p>Setter for the field <code>charset</code>.</p>
     *
     * @param charset a {@link java.lang.String} object.
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * <p>getSignType.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSignType() {
        return sign_type;
    }

    /**
     * <p>setSignType.</p>
     *
     * @param sign_type a {@link java.lang.String} object.
     */
    public void setSignType(String sign_type) {
        this.sign_type = sign_type;
    }

    /**
     * <p>Getter for the field <code>sign</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSign() {
        return sign;
    }

    /**
     * <p>Setter for the field <code>sign</code>.</p>
     *
     * @param sign a {@link java.lang.String} object.
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * <p>Getter for the field <code>timestamp</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * <p>Setter for the field <code>timestamp</code>.</p>
     *
     * @param timestamp a {@link java.lang.String} object.
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>Getter for the field <code>notify_url</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNotify_url() {
        return notify_url;
    }

    /**
     * <p>Setter for the field <code>notify_url</code>.</p>
     *
     * @param notify_url a {@link java.lang.String} object.
     */
    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * <p>Getter for the field <code>app_auth_token</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApp_auth_token() {
        return app_auth_token;
    }

    /**
     * <p>Setter for the field <code>app_auth_token</code>.</p>
     *
     * @param app_auth_token a {@link java.lang.String} object.
     */
    public void setApp_auth_token(String app_auth_token) {
        this.app_auth_token = app_auth_token;
    }

    /**
     * <p>Getter for the field <code>biz_content</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBiz_content() {
        return biz_content;
    }

    /**
     * <p>Setter for the field <code>biz_content</code>.</p>
     *
     * @param biz_content a {@link java.lang.String} object.
     */
    public void setBiz_content(String biz_content) {
        this.biz_content = biz_content;
    }

    /**
     * <p>Getter for the field <code>privateKey</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * <p>Setter for the field <code>privateKey</code>.</p>
     *
     * @param privateKey a {@link java.lang.String} object.
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>Getter for the field <code>publicKey</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * <p>Setter for the field <code>publicKey</code>.</p>
     *
     * @param publicKey a {@link java.lang.String} object.
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
