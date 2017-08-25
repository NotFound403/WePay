package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户订购信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayContract extends AlipayObject {

	private static final long serialVersionUID = 5764549979916976531L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订购的应用名称，有效时间。
	 */
	@ApiField("contract_content")
	private String contractContent;

	/**
	 * 订购的失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 订购URL。在sign返回false时返回应用的订购地址，可以引导用户订购。
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 订购的生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 是否订购的标识。true：代表已订购。
	 */
	@ApiField("subscribe")
	private Boolean subscribe;

	/**
	 * <p>Getter for the field <code>alipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	/**
	 * <p>Setter for the field <code>alipayUserId</code>.</p>
	 *
	 * @param alipayUserId a {@link java.lang.String} object.
	 */
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	/**
	 * <p>Getter for the field <code>contractContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContractContent() {
		return this.contractContent;
	}
	/**
	 * <p>Setter for the field <code>contractContent</code>.</p>
	 *
	 * @param contractContent a {@link java.lang.String} object.
	 */
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>pageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageUrl() {
		return this.pageUrl;
	}
	/**
	 * <p>Setter for the field <code>pageUrl</code>.</p>
	 *
	 * @param pageUrl a {@link java.lang.String} object.
	 */
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>subscribe</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSubscribe() {
		return this.subscribe;
	}
	/**
	 * <p>Setter for the field <code>subscribe</code>.</p>
	 *
	 * @param subscribe a {@link java.lang.Boolean} object.
	 */
	public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}

}
