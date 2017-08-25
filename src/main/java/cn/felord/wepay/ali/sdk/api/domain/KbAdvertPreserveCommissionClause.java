package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 专属领取人员
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertPreserveCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 3427168444398272715L;

	/**
	 * user_id：支付宝账户ID(2088开头)
logon_id：登陆账号
	 */
	@ApiField("claimer_id_type")
	private String claimerIdType;

	/**
	 * 认领人
	 */
	@ApiListField("claimers")
	@ApiField("string")
	private List<String> claimers;

	/**
	 * <p>Getter for the field <code>claimerIdType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClaimerIdType() {
		return this.claimerIdType;
	}
	/**
	 * <p>Setter for the field <code>claimerIdType</code>.</p>
	 *
	 * @param claimerIdType a {@link java.lang.String} object.
	 */
	public void setClaimerIdType(String claimerIdType) {
		this.claimerIdType = claimerIdType;
	}

	/**
	 * <p>Getter for the field <code>claimers</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getClaimers() {
		return this.claimers;
	}
	/**
	 * <p>Setter for the field <code>claimers</code>.</p>
	 *
	 * @param claimers a {@link java.util.List} object.
	 */
	public void setClaimers(List<String> claimers) {
		this.claimers = claimers;
	}

}
