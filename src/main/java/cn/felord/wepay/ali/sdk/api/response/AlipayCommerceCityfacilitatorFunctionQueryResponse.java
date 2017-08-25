package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.SupportFunction;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.function.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8535334652211728178L;

	/** 
	 * 支持的功能列表
	 */
	@ApiListField("functions")
	@ApiField("support_function")
	private List<SupportFunction> functions;

	/**
	 * <p>Setter for the field <code>functions</code>.</p>
	 *
	 * @param functions a {@link java.util.List} object.
	 */
	public void setFunctions(List<SupportFunction> functions) {
		this.functions = functions;
	}
	/**
	 * <p>Getter for the field <code>functions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<SupportFunction> getFunctions( ) {
		return this.functions;
	}

}
