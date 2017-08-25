package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.gis.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicGisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5842275494233931188L;

	/** 
	 * 精确度
	 */
	@ApiField("accuracy")
	private String accuracy;

	/** 
	 * 经纬度所在位置
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 纬度信息
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 经度信息
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 经纬度对应位置所在的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * <p>Setter for the field <code>accuracy</code>.</p>
	 *
	 * @param accuracy a {@link java.lang.String} object.
	 */
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	/**
	 * <p>Getter for the field <code>accuracy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccuracy( ) {
		return this.accuracy;
	}

	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity( ) {
		return this.city;
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
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLatitude( ) {
		return this.latitude;
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
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLongitude( ) {
		return this.longitude;
	}

	/**
	 * <p>Setter for the field <code>province</code>.</p>
	 *
	 * @param province a {@link java.lang.String} object.
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * <p>Getter for the field <code>province</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvince( ) {
		return this.province;
	}

}
