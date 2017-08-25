package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.MerchantApplyResultRecord;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.mapplyorder.query response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo( ) {
		return this.orderNo;
	}

	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link java.lang.String} object.
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	/**
	 * <p>Setter for the field <code>resultInfo</code>.</p>
	 *
	 * @param resultInfo a {@link java.util.List} object.
	 */
	public void setResultInfo(List<MerchantApplyResultRecord> resultInfo) {
		this.resultInfo = resultInfo;
	}
	/**
	 * <p>Getter for the field <code>resultInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MerchantApplyResultRecord> getResultInfo( ) {
		return this.resultInfo;
	}

}
