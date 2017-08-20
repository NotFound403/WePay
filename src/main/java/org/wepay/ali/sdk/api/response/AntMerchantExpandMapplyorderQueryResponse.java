package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.MerchantApplyResultRecord;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.mapplyorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-28 23:35:07
 */
public class AntMerchantExpandMapplyorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1893551857471932198L;

	/** 
	 * 支付宝端商户入驻申请单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝商户入驻申请单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 入驻申请单认证审核、签约审核详情
	 */
	@ApiListField("result_info")
	@ApiField("merchant_apply_result_record")
	private List<MerchantApplyResultRecord> resultInfo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setResultInfo(List<MerchantApplyResultRecord> resultInfo) {
		this.resultInfo = resultInfo;
	}
	public List<MerchantApplyResultRecord> getResultInfo( ) {
		return this.resultInfo;
	}

}
