package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 机具解绑按照条件分页查询返回对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EquipmentAuthRemoveQueryBypageDTO extends AlipayObject {

	private static final long serialVersionUID = 5522341566395388727L;

	/**
	 * 机具编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 解绑时间
	 */
	@ApiField("unbind_time")
	private String unbindTime;

	/**
	 * <p>Getter for the field <code>deviceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeviceId() {
		return this.deviceId;
	}
	/**
	 * <p>Setter for the field <code>deviceId</code>.</p>
	 *
	 * @param deviceId a {@link java.lang.String} object.
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * <p>Getter for the field <code>unbindTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnbindTime() {
		return this.unbindTime;
	}
	/**
	 * <p>Setter for the field <code>unbindTime</code>.</p>
	 *
	 * @param unbindTime a {@link java.lang.String} object.
	 */
	public void setUnbindTime(String unbindTime) {
		this.unbindTime = unbindTime;
	}

}
