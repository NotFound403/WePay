package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分佣任务推广接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionMissionPromoteModel extends AlipayObject {

	private static final long serialVersionUID = 2819414665256722889L;

	/**
	 * 推广主键
identify_type=mission-值必须是任务ID
identify_type=voucher-值必须是券ID
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 推广主键类型
mission-任务
voucher-券
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 指定推广活动的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>identify</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentify() {
		return this.identify;
	}
	/**
	 * <p>Setter for the field <code>identify</code>.</p>
	 *
	 * @param identify a {@link java.lang.String} object.
	 */
	public void setIdentify(String identify) {
		this.identify = identify;
	}

	/**
	 * <p>Getter for the field <code>identifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentifyType() {
		return this.identifyType;
	}
	/**
	 * <p>Setter for the field <code>identifyType</code>.</p>
	 *
	 * @param identifyType a {@link java.lang.String} object.
	 */
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
