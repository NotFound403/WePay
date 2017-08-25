package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 上传物业小区内部房屋信息.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeRoominfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6188121725155484946L;

	/**
	 * 请求批次号，由商户自定义，在商户系统内唯一标示一次业务请求。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 待上传的房屋信息列表，单次上传不超过200条.
	 */
	@ApiListField("room_info_set")
	@ApiField("cplife_room_info")
	private List<CplifeRoomInfo> roomInfoSet;

	/**
	 * <p>Getter for the field <code>batchId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchId() {
		return this.batchId;
	}
	/**
	 * <p>Setter for the field <code>batchId</code>.</p>
	 *
	 * @param batchId a {@link java.lang.String} object.
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	/**
	 * <p>Getter for the field <code>communityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityId() {
		return this.communityId;
	}
	/**
	 * <p>Setter for the field <code>communityId</code>.</p>
	 *
	 * @param communityId a {@link java.lang.String} object.
	 */
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	/**
	 * <p>Getter for the field <code>roomInfoSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CplifeRoomInfo> getRoomInfoSet() {
		return this.roomInfoSet;
	}
	/**
	 * <p>Setter for the field <code>roomInfoSet</code>.</p>
	 *
	 * @param roomInfoSet a {@link java.util.List} object.
	 */
	public void setRoomInfoSet(List<CplifeRoomInfo> roomInfoSet) {
		this.roomInfoSet = roomInfoSet;
	}

}
