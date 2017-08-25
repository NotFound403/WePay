package cn.felord.wepay.ali.sdk.api.request;

import java.util.List;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayPassCodeAddResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.pass.code.add request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassCodeAddRequest implements AlipayRequest<AlipayPassCodeAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* alipass文件Base64编码后的内容。
	 */
	private String fileContent;

	/** 
	* 识别信息
当 recognition_type=1时， recognition_info={“partner_id”:”2088102114633762”,“out_trade_no”:”1234567”}
当recognition_type=2时， recognition_info={“user_id”:”2088102114633761“ }
	 */
	private String recognitionInfo;

	/** 
	* 发放对象识别类型
1-	订单信息
2-	支付宝userId
	 */
	private String recognitionType;

	/** 
	* 该pass的核销方式,如果为空，则默认为["wave","qrcode"]
	 */
	private List<String> verifyType;

	/**
	 * <p>Setter for the field <code>fileContent</code>.</p>
	 *
	 * @param fileContent a {@link java.lang.String} object.
	 */
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	/**
	 * <p>Getter for the field <code>fileContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileContent() {
		return this.fileContent;
	}

	/**
	 * <p>Setter for the field <code>recognitionInfo</code>.</p>
	 *
	 * @param recognitionInfo a {@link java.lang.String} object.
	 */
	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}
	/**
	 * <p>Getter for the field <code>recognitionInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}

	/**
	 * <p>Setter for the field <code>recognitionType</code>.</p>
	 *
	 * @param recognitionType a {@link java.lang.String} object.
	 */
	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}
	/**
	 * <p>Getter for the field <code>recognitionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecognitionType() {
		return this.recognitionType;
	}

	/**
	 * <p>Setter for the field <code>verifyType</code>.</p>
	 *
	 * @param verifyType a {@link java.util.List} object.
	 */
	public void setVerifyType(List<String> verifyType) {
		this.verifyType = verifyType;
	}
	/**
	 * <p>Getter for the field <code>verifyType</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getVerifyType() {
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
		return "alipay.pass.code.add";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("file_content", this.fileContent);
		txtParams.put("recognition_info", this.recognitionInfo);
		txtParams.put("recognition_type", this.recognitionType);
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
	public Class<AlipayPassCodeAddResponse> getResponseClass() {
		return AlipayPassCodeAddResponse.class;
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
