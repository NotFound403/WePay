package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayExscUserFirstsignGetResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.exsc.user.firstsign.get request
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 17:13:27
 */
public class AlipayExscUserFirstsignGetRequest implements AlipayRequest<AlipayExscUserFirstsignGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝 cif的accountNo 格式：支付宝userId+0156
	 */
	private String alipayId;

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getAlipayId() {
		return this.alipayId;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.exsc.user.firstsign.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_id", this.alipayId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayExscUserFirstsignGetResponse> getResponseClass() {
		return AlipayExscUserFirstsignGetResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}