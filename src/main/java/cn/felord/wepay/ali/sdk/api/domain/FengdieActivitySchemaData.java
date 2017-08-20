package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 初始化凤蝶应用时传入的默认数据
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class FengdieActivitySchemaData extends AlipayObject {

	private static final long serialVersionUID = 8664443757673586483L;

	/**
	 * 默认数据的内容，内容格式参考模板开发过程中自动生成的mock数据（与schema文件同名的json文件）。
	 */
	@ApiField("data")
	private String data;

	/**
	 * 指定需要初始化的schema区域，与模板中schema文件路径对应
	 */
	@ApiField("name")
	private String name;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
