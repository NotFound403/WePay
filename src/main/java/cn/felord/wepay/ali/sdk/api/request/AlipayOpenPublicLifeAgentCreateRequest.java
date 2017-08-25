package cn.felord.wepay.ali.sdk.api.request;

import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayOpenPublicLifeAgentCreateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.agent.create request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeAgentCreateRequest implements AlipayUploadRequest<AlipayOpenPublicLifeAgentCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* isv代开通生活号的商户支付宝账号或者商户支付宝账号pid（2088开头16位长度的字符串），账号需通过实名认证
	 */
	private String account;

	/** 
	* 生活号背景图片
	 */
	private FileItem backgroundPic;

	/** 
	* 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片
	 */
	private FileItem businessLicenseAuthPic;

	/** 
	* 营业执照号码
	 */
	private String businessLicenseNo;

	/** 
	* 营业执照图片
	 */
	private FileItem businessLicensePic;

	/** 
	* 联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人手机号
	 */
	private String contactMobile;

	/** 
	* 企业联系人名称
	 */
	private String contactName;

	/** 
	* 生活号头像
	 */
	private FileItem logoPic;

	/** 
	* 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.INIZWb&articleId=105364&docType=1
">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 外部入驻申请单据号，由开发者生成，并需保证在开发者端不重复。另，如果代创建被驳回，需更换新的申请号，原申请号不能再次使用
	 */
	private String outBizNo;

	/** 
	* 自有知识产权证书图片
	 */
	private FileItem ownIntellectualPic;

	/** 
	* 生活号简介
	 */
	private String publicDesc;

	/** 
	* 生活号名称
	 */
	private String publicName;

	/** 
	* 店铺内景图片，个人账户必填 ，企业账户选填
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，个人账户必填，企业账户选填
	 */
	private FileItem shopSignBoardPic;

	/** 
	* 企业特殊资质图片，可参考 <a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.INIZWb&articleId=105364&docType=1">商家经营类目</a> 中的 “需要的特殊资质证书”
	 */
	private FileItem specialLicensePic;

	/**
	 * <p>Setter for the field <code>account</code>.</p>
	 *
	 * @param account a {@link java.lang.String} object.
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * <p>Getter for the field <code>account</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccount() {
		return this.account;
	}

	/**
	 * <p>Setter for the field <code>backgroundPic</code>.</p>
	 *
	 * @param backgroundPic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setBackgroundPic(FileItem backgroundPic) {
		this.backgroundPic = backgroundPic;
	}
	/**
	 * <p>Getter for the field <code>backgroundPic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getBackgroundPic() {
		return this.backgroundPic;
	}

	/**
	 * <p>Setter for the field <code>businessLicenseAuthPic</code>.</p>
	 *
	 * @param businessLicenseAuthPic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setBusinessLicenseAuthPic(FileItem businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}
	/**
	 * <p>Getter for the field <code>businessLicenseAuthPic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
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
	 * <p>Getter for the field <code>businessLicenseNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

	/**
	 * <p>Setter for the field <code>businessLicensePic</code>.</p>
	 *
	 * @param businessLicensePic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setBusinessLicensePic(FileItem businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}
	/**
	 * <p>Getter for the field <code>businessLicensePic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getBusinessLicensePic() {
		return this.businessLicensePic;
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
	 * <p>Getter for the field <code>contactEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactEmail() {
		return this.contactEmail;
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
	 * <p>Getter for the field <code>contactMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactMobile() {
		return this.contactMobile;
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
	 * <p>Getter for the field <code>contactName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactName() {
		return this.contactName;
	}

	/**
	 * <p>Setter for the field <code>logoPic</code>.</p>
	 *
	 * @param logoPic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setLogoPic(FileItem logoPic) {
		this.logoPic = logoPic;
	}
	/**
	 * <p>Getter for the field <code>logoPic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getLogoPic() {
		return this.logoPic;
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
	 * <p>Getter for the field <code>mccCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMccCode() {
		return this.mccCode;
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
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}

	/**
	 * <p>Setter for the field <code>ownIntellectualPic</code>.</p>
	 *
	 * @param ownIntellectualPic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setOwnIntellectualPic(FileItem ownIntellectualPic) {
		this.ownIntellectualPic = ownIntellectualPic;
	}
	/**
	 * <p>Getter for the field <code>ownIntellectualPic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getOwnIntellectualPic() {
		return this.ownIntellectualPic;
	}

	/**
	 * <p>Setter for the field <code>publicDesc</code>.</p>
	 *
	 * @param publicDesc a {@link java.lang.String} object.
	 */
	public void setPublicDesc(String publicDesc) {
		this.publicDesc = publicDesc;
	}
	/**
	 * <p>Getter for the field <code>publicDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicDesc() {
		return this.publicDesc;
	}

	/**
	 * <p>Setter for the field <code>publicName</code>.</p>
	 *
	 * @param publicName a {@link java.lang.String} object.
	 */
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	/**
	 * <p>Getter for the field <code>publicName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicName() {
		return this.publicName;
	}

	/**
	 * <p>Setter for the field <code>shopScenePic</code>.</p>
	 *
	 * @param shopScenePic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setShopScenePic(FileItem shopScenePic) {
		this.shopScenePic = shopScenePic;
	}
	/**
	 * <p>Getter for the field <code>shopScenePic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getShopScenePic() {
		return this.shopScenePic;
	}

	/**
	 * <p>Setter for the field <code>shopSignBoardPic</code>.</p>
	 *
	 * @param shopSignBoardPic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setShopSignBoardPic(FileItem shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}
	/**
	 * <p>Getter for the field <code>shopSignBoardPic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}

	/**
	 * <p>Setter for the field <code>specialLicensePic</code>.</p>
	 *
	 * @param specialLicensePic a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setSpecialLicensePic(FileItem specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}
	/**
	 * <p>Getter for the field <code>specialLicensePic</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getSpecialLicensePic() {
		return this.specialLicensePic;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	/**
	 * <p>Getter for the field <code>notifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	/** {@inheritDoc} */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	/**
	 * <p>Getter for the field <code>returnUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReturnUrl() {
		return this.returnUrl;
	}

	/** {@inheritDoc} */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * <p>Getter for the field <code>apiVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiVersion() {
		return this.apiVersion;
	}
	/** {@inheritDoc} */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/** {@inheritDoc} */
	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    /**
     * <p>Getter for the field <code>terminalType</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalType(){
    	return this.terminalType;
    }

    /** {@inheritDoc} */
    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    /**
     * <p>Getter for the field <code>terminalInfo</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode; 
	}
	
	/** {@inheritDoc} */
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	/**
	 * <p>getApiMethodName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiMethodName() {
		return "alipay.open.public.life.agent.create";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("account", this.account);
		txtParams.put("business_license_no", this.businessLicenseNo);
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_mobile", this.contactMobile);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("public_desc", this.publicDesc);
		txtParams.put("public_name", this.publicName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	/**
	 * <p>putOtherTextParam.</p>
	 *
	 * @param key a {@link java.lang.String} object.
	 * @param value a {@link java.lang.String} object.
	 */
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	/**
	 * <p>getFileParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("background_pic", this.backgroundPic);
		params.put("business_license_auth_pic", this.businessLicenseAuthPic);
		params.put("business_license_pic", this.businessLicensePic);
		params.put("logo_pic", this.logoPic);
		params.put("own_intellectual_pic", this.ownIntellectualPic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_board_pic", this.shopSignBoardPic);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	/**
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<AlipayOpenPublicLifeAgentCreateResponse> getResponseClass() {
		return AlipayOpenPublicLifeAgentCreateResponse.class;
	}
	
	 /**
	  * <p>isNeedEncrypt.</p>
	  *
	  * @return a boolean.
	  */
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    /** {@inheritDoc} */
    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    /**
     * <p>Getter for the field <code>bizModel</code>.</p>
     *
     * @return a {@link cn.felord.wepay.ali.sdk.api.AlipayObject} object.
     */
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    /** {@inheritDoc} */
    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
