package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务者的证书信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 6443458517144512634L;

	/**
	 * 证书的认证机构
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 证照过期时间，格式：yyyy-MM-dd
	 */
	@ApiField("gmt_expire")
	private String gmtExpire;

	/**
	 * 证照的起始时间：证件生效的开始时间，格式：yyyy-MM-dd
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 证书id
	 */
	@ApiField("license_id")
	private String licenseId;

	/**
	 * 证照名称，当type为OTHER时，必填
	 */
	@ApiField("license_name")
	private String licenseName;

	/**
	 * 证书照片的url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 技能或者能力的认证结果，如“高级”
	 */
	@ApiField("result")
	private String result;

	/**
	 * 服务者的证书编号，由证书机构颁发的证书编号
	 */
	@ApiField("sequence")
	private String sequence;

	/**
	 * 证照类型，允许以下值：
TOUR_GUIDE：导游证
LEGAL：法律职业资格证书
COUNSELOR：心理咨询师
DRIVER_TRAIN：机动车驾驶员培训许可证
CHEF：厨师证
TEACHER：教师资格证
LIFE_SAVING：救生证
FINANCIAL_PLANNER：理财规划师
FINANCIAL_MANAGEMENT：金融理财师
BANK：银行从业资格
SECURITIES：证券从业资格
INSURANCE：保险从业资格
FUTURES：期货从业资格
FUND：基金从业资格
SPECIAL：特种经营许可证
POLICE_REGISTER：公安备案登记证明
LOCKS_REPAIR：锁具修理服务卡（公安印章）
HEALTH：健康证
BEAUTY：美容相关证件
MASSAGE：按摩师职业证书
TRANSPORT：道路运输证
DRIVING：驾驶证
TRANSPORT_PERMIT：道路运输经营许可
OTHER：其他
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>agency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgency() {
		return this.agency;
	}
	/**
	 * <p>Setter for the field <code>agency</code>.</p>
	 *
	 * @param agency a {@link java.lang.String} object.
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}

	/**
	 * <p>Getter for the field <code>gmtExpire</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtExpire() {
		return this.gmtExpire;
	}
	/**
	 * <p>Setter for the field <code>gmtExpire</code>.</p>
	 *
	 * @param gmtExpire a {@link java.lang.String} object.
	 */
	public void setGmtExpire(String gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStart() {
		return this.gmtStart;
	}
	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.lang.String} object.
	 */
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	/**
	 * <p>Getter for the field <code>licenseId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenseId() {
		return this.licenseId;
	}
	/**
	 * <p>Setter for the field <code>licenseId</code>.</p>
	 *
	 * @param licenseId a {@link java.lang.String} object.
	 */
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	/**
	 * <p>Getter for the field <code>licenseName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenseName() {
		return this.licenseName;
	}
	/**
	 * <p>Setter for the field <code>licenseName</code>.</p>
	 *
	 * @param licenseName a {@link java.lang.String} object.
	 */
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	/**
	 * <p>Getter for the field <code>picUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPicUrl() {
		return this.picUrl;
	}
	/**
	 * <p>Setter for the field <code>picUrl</code>.</p>
	 *
	 * @param picUrl a {@link java.lang.String} object.
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	/**
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResult() {
		return this.result;
	}
	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link java.lang.String} object.
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * <p>Getter for the field <code>sequence</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSequence() {
		return this.sequence;
	}
	/**
	 * <p>Setter for the field <code>sequence</code>.</p>
	 *
	 * @param sequence a {@link java.lang.String} object.
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
