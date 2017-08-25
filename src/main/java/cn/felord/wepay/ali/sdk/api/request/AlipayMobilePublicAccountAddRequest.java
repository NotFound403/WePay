package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayMobilePublicAccountAddResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.public.account.add request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicAccountAddRequest implements AlipayRequest<AlipayMobilePublicAccountAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 协议号
	 */
	private String agreementId;

	/** 
	* 绑定账户
	 */
	private String bindAccountNo;

	/** 
	* json
	 */
	private String bizContent;

	/** 
	* 绑定账户的名
	 */
	private String displayName;

	/** 
	* 关注者标识
	 */
	private String fromUserId;

	/** 
	* 绑定账户的用户名
	 */
	private String realName;

	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId() {
		return this.agreementId;
	}

	/**
	 * <p>Setter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @param bindAccountNo a {@link java.lang.String} object.
	 */
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}
	/**
	 * <p>Getter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindAccountNo() {
		return this.bindAccountNo;
	}

	/**
	 * <p>Setter for the field <code>bizContent</code>.</p>
	 *
	 * @param bizContent a {@link java.lang.String} object.
	 */
	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	/**
	 * <p>Getter for the field <code>bizContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizContent() {
		return this.bizContent;
	}

	/**
	 * <p>Setter for the field <code>displayName</code>.</p>
	 *
	 * @param displayName a {@link java.lang.String} object.
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * <p>Getter for the field <code>displayName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * <p>Setter for the field <code>fromUserId</code>.</p>
	 *
	 * @param fromUserId a {@link java.lang.String} object.
	 */
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	/**
	 * <p>Getter for the field <code>fromUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFromUserId() {
		return this.fromUserId;
	}

	/**
	 * <p>Setter for the field <code>realName</code>.</p>
	 *
	 * @param realName a {@link java.lang.String} object.
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * <p>Getter for the field <code>realName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealName() {
		return this.realName;
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
		return "alipay.mobile.public.account.add";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("bind_account_no", this.bindAccountNo);
		txtParams.put("biz_content", this.bizContent);
		txtParams.put("display_name", this.displayName);
		txtParams.put("from_user_id", this.fromUserId);
		txtParams.put("real_name", this.realName);
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
	public Class<AlipayMobilePublicAccountAddResponse> getResponseClass() {
		return AlipayMobilePublicAccountAddResponse.class;
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
