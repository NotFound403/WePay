package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayPassSyncUpdateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.pass.sync.update request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassSyncUpdateRequest implements AlipayRequest<AlipayPassSyncUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid；商户自己发券时，此值为空或者商户appId
	 */
	private String channelId;

	/** 
	* 用来传递外部交易号等扩展参数信息，格式为json
	 */
	private String extInfo;

	/** 
	* 需要修改的pass信息，可以更新全部pass信息，也可以斤更新某一节点。pass信息中的pass.json中的数据格式，如果不需要更新该属性值，设置为null即可。
	 */
	private String pass;

	/** 
	* Alipass唯一标识
	 */
	private String serialNumber;

	/** 
	* Alipass状态，目前仅支持CLOSED及USED两种数据。status为USED时，verify_type即为核销时的核销方式。
	 */
	private String status;

	/** 
	* 核销码串值【当状态变更为USED时，建议传入】
	 */
	private String verifyCode;

	/** 
	* 核销方式，目前支持：wave（声波方式）、qrcode（二维码方式）、barcode（条码方式）、input（文本方式，即手工输入方式）。pass和verify_type不能同时为空
	 */
	private String verifyType;

	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a {@link java.lang.String} object.
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	/**
	 * <p>Getter for the field <code>channelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelId() {
		return this.channelId;
	}

	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}

	/**
	 * <p>Setter for the field <code>pass</code>.</p>
	 *
	 * @param pass a {@link java.lang.String} object.
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * <p>Getter for the field <code>pass</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPass() {
		return this.pass;
	}

	/**
	 * <p>Setter for the field <code>serialNumber</code>.</p>
	 *
	 * @param serialNumber a {@link java.lang.String} object.
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * <p>Getter for the field <code>serialNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerialNumber() {
		return this.serialNumber;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * <p>Setter for the field <code>verifyCode</code>.</p>
	 *
	 * @param verifyCode a {@link java.lang.String} object.
	 */
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	/**
	 * <p>Getter for the field <code>verifyCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyCode() {
		return this.verifyCode;
	}

	/**
	 * <p>Setter for the field <code>verifyType</code>.</p>
	 *
	 * @param verifyType a {@link java.lang.String} object.
	 */
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}
	/**
	 * <p>Getter for the field <code>verifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyType() {
		return this.verifyType;
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
		return "alipay.pass.sync.update";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("channel_id", this.channelId);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("pass", this.pass);
		txtParams.put("serial_number", this.serialNumber);
		txtParams.put("status", this.status);
		txtParams.put("verify_code", this.verifyCode);
		txtParams.put("verify_type", this.verifyType);
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
	public Class<AlipayPassSyncUpdateResponse> getResponseClass() {
		return AlipayPassSyncUpdateResponse.class;
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
