package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.RechargeBill;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.deposit.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-15 11:37:56
 */
public class AlipayCommerceCityfacilitatorDepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6245482733559182337L;

	/** 
	 * 待圈存明细
	 */
	@ApiListField("recharge_bills")
	@ApiField("recharge_bill")
	private List<RechargeBill> rechargeBills;

	public void setRechargeBills(List<RechargeBill> rechargeBills) {
		this.rechargeBills = rechargeBills;
	}
	public List<RechargeBill> getRechargeBills( ) {
		return this.rechargeBills;
	}

}
