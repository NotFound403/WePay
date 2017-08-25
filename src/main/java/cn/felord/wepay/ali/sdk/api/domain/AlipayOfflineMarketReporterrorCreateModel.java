package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 上报线下服务异常
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketReporterrorCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1452171898294995482L;

	/**
	 * 发生错误的时候，当前系统的毫秒数，系统会把当前时间构建成Date对象保存为错误发生时间
	 */
	@ApiField("err_time")
	private Long errTime;

	/**
	 * 如果：type是tableNum  请设置table_num字段作为桌码
	 */
	@ApiField("feature")
	private ReportErrorFeature feature;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 上传类型，通过类型来区分不同错误： value=tableNum 代表扫码点菜
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户的ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>errTime</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getErrTime() {
		return this.errTime;
	}
	/**
	 * <p>Setter for the field <code>errTime</code>.</p>
	 *
	 * @param errTime a {@link java.lang.Long} object.
	 */
	public void setErrTime(Long errTime) {
		this.errTime = errTime;
	}

	/**
	 * <p>Getter for the field <code>feature</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ReportErrorFeature} object.
	 */
	public ReportErrorFeature getFeature() {
		return this.feature;
	}
	/**
	 * <p>Setter for the field <code>feature</code>.</p>
	 *
	 * @param feature a {@link cn.felord.wepay.ali.sdk.api.domain.ReportErrorFeature} object.
	 */
	public void setFeature(ReportErrorFeature feature) {
		this.feature = feature;
	}

	/**
	 * <p>Getter for the field <code>merchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantId() {
		return this.merchantId;
	}
	/**
	 * <p>Setter for the field <code>merchantId</code>.</p>
	 *
	 * @param merchantId a {@link java.lang.String} object.
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
