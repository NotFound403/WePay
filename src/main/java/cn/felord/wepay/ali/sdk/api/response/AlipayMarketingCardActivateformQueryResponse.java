package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.activateform.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardActivateformQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3819424798754941556L;

	/** 
	 * 表单提交信息各个字段的值JSON数组

默认通用表单字段名称可选值如下：
OPEN_FORM_FIELD_MOBILE – 手机号
OPEN_FORM_FIELD_GENDER – 性别
OPEN_FORM_FIELD_NAME – 姓名
OPEN_FORM_FIELD_BIRTHDAY – 生日
OPEN_FORM_FIELD_IDCARD – 身份证
OPEN_FORM_FIELD_EMAIL – 邮箱
OPEN_FORM_FIELD_ADDRESS – 地址
	 */
	@ApiField("infos")
	private String infos;

	/**
	 * <p>Setter for the field <code>infos</code>.</p>
	 *
	 * @param infos a {@link java.lang.String} object.
	 */
	public void setInfos(String infos) {
		this.infos = infos;
	}
	/**
	 * <p>Getter for the field <code>infos</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInfos( ) {
		return this.infos;
	}

}
