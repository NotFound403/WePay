package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 停车ISV系统配置接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingConfigSetModel extends AlipayObject {

	private static final long serialVersionUID = 5632551688183113917L;

	/**
	 * 签约支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
	 */
	@ApiListField("interface_info_list")
	@ApiField("interface_info_list")
	private List<InterfaceInfoList> interfaceInfoList;

	/**
	 * 商户在停车平台首页露出的LOGO；注意：该图片为PNG格式内容为BASE64的字符串，若为空则停车平台首页将不露出商户LOGO。建议图片尺寸27px*27px，大小不要超过60K
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户简称，由开发者提供
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户客服电话
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	/**
	 * <p>Getter for the field <code>accountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountNo() {
		return this.accountNo;
	}
	/**
	 * <p>Setter for the field <code>accountNo</code>.</p>
	 *
	 * @param accountNo a {@link java.lang.String} object.
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * <p>Getter for the field <code>interfaceInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InterfaceInfoList> getInterfaceInfoList() {
		return this.interfaceInfoList;
	}
	/**
	 * <p>Setter for the field <code>interfaceInfoList</code>.</p>
	 *
	 * @param interfaceInfoList a {@link java.util.List} object.
	 */
	public void setInterfaceInfoList(List<InterfaceInfoList> interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}

	/**
	 * <p>Getter for the field <code>merchantLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantLogo() {
		return this.merchantLogo;
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
	 * <p>Getter for the field <code>merchantName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantName() {
		return this.merchantName;
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
	 * <p>Getter for the field <code>merchantServicePhone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantServicePhone() {
		return this.merchantServicePhone;
	}
	/**
	 * <p>Setter for the field <code>merchantServicePhone</code>.</p>
	 *
	 * @param merchantServicePhone a {@link java.lang.String} object.
	 */
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}

}
