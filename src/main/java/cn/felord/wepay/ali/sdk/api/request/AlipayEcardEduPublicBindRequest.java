package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEcardEduPublicBindResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecard.edu.public.bind request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcardEduPublicBindRequest implements AlipayRequest<AlipayEcardEduPublicBindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 机构编码
	 */
	private String agentCode;

	/** 
	* 公众账号协议Id
	 */
	private String agreementId;

	/** 
	* 支付宝userId
	 */
	private String alipayUserId;

	/** 
	* 一卡通姓名
	 */
	private String cardName;

	/** 
	* 一卡通卡号
	 */
	private String cardNo;

	/** 
	* 公众账号id
	 */
	private String publicId;

	/**
	 * <p>Setter for the field <code>agentCode</code>.</p>
	 *
	 * @param agentCode a {@link java.lang.String} object.
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	/**
	 * <p>Getter for the field <code>agentCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentCode() {
		return this.agentCode;
	}

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
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId() {
		return this.alipayUserId;
	}

	/**
	 * <p>Setter for the field <code>cardName</code>.</p>
	 *
	 * @param cardName a {@link java.lang.String} object.
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	/**
	 * <p>Getter for the field <code>cardName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardName() {
		return this.cardName;
	}

	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo() {
		return this.cardNo;
	}

	/**
	 * <p>Setter for the field <code>publicId</code>.</p>
	 *
	 * @param publicId a {@link java.lang.String} object.
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	/**
	 * <p>Getter for the field <code>publicId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicId() {
		return this.publicId;
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
		return "alipay.ecard.edu.public.bind";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("alipay_user_id", this.alipayUserId);
		txtParams.put("card_name", this.cardName);
		txtParams.put("card_no", this.cardNo);
		txtParams.put("public_id", this.publicId);
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
	public Class<AlipayEcardEduPublicBindResponse> getResponseClass() {
		return AlipayEcardEduPublicBindResponse.class;
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
