package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝建群
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseGroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4329476127342556624L;

	/**
	 * 业务方传入的唯一id，做为幂等使用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 群的业务类型，目前只能为0
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 建群时初始化的群设置
	 */
	@ApiField("group_settings")
	private GroupSetting groupSettings;

	/**
	 * 建群的时候，群主的userid
	 */
	@ApiField("master_id")
	private String masterId;

	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>groupSettings</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.GroupSetting} object.
	 */
	public GroupSetting getGroupSettings() {
		return this.groupSettings;
	}
	/**
	 * <p>Setter for the field <code>groupSettings</code>.</p>
	 *
	 * @param groupSettings a {@link cn.felord.wepay.ali.sdk.api.domain.GroupSetting} object.
	 */
	public void setGroupSettings(GroupSetting groupSettings) {
		this.groupSettings = groupSettings;
	}

	/**
	 * <p>Getter for the field <code>masterId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMasterId() {
		return this.masterId;
	}
	/**
	 * <p>Setter for the field <code>masterId</code>.</p>
	 *
	 * @param masterId a {@link java.lang.String} object.
	 */
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

}
