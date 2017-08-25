package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 地铁购票发码退款
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherRefundModel extends AlipayObject {

    private static final long serialVersionUID = 2452447267763837652L;

    /**
     * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
     * 已支持城市：广州 440100，深圳 440300，杭州330100。
     */
    @ApiField("city_code")
    private String cityCode;

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
