package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 物业费账单数据批量上传
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeBillBatchUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2582455494622712972L;

	/**
	 * 每次上传物业费账单，都需要提供一个批次号。对于每一个合作伙伴，传递的每一个批次号都必须保证唯一性，同时对于批次号内的账单明细数据必须保证唯一性；
建议格式为：8位当天日期+流水号（3～24位，流水号可以接受数字或英文字符，建议使用数字）。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 账单应收条目明细集合，同一小区内条目明细不允许重复；一次接口请求最多支持1000条明细。
	 */
	@ApiListField("bill_set")
	@ApiField("c_p_bill_set")
	private List<CPBillSet> billSet;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

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
	 * <p>Getter for the field <code>billSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CPBillSet> getBillSet() {
		return this.billSet;
	}
	/**
	 * <p>Setter for the field <code>billSet</code>.</p>
	 *
	 * @param billSet a {@link java.util.List} object.
	 */
	public void setBillSet(List<CPBillSet> billSet) {
		this.billSet = billSet;
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
