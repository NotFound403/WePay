package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.balance.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAssetPointBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2825177436865761991L;

	/** 
	 * 用户的集分宝余额
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * <p>Setter for the field <code>pointAmount</code>.</p>
	 *
	 * @param pointAmount a {@link java.lang.Long} object.
	 */
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}
	/**
	 * <p>Getter for the field <code>pointAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPointAmount( ) {
		return this.pointAmount;
	}

}
