package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertAdvResponse extends AlipayObject {

	private static final long serialVersionUID = 8143485512253581847L;

	/**
	 * 推广ID
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 指定推广活动的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单张券推广
只有type=single_voucher才会有值
	 */
	@ApiField("single_voucher")
	private KbAdvertAdvSingleVoucherResponse singleVoucher;

	/**
	 * 推广类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>advId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdvId() {
		return this.advId;
	}
	/**
	 * <p>Setter for the field <code>advId</code>.</p>
	 *
	 * @param advId a {@link java.lang.String} object.
	 */
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>singleVoucher</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertAdvSingleVoucherResponse} object.
	 */
	public KbAdvertAdvSingleVoucherResponse getSingleVoucher() {
		return this.singleVoucher;
	}
	/**
	 * <p>Setter for the field <code>singleVoucher</code>.</p>
	 *
	 * @param singleVoucher a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertAdvSingleVoucherResponse} object.
	 */
	public void setSingleVoucher(KbAdvertAdvSingleVoucherResponse singleVoucher) {
		this.singleVoucher = singleVoucher;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
