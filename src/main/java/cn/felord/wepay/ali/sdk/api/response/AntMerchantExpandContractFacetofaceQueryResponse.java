package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.contract.facetoface.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandContractFacetofaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3789323353291749267L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 产品签约审核结果，申请单状态为审核失败时失败原因用“;”分割，其他状态产品签约审核结果为空
	 */
	@ApiField("order_detail")
	private String orderDetail;

	/** 
	 * 支付宝端商户入驻申请单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、审核成功、审核失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	/**
	 * <p>Setter for the field <code>orderDetail</code>.</p>
	 *
	 * @param orderDetail a {@link java.lang.String} object.
	 */
	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}
	/**
	 * <p>Getter for the field <code>orderDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderDetail( ) {
		return this.orderDetail;
	}

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

}
