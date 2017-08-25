package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 招商商家报名分页查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignRecruitApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2631813337975424697L;

	/**
	 * 运营活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 分页号
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小,最大值200
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * <p>Getter for the field <code>campId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampId() {
		return this.campId;
	}
	/**
	 * <p>Setter for the field <code>campId</code>.</p>
	 *
	 * @param campId a {@link java.lang.String} object.
	 */
	public void setCampId(String campId) {
		this.campId = campId;
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
