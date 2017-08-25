package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 通用的活跃高价值用户等级，支持EMAIL,PHONE,BANKCARD,CERTNO,IMEI,MAC，TBID维度查询用户活跃高价值等级。等级从Z0-Z7，等级越高价值越高，Z0表示未实名认证或者用户信息不全。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceUserlevelZrankGetModel extends AlipayObject {

	private static final long serialVersionUID = 8788839318246695975L;

	/**
	 * type对应的账号：如手机号-13815869530
	 */
	@ApiField("id")
	private String id;

	/**
	 * 暂时支持：EMAIL(邮箱),PHONE(手机号),BANKCARD（银行卡）,CERTNO（身份证）,IMEI（设备唯一码）,MAC（mac地址）,TBID（淘宝id）
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
