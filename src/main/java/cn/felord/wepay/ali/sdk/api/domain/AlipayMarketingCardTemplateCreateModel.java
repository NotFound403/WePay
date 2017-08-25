package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 会员卡模板创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2192386252452489731L;

	/**
	 * 业务卡号前缀，由商户自定义
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/**
	 * 业务卡号后缀长度，最大int值不能超过32-biz_no_suffix长度
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/**
	 * 卡级别配置
	 */
	@ApiListField("card_level_conf")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConf;

	/**
	 * 卡类型为固定枚举类型，可选类型如下：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 栏位信息
	 */
	@ApiListField("column_info_list")
	@ApiField("template_column_info_d_t_o")
	private List<TemplateColumnInfoDTO> columnInfoList;

	/**
	 * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
	 */
	@ApiListField("field_rule_list")
	@ApiField("template_field_rule_d_t_o")
	private List<TemplateFieldRuleDTO> fieldRuleList;

	/**
	 * 商户动态码通知参数配置：
当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填；
在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。
	 */
	@ApiField("mdcode_notify_conf")
	private TemplateMdcodeNotifyConfDTO mdcodeNotifyConf;

	/**
	 * 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
	 */
	@ApiField("open_card_conf")
	private TemplateOpenCardConfDTO openCardConf;

	/**
	 * 卡模板投放渠道
	 */
	@ApiListField("pub_channels")
	@ApiField("pub_channel_d_t_o")
	private List<PubChannelDTO> pubChannels;

	/**
	 * 请求ID，由开发者生成并保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务Code
HUABEI_FUWU：花呗服务（只有需要花呗服务时，才需要加入该标识）
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/**
	 * 会员卡上架门店id（支付宝门店id），既发放会员卡的商家门店id
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 权益信息，
1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，
2、如果添加门店渠道，则可在门店页展现会员卡的权益
	 */
	@ApiListField("template_benefit_info")
	@ApiField("template_benefit_info_d_t_o")
	private List<TemplateBenefitInfoDTO> templateBenefitInfo;

	/**
	 * 模板样式信息
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	/**
	 * 卡包详情页面中展现出的卡码（可用于扫码核销）
qrcode: 二维码
dqrcode: 动态二维码
barcode: 条码
dbarcode: 动态条码
text: 文本 
mdbarcode: 商户动态条码
mdqrcode: 商户动态二维码
	 */
	@ApiField("write_off_type")
	private String writeOffType;

	/**
	 * <p>Getter for the field <code>bizNoPrefix</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNoPrefix() {
		return this.bizNoPrefix;
	}
	/**
	 * <p>Setter for the field <code>bizNoPrefix</code>.</p>
	 *
	 * @param bizNoPrefix a {@link java.lang.String} object.
	 */
	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}

	/**
	 * <p>Getter for the field <code>bizNoSuffixLen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNoSuffixLen() {
		return this.bizNoSuffixLen;
	}
	/**
	 * <p>Setter for the field <code>bizNoSuffixLen</code>.</p>
	 *
	 * @param bizNoSuffixLen a {@link java.lang.String} object.
	 */
	public void setBizNoSuffixLen(String bizNoSuffixLen) {
		this.bizNoSuffixLen = bizNoSuffixLen;
	}

	/**
	 * <p>Getter for the field <code>cardLevelConf</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateCardLevelConfDTO> getCardLevelConf() {
		return this.cardLevelConf;
	}
	/**
	 * <p>Setter for the field <code>cardLevelConf</code>.</p>
	 *
	 * @param cardLevelConf a {@link java.util.List} object.
	 */
	public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
		this.cardLevelConf = cardLevelConf;
	}

	/**
	 * <p>Getter for the field <code>cardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardType() {
		return this.cardType;
	}
	/**
	 * <p>Setter for the field <code>cardType</code>.</p>
	 *
	 * @param cardType a {@link java.lang.String} object.
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * <p>Getter for the field <code>columnInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateColumnInfoDTO> getColumnInfoList() {
		return this.columnInfoList;
	}
	/**
	 * <p>Setter for the field <code>columnInfoList</code>.</p>
	 *
	 * @param columnInfoList a {@link java.util.List} object.
	 */
	public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
		this.columnInfoList = columnInfoList;
	}

	/**
	 * <p>Getter for the field <code>fieldRuleList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateFieldRuleDTO> getFieldRuleList() {
		return this.fieldRuleList;
	}
	/**
	 * <p>Setter for the field <code>fieldRuleList</code>.</p>
	 *
	 * @param fieldRuleList a {@link java.util.List} object.
	 */
	public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
		this.fieldRuleList = fieldRuleList;
	}

	/**
	 * <p>Getter for the field <code>mdcodeNotifyConf</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateMdcodeNotifyConfDTO} object.
	 */
	public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf() {
		return this.mdcodeNotifyConf;
	}
	/**
	 * <p>Setter for the field <code>mdcodeNotifyConf</code>.</p>
	 *
	 * @param mdcodeNotifyConf a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateMdcodeNotifyConfDTO} object.
	 */
	public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
		this.mdcodeNotifyConf = mdcodeNotifyConf;
	}

	/**
	 * <p>Getter for the field <code>openCardConf</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateOpenCardConfDTO} object.
	 */
	public TemplateOpenCardConfDTO getOpenCardConf() {
		return this.openCardConf;
	}
	/**
	 * <p>Setter for the field <code>openCardConf</code>.</p>
	 *
	 * @param openCardConf a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateOpenCardConfDTO} object.
	 */
	public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
		this.openCardConf = openCardConf;
	}

	/**
	 * <p>Getter for the field <code>pubChannels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PubChannelDTO> getPubChannels() {
		return this.pubChannels;
	}
	/**
	 * <p>Setter for the field <code>pubChannels</code>.</p>
	 *
	 * @param pubChannels a {@link java.util.List} object.
	 */
	public void setPubChannels(List<PubChannelDTO> pubChannels) {
		this.pubChannels = pubChannels;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * <p>Getter for the field <code>serviceLabelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getServiceLabelList() {
		return this.serviceLabelList;
	}
	/**
	 * <p>Setter for the field <code>serviceLabelList</code>.</p>
	 *
	 * @param serviceLabelList a {@link java.util.List} object.
	 */
	public void setServiceLabelList(List<String> serviceLabelList) {
		this.serviceLabelList = serviceLabelList;
	}

	/**
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds() {
		return this.shopIds;
	}
	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.util.List} object.
	 */
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	/**
	 * <p>Getter for the field <code>templateBenefitInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
		return this.templateBenefitInfo;
	}
	/**
	 * <p>Setter for the field <code>templateBenefitInfo</code>.</p>
	 *
	 * @param templateBenefitInfo a {@link java.util.List} object.
	 */
	public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
		this.templateBenefitInfo = templateBenefitInfo;
	}

	/**
	 * <p>Getter for the field <code>templateStyleInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateStyleInfoDTO} object.
	 */
	public TemplateStyleInfoDTO getTemplateStyleInfo() {
		return this.templateStyleInfo;
	}
	/**
	 * <p>Setter for the field <code>templateStyleInfo</code>.</p>
	 *
	 * @param templateStyleInfo a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateStyleInfoDTO} object.
	 */
	public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}

	/**
	 * <p>Getter for the field <code>writeOffType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getWriteOffType() {
		return this.writeOffType;
	}
	/**
	 * <p>Setter for the field <code>writeOffType</code>.</p>
	 *
	 * @param writeOffType a {@link java.lang.String} object.
	 */
	public void setWriteOffType(String writeOffType) {
		this.writeOffType = writeOffType;
	}

}
