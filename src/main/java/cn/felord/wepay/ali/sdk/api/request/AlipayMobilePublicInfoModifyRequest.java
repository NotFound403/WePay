package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayMobilePublicInfoModifyResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.public.info.modify request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicInfoModifyRequest implements AlipayRequest<AlipayMobilePublicInfoModifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 服务窗名称，2-20个字之间；不得含有违反法律法规和公序良俗的相关信息；不得侵害他人名誉权、知识产权、商业秘密等合法权利；不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发；不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等
	 */
	private String appName;

	/** 
	* 授权运营书，企业商户若为被经营方授权，需上传加盖公章的扫描件，请使用照片上传接口上传图片获得image_url
	 */
	private String authPic;

	/** 
	* 营业执照地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	private String licenseUrl;

	/** 
	* 服务窗头像地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	private String logoUrl;

	/** 
	* 服务窗欢迎语，200字以内，首次使用服务窗必须
	 */
	private String publicGreeting;

	/** 
	* 第一张门店照片地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	private String shopPic1;

	/** 
	* 第二张门店照片地址
	 */
	private String shopPic2;

	/** 
	* 第三张门店照片地址
	 */
	private String shopPic3;

	/**
	 * <p>Setter for the field <code>appName</code>.</p>
	 *
	 * @param appName a {@link java.lang.String} object.
	 */
	public void setAppName(String appName) {
		this.appName = appName;
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
	 * <p>Setter for the field <code>authPic</code>.</p>
	 *
	 * @param authPic a {@link java.lang.String} object.
	 */
	public void setAuthPic(String authPic) {
		this.authPic = authPic;
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
	 * <p>Setter for the field <code>licenseUrl</code>.</p>
	 *
	 * @param licenseUrl a {@link java.lang.String} object.
	 */
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
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
	 * <p>Setter for the field <code>logoUrl</code>.</p>
	 *
	 * @param logoUrl a {@link java.lang.String} object.
	 */
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
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
	 * <p>Setter for the field <code>publicGreeting</code>.</p>
	 *
	 * @param publicGreeting a {@link java.lang.String} object.
	 */
	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
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
	 * <p>Setter for the field <code>shopPic1</code>.</p>
	 *
	 * @param shopPic1 a {@link java.lang.String} object.
	 */
	public void setShopPic1(String shopPic1) {
		this.shopPic1 = shopPic1;
	}
	/**
	 * <p>Getter for the field <code>shopPic1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopPic1() {
		return this.shopPic1;
	}

	/**
	 * <p>Setter for the field <code>shopPic2</code>.</p>
	 *
	 * @param shopPic2 a {@link java.lang.String} object.
	 */
	public void setShopPic2(String shopPic2) {
		this.shopPic2 = shopPic2;
	}
	/**
	 * <p>Getter for the field <code>shopPic2</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopPic2() {
		return this.shopPic2;
	}

	/**
	 * <p>Setter for the field <code>shopPic3</code>.</p>
	 *
	 * @param shopPic3 a {@link java.lang.String} object.
	 */
	public void setShopPic3(String shopPic3) {
		this.shopPic3 = shopPic3;
	}
	/**
	 * <p>Getter for the field <code>shopPic3</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopPic3() {
		return this.shopPic3;
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

	/** {@inheritDoc} */
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode; 
	}

	/**
	 * <p>getApiMethodName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApiMethodName() {
		return "alipay.mobile.public.info.modify";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_name", this.appName);
		txtParams.put("auth_pic", this.authPic);
		txtParams.put("license_url", this.licenseUrl);
		txtParams.put("logo_url", this.logoUrl);
		txtParams.put("public_greeting", this.publicGreeting);
		txtParams.put("shop_pic1", this.shopPic1);
		txtParams.put("shop_pic2", this.shopPic2);
		txtParams.put("shop_pic3", this.shopPic3);
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
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<AlipayMobilePublicInfoModifyResponse> getResponseClass() {
		return AlipayMobilePublicInfoModifyResponse.class;
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
