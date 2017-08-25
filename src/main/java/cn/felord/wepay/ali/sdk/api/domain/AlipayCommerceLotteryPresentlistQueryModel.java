package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询调用者指定时间范围内的彩票赠送列表，由亚博科技提供服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceLotteryPresentlistQueryModel extends AlipayObject {

    private static final long serialVersionUID = 4421352247679839318L;

    /**
     * 结束日期，格式为yyyyMMdd
     */
    @ApiField("gmt_end")
    private String gmtEnd;

    /**
     * 开始日期，格式为yyyyMMdd
     */
    @ApiField("gmt_start")
    private String gmtStart;

    /**
     * 页号，必须大于0，默认为1
     */
    @ApiField("page_no")
    private Long pageNo;

    /**
     * 页大小，必须大于0，最大为500，默认为500
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
    }

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart() {
        return this.gmtStart;
    }

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
        this.gmtStart = gmtStart;
    }

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

}
