package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 动态相关的地理位置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 1365739236637293365L;

	/**
	 * 地理信息
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 纬度 latitude（填写非0非1）
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度 longitude（填写非0非1）
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * <p>Getter for the field <code>adCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdCode() {
		return this.adCode;
	}
	/**
	 * <p>Setter for the field <code>adCode</code>.</p>
	 *
	 * @param adCode a {@link java.lang.String} object.
	 */
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	/**
	 * <p>Getter for the field <code>lat</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLat() {
		return this.lat;
	}
	/**
	 * <p>Setter for the field <code>lat</code>.</p>
	 *
	 * @param lat a {@link java.lang.String} object.
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}

	/**
	 * <p>Getter for the field <code>lon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLon() {
		return this.lon;
	}
	/**
	 * <p>Setter for the field <code>lon</code>.</p>
	 *
	 * @param lon a {@link java.lang.String} object.
	 */
	public void setLon(String lon) {
		this.lon = lon;
	}

}
