package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.label.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3816711346236454989L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 所有标签
	 */
	@ApiListField("labels")
	@ApiField("string")
	private List<String> labels;

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
	 * <p>Setter for the field <code>labels</code>.</p>
	 *
	 * @param labels a {@link java.util.List} object.
	 */
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	/**
	 * <p>Getter for the field <code>labels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getLabels( ) {
		return this.labels;
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
