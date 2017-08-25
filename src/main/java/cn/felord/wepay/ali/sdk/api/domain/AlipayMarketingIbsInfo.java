package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 设备相关信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingIbsInfo extends AlipayObject {

	private static final long serialVersionUID = 4114676337989769193L;

	/**
	 * 精度
	 */
	@ApiField("accuracy")
	private String accuracy;

	/**
	 * 海拔
	 */
	@ApiField("altitude")
	private String altitude;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 时间ms
	 */
	@ApiField("time")
	private String time;

	/**
	 * <p>Getter for the field <code>accuracy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccuracy() {
		return this.accuracy;
	}
	/**
	 * <p>Setter for the field <code>accuracy</code>.</p>
	 *
	 * @param accuracy a {@link java.lang.String} object.
	 */
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * <p>Getter for the field <code>altitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAltitude() {
		return this.altitude;
	}
	/**
	 * <p>Setter for the field <code>altitude</code>.</p>
	 *
	 * @param altitude a {@link java.lang.String} object.
	 */
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	/**
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLatitude() {
		return this.latitude;
	}
	/**
	 * <p>Setter for the field <code>latitude</code>.</p>
	 *
	 * @param latitude a {@link java.lang.String} object.
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLongitude() {
		return this.longitude;
	}
	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.String} object.
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * <p>Getter for the field <code>time</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTime() {
		return this.time;
	}
	/**
	 * <p>Setter for the field <code>time</code>.</p>
	 *
	 * @param time a {@link java.lang.String} object.
	 */
	public void setTime(String time) {
		this.time = time;
	}

}
