package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 加油站门店信息增加接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarFuellingShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1141353161723615597L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 国标6位城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 国标6位区编号
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度，高德坐标系，最好找到高德POI标识，取得标识的维度填入
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度，高德坐标系,最好找到高德POI标识，取得标识的经度填入
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 外部门店编号，系统唯一，该值添加后不可修改
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * ISV提供的门店支付链接地址，如果支付链接地址为空，默认使用用户的当面付链接地址。注意：链接地址必须使用https://或alipays://协议。需进行encode转码
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 高德POI信息唯一ID，可通过http://lbs.amap.com/api/webservice/guide/api/search/进行查找，查询的TYPE为010100|010101|010102|010103|010104|010105|010107|010108|010109|010110|010111|010112
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 国标6位省份编号
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店状态，0：有效；1：停用；
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * <p>Getter for the field <code>districtCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrictCode() {
		return this.districtCode;
	}
	/**
	 * <p>Setter for the field <code>districtCode</code>.</p>
	 *
	 * @param districtCode a {@link java.lang.String} object.
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	/**
	 * <p>Getter for the field <code>outShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutShopId() {
		return this.outShopId;
	}
	/**
	 * <p>Setter for the field <code>outShopId</code>.</p>
	 *
	 * @param outShopId a {@link java.lang.String} object.
	 */
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	/**
	 * <p>Getter for the field <code>payUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayUrl() {
		return this.payUrl;
	}
	/**
	 * <p>Setter for the field <code>payUrl</code>.</p>
	 *
	 * @param payUrl a {@link java.lang.String} object.
	 */
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	/**
	 * <p>Getter for the field <code>poiId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPoiId() {
		return this.poiId;
	}
	/**
	 * <p>Setter for the field <code>poiId</code>.</p>
	 *
	 * @param poiId a {@link java.lang.String} object.
	 */
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	/**
	 * <p>Getter for the field <code>provinceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvinceCode() {
		return this.provinceCode;
	}
	/**
	 * <p>Setter for the field <code>provinceCode</code>.</p>
	 *
	 * @param provinceCode a {@link java.lang.String} object.
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	/**
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * <p>Setter for the field <code>shopName</code>.</p>
	 *
	 * @param shopName a {@link java.lang.String} object.
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * <p>Getter for the field <code>shopStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopStatus() {
		return this.shopStatus;
	}
	/**
	 * <p>Setter for the field <code>shopStatus</code>.</p>
	 *
	 * @param shopStatus a {@link java.lang.String} object.
	 */
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
