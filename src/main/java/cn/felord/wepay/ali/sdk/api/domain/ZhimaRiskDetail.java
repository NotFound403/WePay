package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻信用风险记录详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaRiskDetail extends AlipayObject {

	private static final long serialVersionUID = 8719233895866597387L;

	/**
	 * 数据类型：Negative(负面信息)、Risk(风险信息) 。系统会将在APP上对C端披露的信息标记为负面信息，其余的信息标记为风险信息。
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 对于该条风险信息的补充信息。是名称和值得键值对。依据不同的风险类型，存在不同内容。返回信息为JSON字符串。
	 */
	@ApiField("extendinfo")
	private String extendinfo;

	/**
	 * 风险代码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 风险类型
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 对于逾期类风险信息，此字段表示是否结清。T（结清）/F（未结清）
	 */
	@ApiField("settlement")
	private String settlement;

	/**
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出声明。
	 */
	@ApiField("statement")
	private String statement;

	/**
	 * 当用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行业类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 数据更新时间
	 */
	@ApiField("update")
	private Date update;

	/**
	 * <p>Getter for the field <code>dataType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataType() {
		return this.dataType;
	}
	/**
	 * <p>Setter for the field <code>dataType</code>.</p>
	 *
	 * @param dataType a {@link java.lang.String} object.
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * <p>Getter for the field <code>extendinfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendinfo() {
		return this.extendinfo;
	}
	/**
	 * <p>Setter for the field <code>extendinfo</code>.</p>
	 *
	 * @param extendinfo a {@link java.lang.String} object.
	 */
	public void setExtendinfo(String extendinfo) {
		this.extendinfo = extendinfo;
	}

	/**
	 * <p>Getter for the field <code>riskCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskCode() {
		return this.riskCode;
	}
	/**
	 * <p>Setter for the field <code>riskCode</code>.</p>
	 *
	 * @param riskCode a {@link java.lang.String} object.
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**
	 * <p>Getter for the field <code>riskType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskType() {
		return this.riskType;
	}
	/**
	 * <p>Setter for the field <code>riskType</code>.</p>
	 *
	 * @param riskType a {@link java.lang.String} object.
	 */
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	/**
	 * <p>Getter for the field <code>settlement</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSettlement() {
		return this.settlement;
	}
	/**
	 * <p>Setter for the field <code>settlement</code>.</p>
	 *
	 * @param settlement a {@link java.lang.String} object.
	 */
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	/**
	 * <p>Getter for the field <code>statement</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatement() {
		return this.statement;
	}
	/**
	 * <p>Setter for the field <code>statement</code>.</p>
	 *
	 * @param statement a {@link java.lang.String} object.
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
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

	/**
	 * <p>Getter for the field <code>update</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getUpdate() {
		return this.update;
	}
	/**
	 * <p>Setter for the field <code>update</code>.</p>
	 *
	 * @param update a {@link java.util.Date} object.
	 */
	public void setUpdate(Date update) {
		this.update = update;
	}

}
