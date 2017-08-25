package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 实习生职位下线接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduCampusJobCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1583337137776129725L;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * <p>Getter for the field <code>sourceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceCode() {
		return this.sourceCode;
	}
	/**
	 * <p>Setter for the field <code>sourceCode</code>.</p>
	 *
	 * @param sourceCode a {@link java.lang.String} object.
	 */
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId() {
		return this.sourceId;
	}
	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
