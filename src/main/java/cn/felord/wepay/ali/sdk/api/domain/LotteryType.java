package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 彩种类型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LotteryType extends AlipayObject {

	private static final long serialVersionUID = 1698755369156947667L;

	/**
	 * 彩种ID
	 */
	@ApiField("lottery_type_id")
	private Long lotteryTypeId;

	/**
	 * 彩种名称
	 */
	@ApiField("lottery_type_name")
	private String lotteryTypeName;

	/**
	 * <p>Getter for the field <code>lotteryTypeId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getLotteryTypeId() {
		return this.lotteryTypeId;
	}
	/**
	 * <p>Setter for the field <code>lotteryTypeId</code>.</p>
	 *
	 * @param lotteryTypeId a {@link java.lang.Long} object.
	 */
	public void setLotteryTypeId(Long lotteryTypeId) {
		this.lotteryTypeId = lotteryTypeId;
	}

	/**
	 * <p>Getter for the field <code>lotteryTypeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLotteryTypeName() {
		return this.lotteryTypeName;
	}
	/**
	 * <p>Setter for the field <code>lotteryTypeName</code>.</p>
	 *
	 * @param lotteryTypeName a {@link java.lang.String} object.
	 */
	public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

}
