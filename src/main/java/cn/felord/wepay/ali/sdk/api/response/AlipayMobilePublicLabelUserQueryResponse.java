package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.label.user.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262264735129126798L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 标签编号，英文逗号分隔。
	 */
	@ApiField("label_ids")
	private String labelIds;

	/** 
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/**
	 * <p>Setter for the field <code>labelIds</code>.</p>
	 *
	 * @param labelIds a {@link java.lang.String} object.
	 */
	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	/**
	 * <p>Getter for the field <code>labelIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelIds( ) {
		return this.labelIds;
	}

	/** {@inheritDoc} */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg( ) {
		return this.msg;
	}

}
