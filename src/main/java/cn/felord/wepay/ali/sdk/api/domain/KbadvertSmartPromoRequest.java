package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 智能营销推荐信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbadvertSmartPromoRequest extends AlipayObject {

	private static final long serialVersionUID = 2673553488732598479L;

	/**
	 * 智能营销分组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 智能营销方案ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * <p>Getter for the field <code>groupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupId() {
		return this.groupId;
	}
	/**
	 * <p>Setter for the field <code>groupId</code>.</p>
	 *
	 * @param groupId a {@link java.lang.String} object.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * <p>Getter for the field <code>planId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPlanId() {
		return this.planId;
	}
	/**
	 * <p>Setter for the field <code>planId</code>.</p>
	 *
	 * @param planId a {@link java.lang.String} object.
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
