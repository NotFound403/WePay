package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CplifeRoomDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.roominfo.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeRoominfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7351951128267161794L;

	/** 
	 * 符合条件的小区房屋信息列表.
	 */
	@ApiListField("room_info")
	@ApiField("cplife_room_detail")
	private List<CplifeRoomDetail> roomInfo;

	/** 
	 * 该小区下已上传的房间总数
	 */
	@ApiField("total_room_number")
	private Long totalRoomNumber;

	/**
	 * <p>Setter for the field <code>roomInfo</code>.</p>
	 *
	 * @param roomInfo a {@link java.util.List} object.
	 */
	public void setRoomInfo(List<CplifeRoomDetail> roomInfo) {
		this.roomInfo = roomInfo;
	}
	/**
	 * <p>Getter for the field <code>roomInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CplifeRoomDetail> getRoomInfo( ) {
		return this.roomInfo;
	}

	/**
	 * <p>Setter for the field <code>totalRoomNumber</code>.</p>
	 *
	 * @param totalRoomNumber a {@link java.lang.Long} object.
	 */
	public void setTotalRoomNumber(Long totalRoomNumber) {
		this.totalRoomNumber = totalRoomNumber;
	}
	/**
	 * <p>Getter for the field <code>totalRoomNumber</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalRoomNumber( ) {
		return this.totalRoomNumber;
	}

}
