package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约信息标准VO
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementVORes extends AlipayObject {

	private static final long serialVersionUID = 4611878644396291279L;

	/**
	 * 合约基本信息
	 */
	@ApiField("ar_base")
	private ArrangementBaseVO arBase;

	/**
	 * 合约业务状态
	 */
	@ApiField("ar_bsn_status")
	private String arBsnStatus;

	/**
	 * 合约条件值,其格式为json，数据key因合约而存在差异。
	 */
	@ApiField("ar_condition")
	private String arCondition;

	/**
	 * 合约编号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * <p>Getter for the field <code>arBase</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementBaseVO} object.
	 */
	public ArrangementBaseVO getArBase() {
		return this.arBase;
	}
	/**
	 * <p>Setter for the field <code>arBase</code>.</p>
	 *
	 * @param arBase a {@link cn.felord.wepay.ali.sdk.api.domain.ArrangementBaseVO} object.
	 */
	public void setArBase(ArrangementBaseVO arBase) {
		this.arBase = arBase;
	}

	/**
	 * <p>Getter for the field <code>arBsnStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArBsnStatus() {
		return this.arBsnStatus;
	}
	/**
	 * <p>Setter for the field <code>arBsnStatus</code>.</p>
	 *
	 * @param arBsnStatus a {@link java.lang.String} object.
	 */
	public void setArBsnStatus(String arBsnStatus) {
		this.arBsnStatus = arBsnStatus;
	}

	/**
	 * <p>Getter for the field <code>arCondition</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArCondition() {
		return this.arCondition;
	}
	/**
	 * <p>Setter for the field <code>arCondition</code>.</p>
	 *
	 * @param arCondition a {@link java.lang.String} object.
	 */
	public void setArCondition(String arCondition) {
		this.arCondition = arCondition;
	}

	/**
	 * <p>Getter for the field <code>arrangementNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArrangementNo() {
		return this.arrangementNo;
	}
	/**
	 * <p>Setter for the field <code>arrangementNo</code>.</p>
	 *
	 * @param arrangementNo a {@link java.lang.String} object.
	 */
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

}
