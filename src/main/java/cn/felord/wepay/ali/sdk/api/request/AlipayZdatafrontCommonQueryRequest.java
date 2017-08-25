package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayZdatafrontCommonQueryResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.zdatafront.common.query request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZdatafrontCommonQueryRequest implements AlipayRequest<AlipayZdatafrontCommonQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 如果cacheInterval<=0,就直接从外部获取数据；
如果cacheInterval>0,就先判断cache中的数据是否过期，如果没有过期就返回cache中的数据，如果过期再从外部获取数据并刷新cache，然后返回数据。
单位：秒
	 */
	private Long cacheInterval;

	/** 
	* 通用查询的入参
	 */
	private String queryConditions;

	/** 
	* 服务名称请与相关开发负责人联系
	 */
	private String serviceName;

	/** 
	* 访问该服务的业务
	 */
	private String visitBiz;

	/** 
	* 访问该服务的业务线
	 */
	private String visitBizLine;

	/** 
	* 访问该服务的部门名称
	 */
	private String visitDomain;

	/**
	 * <p>Setter for the field <code>cacheInterval</code>.</p>
	 *
	 * @param cacheInterval a {@link java.lang.Long} object.
	 */
	public void setCacheInterval(Long cacheInterval) {
		this.cacheInterval = cacheInterval;
	}
	/**
	 * <p>Getter for the field <code>cacheInterval</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCacheInterval() {
		return this.cacheInterval;
	}

	/**
	 * <p>Setter for the field <code>queryConditions</code>.</p>
	 *
	 * @param queryConditions a {@link java.lang.String} object.
	 */
	public void setQueryConditions(String queryConditions) {
		this.queryConditions = queryConditions;
	}
	/**
	 * <p>Getter for the field <code>queryConditions</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQueryConditions() {
		return this.queryConditions;
	}

	/**
	 * <p>Setter for the field <code>serviceName</code>.</p>
	 *
	 * @param serviceName a {@link java.lang.String} object.
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	/**
	 * <p>Getter for the field <code>serviceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceName() {
		return this.serviceName;
	}

	/**
	 * <p>Setter for the field <code>visitBiz</code>.</p>
	 *
	 * @param visitBiz a {@link java.lang.String} object.
	 */
	public void setVisitBiz(String visitBiz) {
		this.visitBiz = visitBiz;
	}
	/**
	 * <p>Getter for the field <code>visitBiz</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVisitBiz() {
		return this.visitBiz;
	}

	/**
	 * <p>Setter for the field <code>visitBizLine</code>.</p>
	 *
	 * @param visitBizLine a {@link java.lang.String} object.
	 */
	public void setVisitBizLine(String visitBizLine) {
		this.visitBizLine = visitBizLine;
	}
	/**
	 * <p>Getter for the field <code>visitBizLine</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVisitBizLine() {
		return this.visitBizLine;
	}

	/**
	 * <p>Setter for the field <code>visitDomain</code>.</p>
	 *
	 * @param visitDomain a {@link java.lang.String} object.
	 */
	public void setVisitDomain(String visitDomain) {
		this.visitDomain = visitDomain;
	}
	/**
	 * <p>Getter for the field <code>visitDomain</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVisitDomain() {
		return this.visitDomain;
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
		return "alipay.zdatafront.common.query";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("cache_interval", this.cacheInterval);
		txtParams.put("query_conditions", this.queryConditions);
		txtParams.put("service_name", this.serviceName);
		txtParams.put("visit_biz", this.visitBiz);
		txtParams.put("visit_biz_line", this.visitBizLine);
		txtParams.put("visit_domain", this.visitDomain);
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
	public Class<AlipayZdatafrontCommonQueryResponse> getResponseClass() {
		return AlipayZdatafrontCommonQueryResponse.class;
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
