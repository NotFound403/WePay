package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物业费账单数据同步
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2333959931755455861L;

	/**
	 * 待同步的物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 支付宝社区物业平台小区ID，用户通过支付宝社区物业平台物业查询获取。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 指定条目待更新的缴费截止日期
若operate_type为update，该参数选填；
若operate_type为delete，该参数不用填。
	 */
	@ApiField("new_deadline")
	private String newDeadline;

	/**
	 * 指定条目待更新的应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
若operate_type为update，该参数选填；
若operate_type为delete，该参数不用填。
	 */
	@ApiField("new_entry_amount")
	private String newEntryAmount;

	/**
	 * 同步类型：
delete：删除
update：更改
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * <p>Getter for the field <code>billEntryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillEntryId() {
		return this.billEntryId;
	}
	/**
	 * <p>Setter for the field <code>billEntryId</code>.</p>
	 *
	 * @param billEntryId a {@link java.lang.String} object.
	 */
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
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
	 * <p>Getter for the field <code>newDeadline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNewDeadline() {
		return this.newDeadline;
	}
	/**
	 * <p>Setter for the field <code>newDeadline</code>.</p>
	 *
	 * @param newDeadline a {@link java.lang.String} object.
	 */
	public void setNewDeadline(String newDeadline) {
		this.newDeadline = newDeadline;
	}

	/**
	 * <p>Getter for the field <code>newEntryAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNewEntryAmount() {
		return this.newEntryAmount;
	}
	/**
	 * <p>Setter for the field <code>newEntryAmount</code>.</p>
	 *
	 * @param newEntryAmount a {@link java.lang.String} object.
	 */
	public void setNewEntryAmount(String newEntryAmount) {
		this.newEntryAmount = newEntryAmount;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
