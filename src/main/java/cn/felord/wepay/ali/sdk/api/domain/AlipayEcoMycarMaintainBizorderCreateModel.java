package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 创建保养洗车订单接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainBizorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5165646828679537573L;

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
	 * ISV订单状态文案。由ISV上传自己订单的状态，用于订单数据的匹配和对账。
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 订单类型，1：洗车，2：保养，4：4s店
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 车主平台我的爱车ID。可通过接口查询爱车详情。 请查看alipay.eco.mycar.dataservice.maintainvehicle.share接口。
	 */
	@ApiField("car_id")
	private String carId;

	/**
	 * 服务项列表
	 */
	@ApiListField("order_server_list")
	@ApiField("maintain_biz_order")
	private List<MaintainBizOrder> orderServerList;

	/**
	 * 车主平台业务订单状态
1-未支付；
4-已关闭；
6-支付完成；
7-已出库；
8-已收货； 
11-服务开始；
55-服务完成/已核销；
56-订单完成；
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 原始金额，服务原价累计后金额。金额单位(元)，保留两位小数。
原始金额 = 服务原始价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("original_cost")
	private String originalCost;

	/**
	 * ISV业务订单号，ISV上传订单场景，由业务方保证唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部门店编号，订单创建时对应的门店的外部编号，要保证编码在车主平台已经创建对应的门店数据，即有与之唯一匹配的车主平台shop_id
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 支付时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 交易金额。下单时实际支付金额。金额单位(元)，保留两位小数。
交易金额 = 服务售卖价格 * 数量 + 商品售卖价格 * 数量
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 车主平台门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

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
	 * <p>Getter for the field <code>bizStatusTxt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}
	/**
	 * <p>Setter for the field <code>bizStatusTxt</code>.</p>
	 *
	 * @param bizStatusTxt a {@link java.lang.String} object.
	 */
	public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.Long} object.
	 */
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>carId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarId() {
		return this.carId;
	}
	/**
	 * <p>Setter for the field <code>carId</code>.</p>
	 *
	 * @param carId a {@link java.lang.String} object.
	 */
	public void setCarId(String carId) {
		this.carId = carId;
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
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOrderStatus() {
		return this.orderStatus;
	}
	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link java.lang.Long} object.
	 */
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
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
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	/**
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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
	 * <p>Getter for the field <code>payTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayTime() {
		return this.payTime;
	}
	/**
	 * <p>Setter for the field <code>payTime</code>.</p>
	 *
	 * @param payTime a {@link java.lang.String} object.
	 */
	public void setPayTime(String payTime) {
		this.payTime = payTime;
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
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.Long} object.
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
