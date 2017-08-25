package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝打赏订单查询接口，返回打赏订单明细及状态
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransThirdpartyRewardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5883223265373467394L;

	/**
	 * 场景码，接入时找业务方分配
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 付款方支付宝UserId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 打赏单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	/**
	 * <p>Getter for the field <code>scene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScene() {
		return this.scene;
	}
	/**
	 * <p>Setter for the field <code>scene</code>.</p>
	 *
	 * @param scene a {@link java.lang.String} object.
	 */
	public void setScene(String scene) {
		this.scene = scene;
	}

	/**
	 * <p>Getter for the field <code>senderUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSenderUserId() {
		return this.senderUserId;
	}
	/**
	 * <p>Setter for the field <code>senderUserId</code>.</p>
	 *
	 * @param senderUserId a {@link java.lang.String} object.
	 */
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

	/**
	 * <p>Getter for the field <code>transferNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransferNo() {
		return this.transferNo;
	}
	/**
	 * <p>Setter for the field <code>transferNo</code>.</p>
	 *
	 * @param transferNo a {@link java.lang.String} object.
	 */
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

}
