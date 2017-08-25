package cn.felord.wepay.ali.sdk.api.request;

import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayOpenPublicLifeCreateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.create request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeCreateRequest implements AlipayUploadRequest<AlipayOpenPublicLifeCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 背景图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方背景图位置，后缀是jpg或者jpeg，图片大小限制1mb
	 */
	private FileItem background;

	/** 
	* 联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人姓名
	 */
	private String contactName;

	/** 
	* 联系人电话
	 */
	private String contactTel;

	/** 
	* 客服电话，可以是电话号码，手机号码，400电话
	 */
	private String customerTel;

	/** 
	* 生活号简介，此内容显示在支付宝客户端生活号主页简介区块
	 */
	private String description;

	/** 
	* 扩展数据JSON串
	 */
	private String extendData;

	/** 
	* 生活号名称
	 */
	private String lifeName;

	/** 
	* logo图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方位置，后缀是jpg或者jpeg，图片大小限制1mb，图片最小150px ，图片建议为是正方形
	 */
	private FileItem logo;

	/** 
	* mcc code
	 */
	private String mccCode;

	/** 
	* 目前只支持 LIFE_APP：应用号
	 */
	private String publicBizType;

	/** 
	* 生活号前端展示类型
	 */
	private String showStyle;

	/** 
	* 支付宝用户id，由支付宝同学提供用户id，为该生活号对应pid
	 */
	private String userId;

	/**
	 * <p>Setter for the field <code>background</code>.</p>
	 *
	 * @param background a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setBackground(FileItem background) {
		this.background = background;
	}
	/**
	 * <p>Getter for the field <code>background</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getBackground() {
		return this.background;
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
	 * <p>Setter for the field <code>contactTel</code>.</p>
	 *
	 * @param contactTel a {@link java.lang.String} object.
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	/**
	 * <p>Getter for the field <code>contactTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactTel() {
		return this.contactTel;
	}

	/**
	 * <p>Setter for the field <code>customerTel</code>.</p>
	 *
	 * @param customerTel a {@link java.lang.String} object.
	 */
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	/**
	 * <p>Getter for the field <code>customerTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustomerTel() {
		return this.customerTel;
	}

	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * <p>Setter for the field <code>extendData</code>.</p>
	 *
	 * @param extendData a {@link java.lang.String} object.
	 */
	public void setExtendData(String extendData) {
		this.extendData = extendData;
	}
	/**
	 * <p>Getter for the field <code>extendData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendData() {
		return this.extendData;
	}

	/**
	 * <p>Setter for the field <code>lifeName</code>.</p>
	 *
	 * @param lifeName a {@link java.lang.String} object.
	 */
	public void setLifeName(String lifeName) {
		this.lifeName = lifeName;
	}
	/**
	 * <p>Getter for the field <code>lifeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLifeName() {
		return this.lifeName;
	}

	/**
	 * <p>Setter for the field <code>logo</code>.</p>
	 *
	 * @param logo a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setLogo(FileItem logo) {
		this.logo = logo;
	}
	/**
	 * <p>Getter for the field <code>logo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getLogo() {
		return this.logo;
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
	 * <p>Setter for the field <code>publicBizType</code>.</p>
	 *
	 * @param publicBizType a {@link java.lang.String} object.
	 */
	public void setPublicBizType(String publicBizType) {
		this.publicBizType = publicBizType;
	}
	/**
	 * <p>Getter for the field <code>publicBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicBizType() {
		return this.publicBizType;
	}

	/**
	 * <p>Setter for the field <code>showStyle</code>.</p>
	 *
	 * @param showStyle a {@link java.lang.String} object.
	 */
	public void setShowStyle(String showStyle) {
		this.showStyle = showStyle;
	}
	/**
	 * <p>Getter for the field <code>showStyle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowStyle() {
		return this.showStyle;
	}

	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
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
		return "alipay.open.public.life.create";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("contact_tel", this.contactTel);
		txtParams.put("customer_tel", this.customerTel);
		txtParams.put("description", this.description);
		txtParams.put("extend_data", this.extendData);
		txtParams.put("life_name", this.lifeName);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("public_biz_type", this.publicBizType);
		txtParams.put("show_style", this.showStyle);
		txtParams.put("user_id", this.userId);
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
		params.put("background", this.background);
		params.put("logo", this.logo);
		return params;
	}

	/**
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<AlipayOpenPublicLifeCreateResponse> getResponseClass() {
		return AlipayOpenPublicLifeCreateResponse.class;
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
