package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商户经营数据查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataMallIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5685358389131796183L;

	/**
	 * 开始日期,格式:yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 业务类型，目前可选值有5个
1，mallIndustryMemberStatistics	商户会员统计信息
2，mallIndustryTradeStatistics	行业交易统计信息
3，mallIndustryEventStatistics	行业活动统计信息
4，mallIndustryInfo	最新的行业维表信息
5，mallIndustryConsumptionStatistics	MALL消费能力统计信息
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期,格式:yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * camp_id：为活动ID
order_by：为排序指标KEY，目前只支持文档中给出的例子字段
order_type：ASC表示升序,DESC表示降序
cate_1_ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数,不能超过50。默认为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * <p>Getter for the field <code>beginDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBeginDate() {
		return this.beginDate;
	}
	/**
	 * <p>Setter for the field <code>beginDate</code>.</p>
	 *
	 * @param beginDate a {@link java.lang.String} object.
	 */
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>endDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndDate() {
		return this.endDate;
	}
	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.lang.String} object.
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.Long} object.
	 */
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
