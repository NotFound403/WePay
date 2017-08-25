package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统吱口令内容详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertContentShareCode extends AlipayObject {

	private static final long serialVersionUID = 1824729554824186511L;

	/**
	 * 吱口令内容详情
	 */
	@ApiField("share_code_desc")
	private String shareCodeDesc;

	/**
	 * <p>Getter for the field <code>shareCodeDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShareCodeDesc() {
		return this.shareCodeDesc;
	}
	/**
	 * <p>Setter for the field <code>shareCodeDesc</code>.</p>
	 *
	 * @param shareCodeDesc a {@link java.lang.String} object.
	 */
	public void setShareCodeDesc(String shareCodeDesc) {
		this.shareCodeDesc = shareCodeDesc;
	}

}
