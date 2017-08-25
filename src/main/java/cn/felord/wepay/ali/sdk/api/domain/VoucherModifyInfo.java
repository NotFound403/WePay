package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券修改模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherModifyInfo extends AlipayObject {

	private static final long serialVersionUID = 1113472968581352877L;

	/**
	 * 追加的适用门店
	 */
	@ApiListField("suitable_shops")
	@ApiField("string")
	private List<String> suitableShops;

	/**
	 * 描述信息
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 使用须知
	 */
	@ApiListField("voucher_terms")
	@ApiField("voucher_term_info")
	private List<VoucherTermInfo> voucherTerms;

	/**
	 * <p>Getter for the field <code>suitableShops</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSuitableShops() {
		return this.suitableShops;
	}
	/**
	 * <p>Setter for the field <code>suitableShops</code>.</p>
	 *
	 * @param suitableShops a {@link java.util.List} object.
	 */
	public void setSuitableShops(List<String> suitableShops) {
		this.suitableShops = suitableShops;
	}

	/**
	 * <p>Getter for the field <code>voucherDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	/**
	 * <p>Setter for the field <code>voucherDesc</code>.</p>
	 *
	 * @param voucherDesc a {@link java.lang.String} object.
	 */
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	/**
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId() {
		return this.voucherId;
	}
	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	/**
	 * <p>Getter for the field <code>voucherName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherName() {
		return this.voucherName;
	}
	/**
	 * <p>Setter for the field <code>voucherName</code>.</p>
	 *
	 * @param voucherName a {@link java.lang.String} object.
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	/**
	 * <p>Getter for the field <code>voucherTerms</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<VoucherTermInfo> getVoucherTerms() {
		return this.voucherTerms;
	}
	/**
	 * <p>Setter for the field <code>voucherTerms</code>.</p>
	 *
	 * @param voucherTerms a {@link java.util.List} object.
	 */
	public void setVoucherTerms(List<VoucherTermInfo> voucherTerms) {
		this.voucherTerms = voucherTerms;
	}

}
