package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约条件组选择器，根据条件组类型和code选择条件
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ArrangementConditionGroupSelector extends AlipayObject {

	private static final long serialVersionUID = 7549712446526165517L;

	/**
	 * 是否选择最新的产品条件,默认为TRUE
	 */
	@ApiField("select_latest_pd_cd")
	private Boolean selectLatestPdCd;

	public Boolean getSelectLatestPdCd() {
		return this.selectLatestPdCd;
	}
	public void setSelectLatestPdCd(Boolean selectLatestPdCd) {
		this.selectLatestPdCd = selectLatestPdCd;
	}

}
