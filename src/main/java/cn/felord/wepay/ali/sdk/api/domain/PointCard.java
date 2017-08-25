package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 集点卡工具
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PointCard extends AlipayObject {

	private static final long serialVersionUID = 3336458565211613279L;

	/**
	 * 工具的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 工具的有效期的结束时间（必须晚于活动的结束时间）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 工具的LOGO文件ID
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 工具的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 工具的有效期的起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 工具类型，目前支持：
集点卡：POINT_CARD
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
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
	 * <p>Getter for the field <code>logo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogo() {
		return this.logo;
	}
	/**
	 * <p>Setter for the field <code>logo</code>.</p>
	 *
	 * @param logo a {@link java.lang.String} object.
	 */
	public void setLogo(String logo) {
		this.logo = logo;
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
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
