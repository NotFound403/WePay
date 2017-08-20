package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 上传物业小区内部房屋信息.
 *
 * @author auto create
 * @since 1.0, 2017-03-24 11:43:11
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

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<CplifeRoomInfo> getRoomInfoSet() {
		return this.roomInfoSet;
	}
	public void setRoomInfoSet(List<CplifeRoomInfo> roomInfoSet) {
		this.roomInfoSet = roomInfoSet;
	}

}
