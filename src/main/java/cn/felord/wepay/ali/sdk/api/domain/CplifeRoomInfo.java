package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物业社区平台小区房屋信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CplifeRoomInfo extends AlipayObject {

	private static final long serialVersionUID = 8642998364979197459L;

	/**
	 * 房间的完整门牌地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 房屋所在楼栋名称。例如“1栋”，“1幢”等
	 */
	@ApiField("building")
	private String building;

	/**
	 * 房屋所在的组团名称。例如“一期”，“东区”，“香桂苑”等
	 */
	@ApiField("group")
	private String group;

	/**
	 * 商户系统小区房屋唯一ID标示.
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 房屋所在房号。例如“1101室”，“11B室”等
	 */
	@ApiField("room")
	private String room;

	/**
	 * 房屋所在单元名称。例如“一单元”，“二单元”等
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <p>Getter for the field <code>building</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuilding() {
		return this.building;
	}
	/**
	 * <p>Setter for the field <code>building</code>.</p>
	 *
	 * @param building a {@link java.lang.String} object.
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * <p>Getter for the field <code>group</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroup() {
		return this.group;
	}
	/**
	 * <p>Setter for the field <code>group</code>.</p>
	 *
	 * @param group a {@link java.lang.String} object.
	 */
	public void setGroup(String group) {
		this.group = group;
	}

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
	 * <p>Getter for the field <code>room</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoom() {
		return this.room;
	}
	/**
	 * <p>Setter for the field <code>room</code>.</p>
	 *
	 * @param room a {@link java.lang.String} object.
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * <p>Getter for the field <code>unit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUnit() {
		return this.unit;
	}
	/**
	 * <p>Setter for the field <code>unit</code>.</p>
	 *
	 * @param unit a {@link java.lang.String} object.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
