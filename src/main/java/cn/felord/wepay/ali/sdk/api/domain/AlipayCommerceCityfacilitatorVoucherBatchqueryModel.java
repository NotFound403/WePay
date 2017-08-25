package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 地铁购票订单批量查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherBatchqueryModel extends AlipayObject {

    private static final long serialVersionUID = 7729392424846147327L;

    /**
     * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
     * 已支持城市：广州 440100，深圳 440300，杭州330100。
     */
    @ApiField("city_code")
    private String cityCode;

    /**
     * 支付宝交易号列表
     */
    @ApiListField("trade_nos")
    @ApiField("string")
    private List<String> tradeNos;

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
     * Gets trade nos.
     *
     * @return the trade nos
     */
    public List<String> getTradeNos() {
        return this.tradeNos;
    }

    /**
     * Sets trade nos.
     *
     * @param tradeNos the trade nos
     */
    public void setTradeNos(List<String> tradeNos) {
        this.tradeNos = tradeNos;
    }

}
