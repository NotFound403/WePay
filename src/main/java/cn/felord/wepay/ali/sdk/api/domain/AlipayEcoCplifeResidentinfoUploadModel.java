package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 物业小区业主信息上传
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeResidentinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7418582115331592432L;

	/**
	 * 请求流水号，由商户自定义，在商户系统内唯一标示一次业务请求。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 请求上传的住户信息列表，单次至多上传200条住户信息.
	 */
	@ApiListField("resident_info")
	@ApiField("cplife_resident_info")
	private List<CplifeResidentInfo> residentInfo;

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
	 * <p>Getter for the field <code>residentInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CplifeResidentInfo> getResidentInfo() {
		return this.residentInfo;
	}
	/**
	 * <p>Setter for the field <code>residentInfo</code>.</p>
	 *
	 * @param residentInfo a {@link java.util.List} object.
	 */
	public void setResidentInfo(List<CplifeResidentInfo> residentInfo) {
		this.residentInfo = residentInfo;
	}

}
