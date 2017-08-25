package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券核销的叠加标识
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MergeVerifyConfig extends AlipayObject {

	private static final long serialVersionUID = 1873351926692526835L;

	/**
	 * 可以与任意其他券叠加
	 */
	@ApiField("general_merge_others")
	private Boolean generalMergeOthers;

	/**
	 * 全场和单品叠加标识
	 */
	@ApiField("general_merge_single")
	private Boolean generalMergeSingle;

	/**
	 * <p>Getter for the field <code>generalMergeOthers</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getGeneralMergeOthers() {
		return this.generalMergeOthers;
	}
	/**
	 * <p>Setter for the field <code>generalMergeOthers</code>.</p>
	 *
	 * @param generalMergeOthers a {@link java.lang.Boolean} object.
	 */
	public void setGeneralMergeOthers(Boolean generalMergeOthers) {
		this.generalMergeOthers = generalMergeOthers;
	}

	/**
	 * <p>Getter for the field <code>generalMergeSingle</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getGeneralMergeSingle() {
		return this.generalMergeSingle;
	}
	/**
	 * <p>Setter for the field <code>generalMergeSingle</code>.</p>
	 *
	 * @param generalMergeSingle a {@link java.lang.Boolean} object.
	 */
	public void setGeneralMergeSingle(Boolean generalMergeSingle) {
		this.generalMergeSingle = generalMergeSingle;
	}

}
