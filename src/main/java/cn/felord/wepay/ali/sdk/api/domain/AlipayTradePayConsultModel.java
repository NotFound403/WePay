package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 统一收单支付能力咨询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradePayConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7772665625761916484L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。用户签约成功后时，协议号会返回给商户。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 商户申请额度，商户端根据实际需要来赋值。
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 业务场景，用于区分商户具体的咨询类型。ENJOY_CONSULT：兜底资金咨询；FUND_BILL_CONSULT资金渠道咨询
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家的支付宝用户id，用户签约成功后，会返回给商户。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 支付咨询阶段。在支付过程中，用于区分商户发起咨询的阶段。BEFORE_PAY：支付前咨询；AFTER_PAY：支付后咨询
	 */
	@ApiField("consult_phase")
	private String consultPhase;

	/**
	 * 扩展参数，必须是json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 此参数值取商户签约销售方案时的销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户端生成唯一标识，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 订单标题，商户端描述该次咨询对应的基本订单信息。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * <p>Getter for the field <code>agreementNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementNo() {
		return this.agreementNo;
	}
	/**
	 * <p>Setter for the field <code>agreementNo</code>.</p>
	 *
	 * @param agreementNo a {@link java.lang.String} object.
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	/**
	 * <p>Getter for the field <code>applyAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyAmount() {
		return this.applyAmount;
	}
	/**
	 * <p>Setter for the field <code>applyAmount</code>.</p>
	 *
	 * @param applyAmount a {@link java.lang.String} object.
	 */
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	/**
	 * <p>Getter for the field <code>bizScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizScene() {
		return this.bizScene;
	}
	/**
	 * <p>Setter for the field <code>bizScene</code>.</p>
	 *
	 * @param bizScene a {@link java.lang.String} object.
	 */
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	/**
	 * <p>Getter for the field <code>buyerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuyerId() {
		return this.buyerId;
	}
	/**
	 * <p>Setter for the field <code>buyerId</code>.</p>
	 *
	 * @param buyerId a {@link java.lang.String} object.
	 */
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	/**
	 * <p>Getter for the field <code>consultPhase</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsultPhase() {
		return this.consultPhase;
	}
	/**
	 * <p>Setter for the field <code>consultPhase</code>.</p>
	 *
	 * @param consultPhase a {@link java.lang.String} object.
	 */
	public void setConsultPhase(String consultPhase) {
		this.consultPhase = consultPhase;
	}

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * <p>Getter for the field <code>requestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestNo() {
		return this.requestNo;
	}
	/**
	 * <p>Setter for the field <code>requestNo</code>.</p>
	 *
	 * @param requestNo a {@link java.lang.String} object.
	 */
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
