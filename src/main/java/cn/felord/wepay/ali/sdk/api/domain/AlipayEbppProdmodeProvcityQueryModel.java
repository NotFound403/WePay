package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询省市地区接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppProdmodeProvcityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7481968623591121669L;

	/**
	 * 省市编号
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 查询类型，queryType=1,查询省下面的市信息
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * <p>Getter for the field <code>adcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdcode() {
		return this.adcode;
	}
	/**
	 * <p>Setter for the field <code>adcode</code>.</p>
	 *
	 * @param adcode a {@link java.lang.String} object.
	 */
	public void setAdcode(String adcode) {
		this.adcode = adcode;
	}

	/**
	 * <p>Getter for the field <code>queryType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQueryType() {
		return this.queryType;
	}
	/**
	 * <p>Setter for the field <code>queryType</code>.</p>
	 *
	 * @param queryType a {@link java.lang.String} object.
	 */
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
