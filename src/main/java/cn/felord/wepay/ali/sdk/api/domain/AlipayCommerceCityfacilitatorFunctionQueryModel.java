package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 基于设备和城市查询当前支持的功能
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorFunctionQueryModel extends AlipayObject {

    private static final long serialVersionUID = 2665268417855323344L;

    /**
     * 城市国家标准编码
     */
    @ApiField("city_code")
    private String cityCode;

    /**
     * 终端设备编码，android可直接获取设备的devicecode值
     */
    @ApiField("device_code")
    private String deviceCode;

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
     * Gets device code.
     *
     * @return the device code
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * Sets device code.
     *
     * @param deviceCode the device code
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

}
