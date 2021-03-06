package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 删除已上传的物业费账单数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeBillDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8734485538536775788L;

	/**
	 * 指定小区下待删除的物业费账单应收明细条目ID列表，一次最多删除1000条，如果明细条目已被支付或在支付中，则无法被删除。接口会返回无法删除的明细条目ID列表。
	 */
	@ApiListField("bill_entry_id_list")
	@ApiField("string")
	private List<String> billEntryIdList;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * <p>Getter for the field <code>billEntryIdList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBillEntryIdList() {
		return this.billEntryIdList;
	}
	/**
	 * <p>Setter for the field <code>billEntryIdList</code>.</p>
	 *
	 * @param billEntryIdList a {@link java.util.List} object.
	 */
	public void setBillEntryIdList(List<String> billEntryIdList) {
		this.billEntryIdList = billEntryIdList;
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
