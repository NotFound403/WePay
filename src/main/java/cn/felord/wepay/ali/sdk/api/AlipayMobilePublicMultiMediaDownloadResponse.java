/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package cn.felord.wepay.ali.sdk.api;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ��ý���ļ�������Ӧ
 *
 * @author yikai.hu
 * @version $Id : AlipayMobilePublicMultiMediaDownloadResponse.java, v 0.1 Aug 15, 2014 10:19:31 AM yikai.hu Exp $
 */
public class AlipayMobilePublicMultiMediaDownloadResponse extends AlipayResponse {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4500718209713594926L;

    @ApiField("code")
    private String code;

    @ApiField("msg")
    private String msg;

    /**
     * <p>Getter for the field <code>code</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCode() {
        return this.code;
    }

    /** {@inheritDoc} */
    public void setCode(String code) {
        this.code = code;
    }

    /** {@inheritDoc} */
    @Override
    public String getMsg() {
        return this.msg;
    }

    /** {@inheritDoc} */
    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
