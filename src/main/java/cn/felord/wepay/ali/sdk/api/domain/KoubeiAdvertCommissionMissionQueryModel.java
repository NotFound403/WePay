package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 标的分佣查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionMissionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4862689157651787731L;

	/**
	 * 主键ID
	 */
	@ApiListField("identify_list")
	@ApiField("string")
	private List<String> identifyList;

	/**
	 * 主键类型
activity_id：运营活动ID
voucher：商品ID
mission：分佣任务ID
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * <p>Getter for the field <code>identifyList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getIdentifyList() {
		return this.identifyList;
	}
	/**
	 * <p>Setter for the field <code>identifyList</code>.</p>
	 *
	 * @param identifyList a {@link java.util.List} object.
	 */
	public void setIdentifyList(List<String> identifyList) {
		this.identifyList = identifyList;
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

}
