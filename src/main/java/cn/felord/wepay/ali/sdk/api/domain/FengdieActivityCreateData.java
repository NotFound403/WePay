package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 凤蝶创建H5应用的初始化数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FengdieActivityCreateData extends AlipayObject {

	private static final long serialVersionUID = 8747161544896375117L;

	/**
	 * H5应用的名称，用户自定义，最终用于生成URL。生成URL的规则“域名/p/f/${name}/页面名称.html”
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户自定义，到了该时间后，用户将访问不到该应用
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * H5应用的页面在编辑器中默认展示的数据
	 */
	@ApiListField("page")
	@ApiField("fengdie_activity_create_page_data")
	private List<FengdieActivityCreatePageData> page;

	/**
	 * H5应用标题，用户自定义
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>offlineTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOfflineTime() {
		return this.offlineTime;
	}
	/**
	 * <p>Setter for the field <code>offlineTime</code>.</p>
	 *
	 * @param offlineTime a {@link java.lang.String} object.
	 */
	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FengdieActivityCreatePageData> getPage() {
		return this.page;
	}
	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.util.List} object.
	 */
	public void setPage(List<FengdieActivityCreatePageData> page) {
		this.page = page;
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

}
