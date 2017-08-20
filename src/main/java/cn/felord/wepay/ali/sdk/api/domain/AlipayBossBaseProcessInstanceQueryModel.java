package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询流程实例
 *
 * @author auto create
 * @since 1.0, 2017-03-03 11:29:50
 */
public class AlipayBossBaseProcessInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1323716564297526924L;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}
