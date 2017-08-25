package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销活动指标查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2367145492475737969L;

	/**
	 * 开始日期,格式:yyyyMMdd
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 业务类型，可选值有六个
1，MemberQuery 商户会员数据查询
2，MemberQueryByStore 门店会员数据查询
3，TradeQuery 商户交易数据查询
4，TradeQueryByStore 门店交易数据查询
5，CampaignQuery 商户活动数据查询
6，CampaignQueryByStore 门店活动数据查询
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期 格式:yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * camp_id：为活动ID
sort_field：为排序指标KEY
sort_type：ASC表示升序,DESC表示降序
store_Ids：为门店ID，多个门店使用逗号分隔
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页记录数,不能超过50，默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

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
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.String} object.
	 */
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
