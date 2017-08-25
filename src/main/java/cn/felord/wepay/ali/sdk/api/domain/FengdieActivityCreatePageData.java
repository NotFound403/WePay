package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 凤蝶创建H5页面初始化数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FengdieActivityCreatePageData extends AlipayObject {

	private static final long serialVersionUID = 4523722245734232999L;

	/**
	 * H5应用中页面名称。指定凤蝶开发工具项目中某个H5应用的页面名称。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 指定name页面默认展示的数据。由Schema文件中的路径和展示的数据结构组成，默认模板中Schema文件路径：bgImage/bgImage；默认模板中此参数的数据结构请参考：默认模板-project-components-bglmage-bjlmage.json文件，bjlmage.json文件中的内容可以编辑。注意：展示的数据结构需要和Schema文件中的路径一致。
	 */
	@ApiField("schema_data")
	private String schemaData;

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
	 * <p>Getter for the field <code>schemaData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchemaData() {
		return this.schemaData;
	}
	/**
	 * <p>Setter for the field <code>schemaData</code>.</p>
	 *
	 * @param schemaData a {@link java.lang.String} object.
	 */
	public void setSchemaData(String schemaData) {
		this.schemaData = schemaData;
	}

}
