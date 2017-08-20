package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 现金活动列表查询
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:53:33
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

	public String getCampStatus() {
		return this.campStatus;
	}
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
