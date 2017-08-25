package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建保险凭证请求对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsCreateCertificateRequest extends AlipayObject {

	private static final long serialVersionUID = 4688932937954696146L;

	/**
	 * 扩展字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险凭证类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 面值
	 */
	@ApiField("face_value")
	private String faceValue;

	/**
	 * 电子保单号
	 */
	@ApiField("ins_policy_no")
	private String insPolicyNo;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

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
	 * <p>Getter for the field <code>bizData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizData() {
		return this.bizData;
	}
	/**
	 * <p>Setter for the field <code>bizData</code>.</p>
	 *
	 * @param bizData a {@link java.lang.String} object.
	 */
	public void setBizData(String bizData) {
		this.bizData = bizData;
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
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireTime() {
		return this.expireTime;
	}
	/**
	 * <p>Setter for the field <code>expireTime</code>.</p>
	 *
	 * @param expireTime a {@link java.util.Date} object.
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * <p>Getter for the field <code>faceValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFaceValue() {
		return this.faceValue;
	}
	/**
	 * <p>Setter for the field <code>faceValue</code>.</p>
	 *
	 * @param faceValue a {@link java.lang.String} object.
	 */
	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	/**
	 * <p>Getter for the field <code>insPolicyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInsPolicyNo() {
		return this.insPolicyNo;
	}
	/**
	 * <p>Setter for the field <code>insPolicyNo</code>.</p>
	 *
	 * @param insPolicyNo a {@link java.lang.String} object.
	 */
	public void setInsPolicyNo(String insPolicyNo) {
		this.insPolicyNo = insPolicyNo;
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

}
