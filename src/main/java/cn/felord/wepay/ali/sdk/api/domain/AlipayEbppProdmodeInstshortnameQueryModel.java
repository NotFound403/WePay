package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询机构英文名称
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppProdmodeInstshortnameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5596871637762599561L;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

	/**
	 * <p>Getter for the field <code>chargeinstCnName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeinstCnName() {
		return this.chargeinstCnName;
	}
	/**
	 * <p>Setter for the field <code>chargeinstCnName</code>.</p>
	 *
	 * @param chargeinstCnName a {@link java.lang.String} object.
	 */
	public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}

}
