package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 同步评论接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataserviceMaintainvehicleShareModel extends AlipayObject {

	private static final long serialVersionUID = 8447398748374678474L;

	/**
	 * 车辆ID
	 */
	@ApiField("vid")
	private String vid;

	/**
	 * <p>Getter for the field <code>vid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVid() {
		return this.vid;
	}
	/**
	 * <p>Setter for the field <code>vid</code>.</p>
	 *
	 * @param vid a {@link java.lang.String} object.
	 */
	public void setVid(String vid) {
		this.vid = vid;
	}

}
