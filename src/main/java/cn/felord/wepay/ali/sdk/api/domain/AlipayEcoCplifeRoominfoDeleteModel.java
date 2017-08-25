package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 删除物业小区房屋信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeRoominfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5324288146739978491L;

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
	 * 待删除的商户房间列表，一次API调用至多传入200条待删除的房间ID(房间在商户系统的唯一ID标识)
	 */
	@ApiListField("out_room_id_set")
	@ApiField("string")
	private List<String> outRoomIdSet;

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
	 * <p>Getter for the field <code>outRoomIdSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getOutRoomIdSet() {
		return this.outRoomIdSet;
	}
	/**
	 * <p>Setter for the field <code>outRoomIdSet</code>.</p>
	 *
	 * @param outRoomIdSet a {@link java.util.List} object.
	 */
	public void setOutRoomIdSet(List<String> outRoomIdSet) {
		this.outRoomIdSet = outRoomIdSet;
	}

}
