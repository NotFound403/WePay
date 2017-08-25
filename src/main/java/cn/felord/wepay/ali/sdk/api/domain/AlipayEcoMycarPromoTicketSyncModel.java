package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * ISV有新的卡券信息同步到车主服务平台
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarPromoTicketSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3846524676113452181L;

	/**
	 * 营销活动ID
	 */
	@ApiField("active_id")
	private String activeId;

	/**
	 * 需要同步的卡券信息
	 */
	@ApiListField("code_no_list")
	@ApiField("code_n_o_list")
	private List<CodeNOList> codeNoList;

	/**
	 * 卡券来源
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * <p>Getter for the field <code>activeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActiveId() {
		return this.activeId;
	}
	/**
	 * <p>Setter for the field <code>activeId</code>.</p>
	 *
	 * @param activeId a {@link java.lang.String} object.
	 */
	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	/**
	 * <p>Getter for the field <code>codeNoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CodeNOList> getCodeNoList() {
		return this.codeNoList;
	}
	/**
	 * <p>Setter for the field <code>codeNoList</code>.</p>
	 *
	 * @param codeNoList a {@link java.util.List} object.
	 */
	public void setCodeNoList(List<CodeNOList> codeNoList) {
		this.codeNoList = codeNoList;
	}

	/**
	 * <p>Getter for the field <code>sourceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceType() {
		return this.sourceType;
	}
	/**
	 * <p>Setter for the field <code>sourceType</code>.</p>
	 *
	 * @param sourceType a {@link java.lang.String} object.
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
