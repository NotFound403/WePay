package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询券模板列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherTemplatelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7626746961818538139L;

	/**
	 * 模板创建结束时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_end_time")
	private Date createEndTime;

	/**
	 * 模板创建开始时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_start_time")
	private Date createStartTime;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为30
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * <p>Getter for the field <code>createEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreateEndTime() {
		return this.createEndTime;
	}
	/**
	 * <p>Setter for the field <code>createEndTime</code>.</p>
	 *
	 * @param createEndTime a {@link java.util.Date} object.
	 */
	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	/**
	 * <p>Getter for the field <code>createStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getCreateStartTime() {
		return this.createStartTime;
	}
	/**
	 * <p>Setter for the field <code>createStartTime</code>.</p>
	 *
	 * @param createStartTime a {@link java.util.Date} object.
	 */
	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
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
