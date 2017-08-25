package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.voucher.create response.
 *
 * @author auto create
 * @version $Id : $Id
 */
public class AlipayFundAuthOrderVoucherCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 8283415181725563889L;

    /**
     * 码类型，分为  barCode：条形码 (一维码) 和 qrCode:二维码(qrCode) ；
     * 目前发码只支持 qrCode
     */
    @ApiField("code_type")
    private String codeType;

    /**
     * 生成的带有支付宝logo的二维码地址，如：<a href="http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a">参考文档</a>。 商户端通过在末尾追加picSize来指定要显示的图片大小，如
     * 显示1280大小的URL:<a href="http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a&picSize=1280">参考文档</a>。
     * 目前支持的大小有：256, 227, 270, 344, 430, 512, 570, 860, 1280, 1546；
     */
    @ApiField("code_url")
    private String codeUrl;

    /**
     * 当前发码请求生成的二维码码串，商户端可以利用二维码生成工具根据该码串值生成对应的二维码
     */
    @ApiField("code_value")
    private String codeValue;

    /**
     * 商户的授权资金订单号
     */
    @ApiField("out_order_no")
    private String outOrderNo;

    /**
     * 商户本次资金操作的请求流水号
     */
    @ApiField("out_request_no")
    private String outRequestNo;

    /**
     * <p>Getter for the field <code>codeType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * <p>Setter for the field <code>codeType</code>.</p>
     *
     * @param codeType a {@link java.lang.String} object.
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    /**
     * <p>Getter for the field <code>codeUrl</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCodeUrl() {
        return this.codeUrl;
    }

    /**
     * <p>Setter for the field <code>codeUrl</code>.</p>
     *
     * @param codeUrl a {@link java.lang.String} object.
     */
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    /**
     * <p>Getter for the field <code>codeValue</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCodeValue() {
        return this.codeValue;
    }

    /**
     * <p>Setter for the field <code>codeValue</code>.</p>
     *
     * @param codeValue a {@link java.lang.String} object.
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    /**
     * <p>Getter for the field <code>outOrderNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    /**
     * <p>Setter for the field <code>outOrderNo</code>.</p>
     *
     * @param outOrderNo a {@link java.lang.String} object.
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    /**
     * <p>Getter for the field <code>outRequestNo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    /**
     * <p>Setter for the field <code>outRequestNo</code>.</p>
     *
     * @param outRequestNo a {@link java.lang.String} object.
     */
    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

}
