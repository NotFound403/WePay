package cn.felord.wepay.ali.sdk.api.request;

import java.util.Date;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayMicropayOrderFreezeResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.micropay.order.freeze request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMicropayOrderFreezeRequest implements AlipayRequest<AlipayMicropayOrderFreezeResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 需要冻结金额，[0.01,2000]，必须是正数，最多只能保留小数点两位,单位是元
	 */
	private String amount;

	/** 
	* 冻结资金的到期时间，超过此日期，冻结金会自动解冻,时间要求是:[当前时间+24h,订购时间-8h] .
	 */
	private Date expireTime;

	/** 
	* 冻结备注,maxLength=40
	 */
	private String memo;

	/** 
	* 商户订单号,只能由字母和数字组成，最大长度32.此外部订单号与支付宝的冻结订单号对应,注意 应用id和订购者id和外部订单号必须保证唯一性。
	 */
	private String merchantOrderNo;

	/** 
	* 在解冻转账的时候的支付方式: NO_CONFIRM：不需要付款确认，调用接口直接扣款 PAY_PASSWORD: 在转账需要付款方用支付密码确认，才可以转账成功
	 */
	private String payConfirm;

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
	 * <p>Setter for the field <code>expireTime</code>.</p>
	 *
	 * @param expireTime a {@link java.util.Date} object.
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	/**
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireTime() {
		return this.expireTime;
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
	 * <p>Setter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @param merchantOrderNo a {@link java.lang.String} object.
	 */
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	/**
	 * <p>Getter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	/**
	 * <p>Setter for the field <code>payConfirm</code>.</p>
	 *
	 * @param payConfirm a {@link java.lang.String} object.
	 */
	public void setPayConfirm(String payConfirm) {
		this.payConfirm = payConfirm;
	}
	/**
	 * <p>Getter for the field <code>payConfirm</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayConfirm() {
		return this.payConfirm;
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
		return "alipay.micropay.order.freeze";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("amount", this.amount);
		txtParams.put("expire_time", this.expireTime);
		txtParams.put("memo", this.memo);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("pay_confirm", this.payConfirm);
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
	public Class<AlipayMicropayOrderFreezeResponse> getResponseClass() {
		return AlipayMicropayOrderFreezeResponse.class;
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
