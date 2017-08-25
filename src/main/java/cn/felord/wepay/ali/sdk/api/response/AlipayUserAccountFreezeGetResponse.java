package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AccountFreeze;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.freeze.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAccountFreezeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1665999842743598255L;

	/** 
	 * 冻结金额列表
	 */
	@ApiListField("freeze_items")
	@ApiField("account_freeze")
	private List<AccountFreeze> freezeItems;

	/** 
	 * 冻结总条数
	 */
	@ApiField("total_results")
	private String totalResults;

	/**
	 * <p>Setter for the field <code>freezeItems</code>.</p>
	 *
	 * @param freezeItems a {@link java.util.List} object.
	 */
	public void setFreezeItems(List<AccountFreeze> freezeItems) {
		this.freezeItems = freezeItems;
	}
	/**
	 * <p>Getter for the field <code>freezeItems</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AccountFreeze> getFreezeItems( ) {
		return this.freezeItems;
	}

	/**
	 * <p>Setter for the field <code>totalResults</code>.</p>
	 *
	 * @param totalResults a {@link java.lang.String} object.
	 */
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	/**
	 * <p>Getter for the field <code>totalResults</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalResults( ) {
		return this.totalResults;
	}

}
