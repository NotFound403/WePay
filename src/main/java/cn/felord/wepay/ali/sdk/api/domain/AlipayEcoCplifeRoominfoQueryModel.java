package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户根据需要调用该接口查询小区房屋信息列表。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeRoominfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2828893798862386943L;

	/**
	 * 传入该小区在支付宝社区物业平台中的唯一编号，通过小区创建和查询接口获取。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 分页查询的页码数，分页从1开始计数。该参数不传入的时候，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页最大数据条数。默认为200
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * <p>Getter for the field <code>communityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityId() {
		return this.communityId;
	}
	/**
	 * <p>Setter for the field <code>communityId</code>.</p>
	 *
	 * @param communityId a {@link java.lang.String} object.
	 */
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
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
