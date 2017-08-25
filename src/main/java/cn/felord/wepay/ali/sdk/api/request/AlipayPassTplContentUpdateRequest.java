package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayPassTplContentUpdateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.pass.tpl.content.update request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassTplContentUpdateRequest implements AlipayRequest<AlipayPassTplContentUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
	 */
	private String channelId;

	/** 
	* 支付宝pass唯一标识
	 */
	private String serialNumber;

	/** 
	* 券状态,支持更新为USED,CLOSED两种状态
	 */
	private String status;

	/** 
	* 模版动态参数信息【支付宝pass模版参数键值对JSON字符串】
	 */
	private String tplParams;

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
	 * <p>Setter for the field <code>tplParams</code>.</p>
	 *
	 * @param tplParams a {@link java.lang.String} object.
	 */
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}
	/**
	 * <p>Getter for the field <code>tplParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTplParams() {
		return this.tplParams;
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
		return "alipay.pass.tpl.content.update";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("channel_id", this.channelId);
		txtParams.put("serial_number", this.serialNumber);
		txtParams.put("status", this.status);
		txtParams.put("tpl_params", this.tplParams);
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
	public Class<AlipayPassTplContentUpdateResponse> getResponseClass() {
		return AlipayPassTplContentUpdateResponse.class;
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
