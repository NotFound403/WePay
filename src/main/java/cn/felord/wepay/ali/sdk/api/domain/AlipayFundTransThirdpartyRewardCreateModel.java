package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部商户可通过此接口创建支付宝用户的打赏订单，而后通过支付宝快捷支付对此订单进行支付完成打赏。（不支持企业用户）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundTransThirdpartyRewardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6429786235857973922L;

	/**
	 * 打赏金额，单位：人民币分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展参数，json格式
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 外部业务号，用于幂等控制
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 收款用户的支付宝userId
	 */
	@ApiField("receiver_user_id")
	private String receiverUserId;

	/**
	 * 场景码，需业务方分配方可使用
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 付款用户的支付宝userId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 打赏的标题（理由）
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
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
	 * <p>Getter for the field <code>outNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutNo() {
		return this.outNo;
	}
	/**
	 * <p>Setter for the field <code>outNo</code>.</p>
	 *
	 * @param outNo a {@link java.lang.String} object.
	 */
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	/**
	 * <p>Getter for the field <code>receiverUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReceiverUserId() {
		return this.receiverUserId;
	}
	/**
	 * <p>Setter for the field <code>receiverUserId</code>.</p>
	 *
	 * @param receiverUserId a {@link java.lang.String} object.
	 */
	public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

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
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
