package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.TemplateCardLevelConfDTO;
import cn.felord.wepay.ali.sdk.api.domain.TemplateColumnInfoDTO;
import cn.felord.wepay.ali.sdk.api.domain.TemplateFieldRuleDTO;
import cn.felord.wepay.ali.sdk.api.domain.TemplateMdcodeNotifyConfDTO;
import cn.felord.wepay.ali.sdk.api.domain.TemplateOpenCardConfDTO;
import cn.felord.wepay.ali.sdk.api.domain.PubChannelDTO;
import cn.felord.wepay.ali.sdk.api.domain.TemplateBenefitInfoDTO;
import cn.felord.wepay.ali.sdk.api.domain.TemplateStyleInfoDTO;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2144424165949925688L;

	/** 
	 * 业务卡号前缀，由商户自定义
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/** 
	 * 卡号长度
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/** 
	 * 卡等级配置
	 */
	@ApiListField("card_level_confs")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConfs;

	/** 
	 * 会员卡类型：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 栏位信息（卡包详情页面展现的栏位）
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
当write_off_type指定为商户动态码mdbarcode或mdqrcode时不为空；
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
	 * 服务标签列表
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/** 
	 * 门店ids
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
	 * 模板样式信息(钱包展现效果)
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	/**
	 * <p>Setter for the field <code>bizNoPrefix</code>.</p>
	 *
	 * @param bizNoPrefix a {@link java.lang.String} object.
	 */
	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}
	/**
	 * <p>Getter for the field <code>bizNoPrefix</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNoPrefix( ) {
		return this.bizNoPrefix;
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
	 * <p>Getter for the field <code>bizNoSuffixLen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNoSuffixLen( ) {
		return this.bizNoSuffixLen;
	}

	/**
	 * <p>Setter for the field <code>cardLevelConfs</code>.</p>
	 *
	 * @param cardLevelConfs a {@link java.util.List} object.
	 */
	public void setCardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs) {
		this.cardLevelConfs = cardLevelConfs;
	}
	/**
	 * <p>Getter for the field <code>cardLevelConfs</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateCardLevelConfDTO> getCardLevelConfs( ) {
		return this.cardLevelConfs;
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
	 * <p>Getter for the field <code>cardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardType( ) {
		return this.cardType;
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
	 * <p>Getter for the field <code>columnInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateColumnInfoDTO> getColumnInfoList( ) {
		return this.columnInfoList;
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
	 * <p>Getter for the field <code>fieldRuleList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateFieldRuleDTO> getFieldRuleList( ) {
		return this.fieldRuleList;
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
	 * <p>Getter for the field <code>mdcodeNotifyConf</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateMdcodeNotifyConfDTO} object.
	 */
	public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf( ) {
		return this.mdcodeNotifyConf;
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
	 * <p>Getter for the field <code>openCardConf</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateOpenCardConfDTO} object.
	 */
	public TemplateOpenCardConfDTO getOpenCardConf( ) {
		return this.openCardConf;
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
	 * <p>Getter for the field <code>pubChannels</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PubChannelDTO> getPubChannels( ) {
		return this.pubChannels;
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
	 * <p>Getter for the field <code>serviceLabelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getServiceLabelList( ) {
		return this.serviceLabelList;
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
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds( ) {
		return this.shopIds;
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
	 * <p>Getter for the field <code>templateBenefitInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo( ) {
		return this.templateBenefitInfo;
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
	 * <p>Getter for the field <code>templateStyleInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.TemplateStyleInfoDTO} object.
	 */
	public TemplateStyleInfoDTO getTemplateStyleInfo( ) {
		return this.templateStyleInfo;
	}

}
