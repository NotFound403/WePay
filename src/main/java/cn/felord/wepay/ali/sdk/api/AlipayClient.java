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
 */
public interface AlipayClient {

    /**
     * Execute t.
     *
     * @param <T>     the type parameter
     * @param request the request
     * @return t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends cn.felord.wepay.ali.sdk.api.AlipayResponse> T execute(cn.felord.wepay.ali.sdk.api.AlipayRequest<T> request) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;

    /**
     * Execute t.
     *
     * @param <T>       the type parameter
     * @param request   the request
     * @param authToken the auth token
     * @return t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends cn.felord.wepay.ali.sdk.api.AlipayResponse> T execute(cn.felord.wepay.ali.sdk.api.AlipayRequest<T> request,
                                                                            String authToken) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;

    /**
     * Execute t.
     *
     * @param <T>          the type parameter
     * @param request      the request
     * @param accessToken  the access token
     * @param appAuthToken the app auth token
     * @return t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends cn.felord.wepay.ali.sdk.api.AlipayResponse> T execute(cn.felord.wepay.ali.sdk.api.AlipayRequest<T> request, String accessToken,
                                                                            String appAuthToken) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;

    /**
     * Page execute t.
     *
     * @param <T>     the type parameter
     * @param request the request
     * @return t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends cn.felord.wepay.ali.sdk.api.AlipayResponse> T pageExecute(cn.felord.wepay.ali.sdk.api.AlipayRequest<T> request) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;

    /**
     * SDK客户端调用生成sdk字符串
     *
     * @param <T>     the type parameter
     * @param request the request
     * @return t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends cn.felord.wepay.ali.sdk.api.AlipayResponse> T sdkExecute(cn.felord.wepay.ali.sdk.api.AlipayRequest<T> request) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;

    /**
     * Page execute t.
     *
     * @param <T>     the type parameter
     * @param request the request
     * @param method  the method
     * @return t
     * @throws AlipayApiException the alipay api exception
     */
    public <T extends cn.felord.wepay.ali.sdk.api.AlipayResponse> T pageExecute(cn.felord.wepay.ali.sdk.api.AlipayRequest<T> request,
                                                                                String method) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;

    /**
     * 移动客户端同步结果返回解析的参考工具方法
     *
     * @param <TR>         the type parameter
     * @param <T>          the type parameter
     * @param result       移动客户端SDK同步返回的结果map，一般包含resultStatus，result和memo三个key
     * @param requsetClazz 接口请求request类，如App支付传入 AlipayTradeAppPayRequest.class
     * @return 同步返回结果的response对象 tr
     * @throws AlipayApiException the alipay api exception
     */
    public <TR extends cn.felord.wepay.ali.sdk.api.AlipayResponse, T extends cn.felord.wepay.ali.sdk.api.AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result,
                                                                                                                                                  Class<T> requsetClazz) throws cn.felord.wepay.ali.sdk.api.AlipayApiException;
}
