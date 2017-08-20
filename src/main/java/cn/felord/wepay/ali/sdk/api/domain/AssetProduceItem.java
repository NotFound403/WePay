package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物料生产指令对象, 包括物料生产的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 物料图片Url, 数量,  申请日期,收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @since 1.0, 2017-06-30 10:14:49
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

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public String getAssetPicUrl() {
		return this.assetPicUrl;
	}
	public void setAssetPicUrl(String assetPicUrl) {
		this.assetPicUrl = assetPicUrl;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getPostcode() {
		return this.postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getSupplierPid() {
		return this.supplierPid;
	}
	public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
