package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 推送新支持违章查询的城市
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarViolationCityPushModel extends AlipayObject {

	private static final long serialVersionUID = 2825564584845349622L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 该城市规则是新增还是更新, 0:新增,1:更新
	 */
	@ApiField("push_type")
	private String pushType;

	/**
	 * 该城市是否支持违章查询,0:支持,1:不支持
	 */
	@ApiField("service_status")
	private String serviceStatus;

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
	 * <p>Getter for the field <code>pushType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPushType() {
		return this.pushType;
	}
	/**
	 * <p>Setter for the field <code>pushType</code>.</p>
	 *
	 * @param pushType a {@link java.lang.String} object.
	 */
	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	/**
	 * <p>Getter for the field <code>serviceStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceStatus() {
		return this.serviceStatus;
	}
	/**
	 * <p>Setter for the field <code>serviceStatus</code>.</p>
	 *
	 * @param serviceStatus a {@link java.lang.String} object.
	 */
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

}
