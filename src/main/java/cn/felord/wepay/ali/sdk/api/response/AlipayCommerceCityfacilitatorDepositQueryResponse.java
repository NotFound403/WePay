package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.RechargeBill;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.deposit.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorDepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6245482733559182337L;

	/** 
	 * 待圈存明细
	 */
	@ApiListField("recharge_bills")
	@ApiField("recharge_bill")
	private List<RechargeBill> rechargeBills;

	/**
	 * <p>Setter for the field <code>rechargeBills</code>.</p>
	 *
	 * @param rechargeBills a {@link java.util.List} object.
	 */
	public void setRechargeBills(List<RechargeBill> rechargeBills) {
		this.rechargeBills = rechargeBills;
	}
	/**
	 * <p>Getter for the field <code>rechargeBills</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RechargeBill> getRechargeBills( ) {
		return this.rechargeBills;
	}

}
