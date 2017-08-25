/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package cn.felord.wepay.ali.sdk.api;

import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;

import java.io.OutputStream;
import java.util.Map;

/**
 * 多媒体文件下载请求
 *
 * @author yikai.hu
 * @version $Id : AlipayMobilePublicMultiMediaDownloadRequest.java, v 0.1 Aug 15, 2014 10:19:15 AM yikai.hu Exp $
 */
public class AlipayMobilePublicMultiMediaDownloadRequest implements
        AlipayRequest<AlipayMobilePublicMultiMediaDownloadResponse> {

    private AlipayHashMap udfParams;         // add user-defined text parameters
    private String apiVersion = "1.0";

    private String notifyUrl;

    private OutputStream outputStream;

    private String bizContent;
    private String terminalType;
    private String terminalInfo;
    private String prodCode;

    /**
     * Gets biz content.
     *
     * @return the biz content
     */
    public String getBizContent() {
        return this.bizContent;
    }

    /**
     * Sets biz content.
     *
     * @param bizContent the biz content
     */
    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    /**
     * <p>Getter for the field <code>apiVersion</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** {@inheritDoc} */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * <p>Getter for the field <code>terminalType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    /** {@inheritDoc} */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    /**
     * <p>Getter for the field <code>terminalInfo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalInfo() {
        return this.terminalInfo;
    }

    /** {@inheritDoc} */
    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    /**
     * <p>Getter for the field <code>prodCode</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /** {@inheritDoc} */
    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    /**
     * <p>getApiMethodName.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApiMethodName() {
        return "alipay.mobile.public.multimedia.download";
    }

    /**
     * <p>getTextParams.</p>
     *
     * @return a {@link java.util.Map} object.
     */
    public Map<String, String> getTextParams() {
        AlipayHashMap txtParams = new AlipayHashMap();
        txtParams.put("biz_content", this.bizContent);
        if (udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    /**
     * Put other text param.
     *
     * @param key   the key
     * @param value the value
     */
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new AlipayHashMap();
        }
        this.udfParams.put(key, value);
    }

    /**
     * Getter method for property <tt>outputStream</tt>.
     *
     * @return property value of outputStream
     */
    public OutputStream getOutputStream() {
        return outputStream;
    }

    /**
     * Setter method for property <tt>outputStream</tt>.
     *
     * @param outputStream value to be assigned to property outputStream
     */
    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    /**
     * Getter method for property <tt>notifyUrl</tt>.
     *
     * @return property value of notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * {@inheritDoc}
     *
     * Setter method for property <tt>notifyUrl</tt>.
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * <p>getResponseClass.</p>
     *
     * @return a {@link java.lang.Class} object.
     */
    public Class<AlipayMobilePublicMultiMediaDownloadResponse> getResponseClass() {
        return AlipayMobilePublicMultiMediaDownloadResponse.class;
    }

    /**
     * <p>isNeedEncrypt.</p>
     *
     * @see cn.felord.wepay.ali.sdk.api.AlipayRequest#isNeedEncrypt()
     * @return a boolean.
     */
    public boolean isNeedEncrypt() {
        return false;
    }

    /** {@inheritDoc} */
    public void setNeedEncrypt(boolean needEncrypt) {

        throw new RuntimeException("当前请求不支持加密！");
    }

    /**
     * <p>getReturnUrl.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReturnUrl() {
        return null;
    }

    /** {@inheritDoc} */
    public void setReturnUrl(String returnUrl) {
    }

    /**
     * <p>getBizModel.</p>
     *
     * @return a {@link cn.felord.wepay.ali.sdk.api.AlipayObject} object.
     */
    public AlipayObject getBizModel() {
        return null;
    }

    /** {@inheritDoc} */
    public void setBizModel(AlipayObject bizModel) {
    }

}
