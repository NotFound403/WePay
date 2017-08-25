package cn.felord.wepay.ali.sdk.api.request;

import java.util.Map;

import cn.felord.wepay.ali.sdk.api.AlipayRequest;
import cn.felord.wepay.ali.sdk.api.internal.util.AlipayHashMap;
import cn.felord.wepay.ali.sdk.api.response.AlipayAcquirePrecreateResponse;
import cn.felord.wepay.ali.sdk.api.AlipayObject;

/**
 * ALIPAY API: alipay.acquire.precreate request
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAcquirePrecreateRequest implements AlipayRequest<AlipayAcquirePrecreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body
	 */
	private String body;

	/** 
	* 描述多渠道收单的渠道明细信息，json格式
	 */
	private String channelParameters;

	/** 
	* 订单金额币种。目前只支持传入156（人民币）。
如果为空，则默认设置为156
	 */
	private String currency;

	/** 
	* 公用业务扩展信息。用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
比如可传递二维码支付场景下的门店ID等信息，以json格式传输。
	 */
	private String extendParams;

	/** 
	* 描述商品明细信息，json格式。
	 */
	private String goodsDetail;

	/** 
	* 订单支付超时时间。设置未付款交易的超时时间，一旦超时，该笔交易就会自动被关闭。
取值范围：1m～15d。
m-分钟，h-小时，d-天，1c-当天（无论交易何时创建，都在0点关闭）。
该参数数值不接受小数点，如1.5h，可转换为90m。
该功能需要联系支付宝配置关闭时间。
	 */
	private String itBPay;

	/** 
	* 操作员的类型：
0：支付宝操作员
1：商户的操作员
如果传入其它值或者为空，则默认设置为1
	 */
	private String operatorCode;

	/** 
	* 卖家的操作员ID
	 */
	private String operatorId;

	/** 
	* 支付宝合作商户网站唯一订单号
	 */
	private String outTradeNo;

	/** 
	* 订单中商品的单价。
如果请求时传入本参数，则必须满足total_fee=price×quantity的条件
	 */
	private String price;

	/** 
	* 订单中商品的数量。
如果请求时传入本参数，则必须满足total_fee=price×quantity的条件
	 */
	private String quantity;

	/** 
	* 分账信息。
描述分账明细信息，json格式
	 */
	private String royaltyParameters;

	/** 
	* 分账类型。卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）
	 */
	private String royaltyType;

	/** 
	* 卖家支付宝账号，可以为email或者手机号。如果seller_id不为空，则以seller_id的值作为卖家账号，忽略本参数
	 */
	private String sellerEmail;

	/** 
	* 卖家支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字。如果和seller_email同时为空，则本参数默认填充partner的值
	 */
	private String sellerId;

	/** 
	* 收银台页面上，商品展示的超链接
	 */
	private String showUrl;

	/** 
	* 商品购买
	 */
	private String subject;

	/** 
	* 订单金额。该笔订单的资金总额，取值范围[0.01,100000000]，精确到小数点后2位。
	 */
	private String totalFee;

	/**
	 * <p>Setter for the field <code>body</code>.</p>
	 *
	 * @param body a {@link java.lang.String} object.
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * <p>Getter for the field <code>body</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBody() {
		return this.body;
	}

	/**
	 * <p>Setter for the field <code>channelParameters</code>.</p>
	 *
	 * @param channelParameters a {@link java.lang.String} object.
	 */
	public void setChannelParameters(String channelParameters) {
		this.channelParameters = channelParameters;
	}
	/**
	 * <p>Getter for the field <code>channelParameters</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelParameters() {
		return this.channelParameters;
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
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}
	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}

	/**
	 * <p>Setter for the field <code>goodsDetail</code>.</p>
	 *
	 * @param goodsDetail a {@link java.lang.String} object.
	 */
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	/**
	 * <p>Getter for the field <code>goodsDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGoodsDetail() {
		return this.goodsDetail;
	}

	/**
	 * <p>Setter for the field <code>itBPay</code>.</p>
	 *
	 * @param itBPay a {@link java.lang.String} object.
	 */
	public void setItBPay(String itBPay) {
		this.itBPay = itBPay;
	}
	/**
	 * <p>Getter for the field <code>itBPay</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItBPay() {
		return this.itBPay;
	}

	/**
	 * <p>Setter for the field <code>operatorCode</code>.</p>
	 *
	 * @param operatorCode a {@link java.lang.String} object.
	 */
	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}
	/**
	 * <p>Getter for the field <code>operatorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorCode() {
		return this.operatorCode;
	}

	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}

	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.String} object.
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrice() {
		return this.price;
	}

	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a {@link java.lang.String} object.
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuantity() {
		return this.quantity;
	}

	/**
	 * <p>Setter for the field <code>royaltyParameters</code>.</p>
	 *
	 * @param royaltyParameters a {@link java.lang.String} object.
	 */
	public void setRoyaltyParameters(String royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}
	/**
	 * <p>Getter for the field <code>royaltyParameters</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoyaltyParameters() {
		return this.royaltyParameters;
	}

	/**
	 * <p>Setter for the field <code>royaltyType</code>.</p>
	 *
	 * @param royaltyType a {@link java.lang.String} object.
	 */
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}
	/**
	 * <p>Getter for the field <code>royaltyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoyaltyType() {
		return this.royaltyType;
	}

	/**
	 * <p>Setter for the field <code>sellerEmail</code>.</p>
	 *
	 * @param sellerEmail a {@link java.lang.String} object.
	 */
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	/**
	 * <p>Getter for the field <code>sellerEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerEmail() {
		return this.sellerEmail;
	}

	/**
	 * <p>Setter for the field <code>sellerId</code>.</p>
	 *
	 * @param sellerId a {@link java.lang.String} object.
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	/**
	 * <p>Getter for the field <code>sellerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerId() {
		return this.sellerId;
	}

	/**
	 * <p>Setter for the field <code>showUrl</code>.</p>
	 *
	 * @param showUrl a {@link java.lang.String} object.
	 */
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}
	/**
	 * <p>Getter for the field <code>showUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowUrl() {
		return this.showUrl;
	}

	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}

	/**
	 * <p>Setter for the field <code>totalFee</code>.</p>
	 *
	 * @param totalFee a {@link java.lang.String} object.
	 */
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	/**
	 * <p>Getter for the field <code>totalFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalFee() {
		return this.totalFee;
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
		return "alipay.acquire.precreate";
	}

	/**
	 * <p>getTextParams.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("body", this.body);
		txtParams.put("channel_parameters", this.channelParameters);
		txtParams.put("currency", this.currency);
		txtParams.put("extend_params", this.extendParams);
		txtParams.put("goods_detail", this.goodsDetail);
		txtParams.put("it_b_pay", this.itBPay);
		txtParams.put("operator_code", this.operatorCode);
		txtParams.put("operator_id", this.operatorId);
		txtParams.put("out_trade_no", this.outTradeNo);
		txtParams.put("price", this.price);
		txtParams.put("quantity", this.quantity);
		txtParams.put("royalty_parameters", this.royaltyParameters);
		txtParams.put("royalty_type", this.royaltyType);
		txtParams.put("seller_email", this.sellerEmail);
		txtParams.put("seller_id", this.sellerId);
		txtParams.put("show_url", this.showUrl);
		txtParams.put("subject", this.subject);
		txtParams.put("total_fee", this.totalFee);
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
	public Class<AlipayAcquirePrecreateResponse> getResponseClass() {
		return AlipayAcquirePrecreateResponse.class;
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
