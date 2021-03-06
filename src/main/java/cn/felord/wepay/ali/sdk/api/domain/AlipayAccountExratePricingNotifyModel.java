package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 源汇率受理通知接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExratePricingNotifyModel extends AlipayObject {

    private static final long serialVersionUID = 8292172438312828797L;

    /**
     * 标识该汇率提供给哪个客户使用
     */
    @ApiField("client_id")
    private String clientId;

    /**
     * 源汇率机构
     */
    @ApiField("inst")
    private String inst;

    /**
     * 源汇率数据
     */
    @ApiListField("pricing_list")
    @ApiField("pricing_v_o")
    private List<PricingVO> pricingList;

    /**
     * 该汇率的使用场景
     */
    @ApiField("segment_id")
    private String segmentId;

    /**
     * 所在时区，所有的时间都是该时区的时间
     * 支持 GMT+8 UTC+0 Europe/London 的格式
     */
    @ApiField("time_zone")
    private String timeZone;

    /**
     * Gets client id.
     *
     * @return the client id
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Sets client id.
     *
     * @param clientId the client id
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets inst.
     *
     * @return the inst
     */
    public String getInst() {
        return this.inst;
    }

    /**
     * Sets inst.
     *
     * @param inst the inst
     */
    public void setInst(String inst) {
        this.inst = inst;
    }

    /**
     * Gets pricing list.
     *
     * @return the pricing list
     */
    public List<PricingVO> getPricingList() {
        return this.pricingList;
    }

    /**
     * Sets pricing list.
     *
     * @param pricingList the pricing list
     */
    public void setPricingList(List<PricingVO> pricingList) {
        this.pricingList = pricingList;
    }

    /**
     * Gets segment id.
     *
     * @return the segment id
     */
    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * Sets segment id.
     *
     * @param segmentId the segment id
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * Gets time zone.
     *
     * @return the time zone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * Sets time zone.
     *
     * @param timeZone the time zone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
