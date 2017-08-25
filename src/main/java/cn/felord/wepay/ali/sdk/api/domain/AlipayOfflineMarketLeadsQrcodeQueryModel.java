package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 地推小二认领了Leads后申请创建开店二维码，提供给商户扫描开店。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketLeadsQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5396776445874415484L;

	/**
	 * 支付宝leads ID，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * <p>Getter for the field <code>leadsId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLeadsId() {
		return this.leadsId;
	}
	/**
	 * <p>Setter for the field <code>leadsId</code>.</p>
	 *
	 * @param leadsId a {@link java.lang.String} object.
	 */
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	/**
	 * <p>Getter for the field <code>opId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpId() {
		return this.opId;
	}
	/**
	 * <p>Setter for the field <code>opId</code>.</p>
	 *
	 * @param opId a {@link java.lang.String} object.
	 */
	public void setOpId(String opId) {
		this.opId = opId;
	}

}
