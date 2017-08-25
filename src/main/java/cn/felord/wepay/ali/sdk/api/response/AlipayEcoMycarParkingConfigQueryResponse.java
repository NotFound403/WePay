package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.InterfaceInfoList;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.config.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4258659529397299926L;

	/** 
	 * 签约支付宝账号，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 业务接口列表数据
Json格式数据
	 */
	@ApiField("interface_info_list")
	private InterfaceInfoList interfaceInfoList;

	/** 
	 * 商户在停车平台首页露出的LOGO链接地址，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)调用自动生成该链接
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 商户简称，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户客服电话，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	/**
	 * <p>Setter for the field <code>accountNo</code>.</p>
	 *
	 * @param accountNo a {@link java.lang.String} object.
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * <p>Getter for the field <code>accountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountNo( ) {
		return this.accountNo;
	}

	/**
	 * <p>Setter for the field <code>interfaceInfoList</code>.</p>
	 *
	 * @param interfaceInfoList a {@link cn.felord.wepay.ali.sdk.api.domain.InterfaceInfoList} object.
	 */
	public void setInterfaceInfoList(InterfaceInfoList interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}
	/**
	 * <p>Getter for the field <code>interfaceInfoList</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InterfaceInfoList} object.
	 */
	public InterfaceInfoList getInterfaceInfoList( ) {
		return this.interfaceInfoList;
	}

	/**
	 * <p>Setter for the field <code>merchantLogo</code>.</p>
	 *
	 * @param merchantLogo a {@link java.lang.String} object.
	 */
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	/**
	 * <p>Getter for the field <code>merchantLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantLogo( ) {
		return this.merchantLogo;
	}

	/**
	 * <p>Setter for the field <code>merchantName</code>.</p>
	 *
	 * @param merchantName a {@link java.lang.String} object.
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	/**
	 * <p>Getter for the field <code>merchantName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantName( ) {
		return this.merchantName;
	}

	/**
	 * <p>Setter for the field <code>merchantServicePhone</code>.</p>
	 *
	 * @param merchantServicePhone a {@link java.lang.String} object.
	 */
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}
	/**
	 * <p>Getter for the field <code>merchantServicePhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantServicePhone( ) {
		return this.merchantServicePhone;
	}

}
