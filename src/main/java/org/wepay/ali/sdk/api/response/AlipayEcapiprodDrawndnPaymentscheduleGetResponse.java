package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.PaymentSchedule;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.paymentschedule.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:20
 */
public class AlipayEcapiprodDrawndnPaymentscheduleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2892671874988325651L;

	/** 
	 * 返回的支用还款计划集合
	 */
	@ApiListField("payment_schedules")
	@ApiField("payment_schedule")
	private List<PaymentSchedule> paymentSchedules;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	public void setPaymentSchedules(List<PaymentSchedule> paymentSchedules) {
		this.paymentSchedules = paymentSchedules;
	}
	public List<PaymentSchedule> getPaymentSchedules( ) {
		return this.paymentSchedules;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
