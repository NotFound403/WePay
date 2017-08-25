package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 信用借还借用实体数据上传接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantBorrowEntityUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4552621787941257597L;

	/**
	 * 地址描述
	 */
	@ApiField("address_desc")
	private String addressDesc;

	/**
	 * 是否可借用，Y:可借，N:不可借。如果不可借用，则不在芝麻借还频道地图展示
	 */
	@ApiField("can_borrow")
	private String canBorrow;

	/**
	 * 可借用数量，如果是借用实物，如自行车，传1即可。如果是借用门店或借还机柜，则传入可借用的物品数量
	 */
	@ApiField("can_borrow_cnt")
	private String canBorrowCnt;

	/**
	 * 类目Code，传入芝麻借还规定的类目Code，其他值会认为非法参数，参数值如下：
雨伞：umbrella 
充电宝：power_bank
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 是否收租金，Y:收租金，N:不收租金
	 */
	@ApiField("collect_rent")
	private String collectRent;

	/**
	 * 联系电话，手机11位数字，座机：区号－数字
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 外部实体编号，唯一标识一个实体，如自行车编号，机柜编号
注：商户维度下，类目Code（categoryCode）+实体编号（entity_code）唯一，一个商户下相同类目code+实体编号多次调用，将按照上传时间（upload_time）更新，更新规则取最新的upload_time快照数据
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 实体名称，借用实体的描述，如XX雨伞，XX充电宝，XX自行车
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 地址位置纬度，取值范围：纬度-90~90，中国地区经度范围：纬度3.86~53.55
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址位置经度，取值范围：经度-180~180，中国地区经度范围：73.66~135.05
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 营业时间，格式：xx:xx-xx:xx，24小时制，如果是昼夜00:00—24:00
	 */
	@ApiField("office_hours_desc")
	private String officeHoursDesc;

	/**
	 * 信用借还的签约产品码,传入固定值:w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 租金描述，该借还点的租金描述，例如：5元/小时，5-10元／小时
	 */
	@ApiField("rent_desc")
	private String rentDesc;

	/**
	 * 借用总数，如果是借用实物，如自行车，传1即可。如果是借用门店或借还机柜，则传入提供借还物品的总量
	 */
	@ApiField("total_borrow_cnt")
	private String totalBorrowCnt;

	/**
	 * 实体上传时间，某一借还实体信息多次上传，以最新上传时间数据为当前最新快照，格式：yyyy-mm-dd hh:MM:ss
	 */
	@ApiField("upload_time")
	private String uploadTime;

	/**
	 * <p>Getter for the field <code>addressDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddressDesc() {
		return this.addressDesc;
	}
	/**
	 * <p>Setter for the field <code>addressDesc</code>.</p>
	 *
	 * @param addressDesc a {@link java.lang.String} object.
	 */
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}

	/**
	 * <p>Getter for the field <code>canBorrow</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCanBorrow() {
		return this.canBorrow;
	}
	/**
	 * <p>Setter for the field <code>canBorrow</code>.</p>
	 *
	 * @param canBorrow a {@link java.lang.String} object.
	 */
	public void setCanBorrow(String canBorrow) {
		this.canBorrow = canBorrow;
	}

	/**
	 * <p>Getter for the field <code>canBorrowCnt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCanBorrowCnt() {
		return this.canBorrowCnt;
	}
	/**
	 * <p>Setter for the field <code>canBorrowCnt</code>.</p>
	 *
	 * @param canBorrowCnt a {@link java.lang.String} object.
	 */
	public void setCanBorrowCnt(String canBorrowCnt) {
		this.canBorrowCnt = canBorrowCnt;
	}

	/**
	 * <p>Getter for the field <code>categoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryCode() {
		return this.categoryCode;
	}
	/**
	 * <p>Setter for the field <code>categoryCode</code>.</p>
	 *
	 * @param categoryCode a {@link java.lang.String} object.
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * <p>Getter for the field <code>collectRent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCollectRent() {
		return this.collectRent;
	}
	/**
	 * <p>Setter for the field <code>collectRent</code>.</p>
	 *
	 * @param collectRent a {@link java.lang.String} object.
	 */
	public void setCollectRent(String collectRent) {
		this.collectRent = collectRent;
	}

	/**
	 * <p>Getter for the field <code>contactNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactNumber() {
		return this.contactNumber;
	}
	/**
	 * <p>Setter for the field <code>contactNumber</code>.</p>
	 *
	 * @param contactNumber a {@link java.lang.String} object.
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * <p>Getter for the field <code>entityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityCode() {
		return this.entityCode;
	}
	/**
	 * <p>Setter for the field <code>entityCode</code>.</p>
	 *
	 * @param entityCode a {@link java.lang.String} object.
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	/**
	 * <p>Getter for the field <code>entityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityName() {
		return this.entityName;
	}
	/**
	 * <p>Setter for the field <code>entityName</code>.</p>
	 *
	 * @param entityName a {@link java.lang.String} object.
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	/**
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLatitude() {
		return this.latitude;
	}
	/**
	 * <p>Setter for the field <code>latitude</code>.</p>
	 *
	 * @param latitude a {@link java.lang.String} object.
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLongitude() {
		return this.longitude;
	}
	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.String} object.
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * <p>Getter for the field <code>officeHoursDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOfficeHoursDesc() {
		return this.officeHoursDesc;
	}
	/**
	 * <p>Setter for the field <code>officeHoursDesc</code>.</p>
	 *
	 * @param officeHoursDesc a {@link java.lang.String} object.
	 */
	public void setOfficeHoursDesc(String officeHoursDesc) {
		this.officeHoursDesc = officeHoursDesc;
	}

	/**
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * <p>Getter for the field <code>rentDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRentDesc() {
		return this.rentDesc;
	}
	/**
	 * <p>Setter for the field <code>rentDesc</code>.</p>
	 *
	 * @param rentDesc a {@link java.lang.String} object.
	 */
	public void setRentDesc(String rentDesc) {
		this.rentDesc = rentDesc;
	}

	/**
	 * <p>Getter for the field <code>totalBorrowCnt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalBorrowCnt() {
		return this.totalBorrowCnt;
	}
	/**
	 * <p>Setter for the field <code>totalBorrowCnt</code>.</p>
	 *
	 * @param totalBorrowCnt a {@link java.lang.String} object.
	 */
	public void setTotalBorrowCnt(String totalBorrowCnt) {
		this.totalBorrowCnt = totalBorrowCnt;
	}

	/**
	 * <p>Getter for the field <code>uploadTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUploadTime() {
		return this.uploadTime;
	}
	/**
	 * <p>Setter for the field <code>uploadTime</code>.</p>
	 *
	 * @param uploadTime a {@link java.lang.String} object.
	 */
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

}
