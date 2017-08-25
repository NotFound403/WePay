package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物料生产指令对象, 包括物料生产的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 物料图片Url, 数量,  申请日期,收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AssetProduceItem extends AlipayObject {

	private static final long serialVersionUID = 5883995927938241658L;

	/**
	 * 申请日期，格式yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 申请单号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 收钱码吊牌和贴纸类型不为空; 
物料图片Url，供应商使用该图片进行物料打印
	 */
	@ApiField("asset_pic_url")
	private String assetPicUrl;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * city
	 */
	@ApiField("city")
	private String city;

	/**
	 * 数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 订单创建时间, 格式: yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流运单号; 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 收件人地址邮编; 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("postcode")
	private String postcode;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 收货人地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 联系人电话
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 物料供应商PID，和调用方的供应商PID一致
	 */
	@ApiField("supplier_pid")
	private String supplierPid;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称，线下约定的物料名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * <p>Getter for the field <code>applyDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyDate() {
		return this.applyDate;
	}
	/**
	 * <p>Setter for the field <code>applyDate</code>.</p>
	 *
	 * @param applyDate a {@link java.lang.String} object.
	 */
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	/**
	 * <p>Getter for the field <code>applyOrderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	/**
	 * <p>Setter for the field <code>applyOrderId</code>.</p>
	 *
	 * @param applyOrderId a {@link java.lang.String} object.
	 */
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	/**
	 * <p>Getter for the field <code>assetPicUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssetPicUrl() {
		return this.assetPicUrl;
	}
	/**
	 * <p>Setter for the field <code>assetPicUrl</code>.</p>
	 *
	 * @param assetPicUrl a {@link java.lang.String} object.
	 */
	public void setAssetPicUrl(String assetPicUrl) {
		this.assetPicUrl = assetPicUrl;
	}

	/**
	 * <p>Getter for the field <code>assignItemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssignItemId() {
		return this.assignItemId;
	}
	/**
	 * <p>Setter for the field <code>assignItemId</code>.</p>
	 *
	 * @param assignItemId a {@link java.lang.String} object.
	 */
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCount() {
		return this.count;
	}
	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.String} object.
	 */
	public void setCount(String count) {
		this.count = count;
	}

	/**
	 * <p>Getter for the field <code>createDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateDate() {
		return this.createDate;
	}
	/**
	 * <p>Setter for the field <code>createDate</code>.</p>
	 *
	 * @param createDate a {@link java.lang.String} object.
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * <p>Getter for the field <code>district</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrict() {
		return this.district;
	}
	/**
	 * <p>Setter for the field <code>district</code>.</p>
	 *
	 * @param district a {@link java.lang.String} object.
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * <p>Getter for the field <code>logisticsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsName() {
		return this.logisticsName;
	}
	/**
	 * <p>Setter for the field <code>logisticsName</code>.</p>
	 *
	 * @param logisticsName a {@link java.lang.String} object.
	 */
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	/**
	 * <p>Getter for the field <code>logisticsNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	/**
	 * <p>Setter for the field <code>logisticsNo</code>.</p>
	 *
	 * @param logisticsNo a {@link java.lang.String} object.
	 */
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	/**
	 * <p>Getter for the field <code>postcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPostcode() {
		return this.postcode;
	}
	/**
	 * <p>Setter for the field <code>postcode</code>.</p>
	 *
	 * @param postcode a {@link java.lang.String} object.
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * <p>Getter for the field <code>province</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvince() {
		return this.province;
	}
	/**
	 * <p>Setter for the field <code>province</code>.</p>
	 *
	 * @param province a {@link java.lang.String} object.
	 */
	public void setProvince(String province) {
		this.province = province;
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
	 * <p>Setter for the field <code>receiverAddress</code>.</p>
	 *
	 * @param receiverAddress a {@link java.lang.String} object.
	 */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
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
	 * <p>Setter for the field <code>receiverMobile</code>.</p>
	 *
	 * @param receiverMobile a {@link java.lang.String} object.
	 */
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
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
	 * <p>Setter for the field <code>receiverName</code>.</p>
	 *
	 * @param receiverName a {@link java.lang.String} object.
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	/**
	 * <p>Getter for the field <code>supplierPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSupplierPid() {
		return this.supplierPid;
	}
	/**
	 * <p>Setter for the field <code>supplierPid</code>.</p>
	 *
	 * @param supplierPid a {@link java.lang.String} object.
	 */
	public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
	}

	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * <p>Getter for the field <code>templateName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateName() {
		return this.templateName;
	}
	/**
	 * <p>Setter for the field <code>templateName</code>.</p>
	 *
	 * @param templateName a {@link java.lang.String} object.
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
