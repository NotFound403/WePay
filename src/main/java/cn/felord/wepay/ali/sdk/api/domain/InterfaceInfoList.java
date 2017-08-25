package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InterfaceInfoList extends AlipayObject {

	private static final long serialVersionUID = 8892742887786176314L;

	/**
	 * 传入参数固定值:alipay.eco.mycar.parking.userpage.query
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 传入参数固定值:interface_page
	 */
	@ApiField("interface_type")
	private String interfaceType;

	/**
	 * SPI接口的调用地址url，协议必须为https，对整个url字符串必须进行UrlEncode编码。编码为UTF-8
	 */
	@ApiField("interface_url")
	private String interfaceUrl;

	/**
	 * <p>Getter for the field <code>interfaceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterfaceName() {
		return this.interfaceName;
	}
	/**
	 * <p>Setter for the field <code>interfaceName</code>.</p>
	 *
	 * @param interfaceName a {@link java.lang.String} object.
	 */
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	/**
	 * <p>Getter for the field <code>interfaceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterfaceType() {
		return this.interfaceType;
	}
	/**
	 * <p>Setter for the field <code>interfaceType</code>.</p>
	 *
	 * @param interfaceType a {@link java.lang.String} object.
	 */
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * <p>Getter for the field <code>interfaceUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterfaceUrl() {
		return this.interfaceUrl;
	}
	/**
	 * <p>Setter for the field <code>interfaceUrl</code>.</p>
	 *
	 * @param interfaceUrl a {@link java.lang.String} object.
	 */
	public void setInterfaceUrl(String interfaceUrl) {
		this.interfaceUrl = interfaceUrl;
	}

}
