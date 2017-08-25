package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 凤蝶H5应用中的页面
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FengdieActivityPage extends AlipayObject {

	private static final long serialVersionUID = 7373583874738266758L;

	/**
	 * H5页面唯一id，创建H5应用时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * H5页面名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * H5页面schema数据
	 */
	@ApiListField("schema")
	@ApiField("fengdie_activity_schema_data")
	private List<FengdieActivitySchemaData> schema;

	/**
	 * H5页面预览图
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * H5页面中文标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * H5页面访问地址
	 */
	@ApiField("url")
	private String url;

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
	 * <p>Getter for the field <code>schema</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FengdieActivitySchemaData> getSchema() {
		return this.schema;
	}
	/**
	 * <p>Setter for the field <code>schema</code>.</p>
	 *
	 * @param schema a {@link java.util.List} object.
	 */
	public void setSchema(List<FengdieActivitySchemaData> schema) {
		this.schema = schema;
	}

	/**
	 * <p>Getter for the field <code>snapshot</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSnapshot() {
		return this.snapshot;
	}
	/**
	 * <p>Setter for the field <code>snapshot</code>.</p>
	 *
	 * @param snapshot a {@link java.lang.String} object.
	 */
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
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
