package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约条件组选择器，根据条件组类型和code选择条件
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementConditionGroupSelector extends AlipayObject {

	private static final long serialVersionUID = 7549712446526165517L;

	/**
	 * 是否选择最新的产品条件,默认为TRUE
	 */
	@ApiField("select_latest_pd_cd")
	private Boolean selectLatestPdCd;

	/**
	 * <p>Getter for the field <code>selectLatestPdCd</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSelectLatestPdCd() {
		return this.selectLatestPdCd;
	}
	/**
	 * <p>Setter for the field <code>selectLatestPdCd</code>.</p>
	 *
	 * @param selectLatestPdCd a {@link java.lang.Boolean} object.
	 */
	public void setSelectLatestPdCd(Boolean selectLatestPdCd) {
		this.selectLatestPdCd = selectLatestPdCd;
	}

}
