package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 爱车的数据信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MaintainVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 8498593791467538525L;

	/**
	 * 背景图片
	 */
	@ApiField("bg_url")
	private String bgUrl;

	/**
	 * 发动机编号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发动机类型
	 */
	@ApiField("engine_type")
	private String engineType;

	/**
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 生产年份
	 */
	@ApiField("production_year")
	private String productionYear;

	/**
	 * 发动机排量
	 */
	@ApiListField("swept_volume")
	@ApiField("string")
	private List<String> sweptVolume;

	/**
	 * 品牌Logo
	 */
	@ApiField("vi_brand_logo")
	private String viBrandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("vi_brand_name")
	private String viBrandName;

	/**
	 * 车辆归属地id
	 */
	@ApiField("vi_city_id")
	private String viCityId;

	/**
	 * 城市名称
	 */
	@ApiField("vi_city_name")
	private String viCityName;

	/**
	 * 车辆图标URL
	 */
	@ApiField("vi_logo_url")
	private String viLogoUrl;

	/**
	 * 行驶里程
	 */
	@ApiField("vi_mileage")
	private String viMileage;

	/**
	 * 车型名称
	 */
	@ApiField("vi_model_name")
	private String viModelName;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 车系名称
	 */
	@ApiField("vi_series_name")
	private String viSeriesName;

	/**
	 * 上路日期
	 */
	@ApiField("vi_start_time")
	private Date viStartTime;

	/**
	 * 年款
	 */
	@ApiField("vi_style_name")
	private String viStyleName;

	/**
	 * 行驶里程
	 */
	@ApiListField("vi_vin")
	@ApiField("string")
	private List<String> viVin;

	/**
	 * <p>Getter for the field <code>bgUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBgUrl() {
		return this.bgUrl;
	}
	/**
	 * <p>Setter for the field <code>bgUrl</code>.</p>
	 *
	 * @param bgUrl a {@link java.lang.String} object.
	 */
	public void setBgUrl(String bgUrl) {
		this.bgUrl = bgUrl;
	}

	/**
	 * <p>Getter for the field <code>engineNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngineNo() {
		return this.engineNo;
	}
	/**
	 * <p>Setter for the field <code>engineNo</code>.</p>
	 *
	 * @param engineNo a {@link java.lang.String} object.
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * <p>Getter for the field <code>engineType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngineType() {
		return this.engineType;
	}
	/**
	 * <p>Setter for the field <code>engineType</code>.</p>
	 *
	 * @param engineType a {@link java.lang.String} object.
	 */
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	/**
	 * <p>Getter for the field <code>manufacturer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getManufacturer() {
		return this.manufacturer;
	}
	/**
	 * <p>Setter for the field <code>manufacturer</code>.</p>
	 *
	 * @param manufacturer a {@link java.lang.String} object.
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * <p>Getter for the field <code>productionYear</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductionYear() {
		return this.productionYear;
	}
	/**
	 * <p>Setter for the field <code>productionYear</code>.</p>
	 *
	 * @param productionYear a {@link java.lang.String} object.
	 */
	public void setProductionYear(String productionYear) {
		this.productionYear = productionYear;
	}

	/**
	 * <p>Getter for the field <code>sweptVolume</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSweptVolume() {
		return this.sweptVolume;
	}
	/**
	 * <p>Setter for the field <code>sweptVolume</code>.</p>
	 *
	 * @param sweptVolume a {@link java.util.List} object.
	 */
	public void setSweptVolume(List<String> sweptVolume) {
		this.sweptVolume = sweptVolume;
	}

	/**
	 * <p>Getter for the field <code>viBrandLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViBrandLogo() {
		return this.viBrandLogo;
	}
	/**
	 * <p>Setter for the field <code>viBrandLogo</code>.</p>
	 *
	 * @param viBrandLogo a {@link java.lang.String} object.
	 */
	public void setViBrandLogo(String viBrandLogo) {
		this.viBrandLogo = viBrandLogo;
	}

	/**
	 * <p>Getter for the field <code>viBrandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViBrandName() {
		return this.viBrandName;
	}
	/**
	 * <p>Setter for the field <code>viBrandName</code>.</p>
	 *
	 * @param viBrandName a {@link java.lang.String} object.
	 */
	public void setViBrandName(String viBrandName) {
		this.viBrandName = viBrandName;
	}

	/**
	 * <p>Getter for the field <code>viCityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViCityId() {
		return this.viCityId;
	}
	/**
	 * <p>Setter for the field <code>viCityId</code>.</p>
	 *
	 * @param viCityId a {@link java.lang.String} object.
	 */
	public void setViCityId(String viCityId) {
		this.viCityId = viCityId;
	}

	/**
	 * <p>Getter for the field <code>viCityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViCityName() {
		return this.viCityName;
	}
	/**
	 * <p>Setter for the field <code>viCityName</code>.</p>
	 *
	 * @param viCityName a {@link java.lang.String} object.
	 */
	public void setViCityName(String viCityName) {
		this.viCityName = viCityName;
	}

	/**
	 * <p>Getter for the field <code>viLogoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViLogoUrl() {
		return this.viLogoUrl;
	}
	/**
	 * <p>Setter for the field <code>viLogoUrl</code>.</p>
	 *
	 * @param viLogoUrl a {@link java.lang.String} object.
	 */
	public void setViLogoUrl(String viLogoUrl) {
		this.viLogoUrl = viLogoUrl;
	}

	/**
	 * <p>Getter for the field <code>viMileage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViMileage() {
		return this.viMileage;
	}
	/**
	 * <p>Setter for the field <code>viMileage</code>.</p>
	 *
	 * @param viMileage a {@link java.lang.String} object.
	 */
	public void setViMileage(String viMileage) {
		this.viMileage = viMileage;
	}

	/**
	 * <p>Getter for the field <code>viModelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViModelName() {
		return this.viModelName;
	}
	/**
	 * <p>Setter for the field <code>viModelName</code>.</p>
	 *
	 * @param viModelName a {@link java.lang.String} object.
	 */
	public void setViModelName(String viModelName) {
		this.viModelName = viModelName;
	}

	/**
	 * <p>Getter for the field <code>viNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViNumber() {
		return this.viNumber;
	}
	/**
	 * <p>Setter for the field <code>viNumber</code>.</p>
	 *
	 * @param viNumber a {@link java.lang.String} object.
	 */
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

	/**
	 * <p>Getter for the field <code>viSeriesName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViSeriesName() {
		return this.viSeriesName;
	}
	/**
	 * <p>Setter for the field <code>viSeriesName</code>.</p>
	 *
	 * @param viSeriesName a {@link java.lang.String} object.
	 */
	public void setViSeriesName(String viSeriesName) {
		this.viSeriesName = viSeriesName;
	}

	/**
	 * <p>Getter for the field <code>viStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getViStartTime() {
		return this.viStartTime;
	}
	/**
	 * <p>Setter for the field <code>viStartTime</code>.</p>
	 *
	 * @param viStartTime a {@link java.util.Date} object.
	 */
	public void setViStartTime(Date viStartTime) {
		this.viStartTime = viStartTime;
	}

	/**
	 * <p>Getter for the field <code>viStyleName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViStyleName() {
		return this.viStyleName;
	}
	/**
	 * <p>Setter for the field <code>viStyleName</code>.</p>
	 *
	 * @param viStyleName a {@link java.lang.String} object.
	 */
	public void setViStyleName(String viStyleName) {
		this.viStyleName = viStyleName;
	}

	/**
	 * <p>Getter for the field <code>viVin</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getViVin() {
		return this.viVin;
	}
	/**
	 * <p>Setter for the field <code>viVin</code>.</p>
	 *
	 * @param viVin a {@link java.util.List} object.
	 */
	public void setViVin(List<String> viVin) {
		this.viVin = viVin;
	}

}
