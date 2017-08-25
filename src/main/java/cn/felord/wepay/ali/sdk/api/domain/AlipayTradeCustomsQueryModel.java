package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询报关详细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeCustomsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1352986427754595388L;

	/**
	 * 报关请求号。需要查询的商户端报关请求号，支持批量查询，
多个值用英文半角逗号分隔，单次请求最多10个;
	 */
	@ApiField("out_request_nos")
	private String outRequestNos;

	/**
	 * <p>Getter for the field <code>outRequestNos</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNos() {
		return this.outRequestNos;
	}
	/**
	 * <p>Setter for the field <code>outRequestNos</code>.</p>
	 *
	 * @param outRequestNos a {@link java.lang.String} object.
	 */
	public void setOutRequestNos(String outRequestNos) {
		this.outRequestNos = outRequestNos;
	}

}
