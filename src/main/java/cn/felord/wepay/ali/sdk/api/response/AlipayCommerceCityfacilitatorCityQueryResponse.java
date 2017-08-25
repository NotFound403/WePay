package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CityFunction;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.city.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorCityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8577928369992875133L;

	/** 
	 * 城市列表
	 */
	@ApiListField("citys")
	@ApiField("city_function")
	private List<CityFunction> citys;

	/**
	 * <p>Setter for the field <code>citys</code>.</p>
	 *
	 * @param citys a {@link java.util.List} object.
	 */
	public void setCitys(List<CityFunction> citys) {
		this.citys = citys;
	}
	/**
	 * <p>Getter for the field <code>citys</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CityFunction> getCitys( ) {
		return this.citys;
	}

}
