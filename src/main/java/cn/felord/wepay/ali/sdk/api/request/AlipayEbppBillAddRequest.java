package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEbppBillAddResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.bill.add request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppBillAddRequest implements AlipayRequest<AlipayEbppBillAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 外部订单号
	 */
	private String bankBillNo;

	/** 
	* 账单的账期，例如201203表示2012年3月的账单。
	 */
	private String billDate;

	/** 
	* 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	private String billKey;

	/** 
	* 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	private String chargeInst;

	/** 
	* 扩展属性
	 */
	private String extendField;

	/** 
	* 输出机构的业务流水号，需要保证唯一性
	 */
	private String merchantOrderNo;

	/** 
	* 用户的手机号
	 */
	private String mobile;

	/** 
	* 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	private String orderType;

	/** 
	* 拥有该账单的用户姓名
	 */
	private String ownerName;

	/** 
	* 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	private String payAmount;

	/** 
	* 账单的服务费。
	 */
	private String serviceAmount;

	/** 
	* 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	private String subOrderType;

	/** 
	* 交通违章地点，sub_order_type=TRAFFIC时填写。
	 */
	private String trafficLocation;

	/** 
	* 违章行为，sub_order_type=TRAFFIC时填写。
	 */
	private String trafficRegulations;

	/**
	 * <p>Setter for the field <code>bankBillNo</code>.</p>
	 *
	 * @param bankBillNo a {@link java.lang.String} object.
	 */
	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}
	/**
	 * <p>Getter for the field <code>bankBillNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankBillNo() {
		return this.bankBillNo;
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
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * <p>Setter for the field <code>orderType</code>.</p>
	 *
	 * @param orderType a {@link java.lang.String} object.
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * <p>Getter for the field <code>orderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderType() {
		return this.orderType;
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
	 * <p>Setter for the field <code>serviceAmount</code>.</p>
	 *
	 * @param serviceAmount a {@link java.lang.String} object.
	 */
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	/**
	 * <p>Getter for the field <code>serviceAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceAmount() {
		return this.serviceAmount;
	}

	/**
	 * <p>Setter for the field <code>subOrderType</code>.</p>
	 *
	 * @param subOrderType a {@link java.lang.String} object.
	 */
	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}
	/**
	 * <p>Getter for the field <code>subOrderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubOrderType() {
		return this.subOrderType;
	}

	/**
	 * <p>Setter for the field <code>trafficLocation</code>.</p>
	 *
	 * @param trafficLocation a {@link java.lang.String} object.
	 */
	public void setTrafficLocation(String trafficLocation) {
		this.trafficLocation = trafficLocation;
	}
	/**
	 * <p>Getter for the field <code>trafficLocation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTrafficLocation() {
		return this.trafficLocation;
	}

	/**
	 * <p>Setter for the field <code>trafficRegulations</code>.</p>
	 *
	 * @param trafficRegulations a {@link java.lang.String} object.
	 */
	public void setTrafficRegulations(String trafficRegulations) {
		this.trafficRegulations = trafficRegulations;
	}
	/**
	 * <p>Getter for the field <code>trafficRegulations</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTrafficRegulations() {
		return this.trafficRegulations;
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
		return "alipay.ebpp.bill.add";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bank_bill_no", this.bankBillNo);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("mobile", this.mobile);
		txtParams.put("order_type", this.orderType);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_amount", this.payAmount);
		txtParams.put("service_amount", this.serviceAmount);
		txtParams.put("sub_order_type", this.subOrderType);
		txtParams.put("traffic_location", this.trafficLocation);
		txtParams.put("traffic_regulations", this.trafficRegulations);
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
	public Class<AlipayEbppBillAddResponse> getResponseClass() {
		return AlipayEbppBillAddResponse.class;
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
