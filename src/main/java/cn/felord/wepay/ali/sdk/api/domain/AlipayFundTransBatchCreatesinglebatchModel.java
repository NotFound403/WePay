package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 如果有创建AA收款，江湖救急等业务场景的话，可以调用该接口进行批次单据的创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransBatchCreatesinglebatchModel extends AlipayObject {

	private static final long serialVersionUID = 6496866346683618116L;

	/**
	 * 批次的创建说明，如收款理由等。注：字符长度不能超过24；字符串中不能含有特殊字符（比如emoji等）
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/**
	 * 业务类型,目前支持下面三种业务类型， (AA收款 :aa, 江湖救急 :support , 活动收款:general)，
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 创建者id（该id为用户的支付宝id，需要调用方自己进行转换传入）
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/**
	 * 扩展参数,目前淘系会传商品类目过来key=categoryNo。注：长度不可超过100; 数据格式需要为map<String,String>的json串
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 单笔金额，单位为元。注： AA收款为平均后的金额；活动收款为单笔金额； 江湖救急不填写
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/**
	 * 总金额，单位为元。注：AA为收款总金额；活动收款为份数和单笔金额的积；江湖救急为目标金额
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/**
	 * 实际要创建的笔数。注：AA包括自己这里为show_items_total-1；活动收款为填写的份数;江湖救急不填写
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/**
	 * 显示的总笔数。注：AA收款为选择的人数；活动收款为填写的份数；江湖救急不填写
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/**
	 * <p>Getter for the field <code>batchMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchMemo() {
		return this.batchMemo;
	}
	/**
	 * <p>Setter for the field <code>batchMemo</code>.</p>
	 *
	 * @param batchMemo a {@link java.lang.String} object.
	 */
	public void setBatchMemo(String batchMemo) {
		this.batchMemo = batchMemo;
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
	 * <p>Getter for the field <code>createUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateUserId() {
		return this.createUserId;
	}
	/**
	 * <p>Setter for the field <code>createUserId</code>.</p>
	 *
	 * @param createUserId a {@link java.lang.String} object.
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * <p>Getter for the field <code>extParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParam() {
		return this.extParam;
	}
	/**
	 * <p>Setter for the field <code>extParam</code>.</p>
	 *
	 * @param extParam a {@link java.lang.String} object.
	 */
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	/**
	 * <p>Getter for the field <code>payAmountSingle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmountSingle() {
		return this.payAmountSingle;
	}
	/**
	 * <p>Setter for the field <code>payAmountSingle</code>.</p>
	 *
	 * @param payAmountSingle a {@link java.lang.String} object.
	 */
	public void setPayAmountSingle(String payAmountSingle) {
		this.payAmountSingle = payAmountSingle;
	}

	/**
	 * <p>Getter for the field <code>payAmountTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmountTotal() {
		return this.payAmountTotal;
	}
	/**
	 * <p>Setter for the field <code>payAmountTotal</code>.</p>
	 *
	 * @param payAmountTotal a {@link java.lang.String} object.
	 */
	public void setPayAmountTotal(String payAmountTotal) {
		this.payAmountTotal = payAmountTotal;
	}

	/**
	 * <p>Getter for the field <code>realItemsTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealItemsTotal() {
		return this.realItemsTotal;
	}
	/**
	 * <p>Setter for the field <code>realItemsTotal</code>.</p>
	 *
	 * @param realItemsTotal a {@link java.lang.String} object.
	 */
	public void setRealItemsTotal(String realItemsTotal) {
		this.realItemsTotal = realItemsTotal;
	}

	/**
	 * <p>Getter for the field <code>showItemsTotal</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShowItemsTotal() {
		return this.showItemsTotal;
	}
	/**
	 * <p>Setter for the field <code>showItemsTotal</code>.</p>
	 *
	 * @param showItemsTotal a {@link java.lang.String} object.
	 */
	public void setShowItemsTotal(String showItemsTotal) {
		this.showItemsTotal = showItemsTotal;
	}

}
