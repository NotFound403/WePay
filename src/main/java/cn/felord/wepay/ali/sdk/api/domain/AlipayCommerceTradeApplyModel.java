package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业代理收单接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceTradeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3461653233164488189L;

	/**
	 * 订单费用详情，用于在订单确认页面展示
	 */
	@ApiField("amount_detail")
	private String amountDetail;

	/**
	 * 接口请求渠道编码，由支付宝提供
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 接口版本号
	 */
	@ApiField("interface_version")
	private String interfaceVersion;

	/**
	 * 用于标识操作模型，由支付宝配置提供
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 场景的数据表示. json 数组格式，根据场景不同的模型传入不同参数，由支付宝负责提供参数集合
	 */
	@ApiField("order_detail")
	private String orderDetail;

	/**
	 * 用于标识数据模型，由支付宝配置提供
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景覆盖的目标人群标识，支持支付宝userId、身份证号、支付宝登录号、支付宝绑定手机号；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 场景覆盖人群id类型
	 */
	@ApiField("target_id_type")
	private String targetIdType;

	/**
	 * 交易请求参数
	 */
	@ApiField("trade_apply_params")
	private TradeApplyParams tradeApplyParams;

	/**
	 * <p>Getter for the field <code>amountDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmountDetail() {
		return this.amountDetail;
	}
	/**
	 * <p>Setter for the field <code>amountDetail</code>.</p>
	 *
	 * @param amountDetail a {@link java.lang.String} object.
	 */
	public void setAmountDetail(String amountDetail) {
		this.amountDetail = amountDetail;
	}

	/**
	 * <p>Getter for the field <code>channel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannel() {
		return this.channel;
	}
	/**
	 * <p>Setter for the field <code>channel</code>.</p>
	 *
	 * @param channel a {@link java.lang.String} object.
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * <p>Getter for the field <code>interfaceVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterfaceVersion() {
		return this.interfaceVersion;
	}
	/**
	 * <p>Setter for the field <code>interfaceVersion</code>.</p>
	 *
	 * @param interfaceVersion a {@link java.lang.String} object.
	 */
	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

	/**
	 * <p>Getter for the field <code>opCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpCode() {
		return this.opCode;
	}
	/**
	 * <p>Setter for the field <code>opCode</code>.</p>
	 *
	 * @param opCode a {@link java.lang.String} object.
	 */
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	/**
	 * <p>Getter for the field <code>orderDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderDetail() {
		return this.orderDetail;
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
	 * <p>Getter for the field <code>sceneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneCode() {
		return this.sceneCode;
	}
	/**
	 * <p>Setter for the field <code>sceneCode</code>.</p>
	 *
	 * @param sceneCode a {@link java.lang.String} object.
	 */
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	/**
	 * <p>Getter for the field <code>targetId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetId() {
		return this.targetId;
	}
	/**
	 * <p>Setter for the field <code>targetId</code>.</p>
	 *
	 * @param targetId a {@link java.lang.String} object.
	 */
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	/**
	 * <p>Getter for the field <code>targetIdType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetIdType() {
		return this.targetIdType;
	}
	/**
	 * <p>Setter for the field <code>targetIdType</code>.</p>
	 *
	 * @param targetIdType a {@link java.lang.String} object.
	 */
	public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

	/**
	 * <p>Getter for the field <code>tradeApplyParams</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TradeApplyParams} object.
	 */
	public TradeApplyParams getTradeApplyParams() {
		return this.tradeApplyParams;
	}
	/**
	 * <p>Setter for the field <code>tradeApplyParams</code>.</p>
	 *
	 * @param tradeApplyParams a {@link cn.felord.wepay.ali.sdk.api.domain.TradeApplyParams} object.
	 */
	public void setTradeApplyParams(TradeApplyParams tradeApplyParams) {
		this.tradeApplyParams = tradeApplyParams;
	}

}
