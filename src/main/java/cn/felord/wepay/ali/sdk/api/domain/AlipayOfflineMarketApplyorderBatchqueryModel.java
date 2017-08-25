package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分页查询Leads、门店、商品相关操作流水信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketApplyorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4395233533213619691L;

	/**
	 * 操作动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝流水ID列表，最大不超过100个
	 */
	@ApiListField("apply_ids")
	@ApiField("string")
	private List<String> applyIds;

	/**
	 * 业务主体ID。根据biz_type不同可能对应shop_id或item_id。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型：SHOP-店铺，ITEM-商品。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询的流水创建时间最后值。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 系统集成商统一传入ISV
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认20个结果为一页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页记录数。默认20，最大100。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 请求ID列表，最大不超过100个。
注意：暂时不支持此字段查询。
	 */
	@ApiListField("request_ids")
	@ApiField("string")
	private List<String> requestIds;

	/**
	 * 查询的流水创建时间起始值，只能查询近3个月数据。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>action</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAction() {
		return this.action;
	}
	/**
	 * <p>Setter for the field <code>action</code>.</p>
	 *
	 * @param action a {@link java.lang.String} object.
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * <p>Getter for the field <code>applyIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getApplyIds() {
		return this.applyIds;
	}
	/**
	 * <p>Setter for the field <code>applyIds</code>.</p>
	 *
	 * @param applyIds a {@link java.util.List} object.
	 */
	public void setApplyIds(List<String> applyIds) {
		this.applyIds = applyIds;
	}

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
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
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>opId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpId() {
		return this.opId;
	}
	/**
	 * <p>Setter for the field <code>opId</code>.</p>
	 *
	 * @param opId a {@link java.lang.String} object.
	 */
	public void setOpId(String opId) {
		this.opId = opId;
	}

	/**
	 * <p>Getter for the field <code>opRole</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpRole() {
		return this.opRole;
	}
	/**
	 * <p>Setter for the field <code>opRole</code>.</p>
	 *
	 * @param opRole a {@link java.lang.String} object.
	 */
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.Long} object.
	 */
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
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
	 * <p>Getter for the field <code>requestIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getRequestIds() {
		return this.requestIds;
	}
	/**
	 * <p>Setter for the field <code>requestIds</code>.</p>
	 *
	 * @param requestIds a {@link java.util.List} object.
	 */
	public void setRequestIds(List<String> requestIds) {
		this.requestIds = requestIds;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
