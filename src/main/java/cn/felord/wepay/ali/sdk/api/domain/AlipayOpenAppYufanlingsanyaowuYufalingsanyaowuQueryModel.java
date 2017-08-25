package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 预发03150725
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4544982465837641628L;

	/**
	 * 省份编码，国标码
	 */
	@ApiListField("province_code")
	@ApiField("string")
	private List<String> provinceCode;

	/**
	 * <p>Getter for the field <code>provinceCode</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getProvinceCode() {
		return this.provinceCode;
	}
	/**
	 * <p>Setter for the field <code>provinceCode</code>.</p>
	 *
	 * @param provinceCode a {@link java.util.List} object.
	 */
	public void setProvinceCode(List<String> provinceCode) {
		this.provinceCode = provinceCode;
	}

}
