package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部商户步数同步接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserStepcounterSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2389214745696848559L;

	/**
	 * 年龄数据。是外部商户系统中录入的用户年龄数据
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 卡路里。是商户系统通过用户运动设备(如手环)读取到的用户运动卡路里值
	 */
	@ApiField("calorie")
	private String calorie;

	/**
	 * 步数。商户系统通过用户运动设备(如手环)读取到的用户当日步数值
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 业务方标识。步数来源的唯一标识，每一个外部商户都会分配一个业务方标识，请使用钉钉联系支付宝小二骁然获取此标识
	 */
	@ApiField("data_provider")
	private String dataProvider;

	/**
	 * 运动距离。是外部商户系统从用户设备中读取到的用户步行距离，单位:米
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 身高数据。是外部商户系统中录入的用户身高数据，单位:cm
	 */
	@ApiField("height")
	private String height;

	/**
	 * 位置纬度。是商户系统从用户设备中读取到的用户位置纬度，必须使用wgs84坐标集
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 位置经度。是商户系统从用户客户端设备中读取到的用户位置经度，必须使用wgs84坐标集
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户系统的用户uid。是外部商户系统中的用户唯一id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 步数更新时间。用户步数上报到商户服务端的时间
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 用户时区。外部商户系统从用户运动设备中读取到的设备时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 支付宝用户id。为2088开头id号，需通过alipay.user.userinfo.share接口获取此值
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 体重数据。是外部商户系统中录入的用户体重数据，单位:kg
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * <p>Getter for the field <code>age</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAge() {
		return this.age;
	}
	/**
	 * <p>Setter for the field <code>age</code>.</p>
	 *
	 * @param age a {@link java.lang.Long} object.
	 */
	public void setAge(Long age) {
		this.age = age;
	}

	/**
	 * <p>Getter for the field <code>calorie</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCalorie() {
		return this.calorie;
	}
	/**
	 * <p>Setter for the field <code>calorie</code>.</p>
	 *
	 * @param calorie a {@link java.lang.String} object.
	 */
	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCount() {
		return this.count;
	}
	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.Long} object.
	 */
	public void setCount(Long count) {
		this.count = count;
	}

	/**
	 * <p>Getter for the field <code>dataProvider</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataProvider() {
		return this.dataProvider;
	}
	/**
	 * <p>Setter for the field <code>dataProvider</code>.</p>
	 *
	 * @param dataProvider a {@link java.lang.String} object.
	 */
	public void setDataProvider(String dataProvider) {
		this.dataProvider = dataProvider;
	}

	/**
	 * <p>Getter for the field <code>distance</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDistance() {
		return this.distance;
	}
	/**
	 * <p>Setter for the field <code>distance</code>.</p>
	 *
	 * @param distance a {@link java.lang.Long} object.
	 */
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	/**
	 * <p>Getter for the field <code>height</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeight() {
		return this.height;
	}
	/**
	 * <p>Setter for the field <code>height</code>.</p>
	 *
	 * @param height a {@link java.lang.String} object.
	 */
	public void setHeight(String height) {
		this.height = height;
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
	 * <p>Getter for the field <code>outUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutUserId() {
		return this.outUserId;
	}
	/**
	 * <p>Setter for the field <code>outUserId</code>.</p>
	 *
	 * @param outUserId a {@link java.lang.String} object.
	 */
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	/**
	 * <p>Getter for the field <code>time</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTime() {
		return this.time;
	}
	/**
	 * <p>Setter for the field <code>time</code>.</p>
	 *
	 * @param time a {@link java.util.Date} object.
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * <p>Getter for the field <code>timeZone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeZone() {
		return this.timeZone;
	}
	/**
	 * <p>Setter for the field <code>timeZone</code>.</p>
	 *
	 * @param timeZone a {@link java.lang.String} object.
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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

	/**
	 * <p>Getter for the field <code>weight</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWeight() {
		return this.weight;
	}
	/**
	 * <p>Setter for the field <code>weight</code>.</p>
	 *
	 * @param weight a {@link java.lang.String} object.
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
