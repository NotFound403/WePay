package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下渠道商凭核销码撤销该笔交易
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherCancelModel extends AlipayObject {

    private static final long serialVersionUID = 6181762775176128516L;

    /**
     * 渠道商提供的其它信息
     */
    @ApiField("biz_info_ext")
    private String bizInfoExt;

    /**
     * 城市标准码
     */
    @ApiField("city_code")
    private String cityCode;

    /**
     * 商户退款时间
     */
    @ApiField("operate_time")
    private String operateTime;

    /**
     * 核销号
     */
    @ApiField("ticket_no")
    private String ticketNo;

    /**
     * 支付宝交易号
     */
    @ApiField("trade_no")
    private String tradeNo;

    /**
     * Gets biz info ext.
     *
     * @return the biz info ext
     */
    public String getBizInfoExt() {
        return this.bizInfoExt;
    }

    /**
     * Sets biz info ext.
     *
     * @param bizInfoExt the biz info ext
     */
    public void setBizInfoExt(String bizInfoExt) {
        this.bizInfoExt = bizInfoExt;
    }

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
     * Gets operate time.
     *
     * @return the operate time
     */
    public String getOperateTime() {
        return this.operateTime;
    }

    /**
     * Sets operate time.
     *
     * @param operateTime the operate time
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
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
