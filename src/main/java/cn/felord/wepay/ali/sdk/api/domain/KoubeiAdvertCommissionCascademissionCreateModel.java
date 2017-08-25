package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑客级联分佣任务创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionCascademissionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6512877119949625195L;

	/**
	 * 子任务的分佣配置
	 */
	@ApiListField("cascade_mission_conf")
	@ApiField("cascade_mission_conf_model")
	private List<CascadeMissionConfModel> cascadeMissionConf;

	/**
	 * 根据identify_type指定的值
misison时，为需要设置子任务的分佣任务ID
voucher时，为需要券ID
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
mission：已经领取的任务，需要在该任务下发布子任务的ID
voucher：任务对应的券ID
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>cascadeMissionConf</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CascadeMissionConfModel> getCascadeMissionConf() {
		return this.cascadeMissionConf;
	}
	/**
	 * <p>Setter for the field <code>cascadeMissionConf</code>.</p>
	 *
	 * @param cascadeMissionConf a {@link java.util.List} object.
	 */
	public void setCascadeMissionConf(List<CascadeMissionConfModel> cascadeMissionConf) {
		this.cascadeMissionConf = cascadeMissionConf;
	}

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
