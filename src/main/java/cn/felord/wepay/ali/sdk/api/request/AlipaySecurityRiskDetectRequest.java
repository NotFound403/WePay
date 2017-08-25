package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipaySecurityRiskDetectResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.risk.detect request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskDetectRequest implements AlipayRequest<AlipaySecurityRiskDetectResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 买家账户编号
	 */
	private String buyerAccountNo;

	/** 
	* 买家绑定银行卡号
	 */
	private String buyerBindBankcard;

	/** 
	* 买家绑定银行卡的卡类型
	 */
	private String buyerBindBankcardType;

	/** 
	* 买家绑定手机号
	 */
	private String buyerBindMobile;

	/** 
	* 买家账户在商家的等级，范围：VIP（高级买家）, NORMAL(普通买家）。为空默认NORMAL
	 */
	private String buyerGrade;

	/** 
	* 买家证件号码
	 */
	private String buyerIdentityNo;

	/** 
	* 买家证件类型
	 */
	private String buyerIdentityType;

	/** 
	* 买家真实姓名
	 */
	private String buyerRealName;

	/** 
	* 买家注册时间
	 */
	private String buyerRegDate;

	/** 
	* 买家注册时留的Email
	 */
	private String buyerRegEmail;

	/** 
	* 买家注册手机号
	 */
	private String buyerRegMobile;

	/** 
	* 买家业务处理时使用的银行卡号
	 */
	private String buyerSceneBankcard;

	/** 
	* 买家业务处理时使用的银行卡类型
	 */
	private String buyerSceneBankcardType;

	/** 
	* 买家业务处理时使用的邮箱
	 */
	private String buyerSceneEmail;

	/** 
	* 买家业务处理时使用的手机号
	 */
	private String buyerSceneMobile;

	/** 
	* 币种
	 */
	private String currency;

	/** 
	* 客户端的基带版本
	 */
	private String envClientBaseBand;

	/** 
	* 客户端连接的基站信息,格式为：CELLID^LAC
	 */
	private String envClientBaseStation;

	/** 
	* 客户端的经纬度坐标,格式为：精度^维度
	 */
	private String envClientCoordinates;

	/** 
	* 操作的客户端的imei
	 */
	private String envClientImei;

	/** 
	* 操作的客户端IMSI识别码
	 */
	private String envClientImsi;

	/** 
	* IOS设备的UDID
	 */
	private String envClientIosUdid;

	/** 
	* 操作的客户端ip
	 */
	private String envClientIp;

	/** 
	* 操作的客户端mac
	 */
	private String envClientMac;

	/** 
	* 操作的客户端分辨率，格式为：水平像素^垂直像素；如：800^600
	 */
	private String envClientScreen;

	/** 
	* 客户端设备的统一识别码UUID
	 */
	private String envClientUuid;

	/** 
	* 订单产品数量，购买产品的数量（不可为小数）
	 */
	private String itemQuantity;

	/** 
	* 订单产品单价，取值范围为[0.01,100000000.00]，精确到小数点后两位。 curren...
	 */
	private String itemUnitPrice;

	/** 
	* JS SDK生成的 tokenID
	 */
	private String jsTokenId;

	/** 
	* 订单总金额，取值范围为[0.01,100000000.00]，精确到小数点后两位。
	 */
	private String orderAmount;

	/** 
	* 订单商品所在类目
	 */
	private String orderCategory;

	/** 
	* 订单下单时间
	 */
	private String orderCredateTime;

	/** 
	* 订单商品所在城市
	 */
	private String orderItemCity;

	/** 
	* 订单产品名称
	 */
	private String orderItemName;

	/** 
	* 商户订单唯一标识号
	 */
	private String orderNo;

	/** 
	* 签约的支付宝账号对应的支付宝唯一用户号
	 */
	private String partnerId;

	/** 
	* 订单收货人地址
	 */
	private String receiverAddress;

	/** 
	* 订单收货人地址城市
	 */
	private String receiverCity;

	/** 
	* 订单收货人地址所在区
	 */
	private String receiverDistrict;

	/** 
	* 订单收货人邮箱
	 */
	private String receiverEmail;

	/** 
	* 订单收货人手机
	 */
	private String receiverMobile;

	/** 
	* 订单收货人姓名
	 */
	private String receiverName;

	/** 
	* 订单收货人地址省份
	 */
	private String receiverState;

	/** 
	* 订单收货人地址邮编
	 */
	private String receiverZip;

	/** 
	* 场景编码
	 */
	private String sceneCode;

	/** 
	* 卖家账户编号
	 */
	private String sellerAccountNo;

	/** 
	* 卖家绑定银行卡号
	 */
	private String sellerBindBankcard;

	/** 
	* 卖家绑定的银行卡的卡类型
	 */
	private String sellerBindBankcardType;

	/** 
	* 卖家绑定手机号
	 */
	private String sellerBindMobile;

	/** 
	* 卖家证件号码
	 */
	private String sellerIdentityNo;

	/** 
	* 卖家证件类型
	 */
	private String sellerIdentityType;

	/** 
	* 卖家真实姓名
	 */
	private String sellerRealName;

	/** 
	* 卖家注册时间,格式为：yyyy-MM-dd。
	 */
	private String sellerRegDate;

	/** 
	* 卖家注册Email
	 */
	private String sellerRegEmail;

	/** 
	* 卖家注册手机号
	 */
	private String sellerRegMoile;

	/** 
	* 订单物流方式
	 */
	private String transportType;

	/**
	 * <p>Setter for the field <code>buyerAccountNo</code>.</p>
	 *
	 * @param buyerAccountNo a {@link java.lang.String} object.
	 */
	public void setBuyerAccountNo(String buyerAccountNo) {
		this.buyerAccountNo = buyerAccountNo;
	}
	/**
	 * <p>Getter for the field <code>buyerAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerAccountNo() {
		return this.buyerAccountNo;
	}

	/**
	 * <p>Setter for the field <code>buyerBindBankcard</code>.</p>
	 *
	 * @param buyerBindBankcard a {@link java.lang.String} object.
	 */
	public void setBuyerBindBankcard(String buyerBindBankcard) {
		this.buyerBindBankcard = buyerBindBankcard;
	}
	/**
	 * <p>Getter for the field <code>buyerBindBankcard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerBindBankcard() {
		return this.buyerBindBankcard;
	}

	/**
	 * <p>Setter for the field <code>buyerBindBankcardType</code>.</p>
	 *
	 * @param buyerBindBankcardType a {@link java.lang.String} object.
	 */
	public void setBuyerBindBankcardType(String buyerBindBankcardType) {
		this.buyerBindBankcardType = buyerBindBankcardType;
	}
	/**
	 * <p>Getter for the field <code>buyerBindBankcardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerBindBankcardType() {
		return this.buyerBindBankcardType;
	}

	/**
	 * <p>Setter for the field <code>buyerBindMobile</code>.</p>
	 *
	 * @param buyerBindMobile a {@link java.lang.String} object.
	 */
	public void setBuyerBindMobile(String buyerBindMobile) {
		this.buyerBindMobile = buyerBindMobile;
	}
	/**
	 * <p>Getter for the field <code>buyerBindMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerBindMobile() {
		return this.buyerBindMobile;
	}

	/**
	 * <p>Setter for the field <code>buyerGrade</code>.</p>
	 *
	 * @param buyerGrade a {@link java.lang.String} object.
	 */
	public void setBuyerGrade(String buyerGrade) {
		this.buyerGrade = buyerGrade;
	}
	/**
	 * <p>Getter for the field <code>buyerGrade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerGrade() {
		return this.buyerGrade;
	}

	/**
	 * <p>Setter for the field <code>buyerIdentityNo</code>.</p>
	 *
	 * @param buyerIdentityNo a {@link java.lang.String} object.
	 */
	public void setBuyerIdentityNo(String buyerIdentityNo) {
		this.buyerIdentityNo = buyerIdentityNo;
	}
	/**
	 * <p>Getter for the field <code>buyerIdentityNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerIdentityNo() {
		return this.buyerIdentityNo;
	}

	/**
	 * <p>Setter for the field <code>buyerIdentityType</code>.</p>
	 *
	 * @param buyerIdentityType a {@link java.lang.String} object.
	 */
	public void setBuyerIdentityType(String buyerIdentityType) {
		this.buyerIdentityType = buyerIdentityType;
	}
	/**
	 * <p>Getter for the field <code>buyerIdentityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerIdentityType() {
		return this.buyerIdentityType;
	}

	/**
	 * <p>Setter for the field <code>buyerRealName</code>.</p>
	 *
	 * @param buyerRealName a {@link java.lang.String} object.
	 */
	public void setBuyerRealName(String buyerRealName) {
		this.buyerRealName = buyerRealName;
	}
	/**
	 * <p>Getter for the field <code>buyerRealName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerRealName() {
		return this.buyerRealName;
	}

	/**
	 * <p>Setter for the field <code>buyerRegDate</code>.</p>
	 *
	 * @param buyerRegDate a {@link java.lang.String} object.
	 */
	public void setBuyerRegDate(String buyerRegDate) {
		this.buyerRegDate = buyerRegDate;
	}
	/**
	 * <p>Getter for the field <code>buyerRegDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerRegDate() {
		return this.buyerRegDate;
	}

	/**
	 * <p>Setter for the field <code>buyerRegEmail</code>.</p>
	 *
	 * @param buyerRegEmail a {@link java.lang.String} object.
	 */
	public void setBuyerRegEmail(String buyerRegEmail) {
		this.buyerRegEmail = buyerRegEmail;
	}
	/**
	 * <p>Getter for the field <code>buyerRegEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerRegEmail() {
		return this.buyerRegEmail;
	}

	/**
	 * <p>Setter for the field <code>buyerRegMobile</code>.</p>
	 *
	 * @param buyerRegMobile a {@link java.lang.String} object.
	 */
	public void setBuyerRegMobile(String buyerRegMobile) {
		this.buyerRegMobile = buyerRegMobile;
	}
	/**
	 * <p>Getter for the field <code>buyerRegMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerRegMobile() {
		return this.buyerRegMobile;
	}

	/**
	 * <p>Setter for the field <code>buyerSceneBankcard</code>.</p>
	 *
	 * @param buyerSceneBankcard a {@link java.lang.String} object.
	 */
	public void setBuyerSceneBankcard(String buyerSceneBankcard) {
		this.buyerSceneBankcard = buyerSceneBankcard;
	}
	/**
	 * <p>Getter for the field <code>buyerSceneBankcard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerSceneBankcard() {
		return this.buyerSceneBankcard;
	}

	/**
	 * <p>Setter for the field <code>buyerSceneBankcardType</code>.</p>
	 *
	 * @param buyerSceneBankcardType a {@link java.lang.String} object.
	 */
	public void setBuyerSceneBankcardType(String buyerSceneBankcardType) {
		this.buyerSceneBankcardType = buyerSceneBankcardType;
	}
	/**
	 * <p>Getter for the field <code>buyerSceneBankcardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerSceneBankcardType() {
		return this.buyerSceneBankcardType;
	}

	/**
	 * <p>Setter for the field <code>buyerSceneEmail</code>.</p>
	 *
	 * @param buyerSceneEmail a {@link java.lang.String} object.
	 */
	public void setBuyerSceneEmail(String buyerSceneEmail) {
		this.buyerSceneEmail = buyerSceneEmail;
	}
	/**
	 * <p>Getter for the field <code>buyerSceneEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerSceneEmail() {
		return this.buyerSceneEmail;
	}

	/**
	 * <p>Setter for the field <code>buyerSceneMobile</code>.</p>
	 *
	 * @param buyerSceneMobile a {@link java.lang.String} object.
	 */
	public void setBuyerSceneMobile(String buyerSceneMobile) {
		this.buyerSceneMobile = buyerSceneMobile;
	}
	/**
	 * <p>Getter for the field <code>buyerSceneMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerSceneMobile() {
		return this.buyerSceneMobile;
	}

	/**
	 * <p>Setter for the field <code>currency</code>.</p>
	 *
	 * @param currency a {@link java.lang.String} object.
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * <p>Getter for the field <code>currency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * <p>Setter for the field <code>envClientBaseBand</code>.</p>
	 *
	 * @param envClientBaseBand a {@link java.lang.String} object.
	 */
	public void setEnvClientBaseBand(String envClientBaseBand) {
		this.envClientBaseBand = envClientBaseBand;
	}
	/**
	 * <p>Getter for the field <code>envClientBaseBand</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientBaseBand() {
		return this.envClientBaseBand;
	}

	/**
	 * <p>Setter for the field <code>envClientBaseStation</code>.</p>
	 *
	 * @param envClientBaseStation a {@link java.lang.String} object.
	 */
	public void setEnvClientBaseStation(String envClientBaseStation) {
		this.envClientBaseStation = envClientBaseStation;
	}
	/**
	 * <p>Getter for the field <code>envClientBaseStation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientBaseStation() {
		return this.envClientBaseStation;
	}

	/**
	 * <p>Setter for the field <code>envClientCoordinates</code>.</p>
	 *
	 * @param envClientCoordinates a {@link java.lang.String} object.
	 */
	public void setEnvClientCoordinates(String envClientCoordinates) {
		this.envClientCoordinates = envClientCoordinates;
	}
	/**
	 * <p>Getter for the field <code>envClientCoordinates</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientCoordinates() {
		return this.envClientCoordinates;
	}

	/**
	 * <p>Setter for the field <code>envClientImei</code>.</p>
	 *
	 * @param envClientImei a {@link java.lang.String} object.
	 */
	public void setEnvClientImei(String envClientImei) {
		this.envClientImei = envClientImei;
	}
	/**
	 * <p>Getter for the field <code>envClientImei</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientImei() {
		return this.envClientImei;
	}

	/**
	 * <p>Setter for the field <code>envClientImsi</code>.</p>
	 *
	 * @param envClientImsi a {@link java.lang.String} object.
	 */
	public void setEnvClientImsi(String envClientImsi) {
		this.envClientImsi = envClientImsi;
	}
	/**
	 * <p>Getter for the field <code>envClientImsi</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientImsi() {
		return this.envClientImsi;
	}

	/**
	 * <p>Setter for the field <code>envClientIosUdid</code>.</p>
	 *
	 * @param envClientIosUdid a {@link java.lang.String} object.
	 */
	public void setEnvClientIosUdid(String envClientIosUdid) {
		this.envClientIosUdid = envClientIosUdid;
	}
	/**
	 * <p>Getter for the field <code>envClientIosUdid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientIosUdid() {
		return this.envClientIosUdid;
	}

	/**
	 * <p>Setter for the field <code>envClientIp</code>.</p>
	 *
	 * @param envClientIp a {@link java.lang.String} object.
	 */
	public void setEnvClientIp(String envClientIp) {
		this.envClientIp = envClientIp;
	}
	/**
	 * <p>Getter for the field <code>envClientIp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientIp() {
		return this.envClientIp;
	}

	/**
	 * <p>Setter for the field <code>envClientMac</code>.</p>
	 *
	 * @param envClientMac a {@link java.lang.String} object.
	 */
	public void setEnvClientMac(String envClientMac) {
		this.envClientMac = envClientMac;
	}
	/**
	 * <p>Getter for the field <code>envClientMac</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientMac() {
		return this.envClientMac;
	}

	/**
	 * <p>Setter for the field <code>envClientScreen</code>.</p>
	 *
	 * @param envClientScreen a {@link java.lang.String} object.
	 */
	public void setEnvClientScreen(String envClientScreen) {
		this.envClientScreen = envClientScreen;
	}
	/**
	 * <p>Getter for the field <code>envClientScreen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientScreen() {
		return this.envClientScreen;
	}

	/**
	 * <p>Setter for the field <code>envClientUuid</code>.</p>
	 *
	 * @param envClientUuid a {@link java.lang.String} object.
	 */
	public void setEnvClientUuid(String envClientUuid) {
		this.envClientUuid = envClientUuid;
	}
	/**
	 * <p>Getter for the field <code>envClientUuid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientUuid() {
		return this.envClientUuid;
	}

	/**
	 * <p>Setter for the field <code>itemQuantity</code>.</p>
	 *
	 * @param itemQuantity a {@link java.lang.String} object.
	 */
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	/**
	 * <p>Getter for the field <code>itemQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemQuantity() {
		return this.itemQuantity;
	}

	/**
	 * <p>Setter for the field <code>itemUnitPrice</code>.</p>
	 *
	 * @param itemUnitPrice a {@link java.lang.String} object.
	 */
	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	/**
	 * <p>Getter for the field <code>itemUnitPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemUnitPrice() {
		return this.itemUnitPrice;
	}

	/**
	 * <p>Setter for the field <code>jsTokenId</code>.</p>
	 *
	 * @param jsTokenId a {@link java.lang.String} object.
	 */
	public void setJsTokenId(String jsTokenId) {
		this.jsTokenId = jsTokenId;
	}
	/**
	 * <p>Getter for the field <code>jsTokenId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJsTokenId() {
		return this.jsTokenId;
	}

	/**
	 * <p>Setter for the field <code>orderAmount</code>.</p>
	 *
	 * @param orderAmount a {@link java.lang.String} object.
	 */
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	/**
	 * <p>Getter for the field <code>orderAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderAmount() {
		return this.orderAmount;
	}

	/**
	 * <p>Setter for the field <code>orderCategory</code>.</p>
	 *
	 * @param orderCategory a {@link java.lang.String} object.
	 */
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}
	/**
	 * <p>Getter for the field <code>orderCategory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderCategory() {
		return this.orderCategory;
	}

	/**
	 * <p>Setter for the field <code>orderCredateTime</code>.</p>
	 *
	 * @param orderCredateTime a {@link java.lang.String} object.
	 */
	public void setOrderCredateTime(String orderCredateTime) {
		this.orderCredateTime = orderCredateTime;
	}
	/**
	 * <p>Getter for the field <code>orderCredateTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderCredateTime() {
		return this.orderCredateTime;
	}

	/**
	 * <p>Setter for the field <code>orderItemCity</code>.</p>
	 *
	 * @param orderItemCity a {@link java.lang.String} object.
	 */
	public void setOrderItemCity(String orderItemCity) {
		this.orderItemCity = orderItemCity;
	}
	/**
	 * <p>Getter for the field <code>orderItemCity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderItemCity() {
		return this.orderItemCity;
	}

	/**
	 * <p>Setter for the field <code>orderItemName</code>.</p>
	 *
	 * @param orderItemName a {@link java.lang.String} object.
	 */
	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}
	/**
	 * <p>Getter for the field <code>orderItemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderItemName() {
		return this.orderItemName;
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
	public String getOrderNo() {
		return this.orderNo;
	}

	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}

	/**
	 * <p>Setter for the field <code>receiverAddress</code>.</p>
	 *
	 * @param receiverAddress a {@link java.lang.String} object.
	 */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	/**
	 * <p>Getter for the field <code>receiverAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	/**
	 * <p>Setter for the field <code>receiverCity</code>.</p>
	 *
	 * @param receiverCity a {@link java.lang.String} object.
	 */
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	/**
	 * <p>Getter for the field <code>receiverCity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverCity() {
		return this.receiverCity;
	}

	/**
	 * <p>Setter for the field <code>receiverDistrict</code>.</p>
	 *
	 * @param receiverDistrict a {@link java.lang.String} object.
	 */
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	/**
	 * <p>Getter for the field <code>receiverDistrict</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	/**
	 * <p>Setter for the field <code>receiverEmail</code>.</p>
	 *
	 * @param receiverEmail a {@link java.lang.String} object.
	 */
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	/**
	 * <p>Getter for the field <code>receiverEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverEmail() {
		return this.receiverEmail;
	}

	/**
	 * <p>Setter for the field <code>receiverMobile</code>.</p>
	 *
	 * @param receiverMobile a {@link java.lang.String} object.
	 */
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	/**
	 * <p>Getter for the field <code>receiverMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	/**
	 * <p>Setter for the field <code>receiverName</code>.</p>
	 *
	 * @param receiverName a {@link java.lang.String} object.
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
	 * <p>Getter for the field <code>receiverName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverName() {
		return this.receiverName;
	}

	/**
	 * <p>Setter for the field <code>receiverState</code>.</p>
	 *
	 * @param receiverState a {@link java.lang.String} object.
	 */
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	/**
	 * <p>Getter for the field <code>receiverState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverState() {
		return this.receiverState;
	}

	/**
	 * <p>Setter for the field <code>receiverZip</code>.</p>
	 *
	 * @param receiverZip a {@link java.lang.String} object.
	 */
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}
	/**
	 * <p>Getter for the field <code>receiverZip</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverZip() {
		return this.receiverZip;
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
	 * <p>Getter for the field <code>sceneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneCode() {
		return this.sceneCode;
	}

	/**
	 * <p>Setter for the field <code>sellerAccountNo</code>.</p>
	 *
	 * @param sellerAccountNo a {@link java.lang.String} object.
	 */
	public void setSellerAccountNo(String sellerAccountNo) {
		this.sellerAccountNo = sellerAccountNo;
	}
	/**
	 * <p>Getter for the field <code>sellerAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerAccountNo() {
		return this.sellerAccountNo;
	}

	/**
	 * <p>Setter for the field <code>sellerBindBankcard</code>.</p>
	 *
	 * @param sellerBindBankcard a {@link java.lang.String} object.
	 */
	public void setSellerBindBankcard(String sellerBindBankcard) {
		this.sellerBindBankcard = sellerBindBankcard;
	}
	/**
	 * <p>Getter for the field <code>sellerBindBankcard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerBindBankcard() {
		return this.sellerBindBankcard;
	}

	/**
	 * <p>Setter for the field <code>sellerBindBankcardType</code>.</p>
	 *
	 * @param sellerBindBankcardType a {@link java.lang.String} object.
	 */
	public void setSellerBindBankcardType(String sellerBindBankcardType) {
		this.sellerBindBankcardType = sellerBindBankcardType;
	}
	/**
	 * <p>Getter for the field <code>sellerBindBankcardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerBindBankcardType() {
		return this.sellerBindBankcardType;
	}

	/**
	 * <p>Setter for the field <code>sellerBindMobile</code>.</p>
	 *
	 * @param sellerBindMobile a {@link java.lang.String} object.
	 */
	public void setSellerBindMobile(String sellerBindMobile) {
		this.sellerBindMobile = sellerBindMobile;
	}
	/**
	 * <p>Getter for the field <code>sellerBindMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerBindMobile() {
		return this.sellerBindMobile;
	}

	/**
	 * <p>Setter for the field <code>sellerIdentityNo</code>.</p>
	 *
	 * @param sellerIdentityNo a {@link java.lang.String} object.
	 */
	public void setSellerIdentityNo(String sellerIdentityNo) {
		this.sellerIdentityNo = sellerIdentityNo;
	}
	/**
	 * <p>Getter for the field <code>sellerIdentityNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerIdentityNo() {
		return this.sellerIdentityNo;
	}

	/**
	 * <p>Setter for the field <code>sellerIdentityType</code>.</p>
	 *
	 * @param sellerIdentityType a {@link java.lang.String} object.
	 */
	public void setSellerIdentityType(String sellerIdentityType) {
		this.sellerIdentityType = sellerIdentityType;
	}
	/**
	 * <p>Getter for the field <code>sellerIdentityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerIdentityType() {
		return this.sellerIdentityType;
	}

	/**
	 * <p>Setter for the field <code>sellerRealName</code>.</p>
	 *
	 * @param sellerRealName a {@link java.lang.String} object.
	 */
	public void setSellerRealName(String sellerRealName) {
		this.sellerRealName = sellerRealName;
	}
	/**
	 * <p>Getter for the field <code>sellerRealName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerRealName() {
		return this.sellerRealName;
	}

	/**
	 * <p>Setter for the field <code>sellerRegDate</code>.</p>
	 *
	 * @param sellerRegDate a {@link java.lang.String} object.
	 */
	public void setSellerRegDate(String sellerRegDate) {
		this.sellerRegDate = sellerRegDate;
	}
	/**
	 * <p>Getter for the field <code>sellerRegDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerRegDate() {
		return this.sellerRegDate;
	}

	/**
	 * <p>Setter for the field <code>sellerRegEmail</code>.</p>
	 *
	 * @param sellerRegEmail a {@link java.lang.String} object.
	 */
	public void setSellerRegEmail(String sellerRegEmail) {
		this.sellerRegEmail = sellerRegEmail;
	}
	/**
	 * <p>Getter for the field <code>sellerRegEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerRegEmail() {
		return this.sellerRegEmail;
	}

	/**
	 * <p>Setter for the field <code>sellerRegMoile</code>.</p>
	 *
	 * @param sellerRegMoile a {@link java.lang.String} object.
	 */
	public void setSellerRegMoile(String sellerRegMoile) {
		this.sellerRegMoile = sellerRegMoile;
	}
	/**
	 * <p>Getter for the field <code>sellerRegMoile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerRegMoile() {
		return this.sellerRegMoile;
	}

	/**
	 * <p>Setter for the field <code>transportType</code>.</p>
	 *
	 * @param transportType a {@link java.lang.String} object.
	 */
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	/**
	 * <p>Getter for the field <code>transportType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransportType() {
		return this.transportType;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	/**
	 * <p>Getter for the field <code>notifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	/** {@inheritDoc} */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	/**
	 * <p>Getter for the field <code>returnUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReturnUrl() {
		return this.returnUrl;
	}

	/** {@inheritDoc} */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * <p>Getter for the field <code>apiVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiVersion() {
		return this.apiVersion;
	}

	/** {@inheritDoc} */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/** {@inheritDoc} */
	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    /**
     * <p>Getter for the field <code>terminalType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalType(){
    	return this.terminalType;
    }

    /** {@inheritDoc} */
    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    /**
     * <p>Getter for the field <code>terminalInfo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	/** {@inheritDoc} */
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode; 
	}

	/**
	 * <p>getApiMethodName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiMethodName() {
		return "alipay.security.risk.detect";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("buyer_account_no", this.buyerAccountNo);
		txtParams.put("buyer_bind_bankcard", this.buyerBindBankcard);
		txtParams.put("buyer_bind_bankcard_type", this.buyerBindBankcardType);
		txtParams.put("buyer_bind_mobile", this.buyerBindMobile);
		txtParams.put("buyer_grade", this.buyerGrade);
		txtParams.put("buyer_identity_no", this.buyerIdentityNo);
		txtParams.put("buyer_identity_type", this.buyerIdentityType);
		txtParams.put("buyer_real_name", this.buyerRealName);
		txtParams.put("buyer_reg_date", this.buyerRegDate);
		txtParams.put("buyer_reg_email", this.buyerRegEmail);
		txtParams.put("buyer_reg_mobile", this.buyerRegMobile);
		txtParams.put("buyer_scene_bankcard", this.buyerSceneBankcard);
		txtParams.put("buyer_scene_bankcard_type", this.buyerSceneBankcardType);
		txtParams.put("buyer_scene_email", this.buyerSceneEmail);
		txtParams.put("buyer_scene_mobile", this.buyerSceneMobile);
		txtParams.put("currency", this.currency);
		txtParams.put("env_client_base_band", this.envClientBaseBand);
		txtParams.put("env_client_base_station", this.envClientBaseStation);
		txtParams.put("env_client_coordinates", this.envClientCoordinates);
		txtParams.put("env_client_imei", this.envClientImei);
		txtParams.put("env_client_imsi", this.envClientImsi);
		txtParams.put("env_client_ios_udid", this.envClientIosUdid);
		txtParams.put("env_client_ip", this.envClientIp);
		txtParams.put("env_client_mac", this.envClientMac);
		txtParams.put("env_client_screen", this.envClientScreen);
		txtParams.put("env_client_uuid", this.envClientUuid);
		txtParams.put("item_quantity", this.itemQuantity);
		txtParams.put("item_unit_price", this.itemUnitPrice);
		txtParams.put("js_token_id", this.jsTokenId);
		txtParams.put("order_amount", this.orderAmount);
		txtParams.put("order_category", this.orderCategory);
		txtParams.put("order_credate_time", this.orderCredateTime);
		txtParams.put("order_item_city", this.orderItemCity);
		txtParams.put("order_item_name", this.orderItemName);
		txtParams.put("order_no", this.orderNo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("receiver_address", this.receiverAddress);
		txtParams.put("receiver_city", this.receiverCity);
		txtParams.put("receiver_district", this.receiverDistrict);
		txtParams.put("receiver_email", this.receiverEmail);
		txtParams.put("receiver_mobile", this.receiverMobile);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("receiver_state", this.receiverState);
		txtParams.put("receiver_zip", this.receiverZip);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("seller_account_no", this.sellerAccountNo);
		txtParams.put("seller_bind_bankcard", this.sellerBindBankcard);
		txtParams.put("seller_bind_bankcard_type", this.sellerBindBankcardType);
		txtParams.put("seller_bind_mobile", this.sellerBindMobile);
		txtParams.put("seller_identity_no", this.sellerIdentityNo);
		txtParams.put("seller_identity_type", this.sellerIdentityType);
		txtParams.put("seller_real_name", this.sellerRealName);
		txtParams.put("seller_reg_date", this.sellerRegDate);
		txtParams.put("seller_reg_email", this.sellerRegEmail);
		txtParams.put("seller_reg_moile", this.sellerRegMoile);
		txtParams.put("transport_type", this.transportType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	/**
	 * <p>putOtherTextParam.</p>
	 *
	 * @param key a {@link java.lang.String} object.
	 * @param value a {@link java.lang.String} object.
	 */
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	/**
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<AlipaySecurityRiskDetectResponse> getResponseClass() {
		return AlipaySecurityRiskDetectResponse.class;
	}
	

    /**
     * <p>isNeedEncrypt.</p>
     *
     * @return a boolean.
     */
    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    /** {@inheritDoc} */
    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    /**
     * <p>Getter for the field <code>bizModel</code>.</p>
     *
     * @return a {@link cn.felord.wepay.ali.sdk.api.AlipayObject} object.
     */
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    /** {@inheritDoc} */
    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
