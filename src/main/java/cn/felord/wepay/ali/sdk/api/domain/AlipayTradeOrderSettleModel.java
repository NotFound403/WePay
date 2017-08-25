package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 统一收单交易结算接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeOrderSettleModel extends AlipayObject {

	private static final long serialVersionUID = 6496958111839716367L;

	/**
	 * 操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 结算请求流水号 开发者自行生成并保证唯一性
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分账明细信息
	 */
	@ApiListField("royalty_parameters")
	@ApiField("open_api_royalty_detail_info_pojo")
	private List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	/**
	 * <p>Getter for the field <code>royaltyParameters</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenApiRoyaltyDetailInfoPojo> getRoyaltyParameters() {
		return this.royaltyParameters;
	}
	/**
	 * <p>Setter for the field <code>royaltyParameters</code>.</p>
	 *
	 * @param royaltyParameters a {@link java.util.List} object.
	 */
	public void setRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
