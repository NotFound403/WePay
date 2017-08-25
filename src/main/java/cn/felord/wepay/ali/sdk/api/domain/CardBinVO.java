package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据卡号和instId查询得到的卡bin信息对象模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CardBinVO extends AlipayObject {

	private static final long serialVersionUID = 3449745484338154177L;

	/**
	 * 卡的别名
	 */
	@ApiField("card_alias")
	private String cardAlias;

	/**
	 * 卡bin值，通常为卡号的前6位
	 */
	@ApiField("card_bin_value")
	private String cardBinValue;

	/**
	 * 卡类型对象定义
	 */
	@ApiField("card_type_vo")
	private CardTypeVO cardTypeVo;

	/**
	 * 卡域模型定义
	 */
	@ApiField("domain_vo")
	private CardDomainVO domainVo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 卡号长度
	 */
	@ApiField("inst_len")
	private String instLen;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 卡版本信息
	 */
	@ApiField("version")
	private String version;

	/**
	 * <p>Getter for the field <code>cardAlias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardAlias() {
		return this.cardAlias;
	}
	/**
	 * <p>Setter for the field <code>cardAlias</code>.</p>
	 *
	 * @param cardAlias a {@link java.lang.String} object.
	 */
	public void setCardAlias(String cardAlias) {
		this.cardAlias = cardAlias;
	}

	/**
	 * <p>Getter for the field <code>cardBinValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardBinValue() {
		return this.cardBinValue;
	}
	/**
	 * <p>Setter for the field <code>cardBinValue</code>.</p>
	 *
	 * @param cardBinValue a {@link java.lang.String} object.
	 */
	public void setCardBinValue(String cardBinValue) {
		this.cardBinValue = cardBinValue;
	}

	/**
	 * <p>Getter for the field <code>cardTypeVo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CardTypeVO} object.
	 */
	public CardTypeVO getCardTypeVo() {
		return this.cardTypeVo;
	}
	/**
	 * <p>Setter for the field <code>cardTypeVo</code>.</p>
	 *
	 * @param cardTypeVo a {@link cn.felord.wepay.ali.sdk.api.domain.CardTypeVO} object.
	 */
	public void setCardTypeVo(CardTypeVO cardTypeVo) {
		this.cardTypeVo = cardTypeVo;
	}

	/**
	 * <p>Getter for the field <code>domainVo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CardDomainVO} object.
	 */
	public CardDomainVO getDomainVo() {
		return this.domainVo;
	}
	/**
	 * <p>Setter for the field <code>domainVo</code>.</p>
	 *
	 * @param domainVo a {@link cn.felord.wepay.ali.sdk.api.domain.CardDomainVO} object.
	 */
	public void setDomainVo(CardDomainVO domainVo) {
		this.domainVo = domainVo;
	}

	/**
	 * <p>Getter for the field <code>instId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstId() {
		return this.instId;
	}
	/**
	 * <p>Setter for the field <code>instId</code>.</p>
	 *
	 * @param instId a {@link java.lang.String} object.
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

	/**
	 * <p>Getter for the field <code>instLen</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstLen() {
		return this.instLen;
	}
	/**
	 * <p>Setter for the field <code>instLen</code>.</p>
	 *
	 * @param instLen a {@link java.lang.String} object.
	 */
	public void setInstLen(String instLen) {
		this.instLen = instLen;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>operator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperator() {
		return this.operator;
	}
	/**
	 * <p>Setter for the field <code>operator</code>.</p>
	 *
	 * @param operator a {@link java.lang.String} object.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * <p>Getter for the field <code>version</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVersion() {
		return this.version;
	}
	/**
	 * <p>Setter for the field <code>version</code>.</p>
	 *
	 * @param version a {@link java.lang.String} object.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

}
