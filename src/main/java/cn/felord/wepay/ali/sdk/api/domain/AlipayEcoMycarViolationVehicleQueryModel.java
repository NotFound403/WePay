package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISV获取用户违章车辆信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarViolationVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7387675895824595181L;

	/**
	 * 用户车辆ID,支付宝系统唯一
	 */
	@ApiField("vi_id")
	private String viId;

	/**
	 * <p>Getter for the field <code>viId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getViId() {
		return this.viId;
	}
	/**
	 * <p>Setter for the field <code>viId</code>.</p>
	 *
	 * @param viId a {@link java.lang.String} object.
	 */
	public void setViId(String viId) {
		this.viId = viId;
	}

}
