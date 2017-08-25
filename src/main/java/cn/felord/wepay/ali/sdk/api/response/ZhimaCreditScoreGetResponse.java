package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.score.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCreditScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7677226724138295871L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的芝麻信用评分。分值范围[350,950]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("zm_score")
	private String zmScore;

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
	 * <p>Setter for the field <code>zmScore</code>.</p>
	 *
	 * @param zmScore a {@link java.lang.String} object.
	 */
	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	/**
	 * <p>Getter for the field <code>zmScore</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getZmScore( ) {
		return this.zmScore;
	}

}
