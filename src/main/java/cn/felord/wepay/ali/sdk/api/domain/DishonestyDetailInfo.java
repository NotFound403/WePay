package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 公安老赖详细失信信息对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DishonestyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4344362851536191248L;

	/**
	 * 被执行人行为具体情况
	 */
	@ApiField("behavior")
	private String behavior;

	/**
	 * 案号
	 */
	@ApiField("case_code")
	private String caseCode;

	/**
	 * 执行法院
	 */
	@ApiField("enforce_court")
	private String enforceCourt;

	/**
	 * 身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被执行人履行情况
	 */
	@ApiField("performance")
	private String performance;

	/**
	 * 发布日期
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 所在区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * <p>Getter for the field <code>behavior</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBehavior() {
		return this.behavior;
	}
	/**
	 * <p>Setter for the field <code>behavior</code>.</p>
	 *
	 * @param behavior a {@link java.lang.String} object.
	 */
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	/**
	 * <p>Getter for the field <code>caseCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCaseCode() {
		return this.caseCode;
	}
	/**
	 * <p>Setter for the field <code>caseCode</code>.</p>
	 *
	 * @param caseCode a {@link java.lang.String} object.
	 */
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	/**
	 * <p>Getter for the field <code>enforceCourt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnforceCourt() {
		return this.enforceCourt;
	}
	/**
	 * <p>Setter for the field <code>enforceCourt</code>.</p>
	 *
	 * @param enforceCourt a {@link java.lang.String} object.
	 */
	public void setEnforceCourt(String enforceCourt) {
		this.enforceCourt = enforceCourt;
	}

	/**
	 * <p>Getter for the field <code>idNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdNumber() {
		return this.idNumber;
	}
	/**
	 * <p>Setter for the field <code>idNumber</code>.</p>
	 *
	 * @param idNumber a {@link java.lang.String} object.
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>performance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPerformance() {
		return this.performance;
	}
	/**
	 * <p>Setter for the field <code>performance</code>.</p>
	 *
	 * @param performance a {@link java.lang.String} object.
	 */
	public void setPerformance(String performance) {
		this.performance = performance;
	}

	/**
	 * <p>Getter for the field <code>publishDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublishDate() {
		return this.publishDate;
	}
	/**
	 * <p>Setter for the field <code>publishDate</code>.</p>
	 *
	 * @param publishDate a {@link java.lang.String} object.
	 */
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * <p>Getter for the field <code>region</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegion() {
		return this.region;
	}
	/**
	 * <p>Setter for the field <code>region</code>.</p>
	 *
	 * @param region a {@link java.lang.String} object.
	 */
	public void setRegion(String region) {
		this.region = region;
	}

}
