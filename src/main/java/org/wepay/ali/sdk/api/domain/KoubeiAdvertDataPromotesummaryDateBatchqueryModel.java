package org.wepay.ali.sdk.api.domain;

import java.util.Date;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑客日期维度汇总数据查询
 *
 * @author auto create
 * @since 1.0, 2017-06-09 15:39:43
 */
public class KoubeiAdvertDataPromotesummaryDateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1738264964573465479L;

	/**
	 * 广告id  
如果有这个参数默认搜索这个广告标的的汇总信息并忽略voucher_name参数
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 券名称 支持模糊搜索
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
