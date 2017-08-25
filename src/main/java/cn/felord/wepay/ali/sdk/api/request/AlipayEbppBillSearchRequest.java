package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayEbppBillSearchResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.bill.search request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppBillSearchRequest implements AlipayRequest<AlipayEbppBillSearchResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 账单流水
	 */
	private String billKey;

	/** 
	* 出账机构
	 */
	private String chargeInst;

	/** 
	* 销账机构
	 */
	private String chargeoffInst;

	/** 
	* 销账机构给出账机构分配的id
	 */
	private String companyId;

	/** 
	* 必须以key value形式定义，转为json为格式：{"key1":"value1","key2":"value2","key3":"value3","key4":"value4"}
 后端会直接转换为MAP对象，转换异常会报参数格式错误
	 */
	private String extend;

	/** 
	* 业务类型
	 */
	private String orderType;

	/** 
	* 子业务类型
	 */
	private String subOrderType;

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
	 * <p>Setter for the field <code>chargeoffInst</code>.</p>
	 *
	 * @param chargeoffInst a {@link java.lang.String} object.
	 */
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}
	/**
	 * <p>Getter for the field <code>chargeoffInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeoffInst() {
		return this.chargeoffInst;
	}

	/**
	 * <p>Setter for the field <code>companyId</code>.</p>
	 *
	 * @param companyId a {@link java.lang.String} object.
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * <p>Getter for the field <code>companyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyId() {
		return this.companyId;
	}

	/**
	 * <p>Setter for the field <code>extend</code>.</p>
	 *
	 * @param extend a {@link java.lang.String} object.
	 */
	public void setExtend(String extend) {
		this.extend = extend;
	}
	/**
	 * <p>Getter for the field <code>extend</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtend() {
		return this.extend;
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
		return "alipay.ebpp.bill.search";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bill_key", this.billKey);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("chargeoff_inst", this.chargeoffInst);
		txtParams.put("company_id", this.companyId);
		txtParams.put("extend", this.extend);
		txtParams.put("order_type", this.orderType);
		txtParams.put("sub_order_type", this.subOrderType);
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
	public Class<AlipayEbppBillSearchResponse> getResponseClass() {
		return AlipayEbppBillSearchResponse.class;
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
