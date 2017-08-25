package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁云服务插件扩展信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CommodityPublicExtInfos extends AlipayObject {

	private static final long serialVersionUID = 6353792637928135753L;

	/**
	 * 前置url
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 应用展台id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 类目
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 创建者ID
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/**
	 * 挂载ID，用于确认唯一记录的主键对象
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 城市服务说明
	 */
	@ApiField("displayapp_memo")
	private String displayappMemo;

	/**
	 * 服务别名
	 */
	@ApiField("displayapp_name")
	private String displayappName;

	/**
	 * 状态 1:上架；0：下架；2:维护中
	 */
	@ApiField("displayapp_status")
	private String displayappStatus;

	/**
	 * 用户访问地址
	 */
	@ApiField("displayapp_url")
	private String displayappUrl;

	/**
	 * 外部展示地址
	 */
	@ApiField("export_url")
	private String exportUrl;

	/**
	 * 属性ID
	 */
	@ApiField("property_id")
	private String propertyId;

	/**
	 * <p>Getter for the field <code>actionUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionUrl() {
		return this.actionUrl;
	}
	/**
	 * <p>Setter for the field <code>actionUrl</code>.</p>
	 *
	 * @param actionUrl a {@link java.lang.String} object.
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	/**
	 * <p>Getter for the field <code>appId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppId() {
		return this.appId;
	}
	/**
	 * <p>Setter for the field <code>appId</code>.</p>
	 *
	 * @param appId a {@link java.lang.String} object.
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * <p>Getter for the field <code>categoryName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	/**
	 * <p>Setter for the field <code>categoryName</code>.</p>
	 *
	 * @param categoryName a {@link java.lang.String} object.
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * <p>Getter for the field <code>cityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityName() {
		return this.cityName;
	}
	/**
	 * <p>Setter for the field <code>cityName</code>.</p>
	 *
	 * @param cityName a {@link java.lang.String} object.
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * <p>Getter for the field <code>commodityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityId() {
		return this.commodityId;
	}
	/**
	 * <p>Setter for the field <code>commodityId</code>.</p>
	 *
	 * @param commodityId a {@link java.lang.String} object.
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * <p>Getter for the field <code>createUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateUserId() {
		return this.createUserId;
	}
	/**
	 * <p>Setter for the field <code>createUserId</code>.</p>
	 *
	 * @param createUserId a {@link java.lang.String} object.
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * <p>Getter for the field <code>displayappId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayappId() {
		return this.displayappId;
	}
	/**
	 * <p>Setter for the field <code>displayappId</code>.</p>
	 *
	 * @param displayappId a {@link java.lang.String} object.
	 */
	public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

	/**
	 * <p>Getter for the field <code>displayappMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayappMemo() {
		return this.displayappMemo;
	}
	/**
	 * <p>Setter for the field <code>displayappMemo</code>.</p>
	 *
	 * @param displayappMemo a {@link java.lang.String} object.
	 */
	public void setDisplayappMemo(String displayappMemo) {
		this.displayappMemo = displayappMemo;
	}

	/**
	 * <p>Getter for the field <code>displayappName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayappName() {
		return this.displayappName;
	}
	/**
	 * <p>Setter for the field <code>displayappName</code>.</p>
	 *
	 * @param displayappName a {@link java.lang.String} object.
	 */
	public void setDisplayappName(String displayappName) {
		this.displayappName = displayappName;
	}

	/**
	 * <p>Getter for the field <code>displayappStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayappStatus() {
		return this.displayappStatus;
	}
	/**
	 * <p>Setter for the field <code>displayappStatus</code>.</p>
	 *
	 * @param displayappStatus a {@link java.lang.String} object.
	 */
	public void setDisplayappStatus(String displayappStatus) {
		this.displayappStatus = displayappStatus;
	}

	/**
	 * <p>Getter for the field <code>displayappUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayappUrl() {
		return this.displayappUrl;
	}
	/**
	 * <p>Setter for the field <code>displayappUrl</code>.</p>
	 *
	 * @param displayappUrl a {@link java.lang.String} object.
	 */
	public void setDisplayappUrl(String displayappUrl) {
		this.displayappUrl = displayappUrl;
	}

	/**
	 * <p>Getter for the field <code>exportUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExportUrl() {
		return this.exportUrl;
	}
	/**
	 * <p>Setter for the field <code>exportUrl</code>.</p>
	 *
	 * @param exportUrl a {@link java.lang.String} object.
	 */
	public void setExportUrl(String exportUrl) {
		this.exportUrl = exportUrl;
	}

	/**
	 * <p>Getter for the field <code>propertyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPropertyId() {
		return this.propertyId;
	}
	/**
	 * <p>Setter for the field <code>propertyId</code>.</p>
	 *
	 * @param propertyId a {@link java.lang.String} object.
	 */
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

}
