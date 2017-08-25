package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 修改已上传的物业费账单数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeBillModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8297128926369634964L;

	/**
	 * 待修改的物业费账单应收明细条目列表，一次最多修改1000条明细条目。如果明细条目已被支付或在支付中，则无法被修改。接口会返回无法修改的明细条目ID列表。
	 */
	@ApiListField("bill_entry_list")
	@ApiField("c_p_bill_modify_set")
	private List<CPBillModifySet> billEntryList;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * <p>Getter for the field <code>billEntryList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CPBillModifySet> getBillEntryList() {
		return this.billEntryList;
	}
	/**
	 * <p>Setter for the field <code>billEntryList</code>.</p>
	 *
	 * @param billEntryList a {@link java.util.List} object.
	 */
	public void setBillEntryList(List<CPBillModifySet> billEntryList) {
		this.billEntryList = billEntryList;
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

}
