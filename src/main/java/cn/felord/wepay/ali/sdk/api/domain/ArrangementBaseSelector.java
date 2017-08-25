package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 合约基本信息选择器，根据产品编码，合约状态编码来过滤合约
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementBaseSelector extends AlipayObject {

	private static final long serialVersionUID = 5545445439852838175L;

	/**
	 * 合约状态列表.01 待生效，02 生效，03失效，04 取消
	 */
	@ApiListField("ar_statuses")
	@ApiField("string")
	private List<String> arStatuses;

	/**
	 * 产品外标类型:01：机构产品 02：借款人信息 03：主站产品 04： 标准机构产品  05：内部业务平台标准产品
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 产品编码列表
	 */
	@ApiListField("pd_codes")
	@ApiField("string")
	private List<String> pdCodes;

	/**
	 * 产品外标列表
	 */
	@ApiListField("pd_marks")
	@ApiField("string")
	private List<String> pdMarks;

	/**
	 * 是否查询出产品外标
	 */
	@ApiField("select_pd_mark")
	private Boolean selectPdMark;

	/**
	 * 是否查询出产品名称
	 */
	@ApiField("select_pd_name")
	private Boolean selectPdName;

	/**
	 * <p>Getter for the field <code>arStatuses</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getArStatuses() {
		return this.arStatuses;
	}
	/**
	 * <p>Setter for the field <code>arStatuses</code>.</p>
	 *
	 * @param arStatuses a {@link java.util.List} object.
	 */
	public void setArStatuses(List<String> arStatuses) {
		this.arStatuses = arStatuses;
	}

	/**
	 * <p>Getter for the field <code>markType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarkType() {
		return this.markType;
	}
	/**
	 * <p>Setter for the field <code>markType</code>.</p>
	 *
	 * @param markType a {@link java.lang.String} object.
	 */
	public void setMarkType(String markType) {
		this.markType = markType;
	}

	/**
	 * <p>Getter for the field <code>pdCodes</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPdCodes() {
		return this.pdCodes;
	}
	/**
	 * <p>Setter for the field <code>pdCodes</code>.</p>
	 *
	 * @param pdCodes a {@link java.util.List} object.
	 */
	public void setPdCodes(List<String> pdCodes) {
		this.pdCodes = pdCodes;
	}

	/**
	 * <p>Getter for the field <code>pdMarks</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPdMarks() {
		return this.pdMarks;
	}
	/**
	 * <p>Setter for the field <code>pdMarks</code>.</p>
	 *
	 * @param pdMarks a {@link java.util.List} object.
	 */
	public void setPdMarks(List<String> pdMarks) {
		this.pdMarks = pdMarks;
	}

	/**
	 * <p>Getter for the field <code>selectPdMark</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSelectPdMark() {
		return this.selectPdMark;
	}
	/**
	 * <p>Setter for the field <code>selectPdMark</code>.</p>
	 *
	 * @param selectPdMark a {@link java.lang.Boolean} object.
	 */
	public void setSelectPdMark(Boolean selectPdMark) {
		this.selectPdMark = selectPdMark;
	}

	/**
	 * <p>Getter for the field <code>selectPdName</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSelectPdName() {
		return this.selectPdName;
	}
	/**
	 * <p>Setter for the field <code>selectPdName</code>.</p>
	 *
	 * @param selectPdName a {@link java.lang.Boolean} object.
	 */
	public void setSelectPdName(Boolean selectPdName) {
		this.selectPdName = selectPdName;
	}

}
