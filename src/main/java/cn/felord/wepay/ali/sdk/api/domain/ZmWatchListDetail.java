package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 行业关注名单详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZmWatchListDetail extends AlipayObject {

	private static final long serialVersionUID = 3523251535463299957L;

	/**
	 * 行业编码，例如：
AA	金融（信贷类）；
AB	公检法 ；
AC	金融（支付类）；
AD	租车行业；
AE	酒店行业；
AF	电商行业；
AG	租房行业；
AH	运营商；
AI	保险行业；
AJ	公共事业。
该列表动态更新，更新前芝麻将进行通知。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 风险编码，编码由芝麻进行维护和升级，会存在新增编码的可能，更新前芝麻会进行通知。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 行业关注名单记录扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("zm_watch_list_extend_info")
	private List<ZmWatchListExtendInfo> extendInfo;

	/**
	 * 数据更新时间
	 */
	@ApiField("refresh_time")
	private Date refreshTime;

	/**
	 * 对于借款贷款信用消费等，该字段标识是否结清。true，已经结清；false，未结清。
	 */
	@ApiField("settlement")
	private Boolean settlement;

	/**
	 * 当用户进行异议处理，并核查完毕之后，仍有异议时，给出的声明
	 */
	@ApiField("statement")
	private String statement;

	/**
	 * 用户本人对该条负面记录有异议时，表示该异议处理流程的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 行业名单风险类型，编码由芝麻进行维护和升级，会存在新增编码的可能，更新前芝麻将会进行通知。
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>bizCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizCode() {
		return this.bizCode;
	}
	/**
	 * <p>Setter for the field <code>bizCode</code>.</p>
	 *
	 * @param bizCode a {@link java.lang.String} object.
	 */
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>extendInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ZmWatchListExtendInfo> getExtendInfo() {
		return this.extendInfo;
	}
	/**
	 * <p>Setter for the field <code>extendInfo</code>.</p>
	 *
	 * @param extendInfo a {@link java.util.List} object.
	 */
	public void setExtendInfo(List<ZmWatchListExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}

	/**
	 * <p>Getter for the field <code>refreshTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getRefreshTime() {
		return this.refreshTime;
	}
	/**
	 * <p>Setter for the field <code>refreshTime</code>.</p>
	 *
	 * @param refreshTime a {@link java.util.Date} object.
	 */
	public void setRefreshTime(Date refreshTime) {
		this.refreshTime = refreshTime;
	}

	/**
	 * <p>Getter for the field <code>settlement</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSettlement() {
		return this.settlement;
	}
	/**
	 * <p>Setter for the field <code>settlement</code>.</p>
	 *
	 * @param settlement a {@link java.lang.Boolean} object.
	 */
	public void setSettlement(Boolean settlement) {
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

}
