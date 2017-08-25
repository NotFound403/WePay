package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEbppPdeductPayResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.pay request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductPayRequest implements AlipayRequest<AlipayEbppPdeductPayResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 渠道码，如用户通过机构通过服务窗进来签约则是PUBLICFORM，此值可随意传，只要不空就行
	 */
	private String agentChannel;

	/** 
	* 二级渠道码，预留字段
	 */
	private String agentCode;

	/** 
	* 支付宝代扣协议Id
	 */
	private String agreementId;

	/** 
	* 账期
	 */
	private String billDate;

	/** 
	* 户号，缴费单位用于标识每一户的唯一性的
	 */
	private String billKey;

	/** 
	* 扩展参数。必须以key value形式定义，
转为json为格式：{"key1":"value1","key2":"value2",
"key3":"value3","key4":"value4"}
 后端会直接转换为MAP对象，转换异常会报参数格式错误
	 */
	private String extendField;

	/** 
	* 滞纳金
	 */
	private String fineAmount;

	/** 
	* 备注信息
	 */
	private String memo;

	/** 
	* 商户外部业务流水号
	 */
	private String outOrderNo;

	/** 
	* 扣款金额，支付总金额，包含滞纳金
	 */
	private String payAmount;

	/** 
	* 商户PartnerId
	 */
	private String pid;

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
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId() {
		return this.agreementId;
	}

	/**
	 * <p>Setter for the field <code>billDate</code>.</p>
	 *
	 * @param billDate a {@link java.lang.String} object.
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	/**
	 * <p>Getter for the field <code>billDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillDate() {
		return this.billDate;
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
	 * <p>Setter for the field <code>fineAmount</code>.</p>
	 *
	 * @param fineAmount a {@link java.lang.String} object.
	 */
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}
	/**
	 * <p>Getter for the field <code>fineAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFineAmount() {
		return this.fineAmount;
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
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	/**
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	/**
	 * <p>Setter for the field <code>payAmount</code>.</p>
	 *
	 * @param payAmount a {@link java.lang.String} object.
	 */
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * <p>Getter for the field <code>payAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmount() {
		return this.payAmount;
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
		return "alipay.ebpp.pdeduct.pay";
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
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("fine_amount", this.fineAmount);
		txtParams.put("memo", this.memo);
		txtParams.put("out_order_no", this.outOrderNo);
		txtParams.put("pay_amount", this.payAmount);
		txtParams.put("pid", this.pid);
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
	public Class<AlipayEbppPdeductPayResponse> getResponseClass() {
		return AlipayEbppPdeductPayResponse.class;
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
