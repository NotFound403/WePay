/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package cn.felord.wepay.ali.sdk.api;

import java.util.Map;

/**
 * The interface Alipay client.
 *
 * @author runzhi
 * @version $Id : $Id
 */
public interface AlipayClient {

    /**
     * Execute t.
     *
     * @param request the request
     * @return t t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T execute(AlipayRequest<T> request) throws AlipayApiException;

    /**
     * Execute t.
     *
     * @param request   the request
     * @param authToken the auth token
     * @return t t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T execute(AlipayRequest<T> request, String authToken) throws AlipayApiException;

    /**
     * Execute t.
     *
     * @param request      the request
     * @param accessToken  the access token
     * @param appAuthToken the app auth token
     * @return t t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken,
                                         String appAuthToken) throws AlipayApiException;

    /**
     * Page execute t.
     *
     * @param request the request
     * @return t t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException;

    /**
     * SDK客户端调用生成sdk字符串
     *
     * @param request the request
     * @return t t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> request) throws AlipayApiException;

    /**
     * Page execute t.
     *
     * @param request the request
     * @param method  the method
     * @return t t
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request,
                                             String method) throws AlipayApiException;

    /**
     * 移动客户端同步结果返回解析的参考工具方法
     *
     * @param result       移动客户端SDK同步返回的结果map，一般包含resultStatus，result和memo三个key
     * @param requsetClazz 接口请求request类，如App支付传入 AlipayTradeAppPayRequest.class
     * @return 同步返回结果的response对象 tr
     * @throws cn.felord.wepay.ali.sdk.api.AlipayApiException the alipay api exception
     */
    <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result, Class<T> requsetClazz) throws AlipayApiException;
}
