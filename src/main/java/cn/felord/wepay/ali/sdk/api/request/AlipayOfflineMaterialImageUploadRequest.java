package cn.felord.wepay.ali.sdk.api.request;

import java.util.HashMap;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.FileItem;
import cn.felord.wepay.ali.sdk.api.AlipayUploadRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayOfflineMaterialImageUploadResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.offline.material.image.upload request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMaterialImageUploadRequest implements AlipayUploadRequest<AlipayOfflineMaterialImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 图片/视频二进制内容，图片/视频大小不能超过5M
	 */
	private FileItem imageContent;

	/** 
	* 图片/视频名称
	 */
	private String imageName;

	/** 
	* 用于显示指定图片/视频所属的partnerId（支付宝内部使用，外部商户无需填写此字段）
	 */
	private String imagePid;

	/** 
	* 图片/视频格式
	 */
	private String imageType;

	/**
	 * <p>Setter for the field <code>imageContent</code>.</p>
	 *
	 * @param imageContent a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}
	/**
	 * <p>Getter for the field <code>imageContent</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.FileItem} object.
	 */
	public FileItem getImageContent() {
		return this.imageContent;
	}

	/**
	 * <p>Setter for the field <code>imageName</code>.</p>
	 *
	 * @param imageName a {@link java.lang.String} object.
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	/**
	 * <p>Getter for the field <code>imageName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageName() {
		return this.imageName;
	}

	/**
	 * <p>Setter for the field <code>imagePid</code>.</p>
	 *
	 * @param imagePid a {@link java.lang.String} object.
	 */
	public void setImagePid(String imagePid) {
		this.imagePid = imagePid;
	}
	/**
	 * <p>Getter for the field <code>imagePid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImagePid() {
		return this.imagePid;
	}

	/**
	 * <p>Setter for the field <code>imageType</code>.</p>
	 *
	 * @param imageType a {@link java.lang.String} object.
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	/**
	 * <p>Getter for the field <code>imageType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageType() {
		return this.imageType;
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
		return "alipay.offline.material.image.upload";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("image_name", this.imageName);
		txtParams.put("image_pid", this.imagePid);
		txtParams.put("image_type", this.imageType);
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
		params.put("image_content", this.imageContent);
		return params;
	}

	/**
	 * <p>getResponseClass.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<AlipayOfflineMaterialImageUploadResponse> getResponseClass() {
		return AlipayOfflineMaterialImageUploadResponse.class;
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
