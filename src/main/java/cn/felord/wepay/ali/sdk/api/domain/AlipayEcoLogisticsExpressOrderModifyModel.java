package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单更新接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoLogisticsExpressOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6244352793885587782L;

	/**
	 * 接单类型，已接单状态时必填
courier_accept：快递员接单，
site_accept：快递站接单
	 */
	@ApiField("accept_type")
	private String acceptType;

	/**
	 * 快递员支付宝帐号，快递员接单时选填
	 */
	@ApiField("courier_alipay_account")
	private String courierAlipayAccount;

	/**
	 * 员工号，快递员接单时必填
	 */
	@ApiField("courier_emp_num")
	private String courierEmpNum;

	/**
	 * 接单快递员头像文件二进制内容的BASE64编码串
头像格式为100X100的PNG图片
	 */
	@ApiField("courier_head_img")
	private String courierHeadImg;

	/**
	 * 身份证，快递员接单时选填
	 */
	@ApiField("courier_id_card")
	private String courierIdCard;

	/**
	 * 快递员手机号，快递员接单时必填
	 */
	@ApiField("courier_mobile")
	private String courierMobile;

	/**
	 * 快递员姓名，快递员接单时必填
	 */
	@ApiField("courier_name")
	private String courierName;

	/**
	 * 物品重量（克），已取件状态时必填
	 */
	@ApiField("goods_weight")
	private Long goodsWeight;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 订单金额（元），已取件状态时必填
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 寄件平台订单号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态
collected:已取件
accepted:已接单
canceled:已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 产品类型变更原因，产品类型变更时选填。
	 */
	@ApiField("product_type_change_reason")
	private String productTypeChangeReason;

	/**
	 * 产品类型编码，如果快递公司变更了产品类型，则需要将变更后的产品类型编码回传。取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/**
	 * 快递公司拒绝接单原因编码，已取消状态时必填，取值如下：
R01  揽收地超服务范围
R02  派送地超服务范围
R03  揽收预约时间超范围，无法协商
R04  虚假揽货电话（客户电话与联系人不符）
R05  托寄物品为禁限寄品
R06  用户恶意下单
R07  用户取消订单
R08  其他原因，需自定义描述
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 快递公司拒绝接单原因描述，快递公司拒绝接单原因编码取值为R08时必填
	 */
	@ApiField("refuse_desc")
	private String refuseDesc;

	/**
	 * 站点所在区县编码，快递站点接单时必填。采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("site_area_code")
	private String siteAreaCode;

	/**
	 * 快递站点编号，快递站点接单时必填
	 */
	@ApiField("site_code")
	private String siteCode;

	/**
	 * 站点投诉电话，快递站点接单时选填
	 */
	@ApiField("site_complain_tel")
	private String siteComplainTel;

	/**
	 * 站点所在详细地址，快递站点接单时必填
	 */
	@ApiField("site_detail_addr")
	private String siteDetailAddr;

	/**
	 * 站点负责人手机号，快递站点接单时必填
	 */
	@ApiField("site_leader_mobile")
	private String siteLeaderMobile;

	/**
	 * 站点负责人，快递站点接单时必填
	 */
	@ApiField("site_leader_name")
	private String siteLeaderName;

	/**
	 * 快递站点名称，快递站点接单时必填
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 运单号，已取件状态时必填
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

	/**
	 * <p>Getter for the field <code>acceptType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAcceptType() {
		return this.acceptType;
	}
	/**
	 * <p>Setter for the field <code>acceptType</code>.</p>
	 *
	 * @param acceptType a {@link java.lang.String} object.
	 */
	public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}

	/**
	 * <p>Getter for the field <code>courierAlipayAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCourierAlipayAccount() {
		return this.courierAlipayAccount;
	}
	/**
	 * <p>Setter for the field <code>courierAlipayAccount</code>.</p>
	 *
	 * @param courierAlipayAccount a {@link java.lang.String} object.
	 */
	public void setCourierAlipayAccount(String courierAlipayAccount) {
		this.courierAlipayAccount = courierAlipayAccount;
	}

	/**
	 * <p>Getter for the field <code>courierEmpNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCourierEmpNum() {
		return this.courierEmpNum;
	}
	/**
	 * <p>Setter for the field <code>courierEmpNum</code>.</p>
	 *
	 * @param courierEmpNum a {@link java.lang.String} object.
	 */
	public void setCourierEmpNum(String courierEmpNum) {
		this.courierEmpNum = courierEmpNum;
	}

	/**
	 * <p>Getter for the field <code>courierHeadImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCourierHeadImg() {
		return this.courierHeadImg;
	}
	/**
	 * <p>Setter for the field <code>courierHeadImg</code>.</p>
	 *
	 * @param courierHeadImg a {@link java.lang.String} object.
	 */
	public void setCourierHeadImg(String courierHeadImg) {
		this.courierHeadImg = courierHeadImg;
	}

	/**
	 * <p>Getter for the field <code>courierIdCard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCourierIdCard() {
		return this.courierIdCard;
	}
	/**
	 * <p>Setter for the field <code>courierIdCard</code>.</p>
	 *
	 * @param courierIdCard a {@link java.lang.String} object.
	 */
	public void setCourierIdCard(String courierIdCard) {
		this.courierIdCard = courierIdCard;
	}

	/**
	 * <p>Getter for the field <code>courierMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCourierMobile() {
		return this.courierMobile;
	}
	/**
	 * <p>Setter for the field <code>courierMobile</code>.</p>
	 *
	 * @param courierMobile a {@link java.lang.String} object.
	 */
	public void setCourierMobile(String courierMobile) {
		this.courierMobile = courierMobile;
	}

	/**
	 * <p>Getter for the field <code>courierName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCourierName() {
		return this.courierName;
	}
	/**
	 * <p>Setter for the field <code>courierName</code>.</p>
	 *
	 * @param courierName a {@link java.lang.String} object.
	 */
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	/**
	 * <p>Getter for the field <code>goodsWeight</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getGoodsWeight() {
		return this.goodsWeight;
	}
	/**
	 * <p>Setter for the field <code>goodsWeight</code>.</p>
	 *
	 * @param goodsWeight a {@link java.lang.Long} object.
	 */
	public void setGoodsWeight(Long goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	/**
	 * <p>Getter for the field <code>logisMerchCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisMerchCode() {
		return this.logisMerchCode;
	}
	/**
	 * <p>Setter for the field <code>logisMerchCode</code>.</p>
	 *
	 * @param logisMerchCode a {@link java.lang.String} object.
	 */
	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
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
	 * <p>Setter for the field <code>orderAmount</code>.</p>
	 *
	 * @param orderAmount a {@link java.lang.String} object.
	 */
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
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
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus() {
		return this.orderStatus;
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
	 * <p>Getter for the field <code>productTypeChangeReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductTypeChangeReason() {
		return this.productTypeChangeReason;
	}
	/**
	 * <p>Setter for the field <code>productTypeChangeReason</code>.</p>
	 *
	 * @param productTypeChangeReason a {@link java.lang.String} object.
	 */
	public void setProductTypeChangeReason(String productTypeChangeReason) {
		this.productTypeChangeReason = productTypeChangeReason;
	}

	/**
	 * <p>Getter for the field <code>productTypeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductTypeCode() {
		return this.productTypeCode;
	}
	/**
	 * <p>Setter for the field <code>productTypeCode</code>.</p>
	 *
	 * @param productTypeCode a {@link java.lang.String} object.
	 */
	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	/**
	 * <p>Getter for the field <code>refuseCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefuseCode() {
		return this.refuseCode;
	}
	/**
	 * <p>Setter for the field <code>refuseCode</code>.</p>
	 *
	 * @param refuseCode a {@link java.lang.String} object.
	 */
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	/**
	 * <p>Getter for the field <code>refuseDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefuseDesc() {
		return this.refuseDesc;
	}
	/**
	 * <p>Setter for the field <code>refuseDesc</code>.</p>
	 *
	 * @param refuseDesc a {@link java.lang.String} object.
	 */
	public void setRefuseDesc(String refuseDesc) {
		this.refuseDesc = refuseDesc;
	}

	/**
	 * <p>Getter for the field <code>siteAreaCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteAreaCode() {
		return this.siteAreaCode;
	}
	/**
	 * <p>Setter for the field <code>siteAreaCode</code>.</p>
	 *
	 * @param siteAreaCode a {@link java.lang.String} object.
	 */
	public void setSiteAreaCode(String siteAreaCode) {
		this.siteAreaCode = siteAreaCode;
	}

	/**
	 * <p>Getter for the field <code>siteCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteCode() {
		return this.siteCode;
	}
	/**
	 * <p>Setter for the field <code>siteCode</code>.</p>
	 *
	 * @param siteCode a {@link java.lang.String} object.
	 */
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	/**
	 * <p>Getter for the field <code>siteComplainTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteComplainTel() {
		return this.siteComplainTel;
	}
	/**
	 * <p>Setter for the field <code>siteComplainTel</code>.</p>
	 *
	 * @param siteComplainTel a {@link java.lang.String} object.
	 */
	public void setSiteComplainTel(String siteComplainTel) {
		this.siteComplainTel = siteComplainTel;
	}

	/**
	 * <p>Getter for the field <code>siteDetailAddr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteDetailAddr() {
		return this.siteDetailAddr;
	}
	/**
	 * <p>Setter for the field <code>siteDetailAddr</code>.</p>
	 *
	 * @param siteDetailAddr a {@link java.lang.String} object.
	 */
	public void setSiteDetailAddr(String siteDetailAddr) {
		this.siteDetailAddr = siteDetailAddr;
	}

	/**
	 * <p>Getter for the field <code>siteLeaderMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteLeaderMobile() {
		return this.siteLeaderMobile;
	}
	/**
	 * <p>Setter for the field <code>siteLeaderMobile</code>.</p>
	 *
	 * @param siteLeaderMobile a {@link java.lang.String} object.
	 */
	public void setSiteLeaderMobile(String siteLeaderMobile) {
		this.siteLeaderMobile = siteLeaderMobile;
	}

	/**
	 * <p>Getter for the field <code>siteLeaderName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteLeaderName() {
		return this.siteLeaderName;
	}
	/**
	 * <p>Setter for the field <code>siteLeaderName</code>.</p>
	 *
	 * @param siteLeaderName a {@link java.lang.String} object.
	 */
	public void setSiteLeaderName(String siteLeaderName) {
		this.siteLeaderName = siteLeaderName;
	}

	/**
	 * <p>Getter for the field <code>siteName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteName() {
		return this.siteName;
	}
	/**
	 * <p>Setter for the field <code>siteName</code>.</p>
	 *
	 * @param siteName a {@link java.lang.String} object.
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * <p>Getter for the field <code>wayBillNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWayBillNo() {
		return this.wayBillNo;
	}
	/**
	 * <p>Setter for the field <code>wayBillNo</code>.</p>
	 *
	 * @param wayBillNo a {@link java.lang.String} object.
	 */
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

}
