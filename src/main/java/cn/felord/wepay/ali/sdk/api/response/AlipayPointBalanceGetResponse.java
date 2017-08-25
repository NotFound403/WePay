package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.balance.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPointBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2287673744519424783L;

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
