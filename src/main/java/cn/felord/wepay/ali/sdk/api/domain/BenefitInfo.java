package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝积分会员权益信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 4512998712142216543L;

	/**
	 * 权益信息id
	 */
	@ApiField("benefit_info_id")
	private String benefitInfoId;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益中文名称
	 */
	@ApiField("benefit_name_cn")
	private String benefitNameCn;

	/**
	 * 权益类型(会员等级: MemberGrade)
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 权益发放时间
	 */
	@ApiField("dispatch_dt")
	private Date dispatchDt;

	/**
	 * 权益失效时间
	 */
	@ApiField("end_dt")
	private Date endDt;

	/**
	 * 权益生效时间
	 */
	@ApiField("start_dt")
	private Date startDt;

	/**
	 * 权益当前状态     
* 待生效：WAIT
* 生效：VALID
* 失效：INVALID
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>benefitInfoId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitInfoId() {
		return this.benefitInfoId;
	}
	/**
	 * <p>Setter for the field <code>benefitInfoId</code>.</p>
	 *
	 * @param benefitInfoId a {@link java.lang.String} object.
	 */
	public void setBenefitInfoId(String benefitInfoId) {
		this.benefitInfoId = benefitInfoId;
	}

	/**
	 * <p>Getter for the field <code>benefitName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitName() {
		return this.benefitName;
	}
	/**
	 * <p>Setter for the field <code>benefitName</code>.</p>
	 *
	 * @param benefitName a {@link java.lang.String} object.
	 */
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	/**
	 * <p>Getter for the field <code>benefitNameCn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitNameCn() {
		return this.benefitNameCn;
	}
	/**
	 * <p>Setter for the field <code>benefitNameCn</code>.</p>
	 *
	 * @param benefitNameCn a {@link java.lang.String} object.
	 */
	public void setBenefitNameCn(String benefitNameCn) {
		this.benefitNameCn = benefitNameCn;
	}

	/**
	 * <p>Getter for the field <code>benefitType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBenefitType() {
		return this.benefitType;
	}
	/**
	 * <p>Setter for the field <code>benefitType</code>.</p>
	 *
	 * @param benefitType a {@link java.lang.String} object.
	 */
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	/**
	 * <p>Getter for the field <code>dispatchDt</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDispatchDt() {
		return this.dispatchDt;
	}
	/**
	 * <p>Setter for the field <code>dispatchDt</code>.</p>
	 *
	 * @param dispatchDt a {@link java.util.Date} object.
	 */
	public void setDispatchDt(Date dispatchDt) {
		this.dispatchDt = dispatchDt;
	}

	/**
	 * <p>Getter for the field <code>endDt</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndDt() {
		return this.endDt;
	}
	/**
	 * <p>Setter for the field <code>endDt</code>.</p>
	 *
	 * @param endDt a {@link java.util.Date} object.
	 */
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	/**
	 * <p>Getter for the field <code>startDt</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDt() {
		return this.startDt;
	}
	/**
	 * <p>Setter for the field <code>startDt</code>.</p>
	 *
	 * @param startDt a {@link java.util.Date} object.
	 */
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
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
