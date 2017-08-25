package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据发票申请id查询发票信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceInfoApplyidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5538316491195123797L;

	/**
	 * 申请开票时支付宝返回的申请id，具有全局唯一性。
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * <p>Getter for the field <code>applyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyId() {
		return this.applyId;
	}
	/**
	 * <p>Setter for the field <code>applyId</code>.</p>
	 *
	 * @param applyId a {@link java.lang.String} object.
	 */
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

}
