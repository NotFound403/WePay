package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataDeerConnectorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5264481179517561474L;

	/**
	 * 活动洞察数据查询标识
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 数据请求的参数，比如活动投放日期、投放渠道等信息
	 */
	@ApiField("params")
	private String params;

	/**
	 * <p>Getter for the field <code>connectorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConnectorId() {
		return this.connectorId;
	}
	/**
	 * <p>Setter for the field <code>connectorId</code>.</p>
	 *
	 * @param connectorId a {@link java.lang.String} object.
	 */
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	/**
	 * <p>Getter for the field <code>params</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParams() {
		return this.params;
	}
	/**
	 * <p>Setter for the field <code>params</code>.</p>
	 *
	 * @param params a {@link java.lang.String} object.
	 */
	public void setParams(String params) {
		this.params = params;
	}

}
