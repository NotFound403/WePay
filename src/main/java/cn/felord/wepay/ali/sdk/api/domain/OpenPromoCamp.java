package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 开放活动接口活动
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenPromoCamp extends AlipayObject {

	private static final long serialVersionUID = 3171626871485427173L;

	/**
	 * 简短活动名，默认和活动名称相同
	 */
	@ApiField("camp_alias")
	private String campAlias;

	/**
	 * 活动描述
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/**
	 * 活动结束时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 活动开始时间
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/**
	 * 活动类型，现在支持DRAW_PRIZE：表示领奖活动
	 */
	@ApiField("camp_type")
	private String campType;

	/**
	 * <p>Getter for the field <code>campAlias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampAlias() {
		return this.campAlias;
	}
	/**
	 * <p>Setter for the field <code>campAlias</code>.</p>
	 *
	 * @param campAlias a {@link java.lang.String} object.
	 */
	public void setCampAlias(String campAlias) {
		this.campAlias = campAlias;
	}

	/**
	 * <p>Getter for the field <code>campDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampDesc() {
		return this.campDesc;
	}
	/**
	 * <p>Setter for the field <code>campDesc</code>.</p>
	 *
	 * @param campDesc a {@link java.lang.String} object.
	 */
	public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}

	/**
	 * <p>Getter for the field <code>campEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampEndTime() {
		return this.campEndTime;
	}
	/**
	 * <p>Setter for the field <code>campEndTime</code>.</p>
	 *
	 * @param campEndTime a {@link java.lang.String} object.
	 */
	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

	/**
	 * <p>Getter for the field <code>campName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampName() {
		return this.campName;
	}
	/**
	 * <p>Setter for the field <code>campName</code>.</p>
	 *
	 * @param campName a {@link java.lang.String} object.
	 */
	public void setCampName(String campName) {
		this.campName = campName;
	}

	/**
	 * <p>Getter for the field <code>campStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampStartTime() {
		return this.campStartTime;
	}
	/**
	 * <p>Setter for the field <code>campStartTime</code>.</p>
	 *
	 * @param campStartTime a {@link java.lang.String} object.
	 */
	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

	/**
	 * <p>Getter for the field <code>campType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampType() {
		return this.campType;
	}
	/**
	 * <p>Setter for the field <code>campType</code>.</p>
	 *
	 * @param campType a {@link java.lang.String} object.
	 */
	public void setCampType(String campType) {
		this.campType = campType;
	}

}
