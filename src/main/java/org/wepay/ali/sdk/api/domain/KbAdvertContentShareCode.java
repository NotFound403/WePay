package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统吱口令内容详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertContentShareCode extends AlipayObject {

	private static final long serialVersionUID = 1824729554824186511L;

	/**
	 * 吱口令内容详情
	 */
	@ApiField("share_code_desc")
	private String shareCodeDesc;

	public String getShareCodeDesc() {
		return this.shareCodeDesc;
	}
	public void setShareCodeDesc(String shareCodeDesc) {
		this.shareCodeDesc = shareCodeDesc;
	}

}
