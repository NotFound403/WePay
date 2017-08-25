package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 间连商户地址信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AddressInfo extends AlipayObject {

    private static final long serialVersionUID = 4766731947652748349L;

    /**
     * 商户详细经营地址
     */
    @ApiField("address")
    private String address;

    /**
     * 商户所在城市编码
     */
    @ApiField("city_code")
    private String cityCode;

    /**
     * 商户所在区县编码
     */
    @ApiField("district_code")
    private String districtCode;

    /**
     * 纬度，浮点型,小数点后最多保留6位
     */
    @ApiField("latitude")
    private String latitude;

    /**
     * 经度，浮点型, 小数点后最多保留6位
     */
    @ApiField("longitude")
    private String longitude;

    /**
     * 商户所在省份编码
     */
    @ApiField("province_code")
    private String provinceCode;

    /**
     * 地址类型。取值范围：BUSINESS_ADDRESS：经营地址（默认）；REGISTERED_ADDRESS：注册地址
     */
    @ApiField("type")
    private String type;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode() {
        return this.districtCode;
    }

    /**
     * Sets district code.
     *
     * @param districtCode the district code
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
        return this.provinceCode;
    }

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

}
