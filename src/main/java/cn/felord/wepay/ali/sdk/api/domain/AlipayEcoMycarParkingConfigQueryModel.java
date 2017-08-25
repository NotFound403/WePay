package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISV系统配置查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4582822183957653495L;

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

}
