package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询销账机构列表
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:16:51
 */
public class AlipayEbppProdmodeChargeoffinstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4352145158483586115L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
