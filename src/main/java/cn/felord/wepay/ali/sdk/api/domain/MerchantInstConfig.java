package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户的机构配置信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantInstConfig extends AlipayObject {

	private static final long serialVersionUID = 6151723239544466153L;

	/**
	 * 机构短名称，既是合作机构的英文简称，用来标识该机构的唯一性；
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 支付宝定义的业务类型，JF表示公共事业缴费，HK表示信用卡还款具体见附录描述
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 业务场景；分为销帐(chargeoff)和输出(EXTERNAL)
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 合作机构中文名称，如HZCB，中文名称：杭州银行
	 */
	@ApiField("zh_name")
	private String zhName;

	/**
	 * <p>Getter for the field <code>enName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEnName() {
		return this.enName;
	}
	/**
	 * <p>Setter for the field <code>enName</code>.</p>
	 *
	 * @param enName a {@link java.lang.String} object.
	 */
	public void setEnName(String enName) {
		this.enName = enName;
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
	 * <p>Setter for the field <code>orderType</code>.</p>
	 *
	 * @param orderType a {@link java.lang.String} object.
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * <p>Getter for the field <code>scene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScene() {
		return this.scene;
	}
	/**
	 * <p>Setter for the field <code>scene</code>.</p>
	 *
	 * @param scene a {@link java.lang.String} object.
	 */
	public void setScene(String scene) {
		this.scene = scene;
	}

	/**
	 * <p>Getter for the field <code>zhName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getZhName() {
		return this.zhName;
	}
	/**
	 * <p>Setter for the field <code>zhName</code>.</p>
	 *
	 * @param zhName a {@link java.lang.String} object.
	 */
	public void setZhName(String zhName) {
		this.zhName = zhName;
	}

}
