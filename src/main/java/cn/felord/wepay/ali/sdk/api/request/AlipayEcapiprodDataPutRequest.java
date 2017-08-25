package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEcapiprodDataPutResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecapiprod.data.put request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDataPutRequest implements AlipayRequest<AlipayEcapiprodDataPutResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 数据类型
	 */
	private String category;

	/** 
	* 数据字符编码，默认UTF-8
	 */
	private String charSet;

	/** 
	* 数据采集平台生成的采集任务编号
	 */
	private String collectingTaskId;

	/** 
	* 身份证，工商注册号等
	 */
	private String entityCode;

	/** 
	* 姓名或公司名等，name和code不能同时为空
	 */
	private String entityName;

	/** 
	* 人或公司等
	 */
	private String entityType;

	/** 
	* 渠道商
	 */
	private String isvCode;

	/** 
	* 数据主体,以json格式传输的数据
	 */
	private String jsonData;

	/** 
	* 数据合作方
	 */
	private String orgCode;

	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * <p>Setter for the field <code>charSet</code>.</p>
	 *
	 * @param charSet a {@link java.lang.String} object.
	 */
	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}
	/**
	 * <p>Getter for the field <code>charSet</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCharSet() {
		return this.charSet;
	}

	/**
	 * <p>Setter for the field <code>collectingTaskId</code>.</p>
	 *
	 * @param collectingTaskId a {@link java.lang.String} object.
	 */
	public void setCollectingTaskId(String collectingTaskId) {
		this.collectingTaskId = collectingTaskId;
	}
	/**
	 * <p>Getter for the field <code>collectingTaskId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCollectingTaskId() {
		return this.collectingTaskId;
	}

	/**
	 * <p>Setter for the field <code>entityCode</code>.</p>
	 *
	 * @param entityCode a {@link java.lang.String} object.
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	/**
	 * <p>Getter for the field <code>entityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityCode() {
		return this.entityCode;
	}

	/**
	 * <p>Setter for the field <code>entityName</code>.</p>
	 *
	 * @param entityName a {@link java.lang.String} object.
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	/**
	 * <p>Getter for the field <code>entityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityName() {
		return this.entityName;
	}

	/**
	 * <p>Setter for the field <code>entityType</code>.</p>
	 *
	 * @param entityType a {@link java.lang.String} object.
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	/**
	 * <p>Getter for the field <code>entityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityType() {
		return this.entityType;
	}

	/**
	 * <p>Setter for the field <code>isvCode</code>.</p>
	 *
	 * @param isvCode a {@link java.lang.String} object.
	 */
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	/**
	 * <p>Getter for the field <code>isvCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsvCode() {
		return this.isvCode;
	}

	/**
	 * <p>Setter for the field <code>jsonData</code>.</p>
	 *
	 * @param jsonData a {@link java.lang.String} object.
	 */
	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	/**
	 * <p>Getter for the field <code>jsonData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJsonData() {
		return this.jsonData;
	}

	/**
	 * <p>Setter for the field <code>orgCode</code>.</p>
	 *
	 * @param orgCode a {@link java.lang.String} object.
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	/**
	 * <p>Getter for the field <code>orgCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgCode() {
		return this.orgCode;
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
		return "alipay.ecapiprod.data.put";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category", this.category);
		txtParams.put("char_set", this.charSet);
		txtParams.put("collecting_task_id", this.collectingTaskId);
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_name", this.entityName);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("isv_code", this.isvCode);
		txtParams.put("json_data", this.jsonData);
		txtParams.put("org_code", this.orgCode);
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
	public Class<AlipayEcapiprodDataPutResponse> getResponseClass() {
		return AlipayEcapiprodDataPutResponse.class;
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
