package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayTransferThirdpartyBillCreateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.transfer.thirdparty.bill.create request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTransferThirdpartyBillCreateRequest implements AlipayRequest<AlipayTransferThirdpartyBillCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 收款金额，单位：分
	 */
	private String amount;

	/** 
	* 收款币种，默认为156（人民币）目前只允许转账人民币
	 */
	private String currency;

	/** 
	* 扩展参数
	 */
	private String extParam;

	/** 
	* 转账备注
	 */
	private String memo;

	/** 
	* 合作方的支付宝帐号UID
	 */
	private String partnerId;

	/** 
	* 外部系统收款方UID，付款人和收款人不能是同一个帐户
	 */
	private String payeeAccount;

	/** 
	* （同payer_type所列举的）
目前限制payer_type和payee_type必须一致
	 */
	private String payeeType;

	/** 
	* 外部系统付款方的UID
	 */
	private String payerAccount;

	/** 
	* 1-支付宝帐户
2-淘宝帐户
10001-新浪微博帐户
10002-阿里云帐户
（1、2目前对外不可见、不可用）
	 */
	private String payerType;

	/** 
	* 发起支付交易来源方定义的交易ID，用于将支付回执通知给来源方。不同来源方给出的ID可以重复，同一个来源方给出的ID唯一性由来源方保证。
	 */
	private String paymentId;

	/** 
	* 支付来源
10001-新浪微博
10002-阿里云
	 */
	private String paymentSource;

	/** 
	* 支付款项的标题
	 */
	private String title;

	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}

	/**
	 * <p>Setter for the field <code>currency</code>.</p>
	 *
	 * @param currency a {@link java.lang.String} object.
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * <p>Getter for the field <code>currency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * <p>Setter for the field <code>extParam</code>.</p>
	 *
	 * @param extParam a {@link java.lang.String} object.
	 */
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	/**
	 * <p>Getter for the field <code>extParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParam() {
		return this.extParam;
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
	 * <p>Setter for the field <code>payeeAccount</code>.</p>
	 *
	 * @param payeeAccount a {@link java.lang.String} object.
	 */
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	/**
	 * <p>Getter for the field <code>payeeAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeAccount() {
		return this.payeeAccount;
	}

	/**
	 * <p>Setter for the field <code>payeeType</code>.</p>
	 *
	 * @param payeeType a {@link java.lang.String} object.
	 */
	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
	}
	/**
	 * <p>Getter for the field <code>payeeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeType() {
		return this.payeeType;
	}

	/**
	 * <p>Setter for the field <code>payerAccount</code>.</p>
	 *
	 * @param payerAccount a {@link java.lang.String} object.
	 */
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}
	/**
	 * <p>Getter for the field <code>payerAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerAccount() {
		return this.payerAccount;
	}

	/**
	 * <p>Setter for the field <code>payerType</code>.</p>
	 *
	 * @param payerType a {@link java.lang.String} object.
	 */
	public void setPayerType(String payerType) {
		this.payerType = payerType;
	}
	/**
	 * <p>Getter for the field <code>payerType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerType() {
		return this.payerType;
	}

	/**
	 * <p>Setter for the field <code>paymentId</code>.</p>
	 *
	 * @param paymentId a {@link java.lang.String} object.
	 */
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * <p>Getter for the field <code>paymentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentId() {
		return this.paymentId;
	}

	/**
	 * <p>Setter for the field <code>paymentSource</code>.</p>
	 *
	 * @param paymentSource a {@link java.lang.String} object.
	 */
	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}
	/**
	 * <p>Getter for the field <code>paymentSource</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentSource() {
		return this.paymentSource;
	}

	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
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
		return "alipay.transfer.thirdparty.bill.create";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("amount", this.amount);
		txtParams.put("currency", this.currency);
		txtParams.put("ext_param", this.extParam);
		txtParams.put("memo", this.memo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("payee_account", this.payeeAccount);
		txtParams.put("payee_type", this.payeeType);
		txtParams.put("payer_account", this.payerAccount);
		txtParams.put("payer_type", this.payerType);
		txtParams.put("payment_id", this.paymentId);
		txtParams.put("payment_source", this.paymentSource);
		txtParams.put("title", this.title);
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
	public Class<AlipayTransferThirdpartyBillCreateResponse> getResponseClass() {
		return AlipayTransferThirdpartyBillCreateResponse.class;
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
