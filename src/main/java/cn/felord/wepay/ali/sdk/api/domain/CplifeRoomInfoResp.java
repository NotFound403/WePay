package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物业社区平台房屋信息Mapping关系.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CplifeRoomInfoResp extends AlipayObject {

	private static final long serialVersionUID = 6264969541891657644L;

	/**
	 * 商户系统小区房屋唯一ID标示.
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 支付宝系统房间唯一标示.
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * <p>Getter for the field <code>outRoomId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRoomId() {
		return this.outRoomId;
	}
	/**
	 * <p>Setter for the field <code>outRoomId</code>.</p>
	 *
	 * @param outRoomId a {@link java.lang.String} object.
	 */
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	/**
	 * <p>Getter for the field <code>roomId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoomId() {
		return this.roomId;
	}
	/**
	 * <p>Setter for the field <code>roomId</code>.</p>
	 *
	 * @param roomId a {@link java.lang.String} object.
	 */
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}
