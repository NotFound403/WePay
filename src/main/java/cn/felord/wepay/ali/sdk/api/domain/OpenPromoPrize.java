package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 开放活动接口奖品
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenPromoPrize extends AlipayObject {

	private static final long serialVersionUID = 4362775932436211132L;

	/**
	 * 消费门槛设置，单位元
	 */
	@ApiField("prize_base_rule_amount")
	private String prizeBaseRuleAmount;

	/**
	 * 商户增加的自定义菜单内容，包括菜单名称，详情页标题。JSON串形式上传
	 */
	@ApiListField("prize_custom_menu")
	@ApiField("prize_custom_menu")
	private List<PrizeCustomMenu> prizeCustomMenu;

	/**
	 * 奖品详情说明，默认和活动详情相同
	 */
	@ApiField("prize_desc")
	private String prizeDesc;

	/**
	 * ISV提供素材中心的图片ID
	 */
	@ApiField("prize_detail_img")
	private String prizeDetailImg;

	/**
	 * 周期性使用时段规则
	 */
	@ApiListField("prize_dimension_time")
	@ApiField("open_promo_prize_dimension")
	private List<OpenPromoPrizeDimension> prizeDimensionTime;

	/**
	 * 券指定可用有效结束日期，和相对可用时间互斥
	 */
	@ApiField("prize_end_time")
	private String prizeEndTime;

	/**
	 * ISV提供素材中心的图片ID，建议尺寸120*120，默认为空
	 */
	@ApiField("prize_logo")
	private String prizeLogo;

	/**
	 * 奖品名称，默认和活动名称相同
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 券相可用对时间，和指定可用时间互斥。
	 */
	@ApiField("prize_relative_time")
	private OpenPromoPrizeRelativeTime prizeRelativeTime;

	/**
	 * 券指定可用开始时间，和相对可用时间互斥
	 */
	@ApiField("prize_start_time")
	private String prizeStartTime;

	/**
	 * 券副标题
	 */
	@ApiField("prize_subtitle")
	private String prizeSubtitle;

	/**
	 * 店铺数据，支持多条
	 */
	@ApiListField("prize_suitable_shops")
	@ApiField("string")
	private List<String> prizeSuitableShops;

	/**
	 * 券模板有效结束日期，默认和活动结束时间相同
	 */
	@ApiField("prize_template_end_time")
	private String prizeTemplateEndTime;

	/**
	 * 券模板有效起始日期，默认和活动开始时间相同
	 */
	@ApiField("prize_template_start_time")
	private String prizeTemplateStartTime;

	/**
	 * 商家自定义使用须知内容，按条传入。JSON串形式上传，最多6条，每条最多100字
	 */
	@ApiListField("prize_terms")
	@ApiField("string")
	private List<String> prizeTerms;

	/**
	 * 奖品类型，现在支持VOUCHER_TICKET：表示代金券
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 抵扣金额，单位元。
	 */
	@ApiField("prize_worth_amount")
	private String prizeWorthAmount;

	/**
	 * <p>Getter for the field <code>prizeBaseRuleAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeBaseRuleAmount() {
		return this.prizeBaseRuleAmount;
	}
	/**
	 * <p>Setter for the field <code>prizeBaseRuleAmount</code>.</p>
	 *
	 * @param prizeBaseRuleAmount a {@link java.lang.String} object.
	 */
	public void setPrizeBaseRuleAmount(String prizeBaseRuleAmount) {
		this.prizeBaseRuleAmount = prizeBaseRuleAmount;
	}

	/**
	 * <p>Getter for the field <code>prizeCustomMenu</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PrizeCustomMenu> getPrizeCustomMenu() {
		return this.prizeCustomMenu;
	}
	/**
	 * <p>Setter for the field <code>prizeCustomMenu</code>.</p>
	 *
	 * @param prizeCustomMenu a {@link java.util.List} object.
	 */
	public void setPrizeCustomMenu(List<PrizeCustomMenu> prizeCustomMenu) {
		this.prizeCustomMenu = prizeCustomMenu;
	}

	/**
	 * <p>Getter for the field <code>prizeDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeDesc() {
		return this.prizeDesc;
	}
	/**
	 * <p>Setter for the field <code>prizeDesc</code>.</p>
	 *
	 * @param prizeDesc a {@link java.lang.String} object.
	 */
	public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

	/**
	 * <p>Getter for the field <code>prizeDetailImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeDetailImg() {
		return this.prizeDetailImg;
	}
	/**
	 * <p>Setter for the field <code>prizeDetailImg</code>.</p>
	 *
	 * @param prizeDetailImg a {@link java.lang.String} object.
	 */
	public void setPrizeDetailImg(String prizeDetailImg) {
		this.prizeDetailImg = prizeDetailImg;
	}

	/**
	 * <p>Getter for the field <code>prizeDimensionTime</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenPromoPrizeDimension> getPrizeDimensionTime() {
		return this.prizeDimensionTime;
	}
	/**
	 * <p>Setter for the field <code>prizeDimensionTime</code>.</p>
	 *
	 * @param prizeDimensionTime a {@link java.util.List} object.
	 */
	public void setPrizeDimensionTime(List<OpenPromoPrizeDimension> prizeDimensionTime) {
		this.prizeDimensionTime = prizeDimensionTime;
	}

	/**
	 * <p>Getter for the field <code>prizeEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeEndTime() {
		return this.prizeEndTime;
	}
	/**
	 * <p>Setter for the field <code>prizeEndTime</code>.</p>
	 *
	 * @param prizeEndTime a {@link java.lang.String} object.
	 */
	public void setPrizeEndTime(String prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

	/**
	 * <p>Getter for the field <code>prizeLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeLogo() {
		return this.prizeLogo;
	}
	/**
	 * <p>Setter for the field <code>prizeLogo</code>.</p>
	 *
	 * @param prizeLogo a {@link java.lang.String} object.
	 */
	public void setPrizeLogo(String prizeLogo) {
		this.prizeLogo = prizeLogo;
	}

	/**
	 * <p>Getter for the field <code>prizeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeName() {
		return this.prizeName;
	}
	/**
	 * <p>Setter for the field <code>prizeName</code>.</p>
	 *
	 * @param prizeName a {@link java.lang.String} object.
	 */
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	/**
	 * <p>Getter for the field <code>prizeRelativeTime</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoPrizeRelativeTime} object.
	 */
	public OpenPromoPrizeRelativeTime getPrizeRelativeTime() {
		return this.prizeRelativeTime;
	}
	/**
	 * <p>Setter for the field <code>prizeRelativeTime</code>.</p>
	 *
	 * @param prizeRelativeTime a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoPrizeRelativeTime} object.
	 */
	public void setPrizeRelativeTime(OpenPromoPrizeRelativeTime prizeRelativeTime) {
		this.prizeRelativeTime = prizeRelativeTime;
	}

	/**
	 * <p>Getter for the field <code>prizeStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeStartTime() {
		return this.prizeStartTime;
	}
	/**
	 * <p>Setter for the field <code>prizeStartTime</code>.</p>
	 *
	 * @param prizeStartTime a {@link java.lang.String} object.
	 */
	public void setPrizeStartTime(String prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

	/**
	 * <p>Getter for the field <code>prizeSubtitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeSubtitle() {
		return this.prizeSubtitle;
	}
	/**
	 * <p>Setter for the field <code>prizeSubtitle</code>.</p>
	 *
	 * @param prizeSubtitle a {@link java.lang.String} object.
	 */
	public void setPrizeSubtitle(String prizeSubtitle) {
		this.prizeSubtitle = prizeSubtitle;
	}

	/**
	 * <p>Getter for the field <code>prizeSuitableShops</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPrizeSuitableShops() {
		return this.prizeSuitableShops;
	}
	/**
	 * <p>Setter for the field <code>prizeSuitableShops</code>.</p>
	 *
	 * @param prizeSuitableShops a {@link java.util.List} object.
	 */
	public void setPrizeSuitableShops(List<String> prizeSuitableShops) {
		this.prizeSuitableShops = prizeSuitableShops;
	}

	/**
	 * <p>Getter for the field <code>prizeTemplateEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeTemplateEndTime() {
		return this.prizeTemplateEndTime;
	}
	/**
	 * <p>Setter for the field <code>prizeTemplateEndTime</code>.</p>
	 *
	 * @param prizeTemplateEndTime a {@link java.lang.String} object.
	 */
	public void setPrizeTemplateEndTime(String prizeTemplateEndTime) {
		this.prizeTemplateEndTime = prizeTemplateEndTime;
	}

	/**
	 * <p>Getter for the field <code>prizeTemplateStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeTemplateStartTime() {
		return this.prizeTemplateStartTime;
	}
	/**
	 * <p>Setter for the field <code>prizeTemplateStartTime</code>.</p>
	 *
	 * @param prizeTemplateStartTime a {@link java.lang.String} object.
	 */
	public void setPrizeTemplateStartTime(String prizeTemplateStartTime) {
		this.prizeTemplateStartTime = prizeTemplateStartTime;
	}

	/**
	 * <p>Getter for the field <code>prizeTerms</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPrizeTerms() {
		return this.prizeTerms;
	}
	/**
	 * <p>Setter for the field <code>prizeTerms</code>.</p>
	 *
	 * @param prizeTerms a {@link java.util.List} object.
	 */
	public void setPrizeTerms(List<String> prizeTerms) {
		this.prizeTerms = prizeTerms;
	}

	/**
	 * <p>Getter for the field <code>prizeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeType() {
		return this.prizeType;
	}
	/**
	 * <p>Setter for the field <code>prizeType</code>.</p>
	 *
	 * @param prizeType a {@link java.lang.String} object.
	 */
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	/**
	 * <p>Getter for the field <code>prizeWorthAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeWorthAmount() {
		return this.prizeWorthAmount;
	}
	/**
	 * <p>Setter for the field <code>prizeWorthAmount</code>.</p>
	 *
	 * @param prizeWorthAmount a {@link java.lang.String} object.
	 */
	public void setPrizeWorthAmount(String prizeWorthAmount) {
		this.prizeWorthAmount = prizeWorthAmount;
	}

}
