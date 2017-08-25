package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 活动商品的信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1883753733123826714L;

	/**
	 * 商品购买限制
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 商品ID，用于领取时使用
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品售卖结束时间
	 */
	@ApiField("sale_end_time")
	private String saleEndTime;

	/**
	 * 商品售卖的开始时间
	 */
	@ApiField("sale_start_time")
	private Date saleStartTime;

	/**
	 * 剩余库存
	 */
	@ApiField("total_inventory")
	private String totalInventory;

	/**
	 * 券信息
	 */
	@ApiField("voucher")
	private Voucher voucher;

	/**
	 * <p>Getter for the field <code>constraintInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ConstraintInfo} object.
	 */
	public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}
	/**
	 * <p>Setter for the field <code>constraintInfo</code>.</p>
	 *
	 * @param constraintInfo a {@link cn.felord.wepay.ali.sdk.api.domain.ConstraintInfo} object.
	 */
	public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>saleEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSaleEndTime() {
		return this.saleEndTime;
	}
	/**
	 * <p>Setter for the field <code>saleEndTime</code>.</p>
	 *
	 * @param saleEndTime a {@link java.lang.String} object.
	 */
	public void setSaleEndTime(String saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	/**
	 * <p>Getter for the field <code>saleStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getSaleStartTime() {
		return this.saleStartTime;
	}
	/**
	 * <p>Setter for the field <code>saleStartTime</code>.</p>
	 *
	 * @param saleStartTime a {@link java.util.Date} object.
	 */
	public void setSaleStartTime(Date saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	/**
	 * <p>Getter for the field <code>totalInventory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalInventory() {
		return this.totalInventory;
	}
	/**
	 * <p>Setter for the field <code>totalInventory</code>.</p>
	 *
	 * @param totalInventory a {@link java.lang.String} object.
	 */
	public void setTotalInventory(String totalInventory) {
		this.totalInventory = totalInventory;
	}

	/**
	 * <p>Getter for the field <code>voucher</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Voucher} object.
	 */
	public Voucher getVoucher() {
		return this.voucher;
	}
	/**
	 * <p>Setter for the field <code>voucher</code>.</p>
	 *
	 * @param voucher a {@link cn.felord.wepay.ali.sdk.api.domain.Voucher} object.
	 */
	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

}
