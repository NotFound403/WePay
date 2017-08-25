package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CplifeRoomInfoResp;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.roominfo.upload response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>communityId</code>.</p>
	 *
	 * @param communityId a {@link java.lang.String} object.
	 */
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	/**
	 * <p>Getter for the field <code>communityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityId( ) {
		return this.communityId;
	}

	/**
	 * <p>Setter for the field <code>roomInfoSet</code>.</p>
	 *
	 * @param roomInfoSet a {@link java.util.List} object.
	 */
	public void setRoomInfoSet(List<CplifeRoomInfoResp> roomInfoSet) {
		this.roomInfoSet = roomInfoSet;
	}
	/**
	 * <p>Getter for the field <code>roomInfoSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CplifeRoomInfoResp> getRoomInfoSet( ) {
		return this.roomInfoSet;
	}

}
