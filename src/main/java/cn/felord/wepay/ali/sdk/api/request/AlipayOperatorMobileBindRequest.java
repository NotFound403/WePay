package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayOperatorMobileBindResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.operator.mobile.bind request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOperatorMobileBindRequest implements AlipayRequest<AlipayOperatorMobileBindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 标识该运营商是否需要验证用户的手机号绑定过快捷卡
1：需要
0：不需要
	 */
	private String checkSigncard;

	/** 
	* 支付宝处理完请求后，如验证失败，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	private String fReturnUrl;

	/** 
	* 标识该运营商是否提供了查询手机归属的spi接口。
1：提供了
0：没提供
	 */
	private String hasSpi;

	/** 
	* 标识该运营商名称
	 */
	private String operatorName;

	/** 
	* 标识该运营商所在省份
	 */
	private String provinceName;

	/** 
	* 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	private String sReturnUrl;

	/**
	 * <p>Setter for the field <code>checkSigncard</code>.</p>
	 *
	 * @param checkSigncard a {@link java.lang.String} object.
	 */
	public void setCheckSigncard(String checkSigncard) {
		this.checkSigncard = checkSigncard;
	}
	/**
	 * <p>Getter for the field <code>checkSigncard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCheckSigncard() {
		return this.checkSigncard;
	}

	/**
	 * <p>Setter for the field <code>fReturnUrl</code>.</p>
	 *
	 * @param fReturnUrl a {@link java.lang.String} object.
	 */
	public void setfReturnUrl(String fReturnUrl) {
		this.fReturnUrl = fReturnUrl;
	}
	/**
	 * <p>Getter for the field <code>fReturnUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getfReturnUrl() {
		return this.fReturnUrl;
	}

	/**
	 * <p>Setter for the field <code>hasSpi</code>.</p>
	 *
	 * @param hasSpi a {@link java.lang.String} object.
	 */
	public void setHasSpi(String hasSpi) {
		this.hasSpi = hasSpi;
	}
	/**
	 * <p>Getter for the field <code>hasSpi</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasSpi() {
		return this.hasSpi;
	}

	/**
	 * <p>Setter for the field <code>operatorName</code>.</p>
	 *
	 * @param operatorName a {@link java.lang.String} object.
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	/**
	 * <p>Getter for the field <code>operatorName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorName() {
		return this.operatorName;
	}

	/**
	 * <p>Setter for the field <code>provinceName</code>.</p>
	 *
	 * @param provinceName a {@link java.lang.String} object.
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	/**
	 * <p>Getter for the field <code>provinceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvinceName() {
		return this.provinceName;
	}

	/**
	 * <p>Setter for the field <code>sReturnUrl</code>.</p>
	 *
	 * @param sReturnUrl a {@link java.lang.String} object.
	 */
	public void setsReturnUrl(String sReturnUrl) {
		this.sReturnUrl = sReturnUrl;
	}
	/**
	 * <p>Getter for the field <code>sReturnUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getsReturnUrl() {
		return this.sReturnUrl;
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
		return "alipay.operator.mobile.bind";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("check_signcard", this.checkSigncard);
		txtParams.put("f_return_url", this.fReturnUrl);
		txtParams.put("has_spi", this.hasSpi);
		txtParams.put("operator_name", this.operatorName);
		txtParams.put("province_name", this.provinceName);
		txtParams.put("s_return_url", this.sReturnUrl);
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
	public Class<AlipayOperatorMobileBindResponse> getResponseClass() {
		return AlipayOperatorMobileBindResponse.class;
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
