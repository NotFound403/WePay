package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蚂蚁微客任务视图
 *
 * @author auto create
 * @version $Id: $Id
 */
public class WeikeTaskView extends AlipayObject {

	private static final long serialVersionUID = 1232532743641624347L;

	/**
	 * 任务视图描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 蚂蚁微客对当前任务视图编号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 任务视图图片链接
	 */
	@ApiField("img")
	private String img;

	/**
	 * 任务视图名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 任务视图对应的任务薪资
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 当前任务视图剩余任务数
	 */
	@ApiField("task_count")
	private Long taskCount;

	/**
	 * 点击任务视图后唤起微客对应页面的链接
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

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
	 * <p>Getter for the field <code>img</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImg() {
		return this.img;
	}
	/**
	 * <p>Setter for the field <code>img</code>.</p>
	 *
	 * @param img a {@link java.lang.String} object.
	 */
	public void setImg(String img) {
		this.img = img;
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
	 * <p>Getter for the field <code>salary</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalary() {
		return this.salary;
	}
	/**
	 * <p>Setter for the field <code>salary</code>.</p>
	 *
	 * @param salary a {@link java.lang.String} object.
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * <p>Getter for the field <code>taskCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTaskCount() {
		return this.taskCount;
	}
	/**
	 * <p>Setter for the field <code>taskCount</code>.</p>
	 *
	 * @param taskCount a {@link java.lang.Long} object.
	 */
	public void setTaskCount(Long taskCount) {
		this.taskCount = taskCount;
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
