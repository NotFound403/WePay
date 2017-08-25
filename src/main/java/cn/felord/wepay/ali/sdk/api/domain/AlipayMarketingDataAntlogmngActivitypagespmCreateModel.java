package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 凤蝶H5应用申请SPM
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataAntlogmngActivitypagespmCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5331115388941882169L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 负责人的工号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * spma位
	 */
	@ApiField("spma")
	private String spma;

	/**
	 * 页面的spmb值code
	 */
	@ApiField("spmb")
	private String spmb;

	/**
	 * 名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 凤蝶页面的url
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityId() {
		return this.activityId;
	}
	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.String} object.
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	/**
	 * <p>Getter for the field <code>owner</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwner() {
		return this.owner;
	}
	/**
	 * <p>Setter for the field <code>owner</code>.</p>
	 *
	 * @param owner a {@link java.lang.String} object.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * <p>Getter for the field <code>spma</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpma() {
		return this.spma;
	}
	/**
	 * <p>Setter for the field <code>spma</code>.</p>
	 *
	 * @param spma a {@link java.lang.String} object.
	 */
	public void setSpma(String spma) {
		this.spma = spma;
	}

	/**
	 * <p>Getter for the field <code>spmb</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpmb() {
		return this.spmb;
	}
	/**
	 * <p>Setter for the field <code>spmb</code>.</p>
	 *
	 * @param spmb a {@link java.lang.String} object.
	 */
	public void setSpmb(String spmb) {
		this.spmb = spmb;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * <p>Getter for the field <code>url</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrl() {
		return this.url;
	}
	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
