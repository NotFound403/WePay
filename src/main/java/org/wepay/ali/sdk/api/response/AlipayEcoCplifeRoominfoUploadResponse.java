package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.CplifeRoomInfoResp;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.roominfo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-24 11:43:11
 */
public class AlipayEcoCplifeRoominfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3775825466594156922L;

	/** 
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/** 
	 * 已经成功上传的房屋信息列表.
	 */
	@ApiListField("room_info_set")
	@ApiField("cplife_room_info_resp")
	private List<CplifeRoomInfoResp> roomInfoSet;

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityId( ) {
		return this.communityId;
	}

	public void setRoomInfoSet(List<CplifeRoomInfoResp> roomInfoSet) {
		this.roomInfoSet = roomInfoSet;
	}
	public List<CplifeRoomInfoResp> getRoomInfoSet( ) {
		return this.roomInfoSet;
	}

}
