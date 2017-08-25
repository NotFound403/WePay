package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.PaymentSchedule;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.paymentschedule.get response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>paymentSchedules</code>.</p>
	 *
	 * @param paymentSchedules a {@link java.util.List} object.
	 */
	public void setPaymentSchedules(List<PaymentSchedule> paymentSchedules) {
		this.paymentSchedules = paymentSchedules;
	}
	/**
	 * <p>Getter for the field <code>paymentSchedules</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PaymentSchedule> getPaymentSchedules( ) {
		return this.paymentSchedules;
	}

	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId( ) {
		return this.requestId;
	}

}
