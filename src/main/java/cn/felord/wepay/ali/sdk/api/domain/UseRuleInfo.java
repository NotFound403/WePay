package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 使用规则信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class UseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 8367749651378112117L;

	/**
	 * 适用门店列表
	 */
	@ApiListField("suitable_shops")
	@ApiField("string")
	private List<String> suitableShops;

	/**
	 * 核销方式
	 */
	@ApiListField("use_mode")
	@ApiField("string")
	private List<String> useMode;

	/**
	 * <p>Getter for the field <code>suitableShops</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSuitableShops() {
		return this.suitableShops;
	}
	/**
	 * <p>Setter for the field <code>suitableShops</code>.</p>
	 *
	 * @param suitableShops a {@link java.util.List} object.
	 */
	public void setSuitableShops(List<String> suitableShops) {
		this.suitableShops = suitableShops;
	}

	/**
	 * <p>Getter for the field <code>useMode</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUseMode() {
		return this.useMode;
	}
	/**
	 * <p>Setter for the field <code>useMode</code>.</p>
	 *
	 * @param useMode a {@link java.util.List} object.
	 */
	public void setUseMode(List<String> useMode) {
		this.useMode = useMode;
	}

}
