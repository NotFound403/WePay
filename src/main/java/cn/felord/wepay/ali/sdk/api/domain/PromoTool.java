package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 营销工具
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoTool extends AlipayObject {

	private static final long serialVersionUID = 7889192435558294675L;

	/**
	 * 集点卡工具，仅在活动类型为POINT_SEND时才有效且必填，其他活动类型此字段必须为null
	 */
	@ApiField("point_card")
	private PointCard pointCard;

	/**
	 * 奖品发放的规则
	 */
	@ApiField("send_rule")
	private SendRule sendRule;

	/**
	 * 单个营销工具的生效状态，当在招商部分券失效后会使用这个字段
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券对象，当活动类型为POINT_SEND时为null，其他活动类型此字段必填
	 */
	@ApiField("voucher")
	private Voucher voucher;

	/**
	 * 营销工具uid,创建营销活动时无需设置
	 */
	@ApiField("voucher_no")
	private String voucherNo;

	/**
	 * <p>Getter for the field <code>pointCard</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PointCard} object.
	 */
	public PointCard getPointCard() {
		return this.pointCard;
	}
	/**
	 * <p>Setter for the field <code>pointCard</code>.</p>
	 *
	 * @param pointCard a {@link cn.felord.wepay.ali.sdk.api.domain.PointCard} object.
	 */
	public void setPointCard(PointCard pointCard) {
		this.pointCard = pointCard;
	}

	/**
	 * <p>Getter for the field <code>sendRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SendRule} object.
	 */
	public SendRule getSendRule() {
		return this.sendRule;
	}
	/**
	 * <p>Setter for the field <code>sendRule</code>.</p>
	 *
	 * @param sendRule a {@link cn.felord.wepay.ali.sdk.api.domain.SendRule} object.
	 */
	public void setSendRule(SendRule sendRule) {
		this.sendRule = sendRule;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
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

	/**
	 * <p>Getter for the field <code>voucherNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherNo() {
		return this.voucherNo;
	}
	/**
	 * <p>Setter for the field <code>voucherNo</code>.</p>
	 *
	 * @param voucherNo a {@link java.lang.String} object.
	 */
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

}
