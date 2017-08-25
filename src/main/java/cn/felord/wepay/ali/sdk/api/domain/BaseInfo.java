package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 企业基础信息
 *
 * @author auto create
 * @version $Id : $Id
 */
public class BaseInfo extends AlipayObject {

    private static final long serialVersionUID = 2746254923193812181L;

    /**
     * 支付宝服务窗名称
     */
    @ApiField("alipay_fuwu_name")
    private String alipayFuwuName;

    /**
     * 如果商户的app需要签约使用移动快捷支付产品，需要上传该app的名称
     */
    @ApiField("app_name")
    private String appName;

    /**
     * 企业联系人信息
     */
    @ApiListField("contact_info")
    @ApiField("contact_person_info")
    private List<ContactPersonInfo> contactInfo;

    /**
     * 企业logo图片
     */
    @ApiField("logo_pic")
    private String logoPic;

    /**
     * 所属MCCCode，详情可参考 <a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1">商家经营类目</a>
     */
    @ApiField("mcc_code")
    private String mccCode;

    /**
     * 企业别称，例如浙江飞猪网络有限公司别称为阿里旅行。需要签约芝麻信用产品必须要传入该字段
     */
    @ApiField("short_name")
    private String shortName;

    /**
     * 企业特殊资质图片，可参考<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1">商家经营类目</a>
     */
    @ApiListField("special_license_pic")
    @ApiField("string")
    private List<String> specialLicensePic;

    /**
     * 使用场景，签约芝麻信用产品必须传入该参数，比如用于放贷风险防控、免押金租车等
     */
    @ApiField("usage_scenario")
    private String usageScenario;

    /**
     * 企业网址信息
     */
    @ApiListField("web_address")
    @ApiField("string")
    private List<String> webAddress;

    /**
     * 网址授权函图片
     */
    @ApiField("web_auth_pic")
    private String webAuthPic;

    /**
     * 微信公众号名称
     */
    @ApiField("weixin_public_name")
    private String weixinPublicName;

    /**
     * <p>Getter for the field <code>alipayFuwuName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAlipayFuwuName() {
        return this.alipayFuwuName;
    }

    /**
     * <p>Setter for the field <code>alipayFuwuName</code>.</p>
     *
     * @param alipayFuwuName a {@link java.lang.String} object.
     */
    public void setAlipayFuwuName(String alipayFuwuName) {
        this.alipayFuwuName = alipayFuwuName;
    }

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
     * <p>Getter for the field <code>contactInfo</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<ContactPersonInfo> getContactInfo() {
        return this.contactInfo;
    }

    /**
     * <p>Setter for the field <code>contactInfo</code>.</p>
     *
     * @param contactInfo a {@link java.util.List} object.
     */
    public void setContactInfo(List<ContactPersonInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * <p>Getter for the field <code>logoPic</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLogoPic() {
        return this.logoPic;
    }

    /**
     * <p>Setter for the field <code>logoPic</code>.</p>
     *
     * @param logoPic a {@link java.lang.String} object.
     */
    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
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
     * <p>Getter for the field <code>shortName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * <p>Setter for the field <code>shortName</code>.</p>
     *
     * @param shortName a {@link java.lang.String} object.
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * <p>Getter for the field <code>specialLicensePic</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getSpecialLicensePic() {
        return this.specialLicensePic;
    }

    /**
     * <p>Setter for the field <code>specialLicensePic</code>.</p>
     *
     * @param specialLicensePic a {@link java.util.List} object.
     */
    public void setSpecialLicensePic(List<String> specialLicensePic) {
        this.specialLicensePic = specialLicensePic;
    }

    /**
     * <p>Getter for the field <code>usageScenario</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUsageScenario() {
        return this.usageScenario;
    }

    /**
     * <p>Setter for the field <code>usageScenario</code>.</p>
     *
     * @param usageScenario a {@link java.lang.String} object.
     */
    public void setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
    }

    /**
     * <p>Getter for the field <code>webAddress</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getWebAddress() {
        return this.webAddress;
    }

    /**
     * <p>Setter for the field <code>webAddress</code>.</p>
     *
     * @param webAddress a {@link java.util.List} object.
     */
    public void setWebAddress(List<String> webAddress) {
        this.webAddress = webAddress;
    }

    /**
     * <p>Getter for the field <code>webAuthPic</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getWebAuthPic() {
        return this.webAuthPic;
    }

    /**
     * <p>Setter for the field <code>webAuthPic</code>.</p>
     *
     * @param webAuthPic a {@link java.lang.String} object.
     */
    public void setWebAuthPic(String webAuthPic) {
        this.webAuthPic = webAuthPic;
    }

    /**
     * <p>Getter for the field <code>weixinPublicName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getWeixinPublicName() {
        return this.weixinPublicName;
    }

    /**
     * <p>Setter for the field <code>weixinPublicName</code>.</p>
     *
     * @param weixinPublicName a {@link java.lang.String} object.
     */
    public void setWeixinPublicName(String weixinPublicName) {
        this.weixinPublicName = weixinPublicName;
    }

}
