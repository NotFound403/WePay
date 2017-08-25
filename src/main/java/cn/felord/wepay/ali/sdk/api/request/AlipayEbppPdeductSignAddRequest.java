package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEbppPdeductSignAddResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.add request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductSignAddRequest implements AlipayRequest<AlipayEbppPdeductSignAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 机构签约代扣来源渠道
PUBLICPLATFORM：服务窗
	 */
	private String agentChannel;

	/** 
	* 从服务窗发起则为publicId的值
	 */
	private String agentCode;

	/** 
	* 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	private String billKey;

	/** 
	* 业务类型。
JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用
WUYE：缴物业费
HK：信用卡还款
TX：手机充值
	 */
	private String bizType;

	/** 
	* 支付宝缴费系统中的出账机构ID
	 */
	private String chargeInst;

	/** 
	* 签约类型可为空
	 */
	private String deductType;

	/** 
	* 扩展字段
	 */
	private String extendField;

	/** 
	* 通知方式设置，可为空
	 */
	private String notifyConfig;

	/** 
	* 外部产生的协议ID
	 */
	private String outAgreementId;

	/** 
	* 户名，户主真实姓名
	 */
	private String ownerName;

	/** 
	* 支付工具设置，目前可为空
	 */
	private String payConfig;

	/** 
	* 用户签约时，跳转到支付宝独立密码校验页面，校验成功后会将token和对应的用户ID缓存下来，然后跳回到机构页面生成token带回给机构，机构签约时必须传入token
	 */
	private String payPasswordToken;

	/** 
	* 商户ID
	 */
	private String pid;

	/** 
	* 签约到期时间。空表示无限期，一期固定传空。
	 */
	private String signExpireDate;

	/** 
	* 业务子类型。
WATER：缴水费
ELECTRIC：缴电费
GAS：缴燃气费
COMMUN：缴固话宽带
CATV：缴有线电视费
TRAFFIC：缴交通罚款
WUYE：缴物业费
HK：信用卡还款
CZ：手机充值
	 */
	private String subBizType;

	/** 
	* 用户ID
	 */
	private String userId;

	/**
	 * <p>Setter for the field <code>agentChannel</code>.</p>
	 *
	 * @param agentChannel a {@link java.lang.String} object.
	 */
	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}
	/**
	 * <p>Getter for the field <code>agentChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentChannel() {
		return this.agentChannel;
	}

	/**
	 * <p>Setter for the field <code>agentCode</code>.</p>
	 *
	 * @param agentCode a {@link java.lang.String} object.
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	/**
	 * <p>Getter for the field <code>agentCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentCode() {
		return this.agentCode;
	}

	/**
	 * <p>Setter for the field <code>billKey</code>.</p>
	 *
	 * @param billKey a {@link java.lang.String} object.
	 */
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	/**
	 * <p>Getter for the field <code>billKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillKey() {
		return this.billKey;
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
	 * <p>Setter for the field <code>chargeInst</code>.</p>
	 *
	 * @param chargeInst a {@link java.lang.String} object.
	 */
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	/**
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst() {
		return this.chargeInst;
	}

	/**
	 * <p>Setter for the field <code>deductType</code>.</p>
	 *
	 * @param deductType a {@link java.lang.String} object.
	 */
	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}
	/**
	 * <p>Getter for the field <code>deductType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeductType() {
		return this.deductType;
	}

	/**
	 * <p>Setter for the field <code>extendField</code>.</p>
	 *
	 * @param extendField a {@link java.lang.String} object.
	 */
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	/**
	 * <p>Getter for the field <code>extendField</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendField() {
		return this.extendField;
	}

	/**
	 * <p>Setter for the field <code>notifyConfig</code>.</p>
	 *
	 * @param notifyConfig a {@link java.lang.String} object.
	 */
	public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}
	/**
	 * <p>Getter for the field <code>notifyConfig</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyConfig() {
		return this.notifyConfig;
	}

	/**
	 * <p>Setter for the field <code>outAgreementId</code>.</p>
	 *
	 * @param outAgreementId a {@link java.lang.String} object.
	 */
	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	/**
	 * <p>Getter for the field <code>outAgreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutAgreementId() {
		return this.outAgreementId;
	}

	/**
	 * <p>Setter for the field <code>ownerName</code>.</p>
	 *
	 * @param ownerName a {@link java.lang.String} object.
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * <p>Getter for the field <code>ownerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerName() {
		return this.ownerName;
	}

	/**
	 * <p>Setter for the field <code>payConfig</code>.</p>
	 *
	 * @param payConfig a {@link java.lang.String} object.
	 */
	public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
	}
	/**
	 * <p>Getter for the field <code>payConfig</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayConfig() {
		return this.payConfig;
	}

	/**
	 * <p>Setter for the field <code>payPasswordToken</code>.</p>
	 *
	 * @param payPasswordToken a {@link java.lang.String} object.
	 */
	public void setPayPasswordToken(String payPasswordToken) {
		this.payPasswordToken = payPasswordToken;
	}
	/**
	 * <p>Getter for the field <code>payPasswordToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayPasswordToken() {
		return this.payPasswordToken;
	}

	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid() {
		return this.pid;
	}

	/**
	 * <p>Setter for the field <code>signExpireDate</code>.</p>
	 *
	 * @param signExpireDate a {@link java.lang.String} object.
	 */
	public void setSignExpireDate(String signExpireDate) {
		this.signExpireDate = signExpireDate;
	}
	/**
	 * <p>Getter for the field <code>signExpireDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignExpireDate() {
		return this.signExpireDate;
	}

	/**
	 * <p>Setter for the field <code>subBizType</code>.</p>
	 *
	 * @param subBizType a {@link java.lang.String} object.
	 */
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	/**
	 * <p>Getter for the field <code>subBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubBizType() {
		return this.subBizType;
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
		return "alipay.ebpp.pdeduct.sign.add";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_channel", this.agentChannel);
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("deduct_type", this.deductType);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("notify_config", this.notifyConfig);
		txtParams.put("out_agreement_id", this.outAgreementId);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_config", this.payConfig);
		txtParams.put("pay_password_token", this.payPasswordToken);
		txtParams.put("pid", this.pid);
		txtParams.put("sign_expire_date", this.signExpireDate);
		txtParams.put("sub_biz_type", this.subBizType);
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
	public Class<AlipayEbppPdeductSignAddResponse> getResponseClass() {
		return AlipayEbppPdeductSignAddResponse.class;
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
