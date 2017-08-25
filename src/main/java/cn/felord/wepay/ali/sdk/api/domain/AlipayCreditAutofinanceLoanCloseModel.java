package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 撤销订单
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCreditAutofinanceLoanCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4689989438279545114L;

	/**
	 * 汽车金融内部订单号
	 */
	@ApiField("applyno")
	private String applyno;

	/**
	 * 机构编号
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

	/**
	 * 关闭原因
	 */
	@ApiField("reson")
	private String reson;

	/**
	 * 关闭类型
1.	CLOSE_USER_CANCEL(用户主动放弃贷款)
2.	CLOSE_TD_REJECT(同盾校验失败)
3.	CLOSE_OTHER(其他情况)
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>applyno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyno() {
		return this.applyno;
	}
	/**
	 * <p>Setter for the field <code>applyno</code>.</p>
	 *
	 * @param applyno a {@link java.lang.String} object.
	 */
	public void setApplyno(String applyno) {
		this.applyno = applyno;
	}

	/**
	 * <p>Getter for the field <code>orgcode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrgcode() {
		return this.orgcode;
	}
	/**
	 * <p>Setter for the field <code>orgcode</code>.</p>
	 *
	 * @param orgcode a {@link java.lang.String} object.
	 */
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	/**
	 * <p>Getter for the field <code>outorderno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutorderno() {
		return this.outorderno;
	}
	/**
	 * <p>Setter for the field <code>outorderno</code>.</p>
	 *
	 * @param outorderno a {@link java.lang.String} object.
	 */
	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

	/**
	 * <p>Getter for the field <code>reson</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReson() {
		return this.reson;
	}
	/**
	 * <p>Setter for the field <code>reson</code>.</p>
	 *
	 * @param reson a {@link java.lang.String} object.
	 */
	public void setReson(String reson) {
		this.reson = reson;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
