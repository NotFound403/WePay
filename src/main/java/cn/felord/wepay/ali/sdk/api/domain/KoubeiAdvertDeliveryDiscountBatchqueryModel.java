package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告投放券商品输出接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8316186416779729361L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市国标码，比如310100是上海
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 输出的券列表大小
	 */
	@ApiField("size")
	private String size;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>channel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannel() {
		return this.channel;
	}
	/**
	 * <p>Setter for the field <code>channel</code>.</p>
	 *
	 * @param channel a {@link java.lang.String} object.
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode() {
		return this.cityCode;
	}
	/**
	 * <p>Setter for the field <code>cityCode</code>.</p>
	 *
	 * @param cityCode a {@link java.lang.String} object.
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
	 * <p>Getter for the field <code>size</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSize() {
		return this.size;
	}
	/**
	 * <p>Setter for the field <code>size</code>.</p>
	 *
	 * @param size a {@link java.lang.String} object.
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
