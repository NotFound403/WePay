package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 现金活动列表查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5751276949822435582L;

	/**
	 * 要查询的活动状态,不填默认返回所有类型。
可填:
ALL:所有类型的活动
CREATED: 已创建未打款
PAID:已打款
READY:活动已开始
PAUSE:活动已暂停
CLOSED:活动已结束
SETTLE:活动已清算
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 分页查询时的页码，从1开始
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 分页查询时每页返回的列表大小,最大为50
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * <p>Getter for the field <code>campStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStatus() {
		return this.campStatus;
	}
	/**
	 * <p>Setter for the field <code>campStatus</code>.</p>
	 *
	 * @param campStatus a {@link java.lang.String} object.
	 */
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	/**
	 * <p>Getter for the field <code>pageIndex</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageIndex() {
		return this.pageIndex;
	}
	/**
	 * <p>Setter for the field <code>pageIndex</code>.</p>
	 *
	 * @param pageIndex a {@link java.lang.String} object.
	 */
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
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
