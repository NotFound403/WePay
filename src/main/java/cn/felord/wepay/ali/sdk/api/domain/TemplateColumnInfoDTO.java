package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 模板栏位信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TemplateColumnInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3349473554543754164L;

	/**
	 * 标准栏位：行为由支付宝统一定，同时已经分配标准Code
BALANCE：会员卡余额
POINT：积分
LEVEL：等级
TELEPHOME：联系方式
自定义栏位：行为由商户定义，自定义Code码（只要无重复）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展信息
	 */
	@ApiField("more_info")
	private MoreInfoDTO moreInfo;

	/**
	 * 1、openNative：打开二级页面，展现 more中descs
2、openWeb：打开URL
3、staticinfo：静态信息
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 栏目的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 卡包详情页面，卡栏位右边展现的值
	 */
	@ApiField("value")
	private String value;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>moreInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MoreInfoDTO} object.
	 */
	public MoreInfoDTO getMoreInfo() {
		return this.moreInfo;
	}
	/**
	 * <p>Setter for the field <code>moreInfo</code>.</p>
	 *
	 * @param moreInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MoreInfoDTO} object.
	 */
	public void setMoreInfo(MoreInfoDTO moreInfo) {
		this.moreInfo = moreInfo;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
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
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
