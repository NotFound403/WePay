package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营业执照信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BusinessLicenceInfo extends AlipayObject {

	private static final long serialVersionUID = 7272992519547363528L;

	/**
	 * 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片
	 */
	@ApiField("business_license_auth_pic")
	private String businessLicenseAuthPic;

	/**
	 * 营业执照所在城市，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_license_city")
	private String businessLicenseCity;

	/**
	 * 营业执照有效期，传入营业执照上营业期限到期日，格式为YYYY-MM-DD，如为长期则传入9999-12-31
	 */
	@ApiField("business_license_indate")
	private String businessLicenseIndate;

	/**
	 * 营业执照是否为三证合一，个体工商户可忽略该字段，企业级商户的营业执照如为三证合一的新营业执照则传true
	 */
	@ApiField("business_license_is_three_in_one")
	private Boolean businessLicenseIsThreeInOne;

	/**
	 * 营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 营业执照所在地省份，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_license_province")
	private String businessLicenseProvince;

	/**
	 * 营业执照上的企业经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/**
	 * 营业执照上的企业联系地址
	 */
	@ApiField("company_address")
	private String companyAddress;

	/**
	 * 营业执照上的企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 组织机构代码证号码，个体工商户忽略该字段，企业级商户如营业执照非三证合一需要传入该字段否则预校验会不通过
	 */
	@ApiField("org_code_certificate_no")
	private String orgCodeCertificateNo;

	/**
	 * 组织机构代码证图片，个体工商户忽略该字段，企业级商户如营业执照非三证合一需要传入该字段否则预校验会不通过
	 */
	@ApiField("org_code_certificate_pic")
	private String orgCodeCertificatePic;

	/**
	 * <p>Getter for the field <code>businessLicenseAuthPic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseAuthPic</code>.</p>
	 *
	 * @param businessLicenseAuthPic a {@link java.lang.String} object.
	 */
	public void setBusinessLicenseAuthPic(String businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseCity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseCity() {
		return this.businessLicenseCity;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseCity</code>.</p>
	 *
	 * @param businessLicenseCity a {@link java.lang.String} object.
	 */
	public void setBusinessLicenseCity(String businessLicenseCity) {
		this.businessLicenseCity = businessLicenseCity;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseIndate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseIndate() {
		return this.businessLicenseIndate;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseIndate</code>.</p>
	 *
	 * @param businessLicenseIndate a {@link java.lang.String} object.
	 */
	public void setBusinessLicenseIndate(String businessLicenseIndate) {
		this.businessLicenseIndate = businessLicenseIndate;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseIsThreeInOne</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getBusinessLicenseIsThreeInOne() {
		return this.businessLicenseIsThreeInOne;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseIsThreeInOne</code>.</p>
	 *
	 * @param businessLicenseIsThreeInOne a {@link java.lang.Boolean} object.
	 */
	public void setBusinessLicenseIsThreeInOne(Boolean businessLicenseIsThreeInOne) {
		this.businessLicenseIsThreeInOne = businessLicenseIsThreeInOne;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseNo</code>.</p>
	 *
	 * @param businessLicenseNo a {@link java.lang.String} object.
	 */
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	/**
	 * <p>Getter for the field <code>businessLicensePic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	/**
	 * <p>Setter for the field <code>businessLicensePic</code>.</p>
	 *
	 * @param businessLicensePic a {@link java.lang.String} object.
	 */
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	/**
	 * <p>Getter for the field <code>businessLicenseProvince</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseProvince() {
		return this.businessLicenseProvince;
	}
	/**
	 * <p>Setter for the field <code>businessLicenseProvince</code>.</p>
	 *
	 * @param businessLicenseProvince a {@link java.lang.String} object.
	 */
	public void setBusinessLicenseProvince(String businessLicenseProvince) {
		this.businessLicenseProvince = businessLicenseProvince;
	}

	/**
	 * <p>Getter for the field <code>businessScope</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessScope() {
		return this.businessScope;
	}
	/**
	 * <p>Setter for the field <code>businessScope</code>.</p>
	 *
	 * @param businessScope a {@link java.lang.String} object.
	 */
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	/**
	 * <p>Getter for the field <code>companyAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyAddress() {
		return this.companyAddress;
	}
	/**
	 * <p>Setter for the field <code>companyAddress</code>.</p>
	 *
	 * @param companyAddress a {@link java.lang.String} object.
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	/**
	 * <p>Getter for the field <code>companyName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyName() {
		return this.companyName;
	}
	/**
	 * <p>Setter for the field <code>companyName</code>.</p>
	 *
	 * @param companyName a {@link java.lang.String} object.
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * <p>Getter for the field <code>orgCodeCertificateNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgCodeCertificateNo() {
		return this.orgCodeCertificateNo;
	}
	/**
	 * <p>Setter for the field <code>orgCodeCertificateNo</code>.</p>
	 *
	 * @param orgCodeCertificateNo a {@link java.lang.String} object.
	 */
	public void setOrgCodeCertificateNo(String orgCodeCertificateNo) {
		this.orgCodeCertificateNo = orgCodeCertificateNo;
	}

	/**
	 * <p>Getter for the field <code>orgCodeCertificatePic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgCodeCertificatePic() {
		return this.orgCodeCertificatePic;
	}
	/**
	 * <p>Setter for the field <code>orgCodeCertificatePic</code>.</p>
	 *
	 * @param orgCodeCertificatePic a {@link java.lang.String} object.
	 */
	public void setOrgCodeCertificatePic(String orgCodeCertificatePic) {
		this.orgCodeCertificatePic = orgCodeCertificatePic;
	}

}
