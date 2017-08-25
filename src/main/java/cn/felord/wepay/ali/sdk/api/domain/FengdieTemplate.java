package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 通过凤蝶开发者工具开发的模板
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FengdieTemplate extends AlipayObject {

	private static final long serialVersionUID = 6629819923772129315L;

	/**
	 * 模板包唯一id，上传模板时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 模板包开发者，由开发者在package.json中指定
	 */
	@ApiListField("maintainer")
	@ApiField("string")
	private List<String> maintainer;

	/**
	 * 模板包名称，开发模板时由开发者在package.json里指定
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模板包预览图，开发者在模板根目录放置的一张命名为snapshot.png的图片
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 模板包描述，开发者在package.json里指定
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 模板包中文标题，开发者在fengdie.config.js里指定
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
	 * <p>Getter for the field <code>maintainer</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getMaintainer() {
		return this.maintainer;
	}
	/**
	 * <p>Setter for the field <code>maintainer</code>.</p>
	 *
	 * @param maintainer a {@link java.util.List} object.
	 */
	public void setMaintainer(List<String> maintainer) {
		this.maintainer = maintainer;
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
	 * <p>Getter for the field <code>summary</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSummary() {
		return this.summary;
	}
	/**
	 * <p>Setter for the field <code>summary</code>.</p>
	 *
	 * @param summary a {@link java.lang.String} object.
	 */
	public void setSummary(String summary) {
		this.summary = summary;
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
