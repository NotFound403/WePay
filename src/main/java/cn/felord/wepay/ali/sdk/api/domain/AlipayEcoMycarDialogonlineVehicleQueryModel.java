package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取用户车辆信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDialogonlineVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5752659894696866214L;

	/**
	 * 车辆ID
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
