package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 订单内容变更接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainBizorderUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4474337368343939629L;

	/**
	 * 预约确认时间yyyy-MM-dd HH:mm:ss。门店确认预约时间。门店确认后，预约流程生效，用户可到店服务。
	 */
	@ApiField("appoint_affirm_time")
	private String appointAffirmTime;

	/**
	 * 预约结束时间yyyy-MM-dd HH:mm:ss。用户选择的预约结束时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("appoint_end_time")
	private String appointEndTime;

	/**
	 * 预约开始时间yyyy-MM-dd HH:mm:ss，用户选择的预约开始时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("appoint_start_time")
	private String appointStartTime;

	/**
	 * 预约状态(0-待确认预约 1-确认预约)。有预约流程的订单，门店确认前为待确认预约，门店确认后为 确认预约。
	 */
	@ApiField("appoint_status")
	private Long appointStatus;

	/**
	 * 到店时间yyyy-MM-dd HH:mm:ss。 用户到店时间，用于判断用户是否在预约时间到店服务。
	 */
	@ApiField("arrive_time")
	private String arriveTime;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 服务项列表
	 */
	@ApiListField("order_server_list")
	@ApiField("maintain_biz_order")
	private List<MaintainBizOrder> orderServerList;

	/**
	 * 原始金额。服务原价累计后金额。服务项变更时，重新计算交易金额。金额单位(元)，保留两位小数。原始金额 = 服务原始价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * 外部门店编号；更换门店下单是门店编号，适用于门店重新指派场景。
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 交易金额。服务项变更时，重新计算交易金额。金额单位(元)，保留两位小数。交易金额 = 服务售卖价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 修改场景类型：
appoint_change: 变更预约时间，
appoint_affirm : 预约确认
shop_arrive :到店
service_change : 服务项修改
shop_change : 门店重新指派

变更预约时间（appoint_change）
涉及字段：appoint_start_time、 appoint_end_time
条件：订单未支付、已支付，未确定预约。

确认预约（appoint_affirm）
涉及字段：appoint_status、appoint_affirm_time
条件：订单已支付、未到店

确认到店（shop_arrive）
涉及字段：arrive_time
条件：订单已确定预约、服务未完成

服务项变更（service_change）
涉及字段：order_server_list、real_cost、original_cost
条件：开始保养，服务未完成

门店重新指派（shop_change）
涉及字段：out_shop_id
条件：服务未完成
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * <p>Getter for the field <code>appointAffirmTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppointAffirmTime() {
		return this.appointAffirmTime;
	}
	/**
	 * <p>Setter for the field <code>appointAffirmTime</code>.</p>
	 *
	 * @param appointAffirmTime a {@link java.lang.String} object.
	 */
	public void setAppointAffirmTime(String appointAffirmTime) {
		this.appointAffirmTime = appointAffirmTime;
	}

	/**
	 * <p>Getter for the field <code>appointEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppointEndTime() {
		return this.appointEndTime;
	}
	/**
	 * <p>Setter for the field <code>appointEndTime</code>.</p>
	 *
	 * @param appointEndTime a {@link java.lang.String} object.
	 */
	public void setAppointEndTime(String appointEndTime) {
		this.appointEndTime = appointEndTime;
	}

	/**
	 * <p>Getter for the field <code>appointStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppointStartTime() {
		return this.appointStartTime;
	}
	/**
	 * <p>Setter for the field <code>appointStartTime</code>.</p>
	 *
	 * @param appointStartTime a {@link java.lang.String} object.
	 */
	public void setAppointStartTime(String appointStartTime) {
		this.appointStartTime = appointStartTime;
	}

	/**
	 * <p>Getter for the field <code>appointStatus</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAppointStatus() {
		return this.appointStatus;
	}
	/**
	 * <p>Setter for the field <code>appointStatus</code>.</p>
	 *
	 * @param appointStatus a {@link java.lang.Long} object.
	 */
	public void setAppointStatus(Long appointStatus) {
		this.appointStatus = appointStatus;
	}

	/**
	 * <p>Getter for the field <code>arriveTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArriveTime() {
		return this.arriveTime;
	}
	/**
	 * <p>Setter for the field <code>arriveTime</code>.</p>
	 *
	 * @param arriveTime a {@link java.lang.String} object.
	 */
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
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
	 * <p>Getter for the field <code>orderServerList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MaintainBizOrder> getOrderServerList() {
		return this.orderServerList;
	}
	/**
	 * <p>Setter for the field <code>orderServerList</code>.</p>
	 *
	 * @param orderServerList a {@link java.util.List} object.
	 */
	public void setOrderServerList(List<MaintainBizOrder> orderServerList) {
		this.orderServerList = orderServerList;
	}

	/**
	 * <p>Getter for the field <code>originalCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalCost() {
		return this.originalCost;
	}
	/**
	 * <p>Setter for the field <code>originalCost</code>.</p>
	 *
	 * @param originalCost a {@link java.lang.String} object.
	 */
	public void setOriginalCost(String originalCost) {
		this.originalCost = originalCost;
	}

	/**
	 * <p>Getter for the field <code>outShopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutShopId() {
		return this.outShopId;
	}
	/**
	 * <p>Setter for the field <code>outShopId</code>.</p>
	 *
	 * @param outShopId a {@link java.lang.String} object.
	 */
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	/**
	 * <p>Getter for the field <code>realCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealCost() {
		return this.realCost;
	}
	/**
	 * <p>Setter for the field <code>realCost</code>.</p>
	 *
	 * @param realCost a {@link java.lang.String} object.
	 */
	public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

	/**
	 * <p>Getter for the field <code>sceneType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneType() {
		return this.sceneType;
	}
	/**
	 * <p>Setter for the field <code>sceneType</code>.</p>
	 *
	 * @param sceneType a {@link java.lang.String} object.
	 */
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
