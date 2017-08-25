package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayMemberCouponQuerylistResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.member.coupon.querylist request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMemberCouponQuerylistRequest implements AlipayRequest<AlipayMemberCouponQuerylistResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 红包发放者商户信息，json格式。商户可以传自己的PID，平台商可以传其它商户的PID用于查询指定商户的信息
目前仅支持如下key：
  unique：商户唯一标识
  unique_type：支持以下1种取值。
PID：商户所在平台商的partner id[唯一]
	 */
	private String merchantInfo;

	/** 
	* 翻页页码：翻页查询时使用，表明当前要查询第几页，若page_size为0，则此字段不生效
	 */
	private String pageNo;

	/** 
	* 翻页每页条数：翻页查询时使用，表明每页返回的记录数量，范围为1至20；为空或者为0时表示不使用翻页查询，返回所有数量
	 */
	private String pageSize;

	/** 
	* 优惠券状态列表，如果指定则只返回指定状态的优惠券.
目前状态主要有以下几种：
VALID：可使用
WRITED_OFF：已核销,
EXPIRED：已过期
CLOSED：已关闭 
注意：
多个状态以逗号隔开
	 */
	private String status;

	/** 
	* 劵所有者买家用户信息，必须是支付宝的用户，json格式。
目前仅支持如下key：
  unique：用户唯一标识
  unique_type：支持以下1种取值。
UID：用户支付宝账户的唯一ID
OPENID：用户支付宝账户在某商户下的唯一ID
	 */
	private String userInfo;

	/**
	 * <p>Setter for the field <code>merchantInfo</code>.</p>
	 *
	 * @param merchantInfo a {@link java.lang.String} object.
	 */
	public void setMerchantInfo(String merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	/**
	 * <p>Getter for the field <code>merchantInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantInfo() {
		return this.merchantInfo;
	}

	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.String} object.
	 */
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNo() {
		return this.pageNo;
	}

	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * <p>Setter for the field <code>userInfo</code>.</p>
	 *
	 * @param userInfo a {@link java.lang.String} object.
	 */
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	/**
	 * <p>Getter for the field <code>userInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserInfo() {
		return this.userInfo;
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
		return "alipay.member.coupon.querylist";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("merchant_info", this.merchantInfo);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("status", this.status);
		txtParams.put("user_info", this.userInfo);
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
	public Class<AlipayMemberCouponQuerylistResponse> getResponseClass() {
		return AlipayMemberCouponQuerylistResponse.class;
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
