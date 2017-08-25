package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEcapiprodDrawndnLendingrecordQueryResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.lendingrecord.query request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDrawndnLendingrecordQueryRequest implements AlipayRequest<AlipayEcapiprodDrawndnLendingrecordQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支用编号
	 */
	private String drawndnNo;

	/** 
	* 还款记录的终止时间，终止时间与起始时间的范围不能超过31天
	 */
	private String end;

	/** 
	* 身份证号码
	 */
	private String entityCode;

	/** 
	* 客户的姓名
	 */
	private String entityName;

	/** 
	* 融资平台分配给ISV的编码
	 */
	private String isvCode;

	/** 
	* 融资平台分配给小贷公司的机构编码
	 */
	private String orgCode;

	/** 
	* 还款记录的起始时间（距离当前时间不能大于183天，只能在【0-183】之间）
	 */
	private String start;

	/**
	 * <p>Setter for the field <code>drawndnNo</code>.</p>
	 *
	 * @param drawndnNo a {@link java.lang.String} object.
	 */
	public void setDrawndnNo(String drawndnNo) {
		this.drawndnNo = drawndnNo;
	}
	/**
	 * <p>Getter for the field <code>drawndnNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDrawndnNo() {
		return this.drawndnNo;
	}

	/**
	 * <p>Setter for the field <code>end</code>.</p>
	 *
	 * @param end a {@link java.lang.String} object.
	 */
	public void setEnd(String end) {
		this.end = end;
	}
	/**
	 * <p>Getter for the field <code>end</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnd() {
		return this.end;
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

	/**
	 * <p>Setter for the field <code>start</code>.</p>
	 *
	 * @param start a {@link java.lang.String} object.
	 */
	public void setStart(String start) {
		this.start = start;
	}
	/**
	 * <p>Getter for the field <code>start</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStart() {
		return this.start;
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
		return "alipay.ecapiprod.drawndn.lendingrecord.query";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("drawndn_no", this.drawndnNo);
		txtParams.put("end", this.end);
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_name", this.entityName);
		txtParams.put("isv_code", this.isvCode);
		txtParams.put("org_code", this.orgCode);
		txtParams.put("start", this.start);
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
	public Class<AlipayEcapiprodDrawndnLendingrecordQueryResponse> getResponseClass() {
		return AlipayEcapiprodDrawndnLendingrecordQueryResponse.class;
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
