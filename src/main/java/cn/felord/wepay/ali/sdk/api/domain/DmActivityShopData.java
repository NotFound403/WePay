package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 店铺DM营销数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DmActivityShopData extends AlipayObject {

	private static final long serialVersionUID = 8293157877667714315L;

	/**
	 * 数据创建时间戳
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 数据修改时间戳
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 单日点击人数
	 */
	@ApiField("one_day_click_persons")
	private Long oneDayClickPersons;

	/**
	 * 单日点击次数
	 */
	@ApiField("one_day_click_times")
	private Long oneDayClickTimes;

	/**
	 * 单日点击人数
	 */
	@ApiField("one_day_exposure_times")
	private Long oneDayExposureTimes;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 总点击人数
	 */
	@ApiField("total_click_persons")
	private Long totalClickPersons;

	/**
	 * 总点击次数
	 */
	@ApiField("total_click_times")
	private Long totalClickTimes;

	/**
	 * 总曝光次数
	 */
	@ApiField("total_exposure_times")
	private Long totalExposureTimes;

	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtModified() {
		return this.gmtModified;
	}
	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.util.Date} object.
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * <p>Getter for the field <code>oneDayClickPersons</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOneDayClickPersons() {
		return this.oneDayClickPersons;
	}
	/**
	 * <p>Setter for the field <code>oneDayClickPersons</code>.</p>
	 *
	 * @param oneDayClickPersons a {@link java.lang.Long} object.
	 */
	public void setOneDayClickPersons(Long oneDayClickPersons) {
		this.oneDayClickPersons = oneDayClickPersons;
	}

	/**
	 * <p>Getter for the field <code>oneDayClickTimes</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOneDayClickTimes() {
		return this.oneDayClickTimes;
	}
	/**
	 * <p>Setter for the field <code>oneDayClickTimes</code>.</p>
	 *
	 * @param oneDayClickTimes a {@link java.lang.Long} object.
	 */
	public void setOneDayClickTimes(Long oneDayClickTimes) {
		this.oneDayClickTimes = oneDayClickTimes;
	}

	/**
	 * <p>Getter for the field <code>oneDayExposureTimes</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOneDayExposureTimes() {
		return this.oneDayExposureTimes;
	}
	/**
	 * <p>Setter for the field <code>oneDayExposureTimes</code>.</p>
	 *
	 * @param oneDayExposureTimes a {@link java.lang.Long} object.
	 */
	public void setOneDayExposureTimes(Long oneDayExposureTimes) {
		this.oneDayExposureTimes = oneDayExposureTimes;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>totalClickPersons</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalClickPersons() {
		return this.totalClickPersons;
	}
	/**
	 * <p>Setter for the field <code>totalClickPersons</code>.</p>
	 *
	 * @param totalClickPersons a {@link java.lang.Long} object.
	 */
	public void setTotalClickPersons(Long totalClickPersons) {
		this.totalClickPersons = totalClickPersons;
	}

	/**
	 * <p>Getter for the field <code>totalClickTimes</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalClickTimes() {
		return this.totalClickTimes;
	}
	/**
	 * <p>Setter for the field <code>totalClickTimes</code>.</p>
	 *
	 * @param totalClickTimes a {@link java.lang.Long} object.
	 */
	public void setTotalClickTimes(Long totalClickTimes) {
		this.totalClickTimes = totalClickTimes;
	}

	/**
	 * <p>Getter for the field <code>totalExposureTimes</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalExposureTimes() {
		return this.totalExposureTimes;
	}
	/**
	 * <p>Setter for the field <code>totalExposureTimes</code>.</p>
	 *
	 * @param totalExposureTimes a {@link java.lang.Long} object.
	 */
	public void setTotalExposureTimes(Long totalExposureTimes) {
		this.totalExposureTimes = totalExposureTimes;
	}

}
