package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 对账配置查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppProdmodeReconconfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4249369985668871523L;

	/**
	 * 缴费业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 销账机构编码
	 */
	@ApiField("chargeoff_code")
	private String chargeoffCode;

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>chargeoffCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeoffCode() {
		return this.chargeoffCode;
	}
	/**
	 * <p>Setter for the field <code>chargeoffCode</code>.</p>
	 *
	 * @param chargeoffCode a {@link java.lang.String} object.
	 */
	public void setChargeoffCode(String chargeoffCode) {
		this.chargeoffCode = chargeoffCode;
	}

}
