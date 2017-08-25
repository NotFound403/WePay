package cn.felord.wepay.ali.sdk.api.request;

import java.util.Date;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayMobileCodeCreateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.code.create request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileCodeCreateRequest implements AlipayRequest<AlipayMobileCodeCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务关联ID。比如订单号,userId，业务连接等
	 */
	private String bizLinkedId;

	/** 
	* 类似产品名称，根据该值决定码存储类型；新接业务需要找码平台技术配置
	 */
	private String bizType;

	/** 
	* 业务自定义,码平台不用理解。一定要传json字符串。
	 */
	private String contextStr;

	/** 
	* 如果是true，则扫一扫下发跳转地址直接取自bizLinkedId
否则，从路由信息里取跳转地址
	 */
	private Boolean isDirect;

	/** 
	* 备注信息字段
	 */
	private String memo;

	/** 
	* 发码来源，业务自定
	 */
	private String sourceId;

	/** 
	* 编码启动时间（yyy-MM-dd hh:mm:ss），为空表示立即启用
	 */
	private Date startDate;

	/** 
	* 超时时间,单位秒；若不传则为永久。发码超时时间需要找码平台技术评估
	 */
	private Long timeout;

	/** 
	* 支付宝用户id
	 */
	private String userId;

	/**
	 * <p>Setter for the field <code>bizLinkedId</code>.</p>
	 *
	 * @param bizLinkedId a {@link java.lang.String} object.
	 */
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}
	/**
	 * <p>Getter for the field <code>bizLinkedId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizLinkedId() {
		return this.bizLinkedId;
	}

	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}

	/**
	 * <p>Setter for the field <code>contextStr</code>.</p>
	 *
	 * @param contextStr a {@link java.lang.String} object.
	 */
	public void setContextStr(String contextStr) {
		this.contextStr = contextStr;
	}
	/**
	 * <p>Getter for the field <code>contextStr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContextStr() {
		return this.contextStr;
	}

	/**
	 * <p>Setter for the field <code>isDirect</code>.</p>
	 *
	 * @param isDirect a {@link java.lang.Boolean} object.
	 */
	public void setIsDirect(Boolean isDirect) {
		this.isDirect = isDirect;
	}
	/**
	 * <p>Getter for the field <code>isDirect</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsDirect() {
		return this.isDirect;
	}

	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}

	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId() {
		return this.sourceId;
	}

	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.util.Date} object.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * <p>Setter for the field <code>timeout</code>.</p>
	 *
	 * @param timeout a {@link java.lang.Long} object.
	 */
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}
	/**
	 * <p>Getter for the field <code>timeout</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTimeout() {
		return this.timeout;
	}

	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
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
		return "alipay.mobile.code.create";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_linked_id", this.bizLinkedId);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("context_str", this.contextStr);
		txtParams.put("is_direct", this.isDirect);
		txtParams.put("memo", this.memo);
		txtParams.put("source_id", this.sourceId);
		txtParams.put("start_date", this.startDate);
		txtParams.put("timeout", this.timeout);
		txtParams.put("user_id", this.userId);
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
	public Class<AlipayMobileCodeCreateResponse> getResponseClass() {
		return AlipayMobileCodeCreateResponse.class;
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
