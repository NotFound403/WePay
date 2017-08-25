package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipaySecurityInfoAnalysisResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.info.analysis request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityInfoAnalysisRequest implements AlipayRequest<AlipaySecurityInfoAnalysisResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 客户端的基带版本
	 */
	private String envClientBaseBand;

	/** 
	* 客户端连接的基站信息
	 */
	private String envClientBaseStation;

	/** 
	* 客户端的经纬度坐标
	 */
	private String envClientCoordinates;

	/** 
	* 操作的客户端的imei
	 */
	private String envClientImei;

	/** 
	* 操作的客户端的imsi
	 */
	private String envClientImsi;

	/** 
	* IOS设备的UDID
	 */
	private String envClientIosUdid;

	/** 
	* 操作的客户端ip
	 */
	private String envClientIp;

	/** 
	* 操作的客户端mac
	 */
	private String envClientMac;

	/** 
	* 操作的客户端分辨率，格式为：水平像素^垂直像素；如：800^600
	 */
	private String envClientScreen;

	/** 
	* 客户端设备的统一识别码UUID
	 */
	private String envClientUuid;

	/** 
	* JS SDK生成的 tokenID
	 */
	private String jsTokenId;

	/** 
	* 签约的支付宝账号对应的支付宝唯一用户号
	 */
	private String partnerId;

	/** 
	* 场景编码
	 */
	private String sceneCode;

	/** 
	* 卖家账户ID
	 */
	private String userAccountNo;

	/** 
	* 用户绑定银行卡号
	 */
	private String userBindBankcard;

	/** 
	* 用户绑定银行卡的卡类型
	 */
	private String userBindBankcardType;

	/** 
	* 用户绑定手机号
	 */
	private String userBindMobile;

	/** 
	* 用户证件类型
	 */
	private String userIdentityType;

	/** 
	* 用户真实姓名
	 */
	private String userRealName;

	/** 
	* 用户注册时间
	 */
	private String userRegDate;

	/** 
	* 用户注册Email
	 */
	private String userRegEmail;

	/** 
	* 用户注册手机号
	 */
	private String userRegMobile;

	/** 
	* 用户证件号码
	 */
	private String userrIdentityNo;

	/**
	 * <p>Setter for the field <code>envClientBaseBand</code>.</p>
	 *
	 * @param envClientBaseBand a {@link java.lang.String} object.
	 */
	public void setEnvClientBaseBand(String envClientBaseBand) {
		this.envClientBaseBand = envClientBaseBand;
	}
	/**
	 * <p>Getter for the field <code>envClientBaseBand</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientBaseBand() {
		return this.envClientBaseBand;
	}

	/**
	 * <p>Setter for the field <code>envClientBaseStation</code>.</p>
	 *
	 * @param envClientBaseStation a {@link java.lang.String} object.
	 */
	public void setEnvClientBaseStation(String envClientBaseStation) {
		this.envClientBaseStation = envClientBaseStation;
	}
	/**
	 * <p>Getter for the field <code>envClientBaseStation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientBaseStation() {
		return this.envClientBaseStation;
	}

	/**
	 * <p>Setter for the field <code>envClientCoordinates</code>.</p>
	 *
	 * @param envClientCoordinates a {@link java.lang.String} object.
	 */
	public void setEnvClientCoordinates(String envClientCoordinates) {
		this.envClientCoordinates = envClientCoordinates;
	}
	/**
	 * <p>Getter for the field <code>envClientCoordinates</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientCoordinates() {
		return this.envClientCoordinates;
	}

	/**
	 * <p>Setter for the field <code>envClientImei</code>.</p>
	 *
	 * @param envClientImei a {@link java.lang.String} object.
	 */
	public void setEnvClientImei(String envClientImei) {
		this.envClientImei = envClientImei;
	}
	/**
	 * <p>Getter for the field <code>envClientImei</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientImei() {
		return this.envClientImei;
	}

	/**
	 * <p>Setter for the field <code>envClientImsi</code>.</p>
	 *
	 * @param envClientImsi a {@link java.lang.String} object.
	 */
	public void setEnvClientImsi(String envClientImsi) {
		this.envClientImsi = envClientImsi;
	}
	/**
	 * <p>Getter for the field <code>envClientImsi</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientImsi() {
		return this.envClientImsi;
	}

	/**
	 * <p>Setter for the field <code>envClientIosUdid</code>.</p>
	 *
	 * @param envClientIosUdid a {@link java.lang.String} object.
	 */
	public void setEnvClientIosUdid(String envClientIosUdid) {
		this.envClientIosUdid = envClientIosUdid;
	}
	/**
	 * <p>Getter for the field <code>envClientIosUdid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientIosUdid() {
		return this.envClientIosUdid;
	}

	/**
	 * <p>Setter for the field <code>envClientIp</code>.</p>
	 *
	 * @param envClientIp a {@link java.lang.String} object.
	 */
	public void setEnvClientIp(String envClientIp) {
		this.envClientIp = envClientIp;
	}
	/**
	 * <p>Getter for the field <code>envClientIp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientIp() {
		return this.envClientIp;
	}

	/**
	 * <p>Setter for the field <code>envClientMac</code>.</p>
	 *
	 * @param envClientMac a {@link java.lang.String} object.
	 */
	public void setEnvClientMac(String envClientMac) {
		this.envClientMac = envClientMac;
	}
	/**
	 * <p>Getter for the field <code>envClientMac</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientMac() {
		return this.envClientMac;
	}

	/**
	 * <p>Setter for the field <code>envClientScreen</code>.</p>
	 *
	 * @param envClientScreen a {@link java.lang.String} object.
	 */
	public void setEnvClientScreen(String envClientScreen) {
		this.envClientScreen = envClientScreen;
	}
	/**
	 * <p>Getter for the field <code>envClientScreen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientScreen() {
		return this.envClientScreen;
	}

	/**
	 * <p>Setter for the field <code>envClientUuid</code>.</p>
	 *
	 * @param envClientUuid a {@link java.lang.String} object.
	 */
	public void setEnvClientUuid(String envClientUuid) {
		this.envClientUuid = envClientUuid;
	}
	/**
	 * <p>Getter for the field <code>envClientUuid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnvClientUuid() {
		return this.envClientUuid;
	}

	/**
	 * <p>Setter for the field <code>jsTokenId</code>.</p>
	 *
	 * @param jsTokenId a {@link java.lang.String} object.
	 */
	public void setJsTokenId(String jsTokenId) {
		this.jsTokenId = jsTokenId;
	}
	/**
	 * <p>Getter for the field <code>jsTokenId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getJsTokenId() {
		return this.jsTokenId;
	}

	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}

	/**
	 * <p>Setter for the field <code>sceneCode</code>.</p>
	 *
	 * @param sceneCode a {@link java.lang.String} object.
	 */
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	/**
	 * <p>Getter for the field <code>sceneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneCode() {
		return this.sceneCode;
	}

	/**
	 * <p>Setter for the field <code>userAccountNo</code>.</p>
	 *
	 * @param userAccountNo a {@link java.lang.String} object.
	 */
	public void setUserAccountNo(String userAccountNo) {
		this.userAccountNo = userAccountNo;
	}
	/**
	 * <p>Getter for the field <code>userAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserAccountNo() {
		return this.userAccountNo;
	}

	/**
	 * <p>Setter for the field <code>userBindBankcard</code>.</p>
	 *
	 * @param userBindBankcard a {@link java.lang.String} object.
	 */
	public void setUserBindBankcard(String userBindBankcard) {
		this.userBindBankcard = userBindBankcard;
	}
	/**
	 * <p>Getter for the field <code>userBindBankcard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserBindBankcard() {
		return this.userBindBankcard;
	}

	/**
	 * <p>Setter for the field <code>userBindBankcardType</code>.</p>
	 *
	 * @param userBindBankcardType a {@link java.lang.String} object.
	 */
	public void setUserBindBankcardType(String userBindBankcardType) {
		this.userBindBankcardType = userBindBankcardType;
	}
	/**
	 * <p>Getter for the field <code>userBindBankcardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserBindBankcardType() {
		return this.userBindBankcardType;
	}

	/**
	 * <p>Setter for the field <code>userBindMobile</code>.</p>
	 *
	 * @param userBindMobile a {@link java.lang.String} object.
	 */
	public void setUserBindMobile(String userBindMobile) {
		this.userBindMobile = userBindMobile;
	}
	/**
	 * <p>Getter for the field <code>userBindMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserBindMobile() {
		return this.userBindMobile;
	}

	/**
	 * <p>Setter for the field <code>userIdentityType</code>.</p>
	 *
	 * @param userIdentityType a {@link java.lang.String} object.
	 */
	public void setUserIdentityType(String userIdentityType) {
		this.userIdentityType = userIdentityType;
	}
	/**
	 * <p>Getter for the field <code>userIdentityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIdentityType() {
		return this.userIdentityType;
	}

	/**
	 * <p>Setter for the field <code>userRealName</code>.</p>
	 *
	 * @param userRealName a {@link java.lang.String} object.
	 */
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	/**
	 * <p>Getter for the field <code>userRealName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserRealName() {
		return this.userRealName;
	}

	/**
	 * <p>Setter for the field <code>userRegDate</code>.</p>
	 *
	 * @param userRegDate a {@link java.lang.String} object.
	 */
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	/**
	 * <p>Getter for the field <code>userRegDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserRegDate() {
		return this.userRegDate;
	}

	/**
	 * <p>Setter for the field <code>userRegEmail</code>.</p>
	 *
	 * @param userRegEmail a {@link java.lang.String} object.
	 */
	public void setUserRegEmail(String userRegEmail) {
		this.userRegEmail = userRegEmail;
	}
	/**
	 * <p>Getter for the field <code>userRegEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserRegEmail() {
		return this.userRegEmail;
	}

	/**
	 * <p>Setter for the field <code>userRegMobile</code>.</p>
	 *
	 * @param userRegMobile a {@link java.lang.String} object.
	 */
	public void setUserRegMobile(String userRegMobile) {
		this.userRegMobile = userRegMobile;
	}
	/**
	 * <p>Getter for the field <code>userRegMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserRegMobile() {
		return this.userRegMobile;
	}

	/**
	 * <p>Setter for the field <code>userrIdentityNo</code>.</p>
	 *
	 * @param userrIdentityNo a {@link java.lang.String} object.
	 */
	public void setUserrIdentityNo(String userrIdentityNo) {
		this.userrIdentityNo = userrIdentityNo;
	}
	/**
	 * <p>Getter for the field <code>userrIdentityNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserrIdentityNo() {
		return this.userrIdentityNo;
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
		return "alipay.security.info.analysis";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("env_client_base_band", this.envClientBaseBand);
		txtParams.put("env_client_base_station", this.envClientBaseStation);
		txtParams.put("env_client_coordinates", this.envClientCoordinates);
		txtParams.put("env_client_imei", this.envClientImei);
		txtParams.put("env_client_imsi", this.envClientImsi);
		txtParams.put("env_client_ios_udid", this.envClientIosUdid);
		txtParams.put("env_client_ip", this.envClientIp);
		txtParams.put("env_client_mac", this.envClientMac);
		txtParams.put("env_client_screen", this.envClientScreen);
		txtParams.put("env_client_uuid", this.envClientUuid);
		txtParams.put("js_token_id", this.jsTokenId);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("user_account_no", this.userAccountNo);
		txtParams.put("user_bind_bankcard", this.userBindBankcard);
		txtParams.put("user_bind_bankcard_type", this.userBindBankcardType);
		txtParams.put("user_bind_mobile", this.userBindMobile);
		txtParams.put("user_identity_type", this.userIdentityType);
		txtParams.put("user_real_name", this.userRealName);
		txtParams.put("user_reg_date", this.userRegDate);
		txtParams.put("user_reg_email", this.userRegEmail);
		txtParams.put("user_reg_mobile", this.userRegMobile);
		txtParams.put("userr_identity_no", this.userrIdentityNo);
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
	public Class<AlipaySecurityInfoAnalysisResponse> getResponseClass() {
		return AlipaySecurityInfoAnalysisResponse.class;
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
