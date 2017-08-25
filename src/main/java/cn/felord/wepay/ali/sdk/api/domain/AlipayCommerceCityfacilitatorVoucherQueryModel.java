package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下地铁自助购票机上凭核销码取票，渠道商凭用户输入的核销码调接口查询核销码的有效性。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherQueryModel extends AlipayObject {

    private static final long serialVersionUID = 8368448368371433935L;

    /**
     * 城市标准码
     */
    @ApiField("city_code")
    private String cityCode;

    /**
     * 8位核销码
     */
    @ApiField("ticket_no")
    private String ticketNo;

    /**
     * 支付宝交易号
     */
    @ApiField("trade_no")
    private String tradeNo;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * Gets ticket no.
     *
     * @return the ticket no
     */
    public String getTicketNo() {
        return this.ticketNo;
    }

    /**
     * Sets ticket no.
     *
     * @param ticketNo the ticket no
     */
    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
        return this.tradeNo;
    }

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

}
