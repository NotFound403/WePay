package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.score.brief.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCreditScoreBriefGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6468799412695663627L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 准入判断结果  Y=准入,N=不准入,N/A=无法评估该用户的信用
	 */
	@ApiField("is_admittance")
	private String isAdmittance;

	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo( ) {
		return this.bizNo;
	}

	/**
	 * <p>Setter for the field <code>isAdmittance</code>.</p>
	 *
	 * @param isAdmittance a {@link java.lang.String} object.
	 */
	public void setIsAdmittance(String isAdmittance) {
		this.isAdmittance = isAdmittance;
	}
	/**
	 * <p>Getter for the field <code>isAdmittance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsAdmittance( ) {
		return this.isAdmittance;
	}

}
