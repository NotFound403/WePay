package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券模板创建信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4653449811121977638L;

	/**
	 * 是否可转赠。默认true
	 */
	@ApiField("can_give_friend")
	private Boolean canGiveFriend;

	/**
	 * 使用规则
	 */
	@ApiField("use_rule")
	private UseRuleInfo useRule;

	/**
	 * 有效期
	 */
	@ApiField("valid_date")
	private ValidDateInfo validDate;

	/**
	 * 券详情描述
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券背景图。该值调用接口:alipay.offline.material.image.upload生成
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * logo图片id。该值调用接口:alipay.offline.material.image.upload生成
	 */
	@ApiField("voucher_logo")
	private String voucherLogo;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券上的详情描述信息
	 */
	@ApiListField("voucher_terms")
	@ApiField("voucher_term_info")
	private List<VoucherTermInfo> voucherTerms;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * <p>Getter for the field <code>canGiveFriend</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getCanGiveFriend() {
		return this.canGiveFriend;
	}
	/**
	 * <p>Setter for the field <code>canGiveFriend</code>.</p>
	 *
	 * @param canGiveFriend a {@link java.lang.Boolean} object.
	 */
	public void setCanGiveFriend(Boolean canGiveFriend) {
		this.canGiveFriend = canGiveFriend;
	}

	/**
	 * <p>Getter for the field <code>useRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.UseRuleInfo} object.
	 */
	public UseRuleInfo getUseRule() {
		return this.useRule;
	}
	/**
	 * <p>Setter for the field <code>useRule</code>.</p>
	 *
	 * @param useRule a {@link cn.felord.wepay.ali.sdk.api.domain.UseRuleInfo} object.
	 */
	public void setUseRule(UseRuleInfo useRule) {
		this.useRule = useRule;
	}

	/**
	 * <p>Getter for the field <code>validDate</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ValidDateInfo} object.
	 */
	public ValidDateInfo getValidDate() {
		return this.validDate;
	}
	/**
	 * <p>Setter for the field <code>validDate</code>.</p>
	 *
	 * @param validDate a {@link cn.felord.wepay.ali.sdk.api.domain.ValidDateInfo} object.
	 */
	public void setValidDate(ValidDateInfo validDate) {
		this.validDate = validDate;
	}

	/**
	 * <p>Getter for the field <code>voucherDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	/**
	 * <p>Setter for the field <code>voucherDesc</code>.</p>
	 *
	 * @param voucherDesc a {@link java.lang.String} object.
	 */
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	/**
	 * <p>Getter for the field <code>voucherImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherImg() {
		return this.voucherImg;
	}
	/**
	 * <p>Setter for the field <code>voucherImg</code>.</p>
	 *
	 * @param voucherImg a {@link java.lang.String} object.
	 */
	public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

	/**
	 * <p>Getter for the field <code>voucherLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherLogo() {
		return this.voucherLogo;
	}
	/**
	 * <p>Setter for the field <code>voucherLogo</code>.</p>
	 *
	 * @param voucherLogo a {@link java.lang.String} object.
	 */
	public void setVoucherLogo(String voucherLogo) {
		this.voucherLogo = voucherLogo;
	}

	/**
	 * <p>Getter for the field <code>voucherName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherName() {
		return this.voucherName;
	}
	/**
	 * <p>Setter for the field <code>voucherName</code>.</p>
	 *
	 * @param voucherName a {@link java.lang.String} object.
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	/**
	 * <p>Getter for the field <code>voucherTerms</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<VoucherTermInfo> getVoucherTerms() {
		return this.voucherTerms;
	}
	/**
	 * <p>Setter for the field <code>voucherTerms</code>.</p>
	 *
	 * @param voucherTerms a {@link java.util.List} object.
	 */
	public void setVoucherTerms(List<VoucherTermInfo> voucherTerms) {
		this.voucherTerms = voucherTerms;
	}

	/**
	 * <p>Getter for the field <code>voucherType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherType() {
		return this.voucherType;
	}
	/**
	 * <p>Setter for the field <code>voucherType</code>.</p>
	 *
	 * @param voucherType a {@link java.lang.String} object.
	 */
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
