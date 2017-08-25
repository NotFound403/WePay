package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户商品券查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5519297885118683244L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员类型，MER=商户
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>operatorType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorType() {
		return this.operatorType;
	}
	/**
	 * <p>Setter for the field <code>operatorType</code>.</p>
	 *
	 * @param operatorType a {@link java.lang.String} object.
	 */
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

}
