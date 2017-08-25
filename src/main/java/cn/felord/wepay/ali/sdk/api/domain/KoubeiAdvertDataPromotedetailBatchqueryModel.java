package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * koubei.advert.commission.promotedata.itemsummary
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertDataPromotedetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7771847681229326481L;

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
	 * 当前页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页大小(分页参数)
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 商品券名称 支持模糊搜索
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * <p>Getter for the field <code>endDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndDate() {
		return this.endDate;
	}
	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.util.Date} object.
	 */
	public void setEndDate(Date endDate) {
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
	 * <p>Getter for the field <code>pageIndex</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageIndex() {
		return this.pageIndex;
	}
	/**
	 * <p>Setter for the field <code>pageIndex</code>.</p>
	 *
	 * @param pageIndex a {@link java.lang.Long} object.
	 */
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
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

	/**
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDate() {
		return this.startDate;
	}
	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.util.Date} object.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * <p>Getter for the field <code>voucherName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherName() {
		return this.voucherName;
	}
	/**
	 * <p>Setter for the field <code>voucherName</code>.</p>
	 *
	 * @param voucherName a {@link java.lang.String} object.
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
