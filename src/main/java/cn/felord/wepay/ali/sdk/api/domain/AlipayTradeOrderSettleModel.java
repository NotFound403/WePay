package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 统一收单交易结算接口
 *
 * @author auto create
 * @since 1.0, 2016-10-17 15:13:37
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

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<OpenApiRoyaltyDetailInfoPojo> getRoyaltyParameters() {
		return this.royaltyParameters;
	}
	public void setRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
