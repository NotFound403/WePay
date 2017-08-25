package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ErrorMatcher;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.matchuser.label.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMatchuserLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5189497416367265593L;

	/** 
	 * 用户打标失败数量
	 */
	@ApiField("error_count")
	private Long errorCount;

	/** 
	 * 出错的匹配器列表
	 */
	@ApiListField("error_matchers")
	@ApiField("error_matcher")
	private List<ErrorMatcher> errorMatchers;

	/**
	 * <p>Setter for the field <code>errorCount</code>.</p>
	 *
	 * @param errorCount a {@link java.lang.Long} object.
	 */
	public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
	}
	/**
	 * <p>Getter for the field <code>errorCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getErrorCount( ) {
		return this.errorCount;
	}

	/**
	 * <p>Setter for the field <code>errorMatchers</code>.</p>
	 *
	 * @param errorMatchers a {@link java.util.List} object.
	 */
	public void setErrorMatchers(List<ErrorMatcher> errorMatchers) {
		this.errorMatchers = errorMatchers;
	}
	/**
	 * <p>Getter for the field <code>errorMatchers</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ErrorMatcher> getErrorMatchers( ) {
		return this.errorMatchers;
	}

}
