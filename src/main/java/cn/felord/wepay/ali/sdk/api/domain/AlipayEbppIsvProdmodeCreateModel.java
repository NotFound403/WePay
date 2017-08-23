package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品模型创建接口
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:16:58
 */
public class AlipayEbppIsvProdmodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4594148819676371133L;

	/**
	 * 参数内容包含：ISV录入产品模型相关信息，具体分类如下：1.销账机构信息
2.对账配置信息
3.清算配置信息
4.产品模型和出账机构信息
5.机构拓展信息
	 */
	@ApiField("biz_data")
	private String bizData;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

}