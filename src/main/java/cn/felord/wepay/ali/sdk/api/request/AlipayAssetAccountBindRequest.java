package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayAssetAccountBindResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.asset.account.bind request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAssetAccountBindRequest implements AlipayRequest<AlipayAssetAccountBindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 绑定场景，目前仅支持如下：
wechat：微信公众平台；
transport：物流转运平台；
appOneBind：一对一app绑定； 
注意：必须是这些值，区分大小写。
	 */
	private String bindScene;

	/** 
	* 使用该app提供用户信息的商户，可以和app相同。
	 */
	private String providerId;

	/** 
	* 用户在商户网站的会员标识。商户需确保其唯一性，不可变更。
	 */
	private String providerUserId;

	/** 
	* 用户在商户网站的会员名（登录号或昵称）。
	 */
	private String providerUserName;

	/**
	 * <p>Setter for the field <code>bindScene</code>.</p>
	 *
	 * @param bindScene a {@link java.lang.String} object.
	 */
	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}
	/**
	 * <p>Getter for the field <code>bindScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindScene() {
		return this.bindScene;
	}

	/**
	 * <p>Setter for the field <code>providerId</code>.</p>
	 *
	 * @param providerId a {@link java.lang.String} object.
	 */
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	/**
	 * <p>Getter for the field <code>providerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderId() {
		return this.providerId;
	}

	/**
	 * <p>Setter for the field <code>providerUserId</code>.</p>
	 *
	 * @param providerUserId a {@link java.lang.String} object.
	 */
	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	/**
	 * <p>Getter for the field <code>providerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderUserId() {
		return this.providerUserId;
	}

	/**
	 * <p>Setter for the field <code>providerUserName</code>.</p>
	 *
	 * @param providerUserName a {@link java.lang.String} object.
	 */
	public void setProviderUserName(String providerUserName) {
		this.providerUserName = providerUserName;
	}
	/**
	 * <p>Getter for the field <code>providerUserName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProviderUserName() {
		return this.providerUserName;
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
		return "alipay.asset.account.bind";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bind_scene", this.bindScene);
		txtParams.put("provider_id", this.providerId);
		txtParams.put("provider_user_id", this.providerUserId);
		txtParams.put("provider_user_name", this.providerUserName);
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
	public Class<AlipayAssetAccountBindResponse> getResponseClass() {
		return AlipayAssetAccountBindResponse.class;
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
