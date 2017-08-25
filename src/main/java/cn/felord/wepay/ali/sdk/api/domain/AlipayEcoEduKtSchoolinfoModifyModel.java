package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 教育缴费学校信息录入接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduKtSchoolinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1154744342286347473L;

	/**
	 * 银行卡编号。适配集团到卡模式的学校接入
	 */
	@ApiField("bankcard_no")
	private String bankcardNo;

	/**
	 * 市的国家编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区县的国家编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 商家名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 商家编码，ISV_NO
	 */
	@ApiField("isv_no")
	private String isvNo;

	/**
	 * 此链接是为了保持教育缴费平台与ISV
商户支付状态一致性。用户支付成功后，会异步回调此链接，回调时，会带入支付的相关参数，ISV商户可以根据返回的参数更新账单状态。支付宝异步通知说明
	 */
	@ApiField("isv_notify_url")
	private String isvNotifyUrl;

	/**
	 * Isv支付宝pid，商家在支付宝的唯一标识
	 */
	@ApiField("isv_phone")
	private String isvPhone;

	/**
	 * Isv支付宝pid，用于支付返佣
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 省的国家编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 学校的图像，一般为学校的标识，该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k
	 */
	@ApiField("school_icon")
	private String schoolIcon;

	/**
	 * 如果学校图像数据填写，则此字段不能为空。目前只支持png和jpg两种格式
	 */
	@ApiField("school_icon_type")
	private String schoolIconType;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校支付宝pid，用于授权
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校的国家标准编码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 学校的类型：托幼小初高。1、托, 2、幼,  3、小,  4、初,  5、高。如果学校兼有多种属性，可以写为：初高中为45 ， 小初为34
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * <p>Getter for the field <code>bankcardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankcardNo() {
		return this.bankcardNo;
	}
	/**
	 * <p>Setter for the field <code>bankcardNo</code>.</p>
	 *
	 * @param bankcardNo a {@link java.lang.String} object.
	 */
	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	/**
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode() {
		return this.cityCode;
	}
	/**
	 * <p>Setter for the field <code>cityCode</code>.</p>
	 *
	 * @param cityCode a {@link java.lang.String} object.
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * <p>Getter for the field <code>cityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityName() {
		return this.cityName;
	}
	/**
	 * <p>Setter for the field <code>cityName</code>.</p>
	 *
	 * @param cityName a {@link java.lang.String} object.
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * <p>Getter for the field <code>districtCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrictCode() {
		return this.districtCode;
	}
	/**
	 * <p>Setter for the field <code>districtCode</code>.</p>
	 *
	 * @param districtCode a {@link java.lang.String} object.
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	/**
	 * <p>Getter for the field <code>districtName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDistrictName() {
		return this.districtName;
	}
	/**
	 * <p>Setter for the field <code>districtName</code>.</p>
	 *
	 * @param districtName a {@link java.lang.String} object.
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * <p>Getter for the field <code>isvName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvName() {
		return this.isvName;
	}
	/**
	 * <p>Setter for the field <code>isvName</code>.</p>
	 *
	 * @param isvName a {@link java.lang.String} object.
	 */
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	/**
	 * <p>Getter for the field <code>isvNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvNo() {
		return this.isvNo;
	}
	/**
	 * <p>Setter for the field <code>isvNo</code>.</p>
	 *
	 * @param isvNo a {@link java.lang.String} object.
	 */
	public void setIsvNo(String isvNo) {
		this.isvNo = isvNo;
	}

	/**
	 * <p>Getter for the field <code>isvNotifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvNotifyUrl() {
		return this.isvNotifyUrl;
	}
	/**
	 * <p>Setter for the field <code>isvNotifyUrl</code>.</p>
	 *
	 * @param isvNotifyUrl a {@link java.lang.String} object.
	 */
	public void setIsvNotifyUrl(String isvNotifyUrl) {
		this.isvNotifyUrl = isvNotifyUrl;
	}

	/**
	 * <p>Getter for the field <code>isvPhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvPhone() {
		return this.isvPhone;
	}
	/**
	 * <p>Setter for the field <code>isvPhone</code>.</p>
	 *
	 * @param isvPhone a {@link java.lang.String} object.
	 */
	public void setIsvPhone(String isvPhone) {
		this.isvPhone = isvPhone;
	}

	/**
	 * <p>Getter for the field <code>isvPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvPid() {
		return this.isvPid;
	}
	/**
	 * <p>Setter for the field <code>isvPid</code>.</p>
	 *
	 * @param isvPid a {@link java.lang.String} object.
	 */
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	/**
	 * <p>Getter for the field <code>provinceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvinceCode() {
		return this.provinceCode;
	}
	/**
	 * <p>Setter for the field <code>provinceCode</code>.</p>
	 *
	 * @param provinceCode a {@link java.lang.String} object.
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	/**
	 * <p>Getter for the field <code>provinceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvinceName() {
		return this.provinceName;
	}
	/**
	 * <p>Setter for the field <code>provinceName</code>.</p>
	 *
	 * @param provinceName a {@link java.lang.String} object.
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/**
	 * <p>Getter for the field <code>schoolIcon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolIcon() {
		return this.schoolIcon;
	}
	/**
	 * <p>Setter for the field <code>schoolIcon</code>.</p>
	 *
	 * @param schoolIcon a {@link java.lang.String} object.
	 */
	public void setSchoolIcon(String schoolIcon) {
		this.schoolIcon = schoolIcon;
	}

	/**
	 * <p>Getter for the field <code>schoolIconType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolIconType() {
		return this.schoolIconType;
	}
	/**
	 * <p>Setter for the field <code>schoolIconType</code>.</p>
	 *
	 * @param schoolIconType a {@link java.lang.String} object.
	 */
	public void setSchoolIconType(String schoolIconType) {
		this.schoolIconType = schoolIconType;
	}

	/**
	 * <p>Getter for the field <code>schoolName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolName() {
		return this.schoolName;
	}
	/**
	 * <p>Setter for the field <code>schoolName</code>.</p>
	 *
	 * @param schoolName a {@link java.lang.String} object.
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * <p>Getter for the field <code>schoolPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolPid() {
		return this.schoolPid;
	}
	/**
	 * <p>Setter for the field <code>schoolPid</code>.</p>
	 *
	 * @param schoolPid a {@link java.lang.String} object.
	 */
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	/**
	 * <p>Getter for the field <code>schoolStdcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	/**
	 * <p>Setter for the field <code>schoolStdcode</code>.</p>
	 *
	 * @param schoolStdcode a {@link java.lang.String} object.
	 */
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	/**
	 * <p>Getter for the field <code>schoolType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchoolType() {
		return this.schoolType;
	}
	/**
	 * <p>Setter for the field <code>schoolType</code>.</p>
	 *
	 * @param schoolType a {@link java.lang.String} object.
	 */
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

}
