package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 资产信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AssetParams extends AlipayObject {

	private static final long serialVersionUID = 2559788492955437876L;

	/**
	 * 资产类型：
1. BANK（银行卡）
2. ACCOUNT（账号模式）
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 银行卡号。
assetType为BANK时，必填。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 机构ID。
assetType为BANK时，必填。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * <p>Getter for the field <code>assetType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssetType() {
		return this.assetType;
	}
	/**
	 * <p>Setter for the field <code>assetType</code>.</p>
	 *
	 * @param assetType a {@link java.lang.String} object.
	 */
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * <p>Getter for the field <code>instId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstId() {
		return this.instId;
	}
	/**
	 * <p>Setter for the field <code>instId</code>.</p>
	 *
	 * @param instId a {@link java.lang.String} object.
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
