package cn.felord.wepay.ali.sdk.api.request;

import java.util.Date;
import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayPointOrderAddResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.point.order.add request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPointOrderAddRequest implements AlipayRequest<AlipayPointOrderAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 向用户展示集分宝发放备注
	 */
	private String memo;

	/** 
	* isv提供的发放订单号，由数字和字母组成，最大长度为32位，需要保证每笔订单发放的唯一性，支付宝对该参数做唯一性校验。如果订单号已存在，支付宝将返回订单号已经存在的错误
	 */
	private String merchantOrderNo;

	/** 
	* 发放集分宝时间
	 */
	private Date orderTime;

	/** 
	* 发放集分宝的数量
	 */
	private Long pointCount;

	/** 
	* 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户
	 */
	private String userSymbol;

	/** 
	* 用户标识符类型，现在支持ALIPAY_USER_ID:表示支付宝用户ID,ALIPAY_LOGON_ID:表示支付宝登陆号
	 */
	private String userSymbolType;

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
	 * <p>Setter for the field <code>orderTime</code>.</p>
	 *
	 * @param orderTime a {@link java.util.Date} object.
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	/**
	 * <p>Getter for the field <code>orderTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getOrderTime() {
		return this.orderTime;
	}

	/**
	 * <p>Setter for the field <code>pointCount</code>.</p>
	 *
	 * @param pointCount a {@link java.lang.Long} object.
	 */
	public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}
	/**
	 * <p>Getter for the field <code>pointCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPointCount() {
		return this.pointCount;
	}

	/**
	 * <p>Setter for the field <code>userSymbol</code>.</p>
	 *
	 * @param userSymbol a {@link java.lang.String} object.
	 */
	public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}
	/**
	 * <p>Getter for the field <code>userSymbol</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserSymbol() {
		return this.userSymbol;
	}

	/**
	 * <p>Setter for the field <code>userSymbolType</code>.</p>
	 *
	 * @param userSymbolType a {@link java.lang.String} object.
	 */
	public void setUserSymbolType(String userSymbolType) {
		this.userSymbolType = userSymbolType;
	}
	/**
	 * <p>Getter for the field <code>userSymbolType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserSymbolType() {
		return this.userSymbolType;
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
		return "alipay.point.order.add";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("memo", this.memo);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("order_time", this.orderTime);
		txtParams.put("point_count", this.pointCount);
		txtParams.put("user_symbol", this.userSymbol);
		txtParams.put("user_symbol_type", this.userSymbolType);
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
	public Class<AlipayPointOrderAddResponse> getResponseClass() {
		return AlipayPointOrderAddResponse.class;
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
