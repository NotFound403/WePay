package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 投保单列表查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneApplicationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4723367355579877568L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * <p>Getter for the field <code>applicant</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getApplicant() {
		return this.applicant;
	}
	/**
	 * <p>Setter for the field <code>applicant</code>.</p>
	 *
	 * @param applicant a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
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
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

}
