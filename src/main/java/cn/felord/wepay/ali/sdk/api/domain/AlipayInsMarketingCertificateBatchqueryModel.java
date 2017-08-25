package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分页查询凭证信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingCertificateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2385139213918611811L;

	/**
	 * 32
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 凭证类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 是否失效
	 */
	@ApiField("is_enabled")
	private String isEnabled;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拥有人uid
	 */
	@ApiField("owner_uid")
	private String ownerUid;

	/**
	 * 每页记录数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 凭证状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * <p>Getter for the field <code>certificateNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificateNo() {
		return this.certificateNo;
	}
	/**
	 * <p>Setter for the field <code>certificateNo</code>.</p>
	 *
	 * @param certificateNo a {@link java.lang.String} object.
	 */
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	/**
	 * <p>Getter for the field <code>certificateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertificateType() {
		return this.certificateType;
	}
	/**
	 * <p>Setter for the field <code>certificateType</code>.</p>
	 *
	 * @param certificateType a {@link java.lang.String} object.
	 */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	/**
	 * <p>Getter for the field <code>currentPageNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPageNo() {
		return this.currentPageNo;
	}
	/**
	 * <p>Setter for the field <code>currentPageNo</code>.</p>
	 *
	 * @param currentPageNo a {@link java.lang.Long} object.
	 */
	public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	/**
	 * <p>Getter for the field <code>effectTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEffectTime() {
		return this.effectTime;
	}
	/**
	 * <p>Setter for the field <code>effectTime</code>.</p>
	 *
	 * @param effectTime a {@link java.util.Date} object.
	 */
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	/**
	 * <p>Getter for the field <code>instId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstId() {
		return this.instId;
	}
	/**
	 * <p>Setter for the field <code>instId</code>.</p>
	 *
	 * @param instId a {@link java.lang.String} object.
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

	/**
	 * <p>Getter for the field <code>isEnabled</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsEnabled() {
		return this.isEnabled;
	}
	/**
	 * <p>Setter for the field <code>isEnabled</code>.</p>
	 *
	 * @param isEnabled a {@link java.lang.String} object.
	 */
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * <p>Getter for the field <code>orderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderId() {
		return this.orderId;
	}
	/**
	 * <p>Setter for the field <code>orderId</code>.</p>
	 *
	 * @param orderId a {@link java.lang.String} object.
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * <p>Getter for the field <code>orderSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderSource() {
		return this.orderSource;
	}
	/**
	 * <p>Setter for the field <code>orderSource</code>.</p>
	 *
	 * @param orderSource a {@link java.lang.String} object.
	 */
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>ownerUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerUid() {
		return this.ownerUid;
	}
	/**
	 * <p>Setter for the field <code>ownerUid</code>.</p>
	 *
	 * @param ownerUid a {@link java.lang.String} object.
	 */
	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
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
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.Long} object.
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

}
