package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销权益发放接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneCouponSendModel extends AlipayObject {

	private static final long serialVersionUID = 7165131981659485142L;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 活动维度id;
商户PID值
	 */
	@ApiField("dimension_id")
	private String dimensionId;

	/**
	 * 活动维度;
GOODS:淘宝商品,ANT_PID:蚂蚁商户PID
	 */
	@ApiField("dimension_type")
	private String dimensionType;

	/**
	 * 市场类型;
TAOBAO:淘宝平台,ANT: 蚂蚁平台
	 */
	@ApiField("market_type")
	private String marketType;

	/**
	 * 商户生成的外部业务号,必须保证唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务场景;
propertyPaySuccess:蚂蚁物业支付成功页面
	 */
	@ApiField("service_scenario")
	private String serviceScenario;

	/**
	 * <p>Getter for the field <code>channelUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUserId() {
		return this.channelUserId;
	}
	/**
	 * <p>Setter for the field <code>channelUserId</code>.</p>
	 *
	 * @param channelUserId a {@link java.lang.String} object.
	 */
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	/**
	 * <p>Getter for the field <code>channelUserSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUserSource() {
		return this.channelUserSource;
	}
	/**
	 * <p>Setter for the field <code>channelUserSource</code>.</p>
	 *
	 * @param channelUserSource a {@link java.lang.String} object.
	 */
	public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

	/**
	 * <p>Getter for the field <code>dimensionId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDimensionId() {
		return this.dimensionId;
	}
	/**
	 * <p>Setter for the field <code>dimensionId</code>.</p>
	 *
	 * @param dimensionId a {@link java.lang.String} object.
	 */
	public void setDimensionId(String dimensionId) {
		this.dimensionId = dimensionId;
	}

	/**
	 * <p>Getter for the field <code>dimensionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDimensionType() {
		return this.dimensionType;
	}
	/**
	 * <p>Setter for the field <code>dimensionType</code>.</p>
	 *
	 * @param dimensionType a {@link java.lang.String} object.
	 */
	public void setDimensionType(String dimensionType) {
		this.dimensionType = dimensionType;
	}

	/**
	 * <p>Getter for the field <code>marketType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarketType() {
		return this.marketType;
	}
	/**
	 * <p>Setter for the field <code>marketType</code>.</p>
	 *
	 * @param marketType a {@link java.lang.String} object.
	 */
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
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
	 * <p>Getter for the field <code>serviceScenario</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceScenario() {
		return this.serviceScenario;
	}
	/**
	 * <p>Setter for the field <code>serviceScenario</code>.</p>
	 *
	 * @param serviceScenario a {@link java.lang.String} object.
	 */
	public void setServiceScenario(String serviceScenario) {
		this.serviceScenario = serviceScenario;
	}

}
