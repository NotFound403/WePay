package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 开通当面付申请接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandContractFacetofaceSignModel extends AlipayObject {

	private static final long serialVersionUID = 4764323469536112593L;

	/**
	 * 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片，通过ant.merchant.expand.image.upload接口上传营业执照授权函图片
	 */
	@ApiField("business_license_auth_pic")
	private String businessLicenseAuthPic;

	/**
	 * 营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片，通过ant.merchant.expand.image.upload接口上传营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 联系人邮箱地址
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 企业联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“经营类目编码”
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 外部入驻申请单据号，由开发者生成，并需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 店铺内景图片，个人账户必填，企业账户选填，通过ant.merchant.expand.image.upload接口上传店铺内景图片
	 */
	@ApiField("shop_scene_pic")
	private String shopScenePic;

	/**
	 * 店铺门头照图片，个人账户必填，企业账户选填，通过ant.merchant.expand.image.upload接口上传店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	/**
	 * 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“需要的特殊资质证书” 
通过ant.merchant.expand.image.upload接口上传企业特殊资质图片
	 */
	@ApiField("special_license_pic")
	private String specialLicensePic;

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
	 * <p>Getter for the field <code>contactEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactEmail() {
		return this.contactEmail;
	}
	/**
	 * <p>Setter for the field <code>contactEmail</code>.</p>
	 *
	 * @param contactEmail a {@link java.lang.String} object.
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * <p>Getter for the field <code>contactMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactMobile() {
		return this.contactMobile;
	}
	/**
	 * <p>Setter for the field <code>contactMobile</code>.</p>
	 *
	 * @param contactMobile a {@link java.lang.String} object.
	 */
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	/**
	 * <p>Getter for the field <code>contactName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactName() {
		return this.contactName;
	}
	/**
	 * <p>Setter for the field <code>contactName</code>.</p>
	 *
	 * @param contactName a {@link java.lang.String} object.
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * <p>Getter for the field <code>mccCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMccCode() {
		return this.mccCode;
	}
	/**
	 * <p>Setter for the field <code>mccCode</code>.</p>
	 *
	 * @param mccCode a {@link java.lang.String} object.
	 */
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>shopScenePic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopScenePic() {
		return this.shopScenePic;
	}
	/**
	 * <p>Setter for the field <code>shopScenePic</code>.</p>
	 *
	 * @param shopScenePic a {@link java.lang.String} object.
	 */
	public void setShopScenePic(String shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

	/**
	 * <p>Getter for the field <code>shopSignBoardPic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}
	/**
	 * <p>Setter for the field <code>shopSignBoardPic</code>.</p>
	 *
	 * @param shopSignBoardPic a {@link java.lang.String} object.
	 */
	public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

	/**
	 * <p>Getter for the field <code>specialLicensePic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpecialLicensePic() {
		return this.specialLicensePic;
	}
	/**
	 * <p>Setter for the field <code>specialLicensePic</code>.</p>
	 *
	 * @param specialLicensePic a {@link java.lang.String} object.
	 */
	public void setSpecialLicensePic(String specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

}
