package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 线上间连商户信息查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandIndirectOnlineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6692498678358214555L;

	/**
	 * 受理商户在受理机构下的唯一标识，与sub_merchant_id二选一必传
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一必传
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * <p>Getter for the field <code>externalId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalId() {
		return this.externalId;
	}
	/**
	 * <p>Setter for the field <code>externalId</code>.</p>
	 *
	 * @param externalId a {@link java.lang.String} object.
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * <p>Getter for the field <code>subMerchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	/**
	 * <p>Setter for the field <code>subMerchantId</code>.</p>
	 *
	 * @param subMerchantId a {@link java.lang.String} object.
	 */
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
