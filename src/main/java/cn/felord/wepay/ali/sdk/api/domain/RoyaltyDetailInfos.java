package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分账明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RoyaltyDetailInfos extends AlipayObject {

	private static final long serialVersionUID = 1299197787172743424L;

	/**
	 * 分账的金额，单位为元
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 分账的比例，值为20代表按20%的比例分账
	 */
	@ApiField("amount_percentage")
	private String amountPercentage;

	/**
	 * 分账批次号
分账批次号。
目前需要和转入账号类型为bankIndex配合使用。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 分账描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商户分账的外部关联号，用于关联到每一笔分账信息，商户需保证其唯一性。
如果为空，该值则默认为“商户网站唯一订单号+分账序列号”
	 */
	@ApiField("out_relation_id")
	private String outRelationId;

	/**
	 * 分账序列号，表示分账执行的顺序，必须为正整数
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 如果转入账号类型为userId，本参数为接受分账金额的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
&#61548;	如果转入账号类型为bankIndex，本参数为28位的银行编号（商户和支付宝签约时确定）。
如果转入账号类型为storeId，本参数为商户的门店ID。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 接受分账金额的账户类型：
&#61548;	userId：支付宝账号对应的支付宝唯一用户号。
&#61548;	bankIndex：分账到银行账户的银行编号。目前暂时只支持分账到一个银行编号。
storeId：分账到门店对应的银行卡编号。
默认值为userId。
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 如果转出账号类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 要分账的账户类型。
目前只支持userId：支付宝账号对应的支付宝唯一用户号。
默认值为userId。
	 */
	@ApiField("trans_out_type")
	private String transOutType;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.Long} object.
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>amountPercentage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmountPercentage() {
		return this.amountPercentage;
	}
	/**
	 * <p>Setter for the field <code>amountPercentage</code>.</p>
	 *
	 * @param amountPercentage a {@link java.lang.String} object.
	 */
	public void setAmountPercentage(String amountPercentage) {
		this.amountPercentage = amountPercentage;
	}

	/**
	 * <p>Getter for the field <code>batchNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBatchNo() {
		return this.batchNo;
	}
	/**
	 * <p>Setter for the field <code>batchNo</code>.</p>
	 *
	 * @param batchNo a {@link java.lang.String} object.
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>outRelationId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRelationId() {
		return this.outRelationId;
	}
	/**
	 * <p>Setter for the field <code>outRelationId</code>.</p>
	 *
	 * @param outRelationId a {@link java.lang.String} object.
	 */
	public void setOutRelationId(String outRelationId) {
		this.outRelationId = outRelationId;
	}

	/**
	 * <p>Getter for the field <code>serialNo</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSerialNo() {
		return this.serialNo;
	}
	/**
	 * <p>Setter for the field <code>serialNo</code>.</p>
	 *
	 * @param serialNo a {@link java.lang.Long} object.
	 */
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * <p>Getter for the field <code>transIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransIn() {
		return this.transIn;
	}
	/**
	 * <p>Setter for the field <code>transIn</code>.</p>
	 *
	 * @param transIn a {@link java.lang.String} object.
	 */
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	/**
	 * <p>Getter for the field <code>transInType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransInType() {
		return this.transInType;
	}
	/**
	 * <p>Setter for the field <code>transInType</code>.</p>
	 *
	 * @param transInType a {@link java.lang.String} object.
	 */
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

	/**
	 * <p>Getter for the field <code>transOut</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransOut() {
		return this.transOut;
	}
	/**
	 * <p>Setter for the field <code>transOut</code>.</p>
	 *
	 * @param transOut a {@link java.lang.String} object.
	 */
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	/**
	 * <p>Getter for the field <code>transOutType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransOutType() {
		return this.transOutType;
	}
	/**
	 * <p>Setter for the field <code>transOutType</code>.</p>
	 *
	 * @param transOutType a {@link java.lang.String} object.
	 */
	public void setTransOutType(String transOutType) {
		this.transOutType = transOutType;
	}

}
