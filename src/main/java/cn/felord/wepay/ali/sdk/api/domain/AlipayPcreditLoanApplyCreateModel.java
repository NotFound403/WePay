package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户申贷
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPcreditLoanApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1832197537814542297L;

	/**
	 * 申贷金额，单位为元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 用户身份证后4位
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户贴息率，0~1的小数
	 */
	@ApiField("ratio")
	private Long ratio;

	/**
	 * 场景码
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * <p>Getter for the field <code>applyAmt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyAmt() {
		return this.applyAmt;
	}
	/**
	 * <p>Setter for the field <code>applyAmt</code>.</p>
	 *
	 * @param applyAmt a {@link java.lang.String} object.
	 */
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
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
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>ratio</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRatio() {
		return this.ratio;
	}
	/**
	 * <p>Setter for the field <code>ratio</code>.</p>
	 *
	 * @param ratio a {@link java.lang.Long} object.
	 */
	public void setRatio(Long ratio) {
		this.ratio = ratio;
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

}
