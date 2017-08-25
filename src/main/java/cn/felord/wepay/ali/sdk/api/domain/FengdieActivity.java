package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 凤蝶H5应用详情信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FengdieActivity extends AlipayObject {

	private static final long serialVersionUID = 7786442894618763986L;

	/**
	 * H5应用的唯一id，调用alipay.marketing.tool.fengdie.activity.create接口时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 应用是否已在线，在H5编辑器中点击发布按钮或者过了有效期会修改状态。如：true：在线，在设置的有效期内 ；false：已下线，超过了设置的有效期范围
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 创建的H5应用的名称，调用alipay.marketing.tool.fengdie.activity.create接口时作为参数传入，默认自动生成。最终显示在H5生成的URL上。URL规则为 "域名/p/f/${name}/index.html"
	 */
	@ApiField("name")
	private String name;

	/**
	 * appid所属支付宝账号昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * H5应用下线时间，在H5编辑器中修改
	 */
	@ApiField("offline_time")
	private Date offlineTime;

	/**
	 * 唤起H5编辑器时默认展示的表单数据
	 */
	@ApiListField("page")
	@ApiField("fengdie_activity_page")
	private List<FengdieActivityPage> page;

	/**
	 * H5应用最近一次发布时间，在H5编辑器中点击发布按钮时会修改
	 */
	@ApiField("publish_time")
	private Date publishTime;

	/**
	 * H5应用被编辑的状态，如：OPEN：编辑中；COMPLETE：已完成；PRERELEASED：预览页面生成成功；PRERELEASE_FAIL：预览页面生成失败；RELEASED：已发布；RELEASE_FAIL：发布失败。在H5编辑器中点击保存、编辑完成、发布按钮时会触发。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 创建H5应用所使用的模板包唯一id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * H5应用的标题，在唤起的H5编辑器中输入
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Long} object.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>isOnline</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsOnline() {
		return this.isOnline;
	}
	/**
	 * <p>Setter for the field <code>isOnline</code>.</p>
	 *
	 * @param isOnline a {@link java.lang.Boolean} object.
	 */
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

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
	 * <p>Getter for the field <code>nickName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNickName() {
		return this.nickName;
	}
	/**
	 * <p>Setter for the field <code>nickName</code>.</p>
	 *
	 * @param nickName a {@link java.lang.String} object.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * <p>Getter for the field <code>offlineTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getOfflineTime() {
		return this.offlineTime;
	}
	/**
	 * <p>Setter for the field <code>offlineTime</code>.</p>
	 *
	 * @param offlineTime a {@link java.util.Date} object.
	 */
	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	/**
	 * <p>Getter for the field <code>page</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FengdieActivityPage> getPage() {
		return this.page;
	}
	/**
	 * <p>Setter for the field <code>page</code>.</p>
	 *
	 * @param page a {@link java.util.List} object.
	 */
	public void setPage(List<FengdieActivityPage> page) {
		this.page = page;
	}

	/**
	 * <p>Getter for the field <code>publishTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishTime() {
		return this.publishTime;
	}
	/**
	 * <p>Setter for the field <code>publishTime</code>.</p>
	 *
	 * @param publishTime a {@link java.util.Date} object.
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
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
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.Long} object.
	 */
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
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
