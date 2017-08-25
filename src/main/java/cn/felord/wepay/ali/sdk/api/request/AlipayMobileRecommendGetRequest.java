package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayMobileRecommendGetResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.recommend.get request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileRecommendGetRequest implements AlipayRequest<AlipayMobileRecommendGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 请求上下文扩展信息，需要与接口负责人约定。格式为json对象。
	 */
	private String extInfo;

	/** 
	* 期望获取的最多推荐数量, 默认获取一个推荐内容, 0表示获取所有推荐内容
	 */
	private String limit;

	/** 
	* 所使用的场景id，请向接口负责人申请
	 */
	private String sceneId;

	/** 
	* 获取推荐信息的开始位置, 默认从0开始
	 */
	private String startIdx;

	/** 
	* 用户openid
	 */
	private String userId;

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
	 * <p>Setter for the field <code>limit</code>.</p>
	 *
	 * @param limit a {@link java.lang.String} object.
	 */
	public void setLimit(String limit) {
		this.limit = limit;
	}
	/**
	 * <p>Getter for the field <code>limit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLimit() {
		return this.limit;
	}

	/**
	 * <p>Setter for the field <code>sceneId</code>.</p>
	 *
	 * @param sceneId a {@link java.lang.String} object.
	 */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}
	/**
	 * <p>Getter for the field <code>sceneId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneId() {
		return this.sceneId;
	}

	/**
	 * <p>Setter for the field <code>startIdx</code>.</p>
	 *
	 * @param startIdx a {@link java.lang.String} object.
	 */
	public void setStartIdx(String startIdx) {
		this.startIdx = startIdx;
	}
	/**
	 * <p>Getter for the field <code>startIdx</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartIdx() {
		return this.startIdx;
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
		return "alipay.mobile.recommend.get";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("limit", this.limit);
		txtParams.put("scene_id", this.sceneId);
		txtParams.put("start_idx", this.startIdx);
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
	public Class<AlipayMobileRecommendGetResponse> getResponseClass() {
		return AlipayMobileRecommendGetResponse.class;
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
