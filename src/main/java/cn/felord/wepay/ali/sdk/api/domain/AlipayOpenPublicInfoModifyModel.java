package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 服务窗基础信息修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8218431118684728196L;

	/**
	 * 服务窗名称，2-20个字之间；不得含有违反法律法规和公序良俗的相关信息；不得侵害他人名誉权、知识产权、商业秘密等合法权利；不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发；不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 授权运营书，企业商户若为被经营方授权，需上传加盖公章的扫描件，请使用照片上传接口上传图片获得image_url
	 */
	@ApiField("auth_pic")
	private String authPic;

	/**
	 * 营业执照地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	@ApiField("license_url")
	private String licenseUrl;

	/**
	 * 服务窗头像地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 服务窗欢迎语，200字以内，首次使用服务窗必须
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	/**
	 * 门店照片Url
	 */
	@ApiListField("shop_pics")
	@ApiField("string")
	private List<String> shopPics;

	/**
	 * <p>Getter for the field <code>appName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppName() {
		return this.appName;
	}
	/**
	 * <p>Setter for the field <code>appName</code>.</p>
	 *
	 * @param appName a {@link java.lang.String} object.
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * <p>Getter for the field <code>authPic</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthPic() {
		return this.authPic;
	}
	/**
	 * <p>Setter for the field <code>authPic</code>.</p>
	 *
	 * @param authPic a {@link java.lang.String} object.
	 */
	public void setAuthPic(String authPic) {
		this.authPic = authPic;
	}

	/**
	 * <p>Getter for the field <code>licenseUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLicenseUrl() {
		return this.licenseUrl;
	}
	/**
	 * <p>Setter for the field <code>licenseUrl</code>.</p>
	 *
	 * @param licenseUrl a {@link java.lang.String} object.
	 */
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

	/**
	 * <p>Getter for the field <code>logoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogoUrl() {
		return this.logoUrl;
	}
	/**
	 * <p>Setter for the field <code>logoUrl</code>.</p>
	 *
	 * @param logoUrl a {@link java.lang.String} object.
	 */
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	/**
	 * <p>Getter for the field <code>publicGreeting</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicGreeting() {
		return this.publicGreeting;
	}
	/**
	 * <p>Setter for the field <code>publicGreeting</code>.</p>
	 *
	 * @param publicGreeting a {@link java.lang.String} object.
	 */
	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}

	/**
	 * <p>Getter for the field <code>shopPics</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopPics() {
		return this.shopPics;
	}
	/**
	 * <p>Setter for the field <code>shopPics</code>.</p>
	 *
	 * @param shopPics a {@link java.util.List} object.
	 */
	public void setShopPics(List<String> shopPics) {
		this.shopPics = shopPics;
	}

}
