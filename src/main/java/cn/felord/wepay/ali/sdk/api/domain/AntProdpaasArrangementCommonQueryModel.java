package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约通用查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntProdpaasArrangementCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5781448382518962367L;

	/**
	 * 合约基本信息选择器，根据产品编码，合约状态编码来过滤合约
	 */
	@ApiField("arrangement_base_selector")
	private ArrangementBaseSelector arrangementBaseSelector;

	/**
	 * 合约条件组选择器，筛选合约条件
	 */
	@ApiField("arrangement_condition_group_selector")
	private ArrangementConditionGroupSelector arrangementConditionGroupSelector;

	/**
	 * 合约参与者选择器，根据参与者查询合约编号,与合约号选择器二选一
	 */
	@ApiField("arrangement_involved_party_querier")
	private ArrangementInvolvedPartyQuerier arrangementInvolvedPartyQuerier;

	/**
	 * 合约号查询器，与参与者查询器二选一
	 */
	@ApiField("arrangement_no_querier")
	private ArrangementNoQuerier arrangementNoQuerier;

	/**
	 * <p>Getter for the field <code>arrangementBaseSelector</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementBaseSelector} object.
	 */
	public ArrangementBaseSelector getArrangementBaseSelector() {
		return this.arrangementBaseSelector;
	}
	/**
	 * <p>Setter for the field <code>arrangementBaseSelector</code>.</p>
	 *
	 * @param arrangementBaseSelector a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementBaseSelector} object.
	 */
	public void setArrangementBaseSelector(ArrangementBaseSelector arrangementBaseSelector) {
		this.arrangementBaseSelector = arrangementBaseSelector;
	}

	/**
	 * <p>Getter for the field <code>arrangementConditionGroupSelector</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementConditionGroupSelector} object.
	 */
	public ArrangementConditionGroupSelector getArrangementConditionGroupSelector() {
		return this.arrangementConditionGroupSelector;
	}
	/**
	 * <p>Setter for the field <code>arrangementConditionGroupSelector</code>.</p>
	 *
	 * @param arrangementConditionGroupSelector a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementConditionGroupSelector} object.
	 */
	public void setArrangementConditionGroupSelector(ArrangementConditionGroupSelector arrangementConditionGroupSelector) {
		this.arrangementConditionGroupSelector = arrangementConditionGroupSelector;
	}

	/**
	 * <p>Getter for the field <code>arrangementInvolvedPartyQuerier</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementInvolvedPartyQuerier} object.
	 */
	public ArrangementInvolvedPartyQuerier getArrangementInvolvedPartyQuerier() {
		return this.arrangementInvolvedPartyQuerier;
	}
	/**
	 * <p>Setter for the field <code>arrangementInvolvedPartyQuerier</code>.</p>
	 *
	 * @param arrangementInvolvedPartyQuerier a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementInvolvedPartyQuerier} object.
	 */
	public void setArrangementInvolvedPartyQuerier(ArrangementInvolvedPartyQuerier arrangementInvolvedPartyQuerier) {
		this.arrangementInvolvedPartyQuerier = arrangementInvolvedPartyQuerier;
	}

	/**
	 * <p>Getter for the field <code>arrangementNoQuerier</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementNoQuerier} object.
	 */
	public ArrangementNoQuerier getArrangementNoQuerier() {
		return this.arrangementNoQuerier;
	}
	/**
	 * <p>Setter for the field <code>arrangementNoQuerier</code>.</p>
	 *
	 * @param arrangementNoQuerier a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementNoQuerier} object.
	 */
	public void setArrangementNoQuerier(ArrangementNoQuerier arrangementNoQuerier) {
		this.arrangementNoQuerier = arrangementNoQuerier;
	}

}
