package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 城市信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CityFunction extends AlipayObject {

	private static final long serialVersionUID = 2211572356258197284L;

	/**
	 * 城市标准编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 描述功能，支持开卡(issue)，圈存(load)，充值转账(recharge)
	 */
	@ApiListField("function_type")
	@ApiField("string")
	private List<String> functionType;

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
	 * <p>Getter for the field <code>cityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityName() {
		return this.cityName;
	}
	/**
	 * <p>Setter for the field <code>cityName</code>.</p>
	 *
	 * @param cityName a {@link java.lang.String} object.
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * <p>Getter for the field <code>functionType</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getFunctionType() {
		return this.functionType;
	}
	/**
	 * <p>Setter for the field <code>functionType</code>.</p>
	 *
	 * @param functionType a {@link java.util.List} object.
	 */
	public void setFunctionType(List<String> functionType) {
		this.functionType = functionType;
	}

}
