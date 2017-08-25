package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.code.upload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherCodeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198334522319699493L;

	/** 
	 * 码库id
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

	/**
	 * <p>Setter for the field <code>codeInventoryId</code>.</p>
	 *
	 * @param codeInventoryId a {@link java.lang.String} object.
	 */
	public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
	}
	/**
	 * <p>Getter for the field <code>codeInventoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeInventoryId( ) {
		return this.codeInventoryId;
	}

}
